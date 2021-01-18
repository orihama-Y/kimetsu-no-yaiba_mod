package com.orihama.kimetu_no_yaiba.entity.render.water.nejire;

import com.orihama.kimetu_no_yaiba.entity.model.Model_transparent;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.nejire.nejire;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_nejire extends Render<nejire> {
	private final Model_transparent model = new Model_transparent();

	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/takitubo_model.png");

	public Render_nejire(RenderManager renderManager) {
		super(renderManager);
	}

	public void doRender(nejire entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.enableRescaleNormal();
		GlStateManager.rotate(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		bindEntityTexture(entity);
		this.model.render((Entity)entity, partialTicks, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F);
		GlStateManager.popMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(nejire entity) {
		// TODO 自動生成されたメソッド・スタブ
		return TEXTURE;
	}
}
