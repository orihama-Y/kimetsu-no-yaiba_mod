package com.orihama.kimetu_no_yaiba.potions;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class Potion_joutyuu extends Potion {
	EntityPlayer player;

	public Potion_joutyuu(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
		setPotionName("effect.joutyuu");
		setIconIndex(0, 0);
		setRegistryName(new ResourceLocation("kimetu_no_yaiba:joutyuu"));
	}

	@Override
	public int getStatusIconIndex(){
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("kimetu_no_yaiba:textures/gui/potion_effects.png"));
		return super.getStatusIconIndex();
	}

	@Override
	public boolean hasStatusIcon() {
		return true;
	}

	@Override
	public boolean shouldRender(PotionEffect effect) { 
		return true; 
	}

}

