package com.orihama.kimetu_no_yaiba.entity.projectile.beast.ugatinuki;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ugatinuki extends abs_ugatinuki {
	public int explosionPower = 1;

	public ugatinuki(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public ugatinuki(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public ugatinuki(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}


	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote)
			if ( !(result.entityHit == this.shootingEntity) &&
					!(result.entityHit instanceof ugatinuki) &&
					result.entityHit != null) {

				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 13.0F);
				Vec3d l= shootingEntity.getLookVec();
				result.entityHit.addVelocity( 2.5*(l.x) ,0, 2.5*(l.z));
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
