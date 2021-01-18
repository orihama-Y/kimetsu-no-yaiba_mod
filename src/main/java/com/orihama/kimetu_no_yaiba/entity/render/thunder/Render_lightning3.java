package com.orihama.kimetu_no_yaiba.entity.render.thunder;

import com.orihama.kimetu_no_yaiba.entity.model.Model_hekireki2;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom3;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_lightning3 extends Render<lightning_custom3> {
	private final Model_hekireki2 model = new Model_hekireki2();

	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/hekireki_model.png");

	public Render_lightning3(RenderManager renderManager) {
		super(renderManager);
	}

	public void doRender(lightning_custom3 entity, double x, double y, double z, float entityYaw, float partialTicks) {

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.enableRescaleNormal();
		bindEntityTexture(entity);
		this.model.render((Entity)entity, partialTicks, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F);
		GlStateManager.popMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(lightning_custom3 entity) {
		// TODO 自動生成されたメソッド・スタブ
		return TEXTURE;
	}
}
