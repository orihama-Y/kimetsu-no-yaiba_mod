package com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class enten extends abs_enten {
	public int explosionPower = 1;

	public enten(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public enten(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public enten(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}


	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote)
			if (!(result.entityHit instanceof net.minecraft.entity.player.EntityPlayer) &&
					!(result.entityHit instanceof enten) &&
					result.entityHit != null) {
				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 12.0F);

				if(result.entityHit instanceof EntityLivingBase)
				((EntityLivingBase) result.entityHit).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 50));
				applyEnchantments(this.shootingEntity, result.entityHit);
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
