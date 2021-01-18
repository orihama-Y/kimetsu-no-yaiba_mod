package com.orihama.kimetu_no_yaiba.entity.projectile.water.takitubo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Takitubo extends abs_takitubo {
	public int explosionPower = 1;

	public Takitubo(World worldIn) {
		super(worldIn);
	}

	@SideOnly(Side.CLIENT)
	public Takitubo(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
	}

	public Takitubo(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}

	protected void onImpact(RayTraceResult result) {
		if (!this.getEntityWorld().isRemote)
			if (!(result.entityHit instanceof net.minecraft.entity.player.EntityPlayer) &&
					!(result.entityHit instanceof Takitubo) &&
					result.entityHit != null) {
				result.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this.shootingEntity), 8.0F);
				applyEnchantments(this.shootingEntity, result.entityHit);
				boolean bool = ForgeEventFactory.getMobGriefingEvent(this.world, (Entity)this.shootingEntity);

				this.world.createExplosion(this, this.posX, this.posY, this.posZ, this.explosionPower * 0.9F, bool);
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
