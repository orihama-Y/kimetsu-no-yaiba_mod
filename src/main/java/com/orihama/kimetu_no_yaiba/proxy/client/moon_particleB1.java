package com.orihama.kimetu_no_yaiba.proxy.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class moon_particleB1 extends Particle {
  float oSize;

  private static final ResourceLocation PARTICLES_TEXTURE = new ResourceLocation("kimetu_no_yaiba:textures/effects/picture_moonb.png");

  private static final VertexFormat VERTEX_FORMAT = (new VertexFormat()).addElement(DefaultVertexFormats.POSITION_3F).
		  addElement(DefaultVertexFormats.TEX_2F).addElement(DefaultVertexFormats.COLOR_4UB).addElement(DefaultVertexFormats.TEX_2S).addElement(DefaultVertexFormats.NORMAL_3B).addElement(DefaultVertexFormats.PADDING_1B);

  public moon_particleB1(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
    super(worldIn, xCoordIn, yCoordIn, zCoordIn, 0.0D, 0.0D, 0.0D);
    this.particleScale = 0.4F;
    this.motionX = this.motionX * 0.009999999776482582D + xSpeedIn;
    this.motionY = this.motionY * 0.009999999776482582D + ySpeedIn;
    this.motionZ = this.motionZ * 0.009999999776482582D + zSpeedIn;
    this.posX += ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
    this.posY += ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
    this.posZ += ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F);
    this.particleRed = 1.0F;
    this.particleGreen = 1.0F;
    this.particleBlue = 1.0F;
    this.particleAlpha = 0.6F;
    this.particleMaxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
    this.particleTextureIndexX = 46;
    this.particleTextureIndexY = 46;
  }

  public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {

	GL11.glPushMatrix();
    GlStateManager.depthMask(true);
    GlStateManager.enableBlend();
    GlStateManager.enableDepth();
    GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, this.particleAlpha);
    Minecraft.getMinecraft().getTextureManager().bindTexture(PARTICLES_TEXTURE);
    float f = this.particleTextureIndexX % 16.0F / 16.0F;
    float f1 = f + 0.124875F;
    float f2 = 0.125F;
    float f3 = f2 + 0.124875F;
    float f4 = 0.3F;
    float f5 = (float)(this.prevPosX + (this.posX - this.prevPosX) * partialTicks - interpPosX);
    float f6 = (float)(this.prevPosY + (this.posY - this.prevPosY) * partialTicks - interpPosY);
    float f7 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * partialTicks - interpPosZ);
    GlStateManager.color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
    GlStateManager.disableLighting();
    RenderHelper.disableStandardItemLighting();
    int bright = getBrightnessForRender(partialTicks);
    int bright1 = bright >> 16 & 0xFFFF;
    int bright2 = bright & 0xFFFF;
    buffer.begin(7, VERTEX_FORMAT);
    buffer.pos((f5 - rotationX * f4 - rotationXY * f4), (f6 - rotationZ * f4), (f7 - rotationYZ * f4 - rotationXZ * f4)).tex(f1, f3).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(bright1, bright2).normal(0.0F, 1.0F, 0.0F).endVertex();
    buffer.pos((f5 - rotationX * f4 + rotationXY * f4), (f6 + rotationZ * f4), (f7 - rotationYZ * f4 + rotationXZ * f4)).tex(f1, f2).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(bright1, bright2).normal(0.0F, 1.0F, 0.0F).endVertex();
    buffer.pos((f5 + rotationX * f4 + rotationXY * f4), (f6 + rotationZ * f4), (f7 + rotationYZ * f4 + rotationXZ * f4)).tex(f, f2).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(bright1, bright2).normal(0.0F, 1.0F, 0.0F).endVertex();
    buffer.pos((f5 + rotationX * f4 - rotationXY * f4), (f6 - rotationZ * f4), (f7 + rotationYZ * f4 - rotationXZ * f4)).tex(f, f3).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(bright1, bright2).normal(0.0F, 1.0F, 0.0F).endVertex();
    Tessellator.getInstance().draw();
    GlStateManager.enableLighting();
    GL11.glPopMatrix();
    GlStateManager.enableDepth();
  }

  public int getBrightnessForRender(float partialTicks) {
    float f = (this.particleAge + partialTicks) / this.particleMaxAge;
    f = MathHelper.clamp(f, 0.0F, 1.0F);
    int i = super.getBrightnessForRender(partialTicks);
    int j = i & 0xFF;
    int k = i >> 16 & 0xFF;
    j += (int)(f * 15.0F * 16.0F);
    if (j > 240)
      j = 240;
    return j | k << 16;
  }

  public void onUpdate() {
	    this.prevPosX = this.posX;
	    this.prevPosY = this.posY;
	    this.prevPosZ = this.posZ;
	    if (this.particleAge++ >= this.particleMaxAge)setExpired();
	    move(this.motionX, this.motionY, this.motionZ);
	    this.motionX *= this.rand.nextFloat();
	    this.motionY *= this.rand.nextFloat();
	    this.motionZ *= this.rand.nextFloat();
	  }

  public int getFXLayer() {
    return 3;
  }
}
