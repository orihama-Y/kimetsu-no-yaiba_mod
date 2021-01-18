package com.orihama.kimetu_no_yaiba.util.handlers;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityKokushibou;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;
import com.orihama.kimetu_no_yaiba.entity.projectile.beast.ugatinuki.ugatinuki;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enkoHIT_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enko_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten.enten;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten.enten_HIT;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.HIT_rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.insect.tawamure.tawamure;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.kasumi.kasumi;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.oboro.oboro;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.moon_slash.abs_moon;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.moon_slash.moon;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.rinbi.rinbi;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.HIT_hekireki;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom2;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom3;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo.HIT_minamo;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo.minamo;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.nagi.Nagi;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.nejire.nejire;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.Sei_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.Seisei;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.takitubo.Takitubo;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.idaten.idaten;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.kokuhuu.kokuhuu;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.kokuhuu.kokuhuu_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.sinato.sinato;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.sinato.sinato_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.sogi.HIT_sogi;
import com.orihama.kimetu_no_yaiba.entity.projectile.wind.sogi.sogi;
import com.orihama.kimetu_no_yaiba.init.BlockInit;
import com.orihama.kimetu_no_yaiba.init.EntityInit;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@EventBusSubscriber
public class RegistryHandler {

	@Instance
	public static kimetu_no_yaiba_MOD instance;

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ItemInit.ITEMS) {
			if (item instanceof IHasModel)
				((IHasModel)item).registerModels();
		}
		for (Block block : BlockInit.BLOCKS) {
			if (block instanceof IHasModel)
				((IHasModel)block).registerModels();
		}
	}

	public static void preInitRegistries(FMLPreInitializationEvent event) {
		EntityInit.registerEntities();
		EntityRegistry.addSpawn(EntityKokushibou.class, 1, 1, 1, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.FOREST_HILLS );
		EntityRegistry.addSpawn(EntityTeoni.class, 3, 1, 1, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.FOREST_HILLS );
	}

	public static void initRegistries() {
		SoundHandler.registerSounds();

		EntityRegistry.registerModEntity(new ResourceLocation("takitubo"),    Takitubo.class,    "takitubo",    4,  instance, 51, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("nagi"),        Nagi.class,        "nagi",        5,  instance, 51, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kanten"),      Nagi.class,        "kanten",      7,  instance, 51, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("seisei"),      Seisei.class,      "seisei",      8,  instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("sei_head"),    Sei_head.class,    "sei_head",    9,  instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("minamo2"),     HIT_minamo.class,  "minamo2",     10, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("minamo"),      minamo.class,      "minamo",      11, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("hit_rengoku"), HIT_rengoku.class, "hit_rengoku", 15, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("rengoku"),     rengoku.class,     "rengoku",     15, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("siranui"),     rengoku.class,     "siranui",     16, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("hit_enten"),   enten_HIT.class,   "hit_enten",   17, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("enten"),       enten.class,       "enten",       18, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ugatinuki"),   ugatinuki.class,   "ugatinuki",   19, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("enko_head"),   enko_head.class,   "enko_head",   20, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("enkoHIT_head"),enkoHIT_head.class,"enkoHIT_head",21, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kasumi"),      kasumi.class,      "kasumi",      22, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kasumi_hit"),  kasumi.class,      "kasumi_hit",  23, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("oboro"),       oboro.class,       "oboro",       24, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("nejire"),      nejire.class,      "nejire",      25, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("hit_sogi"),    HIT_sogi.class,    "hit_sogi",    26, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("sogi"),        sogi.class,        "sogi",        27, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kokuhuu"),     kokuhuu.class,     "kokuhuu",     28, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("idaten"),      idaten.class,      "idaten",      29, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("sinato"),      sinato.class,      "sinato",      30, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kokuhuu_hit"), kokuhuu_hit.class, "kokuhuu_hit", 31, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("sinato_hit"),  sinato_hit.class,  "sinato_hit",  32, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("hekireki"),    HIT_hekireki.class,"hekireki",    33, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("tawamure"),    tawamure.class,    "tawamure",    34, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("moon"),        moon.class,        "moon",        35, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("abs_moon"),    abs_moon.class,    "abs_moon",    36, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kataware"),    kataware.class,    "kataware",    37, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kataware_hit"),kataware_hit.class,"kataware_hit",38, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kataware"),    kataware.class,    "kataware",    37, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("kataware_hit"),kataware_hit.class,"kataware_hit",38, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("tukibae"),     tukibae.class,     "tukibae",     39, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("tukibae_hit"), tukibae_hit.class, "tukibae_hit", 40, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("rinbi"),       rinbi.class,       "rinbi",       41, instance, 54, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("lightning_custom"), lightning_custom.class, "lightning_custom", 12, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("lightning_custom2"),lightning_custom2.class, "lightning_custom2", 13, instance, 52, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("lightning_custom3"),lightning_custom3.class, "lightning_custom3", 14, instance, 52, 1, true);

	}

	public static void postInitRegistries() {}
	public static void serverRegistries(FMLServerStartingEvent event) {}

}