
package com.orihama.kimetu_no_yaiba.init;

 import com.orihama.kimetu_no_yaiba.potions.Potion_fuji_poison;
import com.orihama.kimetu_no_yaiba.potions.Potion_joutyuu;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.MathHelper;

 public class PotionInit
 {
   public static final Potion JOUTYUU_POTION_EFFECT_SPEED =
		   new Potion_joutyuu(false, 13796663).registerPotionAttributeModifier(SharedMonsterAttributes.MAX_HEALTH,MathHelper.getRandomUUID().toString(), 0.0D, 2);
   public static final Potion FUJIPOISON_POTION_EFFECT =
           new Potion_fuji_poison(true, 13796664).registerPotionAttributeModifier(SharedMonsterAttributes.MAX_HEALTH,MathHelper.getRandomUUID().toString(), 0.0D, 2);
 }
