package com.orihama.kimetu_no_yaiba.entity.render.water.minamo;

import com.orihama.kimetu_no_yaiba.entity.model.Model_minamo;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.minamo.HIT_minamo;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_minamo extends Render<HIT_minamo> {
	private final Model_minamo model = new Model_minamo();
	//使いまわし
	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/takitubo_model.png");

	public Render_minamo(RenderManager renderManager) {
		super(renderManager);
	}

	public void doRender(HIT_minamo entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
	protected ResourceLocation getEntityTexture(HIT_minamo entity) {
		// TODO 自動生成されたメソッド・スタブ
		return TEXTURE;
	}
}
