package com.orihama.kimetu_no_yaiba.entity.projectile.insect.tawamure;


import com.orihama.kimetu_no_yaiba.init.PotionInit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class tawamure extends abs_tawamure {
	public int explosionPower = 1;

	public tawamure(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public tawamure(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public tawamure(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}

	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote) {
			if (!(result.entityHit instanceof tawamure)	&& result.entityHit != null) {
				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 5.0F);

				if(result.entityHit instanceof EntityLivingBase)
					((EntityLivingBase) result.entityHit).addPotionEffect(new PotionEffect(PotionInit.FUJIPOISON_POTION_EFFECT, 150, 0, false, false));
				if(result.entityHit instanceof EntityPlayer)
					((EntityPlayer) result.entityHit).addPotionEffect(new PotionEffect(PotionInit.FUJIPOISON_POTION_EFFECT, 150, 0, false, false));

				applyEnchantments(this.shootingEntity, result.entityHit);
			}
		}
		setDead();

	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setInteger("ExplosionPower", this.explosionPower);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);

		if (compound.hasKey("ExplosionPower", 99))
		{
			this.explosionPower = compound.getInteger("ExplosionPower");
		}
	}
}
