package com.orihama.kimetu_no_yaiba.init;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityKokushibou;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void registerEntities() {
		EntityRegistry.registerModEntity(new ResourceLocation("teoni"), EntityTeoni.class, "teoni", 200, kimetu_no_yaiba_MOD.instance, 50, 1, true, 30000, 16777086);
		EntityRegistry.registerModEntity(new ResourceLocation("kokushibou"), EntityKokushibou.class, "kokushibou", 201, kimetu_no_yaiba_MOD.instance, 51, 1, true,0x4b0082 , 0x000000);
	}

}

