package com.orihama.kimetu_no_yaiba.objects.items;

import java.util.Random;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.moon_slash.moon;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.rinbi.rinbi;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae_hit;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Nitirintou_tuki extends ItemSword implements IHasModel {
	int tick = 0;
	EntityPlayer player_;
	EnumHand hand_;
	World world_;
    Random rand;
	boolean tukibae_flag=false,rinbi_flag=false,saika_flag=false,kataware_flag=false;

	public Nitirintou_tuki(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_tuki");
		setRegistryName("nitirintou_tuki");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}


	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}


	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		player_= player;
		hand_= handIn;
		world_= world;


		if (player.getHeldItemOffhand().getItem() == ItemInit.SAIKA_ICON) {
			if(tick==0) {
				tick=50; saika_flag=true;
			}
		}

		if (player.getHeldItemOffhand().getItem() == ItemInit.RINBI_ICON) {
			if(tick==0) {
				tick=64; rinbi_flag=true;
			}
		}

		if (player.getHeldItemOffhand().getItem() == ItemInit.KATAWARE_ICON) {
			if(tick==0) {
				tick=50; kataware_flag=true;
			}
		}


		if (player.getHeldItemOffhand().getItem() == ItemInit.TUKIBAE_ICON) {
			if(tick==0) {
				tick=50; tukibae_flag=true;
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

	}


	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0 ) {
			tick=0;
			saika_flag=rinbi_flag=tukibae_flag=kataware_flag=false;
		}

		if(this.tick>0) {
			this.tick--;

			if (saika_flag) {
				if(tick<=40 && tick %3 != 1 )saika(world,player_, (float)20-tick);
			}


			if (rinbi_flag) {
				if(tick<=58)rinbi(world,player_,(float) (70-tick)*0.15f);
			}

			if (kataware_flag){
				if(tick<50 &&tick%7==0)kataware(world,player_);
			}

			if (tukibae_flag) {
				if(tick<50) {
					if(tick %30 != 0) {
						tukibae(world,player_, 2.4f,51-tick);
						tukibae(world,player_, 7.0f,51-tick);
						tukibae2(world,player_, 2.4f,51-tick);
						tukibae2(world,player_, 7.0f,51-tick);
					}
				}
			}

		}
	}

	//----------------------------------------------------------------------------------------


	public void rinbi(World world, EntityPlayer kokushibou,  float dist) {
		Vec3d look = kokushibou.getLookVec();

		for(float i=(float) -0.1;i<0.1;i+=0.1) {
			Vec3d look2 = look.rotateYaw(i);
			rinbi slash = new rinbi(world);
			slash.shootingEntity=(EntityLivingBase) kokushibou;
			slash.setPosition(kokushibou.posX+look2.x*dist , kokushibou.posY+ 1 + look.y*dist, kokushibou.posZ + look2.z * dist);
			slash.accelerationX = look2.x*0.5; slash.accelerationY = -0.0;slash.accelerationZ =look2.z* 0.5;
			world.spawnEntity((Entity)slash);
		}
	}

	//----------------------------------------------------------------------------------------

	public void tukibae(World world, EntityPlayer kokushibou, float rot,float dist) {

		Vec3d look = kokushibou.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * rot);
		Vec3d look3 = look.rotateYaw(-0.1f * rot);
		tukibae slash = new tukibae(world);
		tukibae slash_2 = new tukibae(world);
		slash.shootingEntity=kokushibou;
		slash_2.shootingEntity=kokushibou;

		if(look.y<0) {
			slash.setPosition(kokushibou.posX + look2.x * dist , kokushibou.posY +1 , kokushibou.posZ + look2.z *dist);
			slash_2.setPosition(kokushibou.posX + look3.x * dist , kokushibou.posY +1, kokushibou.posZ + look3.z *dist);
		}else {
			slash.setPosition(kokushibou.posX + look2.x * dist , kokushibou.posY + look2.y * dist +1.2 , kokushibou.posZ + look2.z *dist);
			slash_2.setPosition(kokushibou.posX + look3.x * dist , kokushibou.posY + look2.y * dist +1.2, kokushibou.posZ + look3.z *dist);
		}
		slash.accelerationX = look.x*0; slash.accelerationY = -5;slash.accelerationZ =look.z* 0;
		slash_2.accelerationX = look.x*0; slash_2.accelerationY = -5;slash_2.accelerationZ =look.z* 0;
		world.spawnEntity((Entity)slash);
		world.spawnEntity((Entity)slash_2);

	}

	public void tukibae2(World world, EntityPlayer kokushibou, float rot, float dist) {
		Vec3d look = kokushibou.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * rot);
		Vec3d look3 = look.rotateYaw(-0.1f * rot);
		tukibae_hit slash = new tukibae_hit(world);
		tukibae_hit slash_2 = new tukibae_hit(world);
		slash.shootingEntity=kokushibou;
		slash_2.shootingEntity=kokushibou;
		if(look.y<0) {
			slash.setPosition(kokushibou.posX + look2.x * dist , kokushibou.posY +1 , kokushibou.posZ + look2.z *dist);
			slash_2.setPosition(kokushibou.posX + look3.x * dist , kokushibou.posY +1, kokushibou.posZ + look3.z *dist);
		}else {
			slash.setPosition(kokushibou.posX + look2.x * dist , kokushibou.posY + look2.y * dist +1.2 , kokushibou.posZ + look2.z *dist);
			slash_2.setPosition(kokushibou.posX + look3.x * dist , kokushibou.posY + look2.y * dist +1.2, kokushibou.posZ + look3.z *dist);
		}
		slash.accelerationX = look.x*0; slash.accelerationY = -5;slash.accelerationZ =look.z* 0;
		world.spawnEntity((Entity)slash);
		slash_2.accelerationX = look.x*0; slash_2.accelerationY = -5;slash_2.accelerationZ =look.z* 0;
		world.spawnEntity((Entity)slash_2);

	}

	//----------------------------------------------------------------------------------------

	public void kataware(World world, EntityPlayer kokushibou) {
		Random r = new Random();
		int x;

		for(int i=0;i<15;i++) {

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
			if(slash.posX != kokushibou.posX && slash.posZ != kokushibou.posZ) world.spawnEntity((Entity)slash);
			slash2.setPosition(kokushibou.posX + r3 * r1 -x , kokushibou.posY + 5, kokushibou.posZ + r4 *r2-x);
			slash2.accelerationX = 0;slash2.accelerationY = -0.9;slash2.accelerationZ = 0;
			if(slash2.posX != kokushibou.posX && slash2.posZ != kokushibou.posZ) world.spawnEntity((Entity)slash2);


		}

	}

	//----------------------------------------------------------------------------------------

	public void saika(World world, EntityPlayer player,float dist) {
		Vec3d look = player.getLookVec();
		for(int i=0;i<45;i++) {
			Vec3d look2 = look.rotateYaw(1.3f * i);
			moon slash = new moon(world);

			slash.shootingEntity=player;
			if(look.y<0) {slash.setPosition(player.posX+look2.x * dist , player.posY + 0.4 , player.posZ + look2.z * dist);}
			else {slash.setPosition(player.posX+look2.x * dist , player.posY + look.y + 0.6 + dist *0.1,player.posZ + look2.z * dist);}
			slash.accelerationX = look2.x*0.35; slash.accelerationY = 0;slash.accelerationZ =look2.z* 0.35;
			world.spawnEntity((Entity)slash);
		}
	}

	//------------------------------------------------------------------------------------------

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



