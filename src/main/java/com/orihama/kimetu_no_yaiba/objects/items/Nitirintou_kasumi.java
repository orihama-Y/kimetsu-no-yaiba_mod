package com.orihama.kimetu_no_yaiba.objects.items;


import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.kasumi.kasumi;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.kasumi.kasumi_HIT;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.oboro.oboro;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.handlers.SoundHandler;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Nitirintou_kasumi extends ItemSword implements IHasModel {

	int tick=0;
	EntityPlayer player_;
	EnumHand hand_;
	World world_;
	boolean kasumi_flag=false,oboro_flag=false;

	public Nitirintou_kasumi(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_kasumi");
		setRegistryName("nitirintou_kasumi");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}


	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		player_= player;
		hand_ = handIn;
		world_ = world;

		//移流斬り
		if (player.getHeldItemOffhand().getItem() == ItemInit.IRYUU_ICON) {
			if(tick==0) {
				world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.KASUMI_SOUND, SoundCategory.AMBIENT, 1f, 1f);
				tick = 70;
				kasumi_flag = true;
				invincible_on(world, player,handIn);
			}
		}

		//朧
		if (player.getHeldItemOffhand().getItem() == ItemInit.OBORO_ICON) {
			if(tick==0) {
				world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.KASUMI_SOUND, SoundCategory.AMBIENT, 1f, 1f);
				tick = 60;
				oboro_flag =true;
				invincible_on(world, player,handIn);
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	//---------------------------------------------------------------------------

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0) {
			tick=0;
			kasumi_flag = oboro_flag= false;
		}

		if (this.tick > 0) {
			this.tick--;

			//移流
			if(kasumi_flag) {
				if(tick% 6==1 && tick > 35)iryuu_kasumi(world_,player_,hand_,(float) ((30-tick)*0.4),2);
				if(tick==65) {player_.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 40, 4, false, false));}
				if(tick<70 && tick %3 ==1)iryuu_kasumi_hit(world_,player_,hand_);
			}

			//朧
			if(oboro_flag) {
				if(tick%6 ==1 && tick >30)oboro_kasumi(world_,player_,hand_,(float) ((30-tick)*0.4));
				if(tick<=13)oboro_kasumi_hit(world_,player_,hand_,(float) 13.5-tick);

			}

			if(tick==0) {
				invincible_off(world_,player_,hand_);
			}
		}
	}
	//---------------------------------------------------------------------------

	public void oboro_kasumi(World world, EntityPlayer player, EnumHand handIn, float dist) {
		Vec3d look = player.getLookVec();
		for(int i=0;i<4;i++) {
			for(int j=0;j<17;j++) {
				Vec3d look2 = look.rotateYaw(42f * j);
				kasumi slash = new kasumi(world);
				slash.shootingEntity=player;
				if(look.y<0){slash.setPosition(player.posX+look2.x * dist , player.posY + look.y + 0.2+i , player.posZ + look2.z * dist);}
				else {slash.setPosition(player.posX+look2.x * dist , player.posY + look.y * dist *0.2+i ,player.posZ + look2.z * dist);}
				slash.accelerationX = 0;slash.accelerationY = 0;slash.accelerationZ = 0;
				world.spawnEntity((Entity)slash);
			}
		}
	}

	public void oboro_kasumi_hit(World world, EntityPlayer player, EnumHand handIn, float dist) {
		Vec3d look = player.getLookVec();
		for(int i=0;i<210;i++) {
			Vec3d look2 = look.rotateYaw(0.03f * i);
			oboro slash = new oboro(world);
			slash.shootingEntity=player;
			if(look.y<0) {slash.setPosition(player.posX+look2.x * dist , player.posY + 0.4 , player.posZ + look2.z * dist);}
			else {slash.setPosition(player.posX+look2.x * dist , player.posY + look.y + 0.6 ,player.posZ + look2.z * dist);}
			slash.accelerationX = look2.x*0.35; slash.accelerationY = 0;slash.accelerationZ =look2.z* 0.35;
			world.spawnEntity((Entity)slash);
		}
	}

	//---------------------------------------------------------------------------

	public void iryuu_kasumi(World world, EntityPlayer player, EnumHand handIn, float e,int x) {
		Vec3d look = player.getLookVec();
		for(int k=0;k<4;k++) {
			for(int i=0;i<17;i++) {
				kasumi slash = new kasumi(world);
				Vec3d look2 = look.rotateYaw(042f * i);
				slash.shootingEntity=player;
				slash.accelerationX = 0;slash.accelerationY = 0;slash.accelerationZ = 0;
				if(look.y<0) {slash.setPosition(player.posX+look.x*16+look2.x * e , player.posY + look.y + 0.2+k , player.posZ+look.z * 16 + look2.z * e);}
				else {slash.setPosition(player.posX+look.x*16+look2.x * e , player.posY + look.y * e*0.2+k ,player.posZ+ look.z * 16 + look2.z * e);}
				world.spawnEntity((Entity)slash);
			}
		}
	}

	public void iryuu_kasumi_hit(World world, EntityPlayer player, EnumHand hand) {
		Vec3d look = player.getLookVec();
		for(int i=0;i<14;i++) {
			kasumi_HIT slash = new kasumi_HIT(world);
			Vec3d look2 = look.rotateYaw(0.32f * i);
			slash.shootingEntity=player;
			slash.accelerationX = look2.x*0.7 ;slash.accelerationY = look2.y*0.7 ;slash.accelerationZ = look2.z*0.7;
			slash.setPosition(player.posX+look2.x*1, player.posY+1.1,player.posZ+look2.z*1);
			world.spawnEntity((Entity)slash);
		}
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


}

