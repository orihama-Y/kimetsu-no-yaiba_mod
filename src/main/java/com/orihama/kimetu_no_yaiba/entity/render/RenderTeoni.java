 package com.orihama.kimetu_no_yaiba.entity.render;
 import com.orihama.kimetu_no_yaiba.entity.model.ModelTeoni;
import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

 @SideOnly(Side.CLIENT)
 public class RenderTeoni extends RenderLiving<EntityTeoni> {
   private static final ResourceLocation TEXTURES = new ResourceLocation("kimetu_no_yaiba:textures/entity/teoni.png");

   public RenderTeoni(RenderManager renderManager) {
     super(renderManager, (ModelBase)new ModelTeoni(), 0.5F);
   }


   protected ResourceLocation getEntityTexture(EntityTeoni entity) {
     return TEXTURES;
   }
 }
