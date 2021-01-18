package com.orihama.kimetu_no_yaiba.objects.items;


import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.HIT_hekireki;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.lightning.customLightning;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Nitirintou_kaminari extends ItemSword implements IHasModel {

	int tick = 0;
	EntityPlayer player_;
	EnumHand hand_;
	World world_;
	double tmp_motionX,tmp_motionZ;
	boolean hekireki_flag=false, speedup_on= false;

	public Nitirintou_kaminari(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_kaminari");
		setRegistryName("nitirintou_kaminari");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}

	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		player_ = player;
		hand_ = handIn;
		world_= world;
		this.tmp_motionX = player.motionX;
		this.tmp_motionX = player.motionZ;

		//霹靂一閃
		if (player.getHeldItemOffhand().getItem() == ItemInit.HEKIREKI_ICON) {
			if(tick==0) {
				tick = 70;
				hekireki_flag =true;
				speedup_on = false;
				invincible_on(world, player,handIn);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}


	//---------------------------------------------------------------------------

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0) {
			tick=0;
			hekireki_flag=false;
		}

		if (this.tick > 0) {
			this.tick--;

			//霹靂一閃
			if(hekireki_flag) {

				if(tick >65 && tick < 70){
					invincible_on(world_, player_,hand_);
					blindness(world_, player_,hand_);
				}

				if(tick <= 15){
					Vec3d look = entity.getLookVec();
					entity.playSound(SoundEvents.ENTITY_LIGHTNING_THUNDER, 0.7F, 1.6F + (player_.getRNG().nextFloat() - player_.getRNG().nextFloat()) * 0.4F);

					if(speedup_on == false) {
						speedup_on = true ;
						if (entity.onGround) {
							entity.motionX += 9.8D * look.x;
							entity.motionZ += 9.8D * look.z;
						} else {
							entity.motionX += 3.2D * look.x;
							entity.motionY += 3.2D * look.y;
							entity.motionZ += 3.2D * look.z;
						}
					}
				}

				if( tick>=0 && tick<20 && tick%3==0) {

					if(world.isRemote) {
						hekireki_action(world_,player_,hand_,0,1f);
						hekireki_action(world_,player_,hand_,1,1f);
						hekireki_action(world_,player_,hand_,-1,1f);
						hekireki_action(world_,player_,hand_,2,1f);
						hekireki_action(world_,player_,hand_,6-tick,1f);
					}
					hekireki_hit(world_,player_,hand_);

					if(tick==0) {
						invincible_off(world_,player_,hand_);
						unblindness(world_, player_,hand_);
						speedDown(world_,player_,hand_);
					}
				}
			}
		}
	}
	//---------------------------------------------------------------------------

	public void hekireki_hit(World world, EntityPlayer player, EnumHand handIn) {
		Vec3d look = player.getLookVec();
		HIT_hekireki slash_1 = new HIT_hekireki(world);
		HIT_hekireki slash_2 = new HIT_hekireki(world);
		HIT_hekireki slash_3 = new HIT_hekireki(world);
		slash_1.shootingEntity=player;
		slash_2.shootingEntity=player;
		slash_3.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x *1.4 , player.posY+look.y+1.2, player.posZ + look.z *1.4);
		slash_2.setPosition(player.posX + look.x *1.4 , player.posY+look.y+1.7, player.posZ + look.z *1.4);
		slash_3.setPosition(player.posX + look.x *1.5 , player.posY+look.y+1.7, player.posZ + look.z *1.5);
		slash_1.accelerationX = look.x*6;slash_1.accelerationY = look.y*3 ;slash_1.accelerationZ = look.z*6;
		slash_2.accelerationX = look.x*6;slash_2.accelerationY = look.y*5 ;slash_2.accelerationZ = look.z*6;
		slash_3.accelerationX = look.x*9;slash_3.accelerationY = 0 ;slash_3.accelerationZ = look.z*9;
		world.spawnEntity((Entity)slash_1);
		world.spawnEntity((Entity)slash_2);
		world.spawnEntity((Entity)slash_3);
	}

	public void hekireki_action(World world, EntityPlayer player, EnumHand handIn, int e, float d) {
		customLightning slash = new customLightning(world ,player.posX ,player.posY ,player.posZ ,false);
		world.spawnEntity((Entity)slash);
	}

	//---------------------------------------------------------------------------

	public ActionResult<ItemStack> invincible_on(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			player.capabilities.disableDamage = true;
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	public ActionResult<ItemStack> invincible_off(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			if(!player.isCreative())
				player.capabilities.disableDamage = false;
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	public ActionResult<ItemStack> speedDown(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			player.motionX = this.tmp_motionX;
			player.motionZ = this.tmp_motionZ;
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

	}

	public ActionResult<ItemStack> blindness(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 45, 0, false, false));
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	public ActionResult<ItemStack> unblindness(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 1, 0, false, false));
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

}

