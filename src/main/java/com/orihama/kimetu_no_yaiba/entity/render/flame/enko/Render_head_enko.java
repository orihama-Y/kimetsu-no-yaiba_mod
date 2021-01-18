package com.orihama.kimetu_no_yaiba.entity.render.flame.enko;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.orihama.kimetu_no_yaiba.entity.model.Model_enko;
import com.orihama.kimetu_no_yaiba.entity.projectile.flame.enko.enko_head;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render_head_enko extends Render<enko_head> {

	private final Model_enko model = new Model_enko();
	private static ResourceLocation TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/entity/enko.png");


	public Render_head_enko(RenderManager renderManager) {
		super(renderManager);
	}

	public void renderHead(enko_head par1Entity, double par2, double par4, double par6, float par8, float par9) {


		Model_enko model = this.model;

		this.bindEntityTexture(par1Entity);
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(2.0F, 2.0F, 2.0F, 1.0F);
        GL11.glTranslatef((float)par2, (float)par4 + 1.0F, (float)par6);
        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        //GL11.glRotatef(par1Entity.prevRotationYaw + (par1Entity.rotationYaw - par1Entity.prevRotationYaw) * par9, 0.0F, 1.0F, 0.0F);
        //GL11.glRotatef(par1Entity.prevRotationPitch + (par1Entity.rotationPitch - par1Entity.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        model.render((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();


	}


	public void doRender(enko_head entity, double x, double y, double z, float entityYaw, float partialTicks) {
		//super.doRender(entity, x, y, z, entityYaw, partialTicks);
		/*
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.enableRescaleNormal();
	    GlStateManager.rotate( (180-this.renderManager.playerViewY), 0F, 1F, 0F);
	    GlStateManager.rotate( (180-this.renderManager.playerViewX) , 0F, 0F, 0F);
		bindEntityTexture(entity);
		this.model.render((Entity)entity, partialTicks, 0.0F, -1.0F, 0.0F, 0.0F, 0.05F);
		GlStateManager.popMatrix();
		 */
        this.renderHead((enko_head)entity, x, y, z, entityYaw, partialTicks);
	}


	@Override
	protected ResourceLocation getEntityTexture(enko_head entity) {
		return TEXTURE;
	}
}
