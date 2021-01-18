package com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo;

import java.util.Random;
import java.util.UUID;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class abs_minamo extends Entity
{
	public EntityLivingBase shootingEntity;
	private int ticksAlive;
	private int ticksInAir;
	public int tick_living;
	public double accelerationX;
	public double accelerationY;
	public double accelerationZ;
	private int xTile;
	private int yTile;
	private int zTile;
	private Block inTile;
	protected boolean inGround;
	private int ticksInGround;
	protected EntityLivingBase thrower;
	private String throwerName;
	Random r = new Random();

	public abs_minamo(World worldIn) {
		super(worldIn);
	}

	protected void entityInit() {}

	@SideOnly(Side.CLIENT)
	public boolean isInRangeToRenderDist(double distance) {
		double d0 = getEntityBoundingBox().getAverageEdgeLength() * 1.0D;
		if (Double.isNaN(d0)) {
			d0 = 4.0D;
		}
		d0 *= 64.0D;
		return (distance < d0 * d0);
	}

	public abs_minamo(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn);
		setSize(4.0F, 4.0F);
		setPosition(x, y, z);
	}

	public abs_minamo(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn);
		this.shootingEntity = shooter;
		setSize(4.0F, 4.0F);
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		accelX += this.rand.nextGaussian() * 0.4D;
		accelY += this.rand.nextGaussian() * 0.4D;
		accelZ += this.rand.nextGaussian() * 0.4D;
		double d0 = MathHelper.sqrt(accelX * accelX + accelY * accelY + accelZ * accelZ);
		this.accelerationX = accelX / d0 * 0.1D;
		this.accelerationY = accelY / d0 * 0.1D;
		this.accelerationZ = accelZ / d0 * 0.1D;
	}

	public void onUpdate() {

		tick_living++;
		if(tick_living==3)setDead();

		if (this.inGround) {

			if (this.world.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock() == this.inTile) {
				this.ticksInGround++;
				if (this.ticksInGround == 40) {setDead();}

				return;
			}

			this.inGround = false;
			this.motionX *= (this.rand.nextFloat() * 0.2F);
			this.motionY *= (this.rand.nextFloat() * 0.2F);
			this.motionZ *= (this.rand.nextFloat() * 0.2F);

			this.ticksInGround = 0;
			this.ticksInAir = 0;
		} else {
			this.ticksInAir++;
		}


		if (this.world.isRemote || ((this.shootingEntity == null || !this.shootingEntity.isDead) && this.world.isBlockLoaded(new BlockPos(this)))) {

			super.onUpdate();

			this.ticksInAir++;
			RayTraceResult raytraceresult = ProjectileHelper.forwardsRaycast(this, true, (this.ticksInAir >= 25), (Entity)this.shootingEntity);
			if (raytraceresult != null && !ForgeEventFactory.onProjectileImpact(this, raytraceresult)){
				onImpact(raytraceresult);
			}

			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;

			ProjectileHelper.rotateTowardsMovement(this, 0.2F);
			float f = getMotionFactor();

			if (isInWater()) {
				for (int i = 0; i < 4; i++) {
				}
				f = 0.8F;
			}

			this.motionX += this.accelerationX * 0.4D;
			this.motionY += this.accelerationY * 0.4D;
			this.motionZ += this.accelerationZ * 0.4D;
			this.motionX *= f;
			this.motionY *= f;
			this.motionZ *= f;

			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX+(0.3 * r.nextInt(5)), this.posY +(0.21 * r.nextInt(5)), this.posZ+(0.33 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX-(0.2 * r.nextInt(5)), this.posY -(0.11 * r.nextInt(5)), this.posZ-(0.42 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX+(0.1 * r.nextInt(5)), this.posY +(0.15 * r.nextInt(5)), this.posZ+(0.11 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX-(0.2 * r.nextInt(5)), this.posY -(0.16 * r.nextInt(5)), this.posZ-(0.15 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX+(0.4 * r.nextInt(5)), this.posY +(0.31 * r.nextInt(5)), this.posZ+(0.23 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, this.posX-(0.2 * r.nextInt(5)), this.posY -(0.21 * r.nextInt(5)), this.posZ-(0.15 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
		     this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX+(0.21 * r.nextInt(5)), this.posY +(0.21 * r.nextInt(5)), this.posZ+(0.34 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX-(0.5 * r.nextInt(5)), this.posY -(0.41 * r.nextInt(5)), this.posZ-(0.22 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX+(0.21 * r.nextInt(5)), this.posY +(0.31 * r.nextInt(5)), this.posZ+(0.11 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX-(0.12 * r.nextInt(5)), this.posY -(0.1 * r.nextInt(5)), this.posZ-(0.52 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX+(0.47 * r.nextInt(5)), this.posY +(0.21 * r.nextInt(5)), this.posZ+(0.31 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
			 this.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, this.posX-(0.29 * r.nextInt(5)), this.posY -(0.11 * r.nextInt(5)), this.posZ-(0.41 * r.nextInt(5)), 0.0D, 0.0D, 0.0D, new int[0]);
		     this.world.spawnParticle(EnumParticleTypes.WATER_DROP, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);

			setPosition(this.posX, this.posY, this.posZ);
		}
		else {
			setDead();
		}
	}


	protected boolean isFireballFiery() {
		return false;
	}

	protected EnumParticleTypes getParticleType() {
		return EnumParticleTypes.SWEEP_ATTACK;
	}


	protected float getMotionFactor() {
		return 0.95F;
	}


	protected abstract void onImpact(RayTraceResult paramRayTraceResult);


	public static void registerFixesFireball(DataFixer fixer, String name) {}



	public void writeEntityToNBT(NBTTagCompound compound) {
		compound.setTag("direction", (NBTBase)newDoubleNBTList(new double[] { this.motionX, this.motionY, this.motionZ }));
		compound.setTag("power", (NBTBase)newDoubleNBTList(new double[] { this.accelerationX, this.accelerationY, this.accelerationZ }));
		compound.setInteger("life", this.ticksAlive);
	}


	public void readEntityFromNBT(NBTTagCompound compound) {
		if (compound.hasKey("power", 9)) {

			NBTTagList nbttaglist = compound.getTagList("power", 6);

			if (nbttaglist.tagCount() == 3) {

				this.accelerationX = nbttaglist.getDoubleAt(0);
				this.accelerationY = nbttaglist.getDoubleAt(1);
				this.accelerationZ = nbttaglist.getDoubleAt(2);
			}
		}

		this.ticksAlive = compound.getShort("life");

		if (compound.hasKey("direction", 9) && compound.getTagList("direction", 6).tagCount() == 3) {

			NBTTagList nbttaglist1 = compound.getTagList("direction", 6);
			this.motionX = nbttaglist1.getDoubleAt(0);
			this.motionY = nbttaglist1.getDoubleAt(1);
			this.motionZ = nbttaglist1.getDoubleAt(2);
		}
		else {
			setDead();
		}
	}

	public boolean canBeCollidedWith() {
		return true;
	}


	public float getCollisionBorderSize() {
		return 1.0F;
	}


	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (isEntityInvulnerable(source))
		{
			return false;
		}


		this.markVelocityChanged();

		if (source.getTrueSource() != null) {

			Vec3d vec3d = source.getTrueSource().getLookVec();

			if (vec3d != null) {

				this.motionX = vec3d.x;
				this.motionY = vec3d.y;
				this.motionZ = vec3d.z;
				this.accelerationX = this.motionX * 0.1D;
				this.accelerationY = this.motionY * 0.1D;
				this.accelerationZ = this.motionZ * 0.1D;
			}

			if (source.getTrueSource() instanceof EntityLivingBase)
			{
				this.shootingEntity = (EntityLivingBase)source.getTrueSource();
			}

			return true;
		}


		return false;
	}



	public float getBrightness() {
		return 2.0F;
	}


	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		return 15728880;
	}

	@Nullable
	public EntityLivingBase getThrower() {
		if (this.thrower == null && this.throwerName != null && !this.throwerName.isEmpty()) {

			this.thrower = (EntityLivingBase)this.world.getPlayerEntityByName(this.throwerName);

			if (this.thrower == null && this.world instanceof WorldServer) {

				try {

					Entity entity = ((WorldServer)this.world).getEntityFromUuid(UUID.fromString(this.throwerName));

					if (entity instanceof EntityLivingBase)
					{
						this.thrower = (EntityLivingBase)entity;
					}
				}
				catch (Throwable var2) {

					this.thrower = null;
				}
			}
		}

		return this.thrower;
	}
}

