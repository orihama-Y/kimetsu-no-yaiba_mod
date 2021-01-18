 package com.orihama.kimetu_no_yaiba.entity.render;
 import com.orihama.kimetu_no_yaiba.entity.model.ModelKokushibou;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityKokushibou;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

 @SideOnly(Side.CLIENT)
 public class RenderKokushibou extends RenderLiving<EntityKokushibou> {
   private static final ResourceLocation TEXTURES = new ResourceLocation("kimetu_no_yaiba:textures/entity/kokushibou.png");

   public RenderKokushibou(RenderManager renderManager) {
     super(renderManager, (ModelBase)new ModelKokushibou(), 1F);
   }


   protected ResourceLocation getEntityTexture(EntityKokushibou entity) {
     return TEXTURES;
   }
 }
