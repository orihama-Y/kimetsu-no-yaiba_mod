package com.orihama.kimetu_no_yaiba;


import com.orihama.kimetu_no_yaiba.creativetabs.KimetuTab;
import com.orihama.kimetu_no_yaiba.proxy.CommonProxy;
import com.orihama.kimetu_no_yaiba.util.Reference;
import com.orihama.kimetu_no_yaiba.util.handlers.RecipeHandler;
import com.orihama.kimetu_no_yaiba.util.handlers.RegistryHandler;
import com.orihama.kimetu_no_yaiba.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.MC_VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.MC_VERSION)
public class kimetu_no_yaiba_MOD {

	public static final CreativeTabs kimetu_tabs = new KimetuTab("kimetutab");

	@Instance
	public static kimetu_no_yaiba_MOD instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries(event);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
		RecipeHandler.registerCraftingRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}

	@EventHandler
	public void serverInit(FMLServerStartingEvent event) {}
}
