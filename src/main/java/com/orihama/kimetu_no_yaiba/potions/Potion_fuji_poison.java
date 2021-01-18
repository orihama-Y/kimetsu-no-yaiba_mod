package com.orihama.kimetu_no_yaiba.potions;

import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;
import com.orihama.kimetu_no_yaiba.util.handlers.CustomDamageSource;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class Potion_fuji_poison extends Potion {
	EntityPlayer player;

	public Potion_fuji_poison(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
		setPotionName("effect.fuji_poison");
		setIconIndex(0, 0);
		setRegistryName(new ResourceLocation("kimetu_no_yaiba:fuji_poison"));
	}

	@Override
	public int getStatusIconIndex(){
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("kimetu_no_yaiba:textures/gui/potion_fuji_poison.png"));
		return super.getStatusIconIndex();
	}

	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("kimetu_no_yaiba:textures/gui/potion_fuji_poison.png"));
		return true;
	}

	@Override
	public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier){
		if (!(entityLivingBaseIn instanceof  EntityTeoni)){
			entityLivingBaseIn.attackEntityFrom(CustomDamageSource.cds_fusi_poison, 1F);
		}else {
			entityLivingBaseIn.attackEntityFrom(CustomDamageSource.cds_fusi_poison, 3F);
		}
	}

    @Override
    public boolean isInstant(){
        return false;
    }

    @Override
    public boolean isReady(int duration, int amplifier){
        return true;
    }



}

