package com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class enten_HIT extends abs_enten_HIT{
	public int explosionPower = 2;

	public enten_HIT(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public enten_HIT(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public enten_HIT(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}


	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote)
			if (!(result.entityHit == this.shootingEntity) &&
				!(result.entityHit instanceof enten_HIT) &&
		        (result.entityHit != null)) {
				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 12.0F);
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
