package com.orihama.kimetu_no_yaiba.entity.render.water.seisei;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.orihama.kimetu_no_yaiba.entity.model.Model_seisei;
import com.orihama.kimetu_no_yaiba.entity.projectile.water.seisei.Seisei;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_seisei extends Render<Seisei> {
	private final Model_seisei model = new Model_seisei();

	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/seisei_model.png");

	public Render_seisei(RenderManager renderManager) {
		super(renderManager);
	}

	public void renderSeisei(Seisei par1Entity, double par2, double par4, double par6, float par8, float par9) {

		Model_seisei model = (Model_seisei) this.model;

		this.bindEntityTexture(par1Entity);
        GL11.glPushMatrix();
    	GlStateManager.pushAttrib();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(2.0F, 2.0F, 2.0F, 1.0F);
        GL11.glTranslatef((float)par2, (float)par4 + 1.0F, (float)par6);
        GL11.glRotatef(par1Entity.prevRotationYaw + (par1Entity.rotationYaw - par1Entity.prevRotationYaw) , 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(par1Entity.prevRotationPitch + (par1Entity.rotationPitch - par1Entity.prevRotationPitch) , 0.0F, 0.0F, 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        model.render((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
		GlStateManager.popAttrib();

	}

	public void doRender(Seisei entity, double x, double y, double z, float entityYaw, float partialTicks) {
		//super.doRender(entity, x, y, z, entityYaw, partialTicks);
		/*
		GlStateManager.pushAttrib();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();

		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.enableRescaleNormal();
		bindEntityTexture(entity);
		this.model.render((Entity)entity, partialTicks, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F);
		GlStateManager.popMatrix();

		GlStateManager.popAttrib();
		*/
        this.renderSeisei((Seisei)entity, x, y, z, entityYaw, partialTicks);

	}


	@Override
	protected ResourceLocation getEntityTexture(Seisei entity) {
		return TEXTURE;
	}
}
