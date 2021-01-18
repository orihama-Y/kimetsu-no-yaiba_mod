package com.orihama.kimetu_no_yaiba.entity.monster;
import java.util.List;
import java.util.Random;

import com.orihama.kimetu_no_yaiba.entity.ai.EntityKokushibouAttack;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.moon_slash.moon;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae_hit;
import com.orihama.kimetu_no_yaiba.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityKokushibou extends EntityMob {

	public int tick = 0;
	public int fight_flag=0;
	public int randomNum = 1;
	public int before_attack=1;
	public int attack_pattern=0;

	public Random random;
	public Entity target;
	public EntityPlayer targP;

	private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);


	public EntityKokushibou(World worldIn) {
		super(worldIn);
	}

	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
		this.tasks.addTask(2, new EntityKokushibouAttack(this, 3.0D, false,world));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 7.0D));
		this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.tasks.addTask(6, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));

		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityTeoni.class, true));

	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
	}

	public void onLivingUpdate() {

		List<EntityLiving> list_living = this.world.<EntityLiving>getEntitiesWithinAABB(EntityLiving.class, this.getEntityBoundingBox().grow(20.0D, 10.0D, 20.0D));

		target = this.world.getClosestPlayerToEntity(this, 30.0D);
		for (EntityLivingBase liv : list_living) {
			if(liv instanceof EntityIronGolem)target = liv;
		}

		if(target != null) {

			if(target instanceof EntityPlayer) {
				targP =(EntityPlayer) target;
				if(!targP.isCreative())	this.getNavigator().tryMoveToEntityLiving(target, 1.05);
			}
			else {
				this.getNavigator().tryMoveToEntityLiving(target, 1.05);
			}
		}

		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());


		if(fight_flag != 0) {

			if(tick <= 0) {
				tick=100;
			}


			if (tick > 0) {
				tick--;

				if(attack_pattern %8 == 1) {
					if(tick<=30 && tick %3 != 1 )tenman(world,this, (float)3-tick%6);
				}


				if(attack_pattern %5 == 1) {
					if(tick<=13)yoinomiya(world,this,(float) 13.5-tick);
				}

				if(attack_pattern %4 == 0) {
					if(tick<50) {
						if(tick %4 != 0) {
							tukibae(world,this, 2.4f,55-tick);
							tukibae(world,this, 7.0f,55-tick);
							tukibae2(world,this, 2.4f,55-tick);
							tukibae2(world,this, 7.0f,55-tick);
						}
					}
				}

				if(attack_pattern %3 == 0){
					if(tick<50 &&tick%7==0)kataware(world,this);
				}


				if(tick == 1) {
					attack_pattern ++;
				}
			}

		}

		if (this.world.isDaytime() && !this.world.isRemote && this.shouldBurnInDay()) {
			float f = this.getBrightness();
			if (f > 0.4F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.world.canSeeSky(new BlockPos(this.posX, this.posY + getEyeHeight(), this.posZ))) {
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);

				setFire(8);
			}
		}




		super.onLivingUpdate();
	}


	protected boolean shouldBurnInDay() {
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		return true;
	}

	protected int getExperiencePoints(EntityPlayer player) {
		this.experienceValue = (int)(this.experienceValue * 100.0F);
		return super.getExperiencePoints(player);
	}

	public void setCustomNameTag(String name){
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


	public boolean attackEntityFrom(DamageSource source, float amount) {

		EntityLivingBase entitylivingbase_rev = getRevengeTarget();
		if (entitylivingbase_rev == null && source.getTrueSource() instanceof EntityLivingBase) {
			this.target = (EntityLivingBase)source.getTrueSource();
		}

		return super.attackEntityFrom(source, amount);
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
		float f = 1.94F;
		return f;
	}


	public void onDeath(DamageSource cause) {
		if (!this.world.isRemote) {
			this.entityDropItem(new ItemStack(ItemInit.NITIRINTOU_TUKI, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.TUKIBAE_ICON, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.SAIKA_ICON, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.KATAWARE_ICON, 1 + this.rand.nextInt(1)), 0.2F);
			this.entityDropItem(new ItemStack(ItemInit.RINBI_ICON, 1 + this.rand.nextInt(1)), 0.2F);

		}
		super.onDeath(cause);
	}

	public void yoinomiya(World world, EntityKokushibou kokushibou,  float e) {
		Vec3d look = kokushibou.getLookVec();

		for(float i=(float) -0.5;i<0.5;i+=0.1) {
			Vec3d look2 = look.rotateYaw(i);
			moon slash = new moon(world);
			slash.shootingEntity=(EntityLivingBase) kokushibou;
			slash.setPosition(kokushibou.posX+look2.x*e , kokushibou.posY+ 1 + look.y*e ,kokushibou.posZ + look2.z * e);
			slash.accelerationX = look2.x*0.35; slash.accelerationY = -0.01;slash.accelerationZ =look2.z* 0.35;
			world.spawnEntity((Entity)slash);
		}
	}


	public void tukibae(World world, EntityKokushibou kokushibou,  float d,float e) {

		Vec3d look = kokushibou.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * d);
		Vec3d look3 = look.rotateYaw(-0.1f * d);
		tukibae slash = new tukibae(world);
		tukibae slash_2 = new tukibae(world);
		slash.shootingEntity=kokushibou;
		slash_2.shootingEntity=kokushibou;

		if(look2.y<0) {
			slash.setPosition(kokushibou.posX + look2.x * e , kokushibou.posY +1 , kokushibou.posZ + look2.z *e);
			slash_2.setPosition(kokushibou.posX + look3.x * e , kokushibou.posY +1, kokushibou.posZ + look3.z *e);
		}else {
			slash.setPosition(kokushibou.posX + look2.x * e , kokushibou.posY + look2.y * e +0.6 , kokushibou.posZ + look2.z *e);
			slash_2.setPosition(kokushibou.posX + look3.x * e , kokushibou.posY + look2.y * e +0.6, kokushibou.posZ + look3.z *e);
		}
		slash.accelerationX = 0;slash.accelerationY = -3.2D; slash.accelerationZ = 0;
		slash_2.accelerationX = 0;slash_2.accelerationY = -3.2D; slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash);
		world.spawnEntity((Entity)slash_2);

	}

	public void tukibae2(World world, EntityKokushibou kokushibou,  float d,float e) {
		Vec3d look = kokushibou.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * d);
		Vec3d look3 = look.rotateYaw(-0.1f * d);
		tukibae_hit slash = new tukibae_hit(world);
		tukibae_hit slash_2 = new tukibae_hit(world);
		slash.shootingEntity=kokushibou;
		slash_2.shootingEntity=kokushibou;
		if(look2.y<0) {
			slash.setPosition(kokushibou.posX + look2.x * e , kokushibou.posY + 1, kokushibou.posZ + look2.z *e);
			slash_2.setPosition(kokushibou.posX + look3.x * e , kokushibou.posY + 1, kokushibou.posZ + look3.z *e);
		}else{
			slash.setPosition(kokushibou.posX + look2.x * e , kokushibou.posY + look2.y * e +1.2, kokushibou.posZ + look2.z *e);
			slash_2.setPosition(kokushibou.posX + look3.x * e , kokushibou.posY + look3.y * e +1.2, kokushibou.posZ + look3.z *e);
		}
		slash.accelerationX = 0;slash.accelerationY = -4;slash.accelerationZ = 0;
		world.spawnEntity((Entity)slash);
		slash_2.accelerationX = 0;slash_2.accelerationY = -4;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);

	}

	public void kataware(World world, EntityKokushibou kokushibou) {
		Random r = new Random();
		int x;
		Vec3d look = kokushibou.getLookVec();

		for(int i=0;i<5;i++) {

			if(i%2==0){x=3;} else{x=10;}

			kataware slash = new kataware(world);
			kataware_hit slash2 = new kataware_hit(world);
			slash.shootingEntity=kokushibou;
			slash2.shootingEntity=kokushibou;
			int r1 = r.nextInt(30);
			int r2 = r.nextInt(30);
			float r3 = r.nextFloat();
			float r4 = r.nextFloat();

			slash.setPosition(kokushibou.posX + r3 * r1 -x , kokushibou.posY + 5, kokushibou.posZ + r4 *r2-x);
			slash.accelerationX = 0;slash.accelerationY = -0.9;slash.accelerationZ = 0;
			world.spawnEntity((Entity)slash);
			slash2.setPosition(kokushibou.posX + r3 * r1 -x , kokushibou.posY + 5, kokushibou.posZ + r4 *r2-x);
			slash2.accelerationX = 0;slash2.accelerationY = -0.9;slash2.accelerationZ = 0;
			world.spawnEntity((Entity)slash2);


		}

	}


	public void tenman(World world, EntityKokushibou player,float e) {
		Vec3d look = player.getLookVec();
		for(int i=0;i<45;i++) {
			Vec3d look2 = look.rotateYaw(1.3f * i);
			moon slash = new moon(world);

			slash.shootingEntity=player;
			if(look.y<0) {slash.setPosition(player.posX+look2.x * e , player.posY + 0.4 , player.posZ + look2.z * e);}
			else {slash.setPosition(player.posX+look2.x * e , player.posY + look.y + 0.6 + e*0.1,player.posZ + look2.z * e);}
			slash.accelerationX = look2.x*0.35; slash.accelerationY = 0;slash.accelerationZ =look2.z* 0.35;
			world.spawnEntity((Entity)slash);
		}
	}

}
