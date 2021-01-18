package com.orihama.kimetu_no_yaiba.objects.items;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.kanten.Kanten;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo.HIT_minamo;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo.minamo;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.nagi.Nagi;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.nejire.nejire;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.HIT_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.Sei_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.Seisei;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.takitubo.Takitubo;
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

public class Nitirintou_giyuu extends ItemSword implements IHasModel {
	int tick = 0, tick2 = 0;
	float x=0f;
	EntityPlayer player_;
	EnumHand hand;
	World world_;
	double tmpX,tmpZ;
	double prePosX,prePosY,prePosZ;
	double HprePosX,HprePosY,HprePosZ;
	int takitubo_flag=0,nagi_flag=0,kanten_flag=0, seisei_flag=0,minamo_flag=0,nejire_flag=0,sibuki_flag=0;

	public Nitirintou_giyuu(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("nitirintou_giyuu");
		setRegistryName("nitirintou_giyuu");
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}


	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack item = player.getHeldItem(handIn);
		Vec3d look = player.getLookVec();
		player_=player;
		hand=handIn;
		world_=world;
		this.tmpX = player.motionX;
		this.tmpZ = player.motionZ;

		//滝壺
		if (player.getHeldItemOffhand().getItem() == ItemInit.TAKITUBO_ICON) {
			if(tick==0) {
				tick=50; takitubo_flag =1;
			}
		}

		//凪
		if (player.getHeldItemOffhand().getItem() == ItemInit.NAGI_ICON) {
			if(tick==0) {
				world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.NAGI_SOUND, SoundCategory.AMBIENT, 1f, 1f);
				tick=30; nagi_flag =1;
			}
		}

		//ねじれ渦
		if (player.getHeldItemOffhand().getItem() == ItemInit.NEJIREUZU_ICON) {
			if(tick==0) {
				tick = 120; nejire_flag =1;
			}
		}

		//干天の慈雨
		if (player.getHeldItemOffhand().getItem() == ItemInit.KANTEN_ICON) {
			if(tick==0) {
				world.playSound(player, player.posX+(look.x*4), player.posY+(look.y*4), player.posZ+(look.z*4),  SoundHandler.KANTEN_SOUND, SoundCategory.AMBIENT, 1f, 1f);
				tick=20;tick2=1;kanten_flag =1;
			}

			if(tick2>0) {
				harm_on(world, player,handIn);
				if (player.onGround) {
					player.motionX += 5.8D * look.x;
					player.motionZ += 5.8D * look.z;
				} else {
					player.motionX += 1.2D * look.x;
					player.motionZ += 1.2D * look.z;
				}
			}
		}

		if (player.getHeldItemOffhand().getItem() == ItemInit.SEISEI_ICON) {
			if(tick==0) {
				tick=40; seisei_flag =1;
				prePosX=player.posX+ look.x*4 ;
				prePosY=player.posY+ look.y ;
				prePosZ=player.posZ+ look.z*4 ;
				HprePosX=player.posX+ look.x*6 ;
				HprePosY=player.posY+ look.y;
				HprePosZ=player.posZ+ look.z*6 ;
			}
		}

		//水面斬り
		if (player.getHeldItemOffhand().getItem() == ItemInit.MINAMO_ICON) {
			if(tick==0) {
				world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.MINAMO_SOUND, SoundCategory.AMBIENT, 1f, 1f);
				tick=100; minamo_flag=1;
			}
		}

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

	}


	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {

		if(tick<=0) {
			tick=0; x=0;
			takitubo_flag = nagi_flag= kanten_flag =seisei_flag= minamo_flag=nejire_flag=sibuki_flag=0;
		}

		if(this.tick>0) {
			this.tick--;

			//滝壺
			if (takitubo_flag!=0) {
				if(tick<=45) x+=0.6;
				if(tick == 45){
					for(int a=0;a<=6;a++) {takitubo_action_1(world,player_,hand,x,a);}
				}
				if(tick % 3 == 1) {
					for(int a=0;a<=6;a++) {takitubo_action_2(world,player_,hand,x,a);}
				}
			}

			//ねじれ渦
			if(nejire_flag!=0) {
				harm_on(world, player_,hand);
				if(tick >10)nejire_action(world,player_,hand,(float) (120-tick)*13,2);
			}

			//水流飛沫
			if(sibuki_flag!=0) {
				harm_on(world, player_,hand);
				if(tick >10)nejire_action(world,player_,hand,(float) (120-tick)*7,2);

			}

			//凪
			if (nagi_flag!=0) {
				tick2 =0 ;
				if(tick < 30)x+=1.2;
				if(tick < 30) {
					if(tick % 10==0)for(int a=1;a<16;a+=2)nagi_action1(world,player_,hand,a);
					if(tick % 10==1)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==1)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x+15,a);
					if(tick % 10==2)for(int a=1;a<12;a++)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==2)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x+12,a);
					if(tick % 10==3)for(int a=1;a<13;a+=3)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==3)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x+11,a);
					if(tick % 10==4)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==4)for(int a=1;a<15;a++)nagi_action2(world,player_,hand,x+12,a);
					if(tick % 10==5)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==5)for(int a=1;a<14;a++)nagi_action2(world,player_,hand,x+10,a);
					if(tick % 10==6)for(int a=1;a<16;a+=2)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==6)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x+12,a);
					if(tick % 10==7)for(int a=1;a<18;a+=1)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==7)for(int a=1;a<16;a++)nagi_action2(world,player_,hand,x+8,a);
					if(tick % 10==8)for(int a=1;a<17;a++)nagi_action2(world,player_,hand,x,a);
					if(tick % 10==9)for(int a=1;a<16;a+=3)nagi_action2(world,player_,hand,x+9,a);
				}
			}

			//干天の慈雨
			if (kanten_flag!=0) {
				if(tick>=19 && tick %3 ==0) {
					for(float a=0;a<1.4;a+=0.4)kanten_action2(world,player_,hand,0,a);
				}

				kanten_action1(world,player_,hand,0,1f);
				kanten_action1(world,player_,hand,1,1f);
				kanten_action1(world,player_,hand,2,1f);
				kanten_action1(world,player_,hand,0,0.78f);
				kanten_action1(world,player_,hand,1,0.78f);
				kanten_action1(world,player_,hand,2,0.78f);
				kanten_action1(world,player_,hand,0,-0.78f);
				kanten_action1(world,player_,hand,1,-0.78f);
				kanten_action1(world,player_,hand,2,-0.78f);
				if(tick>=0)kanten_action1(world,player_,hand,6-tick,1f);
				if(tick<=3)kanten_action1(world,player_,hand,6-tick,-1f);

			}

			//水面斬り
			if (minamo_flag!=0) {
				if(tick % 1==0)for(int a=1;a<=5;a++)minamo_action1(world,player_,hand);
				if(tick % 1==0)for(int a=1;a<=5;a++)minamo_action2(world,player_,hand);
			}


			//生生流転（とりあえず放置）
			if (seisei_flag!=0) {
				if(tick>=0)seisei_action1(world,player_,hand,40-tick);
				if(tick>=0)seisei_action2(world,player_,hand,40-tick);
				if(tick>=0)HIT_head(world,player_,hand,40-tick);
				if(tick>=0)HIT_head2(world,player_,hand,40-tick);
				if(tick>=0)HIT_head3(world,player_,hand,40-tick);
			}

			if(tick==0) harm_off(world_,player_,hand);

		}
	}



	//----------------------------------------------------------------------------------------

	public void takitubo_action_1(World world, EntityPlayer player, EnumHand handIn,float d,float e) {
		world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.TAKITUBO_SOUND, SoundCategory.AMBIENT, 0.8f, 1f);
		Vec3d look = player.getLookVec();
		Vec3d look0 = look.rotateYaw(0.1f * 0.5f);
		Vec3d look1 = look.rotateYaw(-0.1f * 0.5f);
		Takitubo slash_0 = new Takitubo(world);
		Takitubo slash_1 = new Takitubo(world);
		slash_0.shootingEntity=player;
		slash_1.shootingEntity=player;
		slash_0.setPosition(player.posX + look0.x * e , player.posY +8.9D, player.posZ + look0.z *e);
		slash_0.accelerationX = 0;slash_0.accelerationY = -2.4;slash_0.accelerationZ = 0;
		world.spawnEntity((Entity)slash_0);
		slash_1.setPosition(player.posX + look1.x * e , player.posY +8.9D, player.posZ + look1.z *e);
		slash_1.accelerationX = 0;slash_1.accelerationY = -2.4D;slash_1.accelerationZ = 0;
		world.spawnEntity((Entity)slash_1);
	}

	public void takitubo_action_2(World world, EntityPlayer player, EnumHand handIn, float d,float e) {
		world.playSound(player, player.posX, player.posY, player.posZ,  SoundHandler.TAKITUBO_SOUND, SoundCategory.AMBIENT, 0.8f, 1f);
		Vec3d look = player.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * d);
		Vec3d look3 = look.rotateYaw(-0.1f * d);
		Takitubo slash_2 = new Takitubo(world);
		Takitubo slash_3 = new Takitubo(world);
		slash_2.shootingEntity=player;
		slash_3.shootingEntity=player;
		slash_2.setPosition(player.posX + look2.x * e , player.posY +8.9D, player.posZ + look2.z *e);
		slash_2.accelerationX = 0;slash_2.accelerationY = -2.4;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
		slash_3.setPosition(player.posX + look3.x * e , player.posY +8.9D, player.posZ + look3.z *e);
		slash_3.accelerationX = 0;slash_3.accelerationY = -2.4D;slash_3.accelerationZ = 0;
		world.spawnEntity((Entity)slash_3);
	}

	//------------------------------------------------------------------------------------------

	public void nejire_action(World world, EntityPlayer player, EnumHand handIn, float e,int x) {
		Vec3d look = player.getLookVec();
		for(int k=0;k<3;k++) {
			for(int i=0;i<9;i++) {
				Vec3d look2 = look.rotateYaw(0.03f * e);
				nejire slash = new nejire(world);
				slash.shootingEntity=player;
				slash.accelerationX = look2.x*1.6; slash.accelerationY = look2.y*1.2;slash.accelerationZ = look2.z*1.6;
				if(look.y<0) {slash.setPosition(player.posX+look2.x * i , player.posY + look.y + 0.2+k , player.posZ + look2.z * i);}
				else {slash.setPosition(player.posX+look2.x * i , player.posY + look.y * i*0.2+k ,player.posZ + look2.z * i);}
				world.spawnEntity((Entity)slash);
			}
		}
	}

	//------------------------------------------------------------------------------------------

	public void nagi_action1(World world, EntityPlayer player, EnumHand handIn,float e) {
		Vec3d look = player.getLookVec();
		Nagi slash_0 = new Nagi(world);
		Nagi slash_1 = new Nagi(world);
		slash_0.shootingEntity=player;
		slash_1.shootingEntity=player;
		slash_0.setPosition(player.posX + look.x *e, player.posY + look.y+3D , player.posZ + look.z *e);
		slash_0.accelerationX = 0;slash_0.accelerationY = -0.7;slash_0.accelerationZ = 0;
		world.spawnEntity((Entity)slash_0);
		slash_1.setPosition(player.posX - look.x *e, player.posY + look.y+3D , player.posZ - look.z *e);
		slash_1.accelerationX = 0;slash_1.accelerationY = -0.7;slash_1.accelerationZ = 0;
		world.spawnEntity((Entity)slash_1);
	}

	public void nagi_action2(World world, EntityPlayer player, EnumHand handIn, float d,float e) {
		Vec3d look = player.getLookVec().rotateYaw(0.1f * d);
		Nagi slash_2 = new Nagi(world);
		Nagi slash_3 = new Nagi(world);
		slash_2.shootingEntity=player;
		slash_3.shootingEntity=player;
		slash_2.setPosition(player.posX + look.x * e , player.posY +3D, player.posZ + look.z *e);
		slash_2.accelerationX = 0;slash_2.accelerationY = -7;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
		slash_3.setPosition(player.posX - look.x * e , player.posY +3D, player.posZ - look.z *e);
		slash_3.accelerationX = 0;slash_3.accelerationY = -0.7;slash_3.accelerationZ = 0;
		world.spawnEntity((Entity)slash_3);
	}

	//------------------------------------------------------------------------------------------

	public void kanten_action1(World world, EntityPlayer player, EnumHand handIn, int e, float d) {
		Vec3d look = player.getLookVec();
		Vec3d look2 = look.rotateYaw(0.1f * 0.4f);
		Vec3d look3 = look.rotateYaw(-0.1f * 0.4f);
		Kanten slash_1 = new Kanten(world);
		Kanten slash_2 = new Kanten(world);
		Kanten slash_3 = new Kanten(world);
		slash_3.shootingEntity=player;
		slash_2.shootingEntity=player;
		slash_1.shootingEntity=player;
		slash_1.setPosition(player.posX + look.x * e*d, player.posY +3.1D, player.posZ + look.z *e*d);
		slash_1.accelerationX = 0;slash_1.accelerationY = -8;slash_1.accelerationZ = 0;
		world.spawnEntity((Entity)slash_1);
		slash_2.setPosition(player.posX + look2.x * e*d , player.posY +3.1D, player.posZ + look2.z *e*d);
		slash_2.accelerationX = 0;slash_2.accelerationY = -8;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
		slash_3.setPosition(player.posX + look3.x * e*d , player.posY +3.1D, player.posZ + look3.z *e*d);
		slash_3.accelerationX = 0;slash_3.accelerationY = -8;slash_3.accelerationZ = 0;
		world.spawnEntity((Entity)slash_3);
	}
	public void kanten_action2(World world, EntityPlayer player, EnumHand handIn, int d, float e) {
		Vec3d look = player.getLookVec();

		Kanten slash_2 = new Kanten(world);
		Kanten slash_3 = new Kanten(world);
		slash_2.shootingEntity=player;
		slash_3.shootingEntity=player;

		slash_2.setPosition(player.posX + look.x , player.posY+look.y+d, player.posZ + look.z );
		slash_2.accelerationX = look.x*6; slash_2.accelerationY = look.y*5 ; slash_3.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash_2);

		slash_3.setPosition(player.posX + look.x  , player.posY+look.y+d, player.posZ + look.z );
		slash_3.accelerationX = look.x*6; slash_3.accelerationY = look.y*5 ; slash_3.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash_3);
	}

	//------------------------------------------------------------------------------------------
	public void seisei_action1(World world, EntityPlayer player, EnumHand handIn, int e) {
		Vec3d look = player.getLookVec();
		float yaw = player.getRotationYawHead();
		Seisei slash = new Seisei(world);
		slash.shootingEntity=player;
		slash.setLocationAndAngles(prePosX + look.x * e * 0.1 , prePosY + look.y  * 0.1 , prePosZ + look.z *e* 0.1, -yaw,(float) look.y);
		prePosX = prePosX + look.x * e * 0.1;
		prePosY = prePosY + look.y * e * 0.1;
		prePosZ = prePosZ + look.z * e * 0.1;
		slash.accelerationX = 0;slash.accelerationY=0;slash.accelerationZ = 0;
		world.spawnEntity((Entity)slash);
	}

	public void seisei_action2(World world, EntityPlayer player, EnumHand handIn, int e) {
		Vec3d look = player.getLookVec();
		float yaw = player.getRotationYawHead();

		Sei_head slash = new Sei_head(world);
		slash.shootingEntity=player;
		//slash.setPosition(HprePosX + look.x * e * 0.1 , HprePosY + look.x  * 0.1 , HprePosZ + look.z *e* 0.1);
		slash.setLocationAndAngles(HprePosX + look.x * e * 0.1 , HprePosY + look.y  * 0.1 , HprePosZ + look.z *e* 0.1,-yaw, (float) look.y);
		HprePosX = HprePosX + look.x * e * 0.1;
		HprePosY = HprePosY + look.y * e * 0.1;
		HprePosZ = HprePosZ + look.z * e * 0.1;
		slash.accelerationX = 0 ;slash.accelerationY=0;slash.accelerationZ = 0;
		world.spawnEntity((Entity)slash);
	}

	public void HIT_head(World world, EntityPlayer player, EnumHand handIn, int e) {
		Vec3d look = player.getLookVec();
		HIT_head slash = new HIT_head(world);
		slash.shootingEntity=player;
		slash.setPosition(prePosX + look.x * e * 0.07 , (prePosY+1) *look.y , prePosZ + look.z *e* 0.07);
		prePosX = prePosX + look.x * e * 0.1;
		prePosY = prePosY + look.y * e * 0.1;
		prePosZ = prePosZ + look.z * e * 0.1;
		slash.accelerationX = look.x*6;slash.accelerationY = look.y*5 ;slash.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash);
	}
	public void HIT_head2(World world, EntityPlayer player, EnumHand handIn, int e) {
		Vec3d look0 =  player.getLookVec().rotateYaw(0.1f * 0.5f);
		Vec3d look1 =  player.getLookVec().rotateYaw(-0.1f * 0.5f);
		HIT_head slash = new HIT_head(world);
		HIT_head slash2 = new HIT_head(world);
		slash2.shootingEntity=player;
		slash.shootingEntity=player;

		slash.setPosition(prePosX + look0.x * e * 0.07 , prePosY+1.3 , prePosZ + look0.z *e* 0.07);
		prePosX = prePosX + look0.x * e * 0.1;
		prePosY = prePosY + look0.y * e * 0.1;
		prePosZ = prePosZ + look0.z * e * 0.1;
		slash.accelerationX = look0.x*6;
		slash.accelerationY = look0.y*5;
		slash.accelerationZ = look0.z*6;
		world.spawnEntity((Entity)slash);

		slash2.setPosition(prePosX + look1.x * e * 0.07 , prePosY+1.3 , prePosZ + look1.z *e* 0.07);
		prePosX = prePosX + look1.x * e * 0.1;
		prePosY = prePosY + look1.y * e * 0.1;
		prePosZ = prePosZ + look1.z * e * 0.1;
		slash2.accelerationX = look1.x*6;slash2.accelerationY = look1.y*5 ;slash2.accelerationZ = look1.z*6;
		world.spawnEntity((Entity)slash2);
	}
	public void HIT_head3(World world, EntityPlayer player, EnumHand handIn, int e) {
		Vec3d look = player.getLookVec();
		HIT_head slash = new HIT_head(world);
		slash.shootingEntity=player;
		slash.setPosition(prePosX + look.x * (e+0.5) * 0.07 , prePosY+1.3, prePosZ + look.z *(e+0.5)* 0.07);
		prePosX = prePosX + look.x * e * 0.1;
		prePosY = prePosY + look.y * e * 0.1;
		prePosZ = prePosZ + look.z * e * 0.1;
		slash.accelerationX = look.x*6;slash.accelerationY = look.y*5 ;slash.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash);
	}

	//------------------------------------------------------------------------------------------

	public void minamo_action1(World world, EntityPlayer player, EnumHand handIn) {
		Vec3d look = player.getLookVec();
		HIT_minamo slash_2 = new HIT_minamo(world);
		HIT_minamo slash_3 = new HIT_minamo(world);
		HIT_minamo slash_4 = new HIT_minamo(world);
		slash_2.shootingEntity=player;
		slash_3.shootingEntity=player;
		slash_4.shootingEntity=player;
		slash_2.setPosition(player.posX + look.x *1.4 , player.posY+look.y+1.2, player.posZ + look.z *1.4);
		slash_2.accelerationX = look.x*6;slash_2.accelerationY = look.y*3 ;slash_3.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash_2);
		slash_3.setPosition(player.posX + look.x *1.4 , player.posY+look.y+1.7, player.posZ + look.z *1.4);
		slash_3.accelerationX = look.x*6;slash_3.accelerationY = look.y*5 ;slash_3.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash_3);
		slash_4.setPosition(player.posX + look.x *1.4 , player.posY+look.y+1.7, player.posZ + look.z *1.4);
		slash_4.accelerationX = look.x*6;slash_4.accelerationY = look.y*5 ;slash_4.accelerationZ = look.z*6;
		world.spawnEntity((Entity)slash_4);
	}
	public void minamo_action2(World world, EntityPlayer player, EnumHand handIn) {
		Vec3d look = player.getLookVec();
		minamo slash_2 = new minamo(world);
		slash_2.shootingEntity=player;
		slash_2.setPosition(player.posX + look.x *3 , player.posY+look.y*2+player.eyeHeight, player.posZ + look.z *3);
		slash_2.accelerationX = 0;slash_2.accelerationY = 0 ;slash_2.accelerationZ = 0;
		world.spawnEntity((Entity)slash_2);
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

