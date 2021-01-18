package com.orihama.kimetu_no_yaiba.util.handlers;

import com.orihama.kimetu_no_yaiba.proxy.client.butterfly_particle;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particle;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particle2;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particle3;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particleB1;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particleB2;
import com.orihama.kimetu_no_yaiba.proxy.client.moon_particleB3;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class particle_spawns {
	private static Minecraft mc = Minecraft.getMinecraft();

	@SideOnly(Side.CLIENT)
	public static Particle spawnParticle(particle_enum type, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed) {

		if (mc != null && mc.getRenderViewEntity() != null && mc.effectRenderer != null) {

			Particle but_particle = null ;
			int settings = mc.gameSettings.particleSetting;
			if (settings == 1 && mc.world.rand.nextInt(3) == 0)settings = 2;
			double positionX = (mc.getRenderViewEntity()).posX - xCoord;
			double positionY = (mc.getRenderViewEntity()).posY - yCoord;
			double positionZ = (mc.getRenderViewEntity()).posZ - zCoord;
			double dis = 50.0D;


			if ( (positionX * positionX + positionY * positionY + positionZ * positionZ > dis * dis) || (settings > 1)) {
				return null;
			}

			if (type == particle_enum.BUTTERFLY) {
				 but_particle = new butterfly_particle(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON1) {
				 but_particle = new moon_particle(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON2) {
				 but_particle = new moon_particle2(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON3) {
				 but_particle = new moon_particle3(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON1B) {
				 but_particle = new moon_particleB1(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON2B) {
				 but_particle = new moon_particleB2(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			if (type == particle_enum.MOON3B) {
				 but_particle = new moon_particleB3(mc.world, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
			}
			mc.effectRenderer.addEffect(but_particle);
		    return but_particle;

		}
		return null;
	}

}
