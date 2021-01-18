package com.orihama.kimetu_no_yaiba.entity.render.thunder;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.orihama.kimetu_no_yaiba.entity.model.Model_hekireki;
import com.orihama.kimetu_no_yaiba.entity.projectile.thunder.hekireki.lightning_custom2;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_lightning2 extends Render<lightning_custom2> {
	private final Model_hekireki model = new Model_hekireki();

	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/hekireki_model.png");

	public Render_lightning2(RenderManager renderManager) {
		super(renderManager);
	}

	public void doRender(lightning_custom2 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		GlStateManager.pushMatrix();
		GlStateManager.pushAttrib();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GlStateManager.translate(x, y, z);
		GlStateManager.enableRescaleNormal();
		GlStateManager.rotate(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		bindEntityTexture(entity);
		this.model.render((Entity)entity, partialTicks, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
		GlStateManager.popMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(lightning_custom2 entity) {
		// TODO 自動生成されたメソッド・スタブ
		return TEXTURE;
	}
}
