package com.orihama.kimetu_no_yaiba.entity.monster;
import com.orihama.kimetu_no_yaiba.entity.ai.EntityTeoniAttack;
import com.orihama.kimetu_no_yaiba.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityTeoni extends EntityMob {

    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);

	int burntick = 0;
	public EntityTeoni(World worldIn) {
		super(worldIn);
		setSize(3.5F, 4.0F);
	}

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
        this.tasks.addTask(2, new EntityTeoniAttack(this, 1.5D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 7.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

	protected void applyEntityAI() {
		this.tasks.addTask(6, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
		this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, true));
		this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityVillager.class, false));
		this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityIronGolem.class, true));
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(150.0D);
	}


	protected int getExperiencePoints(EntityPlayer player) {
		this.experienceValue = (int)(this.experienceValue * 25.0F);
		return super.getExperiencePoints(player);
	}

    public void setCustomNameTag(String name)
    {
        super.setCustomNameTag(name);
        this.bossInfo.setName(this.getDisplayName());
    }

    public void addTrackingPlayer(EntityPlayerMP player)
    {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

   public void removeTrackingPlayer(EntityPlayerMP player)
   {
       super.removeTrackingPlayer(player);
       this.bossInfo.removePlayer(player);
   }

	public void onLivingUpdate() {
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());

		if (this.world.isDaytime() && !this.world.isRemote && !this.isChild() && this.shouldBurnInDay()) {
			float f = this.getBrightness();

			if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.world
					.canSeeSky(new BlockPos(this.posX, this.posY + getEyeHeight(), this.posZ))) {

				boolean sun_flag = true;
				this.burntick--;
				ItemStack itemstack = getItemStackFromSlot(EntityEquipmentSlot.HEAD);
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1D);

				if (!itemstack.isEmpty()) {
					if (itemstack.isItemStackDamageable()) {
						itemstack.setItemDamage(itemstack.getItemDamage() + this.rand.nextInt(2));
						if (itemstack.getItemDamage() >= itemstack.getMaxDamage()) {
							renderBrokenItemStack(itemstack);
							setItemStackToSlot(EntityEquipmentSlot.HEAD, ItemStack.EMPTY);
						}
					}
					sun_flag = false;
				}

				if (sun_flag) {setFire(8);}
			}
		}

		super.onLivingUpdate();
	}


	protected boolean shouldBurnInDay() {
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		return true;
	}


	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (super.attackEntityFrom(source, amount)) {
			EntityLivingBase entitylivingbase = getAttackTarget();

			if (entitylivingbase == null && source.getTrueSource() instanceof EntityLivingBase) {
				entitylivingbase = (EntityLivingBase)source.getTrueSource();
			}
		}
		return false;
	}


	public boolean attackEntityAsMob(Entity entityIn) {
		boolean flag = super.attackEntityAsMob(entityIn);

		if (flag) {
			float f = this.world.getDifficultyForLocation(new BlockPos((Entity)this)).getAdditionalDifficulty();

			if (getHeldItemMainhand().isEmpty() && isBurning() && this.rand.nextFloat() < f * 0.3F) {
				entityIn.setFire(2 * (int)f);
			}
		}

		return flag;
	}


	public float getEyeHeight() {
		float f = 1.74F;
		return f;
	}


	public void onDeath(DamageSource cause) {
		if (!this.world.isRemote) {
			this.entityDropItem(new ItemStack(ItemInit.TAIHUKU_CHEST, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.TAIHUKU_FEET, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.TAIHUKU_LEGGINGS, 1 + this.rand.nextInt(1)), 0.2F);
		}


		super.onDeath(cause);
	}

}
