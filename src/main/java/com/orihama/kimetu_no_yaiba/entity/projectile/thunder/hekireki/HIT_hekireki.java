package com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki;

import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.lightning.customLightning;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HIT_hekireki extends abs_hekireki_HIT{
	public int explosionPower = 1;

	public HIT_hekireki(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public HIT_hekireki(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public HIT_hekireki(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}


	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote)
			if (!(result.entityHit == this.shootingEntity) &&
					!(result.entityHit instanceof HIT_hekireki) &&
					!(result.entityHit instanceof customLightning) &&
					result.entityHit != null) {
				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 17.0F);
				applyEnchantments(this.shootingEntity, result.entityHit);
				setDead();
			}
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
