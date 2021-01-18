package com.orihama.kimetu_no_yaiba.objects.items;


import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enkoHIT_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enko_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten.enten;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.HIT_rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.siranui.siranui;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.handlers.SoundHandler;
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
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Nitirintou_honoo extends ItemSword implements IHasModel {

	int tick=0;
	EntityPlayer player_;
	EnumHand hand_;
	World world_;
	double tmpX,tmpZ;
	boolean rengoku_flag=false,siranui_flag=false,enten_flag=false,enko_flag=false;

	public Nitirintou_honoo(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_honoo");
		setRegistryName("nitirintou_honoo");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}

	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		Vec3d look = player.getLookVec();
		this.tmpX = player.motionX;
		this.tmpZ = player.motionZ;
		player_ = player;
		hand_ = handIn;
		world_ = world;

		//不知火
		if (player.getHeldItemOffhand().getItem() == ItemInit.SIRANUI_ICON) {
			world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.SIRANUI_SOUND, SoundCategory.AMBIENT, 1f, 1f);

			if(tick==0) {
				tick=20; siranui_flag = true;
			}

			if(tick==20) {
				invincible_on(world, player,handIn);
				if (player.onGround) {
					player.motionX += 6.8D * look.x;
					player.motionZ += 6.8D * look.z;
				} else {
					player.motionX += 1.35D * look.x;
					player.motionZ += 1.35D * look.z;
				}
			}
		}

		//煉獄
		if (player.getHeldItemOffhand().getItem() == ItemInit.RENGOKU_ICON) {
			if(tick==0) {
				tick = 70;
				rengoku_flag = true;
				invincible_on(world, player,handIn);
			}
		}

		//炎虎
		if (player.getHeldItemOffhand().getItem() == ItemInit.ENKO_ICON) {
			if(tick==0) {
				tick = 40;
				enko_flag = true;
				invincible_on(world, player,handIn);
			}
		}

		//登り炎天
		if (player.getHeldItemOffhand().getItem() == ItemInit.NOBORI_ICON) {
			if(tick==0) {
				tick = 30;
				enten_flag = true;
				invincible_on(world, player,handIn);
				world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.ENTEN_SOUND, SoundCategory.AMBIENT, 1f, 1f);
			}
		}

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	//---------------------------------------------------------------------------

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0) {
			tick=0;
			rengoku_flag=false;
			siranui_flag=false;
			enten_flag=false;
			enko_flag=false;
		}

		if (this.tick > 0) {
			this.tick--;

			//不知火
			if(siranui_flag) {
				siranui_action1(world,player_,hand_,0,1f);
				siranui_action1(world,player_,hand_,1,1f);
				siranui_action1(world,player_,hand_,2,1f);
				siranui_action1(world,player_,hand_,0,0.78f);
				siranui_action1(world,player_,hand_,1,0.78f);
				siranui_action1(world,player_,hand_,2,0.78f);
				siranui_action1(world,player_,hand_,0,-0.78f);
				siranui_action1(world,player_,hand_,1,-0.78f);
				siranui_action1(world,player_,hand_,2,-0.78f);
				if(tick>=0)siranui_action1(world,player_,hand_,6-tick,1f);
				if(tick<=3)siranui_action1(world,player_,hand_,6-tick,-1f);
			}

			//煉獄
			if(rengoku_flag) {
				if(tick%3==1) {
					for(float i0=0;i0<2;i0+=0.35) {
						for(float i1=0f;i1<2;i1+=0.6) {rengoku_action(world,player_,hand_,i1,i0,70-tick);}
					}
					for(float i0=0;i0<2;i0+=1) {
						for(float i1=0.5f;i1<3;i1+=1.8) {rengoku_action_HIT(world,player_,hand_,i1,i0,70-tick);}
					}
				}
			}

			//炎虎
			if(enko_flag) {
				if(tick==38) enko_action(world,player_,hand_);
				if(tick%3==1) enko_action_HIT(world,player_,hand_);
			}

			//登り炎天
			if(enten_flag) {
				enten_action(world,player_,hand_,(double)(15-(tick*0.48)));
			}


			if(tick==0)invincible_off(world_,player_,hand_);

		}
	}
	//---------------------------------------------------------------------------

	public void rengoku_action_HIT(World world, EntityPlayer player, EnumHand handIn,float a,float rot,int b) {
		Vec3d look = player.getLookVec();
		Vec3d look1 = look.rotateYaw(0.1f * rot);
		Vec3d look2 = look.rotateYaw(-0.1f * rot);
		HIT_rengoku rengoku_0 = new HIT_rengoku(world);
		HIT_rengoku rengoku_1 = new HIT_rengoku(world);
		HIT_rengoku rengoku_2 = new HIT_rengoku(world);
		rengoku_0.shootingEntity=player;
		rengoku_1.shootingEntity=player;
		rengoku_2.shootingEntity=player;
		rengoku_0.setPosition(player.posX + look.x * 0.8  *b , player.posY+(look.y* b+a), player.posZ + look.z * 0.8*b);
		rengoku_1.setPosition(player.posX + look1.x * 0.8 *b , player.posY+(look1.y*b+a), player.posZ + look1.z *0.8*b);
		rengoku_2.setPosition(player.posX + look2.x * 0.8 *b , player.posY+(look2.y*b+a), player.posZ + look2.z *0.8*b);
		rengoku_0.accelerationX = look.x*3;rengoku_0.accelerationY = look.y ;rengoku_0.accelerationZ = look.z*3;
		rengoku_1.accelerationX = look1.x*3;rengoku_1.accelerationY = look1.y ;rengoku_1.accelerationZ = look1.z*3;
		rengoku_2.accelerationX = look2.x*3;rengoku_2.accelerationY = look2.y ;rengoku_2.accelerationZ = look2.z*3;
		world.spawnEntity((Entity)rengoku_0);
		world.spawnEntity((Entity)rengoku_1);
		world.spawnEntity((Entity)rengoku_2);
	}

	public void rengoku_action(World world, EntityPlayer player, EnumHand handIn,float a,float rot,int b) {
		Vec3d look = player.getLookVec();
		Vec3d look1 = look.rotateYaw(0.1f * rot);
		Vec3d look2 = look.rotateYaw(-0.1f * rot);
		rengoku rengoku_0 = new rengoku(world);
		rengoku rengoku_1 = new rengoku(world);
		rengoku rengoku_2 = new rengoku(world);
		rengoku_0.shootingEntity=player;
		rengoku_1.shootingEntity=player;
		rengoku_2.shootingEntity=player;
		rengoku_0.setPosition(player.posX + look.x * 0.8 * b , player.posY+(look.y* b+a), player.posZ + look.z * 0.8*b);
		rengoku_1.setPosition(player.posX + look1.x * 0.8 *b , player.posY+(look1.y*b+a), player.posZ + look1.z *0.8*b);
		rengoku_2.setPosition(player.posX + look2.x * 0.8 *b , player.posY+(look2.y*b+a), player.posZ + look2.z *0.8*b);
		rengoku_0.accelerationX = look.x*3;rengoku_0.accelerationY = look.y ;rengoku_0.accelerationZ = look.z*3;
		rengoku_1.accelerationX = look1.x*3;rengoku_1.accelerationY = look1.y ;rengoku_1.accelerationZ = look1.z*3;
		rengoku_2.accelerationX = look2.x*3;rengoku_2.accelerationY = look2.y ;rengoku_2.accelerationZ = look2.z*3;
		world.spawnEntity((Entity)rengoku_0);
		world.spawnEntity((Entity)rengoku_1);
		world.spawnEntity((Entity)rengoku_2);
	}
	//----------------------------------------------------------------------------------------

	public void siranui_action1(World world, EntityPlayer player, EnumHand handIn, int dist, float dist2) {
		Vec3d look = player.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * 0.4f);
		Vec3d look3 = look.rotateYaw(-0.1f * 0.4f);
		siranui slash_1 = new siranui(world);
		siranui slash_2 = new siranui(world);
		siranui slash_3 = new siranui(world);
		slash_3.shootingEntity=player;
		slash_2.shootingEntity=player;
		slash_1.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x * dist*dist2, player.posY +5.2D, player.posZ + look.z *dist*dist2);
		slash_1.accelerationX = 0;slash_1.accelerationY = -8;slash_1.accelerationZ = 0;
		world.spawnEntity((Entity)slash_1);
		slash_2.setPosition(player.posX + look2.x * dist*dist2 , player.posY +5.2D, player.posZ + look2.z *dist*dist2);
		slash_2.accelerationX = 0;slash_2.accelerationY = -8;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
		slash_3.setPosition(player.posX + look3.x * dist*dist2 , player.posY +5.2D, player.posZ + look3.z *dist*dist2);
		slash_3.accelerationX = 0;slash_3.accelerationY = -8;slash_3.accelerationZ = 0;
		world.spawnEntity((Entity)slash_3);
	}
	public void siranui_action2(World world, EntityPlayer player, EnumHand handIn, int dist, float dist2) {
		Vec3d look = player.getLookVec();
		Vec3d look3 = look.rotateYaw(-0.1f * 0.78f);
		siranui slash_1 = new siranui(world);
		siranui slash_2 = new siranui(world);
		slash_1.shootingEntity=player;
		slash_2.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x * dist*dist2, player.posY +30.2D, player.posZ + look.z *dist*dist2);
		slash_1.accelerationX = 0;slash_1.accelerationY = -23;slash_1.accelerationZ = 0;
		world.spawnEntity((Entity)slash_1);
		slash_2.setPosition(player.posX + look3.x * dist*dist2 , player.posY +30.2D, player.posZ + look3.z *dist*dist2);
		slash_2.accelerationX = 0;slash_2.accelerationY = -23;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
	}

	//---------------------------------------------------------------------------

	public void enko_action(World world, EntityPlayer player, EnumHand handIn) {
		Vec3d look = player.getLookVec();
		enko_head slash_1 = new enko_head(world);
		slash_1.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x * 4, player.posY +look.y * 2 +2, player.posZ +look.z * 4);
		slash_1.accelerationX = look.x*1.4;slash_1.accelerationY = look.y*1.4 ;slash_1.accelerationZ = look.z*1.4;
		world.spawnEntity((Entity)slash_1);
	}

	public void enko_action_HIT(World world, EntityPlayer player, EnumHand handIn) {
		Vec3d look = player.getLookVec();
		enkoHIT_head slash_1 = new enkoHIT_head(world);
		slash_1.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x * 2, player.posY +1.2 , player.posZ +look.z * 2);
		slash_1.accelerationX = look.x*3;slash_1.accelerationY = look.y ;slash_1.accelerationZ = look.z*3;
		world.spawnEntity((Entity)slash_1);
	}

	//---------------------------------------------------------------------------

	public void enten_action(World world, EntityPlayer player, EnumHand handIn,double dist) {
		Vec3d look = player.getLookVec();
		Vec3d look1 = look.rotateYaw(0.1f * 0.78f);
		Vec3d look2 = look.rotateYaw(-0.1f *0.78f);

		enten rengoku_0 = new enten(world);
		enten rengoku_1 = new enten(world);
		enten rengoku_2 = new enten(world);
		rengoku_0.tick_living=30-tick;
		rengoku_1.tick_living=30-tick;
		rengoku_2.tick_living=30-tick;
		rengoku_0.shootingEntity=player;
		rengoku_1.shootingEntity=player;
		rengoku_2.shootingEntity=player;

		if(look1.y<0) {
			rengoku_0.setPosition(player.posX + look.x *dist, player.posY+0.3, player.posZ + look.z *0.8*dist);
			rengoku_1.setPosition(player.posX + look1.x*dist, player.posY+0.3 *dist, player.posZ + look1.z *0.8*dist);
			rengoku_2.setPosition(player.posX + look2.x*dist, player.posY+0.3 *dist, player.posZ + look2.z *0.8*dist);
		}else{
			rengoku_0.setPosition(player.posX + look.x *dist , player.posY+look.y *dist, player.posZ + look.z *0.8*dist);
			rengoku_1.setPosition(player.posX + look1.x*dist , player.posY+look1.y *dist, player.posZ + look1.z *0.8*dist);
			rengoku_2.setPosition(player.posX + look2.x*dist , player.posY+look2.y *dist, player.posZ + look2.z *0.8*dist);
		}

		rengoku_0.accelerationX =0;rengoku_0.accelerationY = 0.15 ;rengoku_0.accelerationZ =0;
		world.spawnEntity((Entity)rengoku_0);
		rengoku_1.accelerationX =0;rengoku_1.accelerationY = 0.15 ;rengoku_1.accelerationZ =0;
		world.spawnEntity((Entity)rengoku_1);
		rengoku_2.accelerationX =0;rengoku_2.accelerationY = 0.15 ;rengoku_2.accelerationZ =0;
		world.spawnEntity((Entity)rengoku_2);

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

