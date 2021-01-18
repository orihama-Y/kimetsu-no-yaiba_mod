package com.orihama.kimetu_no_yaiba.objects.items;

import java.util.Random;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.insect.tawamure.tawamure;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Nitirintou_musi extends ItemSword implements IHasModel {
	int tick = 0, attack_phase = 0;
	EntityPlayer player_;
	EnumHand hand_;
	World world_;
    Random rand;
	boolean tawamure_flag=false;

	public Nitirintou_musi(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_musi");
		setRegistryName("nitirintou_musi");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}


	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		player_=player;
		hand_=handIn;
		world_=world;

		//戯れ
		if (player.getHeldItemOffhand().getItem() == ItemInit.TAWAMURE_ICON) {
			if(tick==0) {
				tick=125;
				tawamure_flag = true;
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

	}


	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0 ) {
			tick=0; attack_phase=0;
			tawamure_flag=false;
		}

		if(this.tick>0) {
			this.tick--;

			// 戯れ
			if (tawamure_flag) {
				if(tick > 0 ) {
					if(attack_phase==0) {
						tawamure_action1(world,player_,hand_, tick);
						if(tick == 1) {
							attack_phase ++;
							tick=50;
						}
					}
					if(attack_phase == 1) {
						tawamure_action2(world,player_,hand_, 1+(54-tick)/18);
						if(tick == 1) {
							attack_phase ++;
							tick=50;
						}
					}
					if(attack_phase == 2) {
						if(tick%3==1 && tick >30)tawamure_action3(world,player_,hand_,(float) ((30-tick)*0.4));
					}

				}
			}
		}
	}

	//----------------------------------------------------------------------------------------


	public void tawamure_action1(World world, EntityPlayer player, EnumHand handIn ,int d) {
			Vec3d look = player.getLookVec();
			Vec3d look1 = look.rotateYaw(0.1f * d);
			tawamure slash_1 = new tawamure(world);
			slash_1.shootingEntity=player;
			slash_1.setPosition(player.posX + look1.x *3 , player.posY+player.eyeHeight, player.posZ + look1.z *3);
		    slash_1.accelerationX = 0;slash_1.accelerationY = -0.8 ;slash_1.accelerationZ = 0;
		    world.spawnEntity((Entity)slash_1);
	}


	public void tawamure_action2(World world, EntityPlayer player, EnumHand handIn ,float d) {
			Vec3d look = player.getLookVec();
		    rand= new Random();

			tawamure slash_1 = new tawamure(world);
			tawamure slash_2 = new tawamure(world);
			slash_1.shootingEntity=player;
			slash_2.shootingEntity=player;
			slash_1.setPosition(player.posX + look.x *4 * d , player.posY+player.eyeHeight, player.posZ + look.z *4  *d);
		    slash_1.accelerationX = look.x*1.2* rand.nextFloat();;slash_1.accelerationY =  look.y*2 ;slash_1.accelerationZ =  look.z*1.2* rand.nextFloat();;
		    slash_2.accelerationX = look.x*2;slash_2.accelerationY =  look.y*2 ;slash_2.accelerationZ =  look.z*2;
		    if(look.y<0) {
				slash_1.setPosition(player.posX + look.x *4 * d , player.posY+player.eyeHeight, player.posZ + look.z *4  *d);
				slash_2.setPosition(player.posX + look.x *4 * d , player.posY+player.eyeHeight, player.posZ + look.z *4  *d);
		    }else {
				slash_1.setPosition(player.posX + look.x *4 * d , player.posY+ look.y *4 +player.eyeHeight , player.posZ + look.z *4  *d);
				slash_2.setPosition(player.posX + look.x *4 * d , player.posY+ look.y *4 +player.eyeHeight, player.posZ + look.z *4  *d);
			}

		    world.spawnEntity((Entity)slash_1);
		    world.spawnEntity((Entity)slash_2);
	}

	public void tawamure_action3(World world, EntityPlayer player, EnumHand handIn ,float e) {
	    rand= new Random();
		Vec3d look = player.getLookVec();
		for(int k=0;k<4;k++) {
			for(int j=0;j<17;j++) {
				tawamure slash = new tawamure(world);
				Vec3d look2 = look.rotateYaw(042f * j);
				slash.shootingEntity=player;
				slash.accelerationX = 4* rand.nextFloat();slash.accelerationY = -2;slash.accelerationZ = 4* rand.nextFloat();
				if(look.y<0) {slash.setPosition(player.posX+look.x*16+look2.x * e , player.posY + look.y + 0.2+k , player.posZ+look.z * 16 + look2.z * e);}
				else {slash.setPosition(player.posX+look.x*16+look2.x * e , player.posY + look.y *16+look2.y * e +player.eyeHeight  ,player.posZ+ look.z * 16 + look2.z * e);}
				world.spawnEntity((Entity)slash);
			}
		}
	}


	//------------------------------------------------------------------------------------------

	public ActionResult<ItemStack> harm_on(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			player.capabilities.disableDamage = true;
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	public ActionResult<ItemStack> harm_off(World world,EntityPlayer player,EnumHand handIn){
		if(!world.isRemote){
			if(!player.isCreative())
				player.capabilities.disableDamage = false;
		}
		ItemStack item = player.getHeldItem(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}


}



