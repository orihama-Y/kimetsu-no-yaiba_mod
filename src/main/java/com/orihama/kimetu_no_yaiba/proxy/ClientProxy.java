package com.orihama.kimetu_no_yaiba.proxy;

import com.orihama.kimetu_no_yaiba.entity.monster.EntityKokushibou;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enkoHIT_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enko_head;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten.enten;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enten.enten_HIT;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.HIT_rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.rengoku.rengoku;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.siranui.siranui;
import com.orihama.kimetu_no_yaiba.entity.projectile.insect.tawamure.tawamure;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.kasumi.kasumi;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.kasumi.kasumi_HIT;
import com.orihama.kimetu_no_yaiba.entity.projectile.mist.oboro.oboro;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.kataware.kataware_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.moon_slash.moon;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.rinbi.rinbi;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae;
import com.orihama.kimetu_no_yaiba.entity.projectile.moon.tukibae.tukibae_hit;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.HIT_hekireki;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom2;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.lightning.customLightning;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.kanten.Kanten;
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

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public static void preInitClientOnly(){
	}

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		RenderingRegistry.registerEntityRenderingHandler(customLightning.class, com.orihama.kimetu_no_yaiba.entity.render.thunder.Render_Lbolt::new);
	    RenderingRegistry.registerEntityRenderingHandler(Takitubo.class, com.orihama.kimetu_no_yaiba.entity.render.water.takitubo.Render_takitubo::new);
	    RenderingRegistry.registerEntityRenderingHandler(Nagi.class, com.orihama.kimetu_no_yaiba.entity.render.water.nagi.Render_nagi::new);
	    RenderingRegistry.registerEntityRenderingHandler(Kanten.class, com.orihama.kimetu_no_yaiba.entity.render.water.kanten.Render_kanten::new);
	    RenderingRegistry.registerEntityRenderingHandler(Seisei.class, com.orihama.kimetu_no_yaiba.entity.render.water.seisei.Render_seisei::new);
	    RenderingRegistry.registerEntityRenderingHandler(Sei_head.class, com.orihama.kimetu_no_yaiba.entity.render.water.seisei.Render_head_seisei::new);
	    RenderingRegistry.registerEntityRenderingHandler(HIT_minamo.class, com.orihama.kimetu_no_yaiba.entity.render.water.minamo.Render_minamo::new);
	    RenderingRegistry.registerEntityRenderingHandler(minamo.class, com.orihama.kimetu_no_yaiba.entity.render.water.minamo.Render_minamo2::new);
	    RenderingRegistry.registerEntityRenderingHandler(lightning_custom.class, com.orihama.kimetu_no_yaiba.entity.render.thunder.Render_lightning::new);
	    RenderingRegistry.registerEntityRenderingHandler(lightning_custom2.class, com.orihama.kimetu_no_yaiba.entity.render.thunder.Render_lightning2::new);
	    RenderingRegistry.registerEntityRenderingHandler(HIT_rengoku.class, com.orihama.kimetu_no_yaiba.entity.render.flame.rengoku.Render_rengoku::new);
	    RenderingRegistry.registerEntityRenderingHandler(rengoku.class, com.orihama.kimetu_no_yaiba.entity.render.flame.rengoku.Render_rengoku2::new);
	    RenderingRegistry.registerEntityRenderingHandler(siranui.class, com.orihama.kimetu_no_yaiba.entity.render.flame.siranui.Render_siranui::new);
	    RenderingRegistry.registerEntityRenderingHandler(enten_HIT.class, com.orihama.kimetu_no_yaiba.entity.render.flame.enten.Render_enten_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(enten.class, com.orihama.kimetu_no_yaiba.entity.render.flame.enten.Render_enten::new);
	    RenderingRegistry.registerEntityRenderingHandler(enko_head.class, com.orihama.kimetu_no_yaiba.entity.render.flame.enko.Render_head_enko::new);
	    RenderingRegistry.registerEntityRenderingHandler(enkoHIT_head.class, com.orihama.kimetu_no_yaiba.entity.render.flame.enko.Render_enko_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(kasumi.class, com.orihama.kimetu_no_yaiba.entity.render.mist.Render_kasumi::new);
	    RenderingRegistry.registerEntityRenderingHandler(kasumi_HIT.class, com.orihama.kimetu_no_yaiba.entity.render.mist.Render_kasumi_HIT::new);
	    RenderingRegistry.registerEntityRenderingHandler(oboro.class, com.orihama.kimetu_no_yaiba.entity.render.mist.oboro.Render_oboro_slash::new);
	    RenderingRegistry.registerEntityRenderingHandler(nejire.class, com.orihama.kimetu_no_yaiba.entity.render.water.nejire.Render_nejire::new);
	    RenderingRegistry.registerEntityRenderingHandler(HIT_sogi.class, com.orihama.kimetu_no_yaiba.entity.render.wind.sogi.Render_sogi::new);
	    RenderingRegistry.registerEntityRenderingHandler(sogi.class, com.orihama.kimetu_no_yaiba.entity.render.wind.sogi.Render_sogi2::new);
	    RenderingRegistry.registerEntityRenderingHandler(kokuhuu.class, com.orihama.kimetu_no_yaiba.entity.render.wind.kokuhuu.Render_kokuhuu::new);
	    RenderingRegistry.registerEntityRenderingHandler(idaten.class, com.orihama.kimetu_no_yaiba.entity.render.wind.idaten.Render_idaten::new);
	    RenderingRegistry.registerEntityRenderingHandler(sinato.class, com.orihama.kimetu_no_yaiba.entity.render.wind.sinato.Render_sinato::new);
	    RenderingRegistry.registerEntityRenderingHandler(sinato_hit.class, com.orihama.kimetu_no_yaiba.entity.render.wind.sinato.Render_sinato_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(kokuhuu_hit.class, com.orihama.kimetu_no_yaiba.entity.render.wind.kokuhuu.Render_kokuhuu_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(HIT_hekireki.class, com.orihama.kimetu_no_yaiba.entity.render.thunder.hekireki.Render_HIT_hekireki::new);
	    RenderingRegistry.registerEntityRenderingHandler(tawamure.class, com.orihama.kimetu_no_yaiba.entity.render.insect.tawamure.Render_tawamure::new);
	    RenderingRegistry.registerEntityRenderingHandler(moon.class, com.orihama.kimetu_no_yaiba.entity.render.moon.Rendermoon::new);
	    RenderingRegistry.registerEntityRenderingHandler(kataware_hit.class, com.orihama.kimetu_no_yaiba.entity.render.moon.kataware.Renderkataware_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(kataware.class, com.orihama.kimetu_no_yaiba.entity.render.moon.kataware.Renderkataware::new);
	    RenderingRegistry.registerEntityRenderingHandler(kataware_hit.class, com.orihama.kimetu_no_yaiba.entity.render.moon.kataware.Renderkataware_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(kataware.class, com.orihama.kimetu_no_yaiba.entity.render.moon.kataware.Renderkataware::new);
	    RenderingRegistry.registerEntityRenderingHandler(tukibae_hit.class, com.orihama.kimetu_no_yaiba.entity.render.moon.tukibae.Rendertukibae_hit::new);
	    RenderingRegistry.registerEntityRenderingHandler(tukibae.class, com.orihama.kimetu_no_yaiba.entity.render.moon.tukibae.Rendertukibae::new);
	    RenderingRegistry.registerEntityRenderingHandler(rinbi.class, com.orihama.kimetu_no_yaiba.entity.render.moon.rinbi.Renderrinbi::new);

	    RenderingRegistry.registerEntityRenderingHandler(EntityKokushibou.class, com.orihama.kimetu_no_yaiba.entity.render.RenderKokushibou::new);
	    RenderingRegistry.registerEntityRenderingHandler(EntityTeoni.class, com.orihama.kimetu_no_yaiba.entity.render.RenderTeoni::new);

	}
}
