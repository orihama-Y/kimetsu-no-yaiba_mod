package com.orihama.kimetu_no_yaiba.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_rengoku extends ModelBase {
	private final ModelRenderer bb_main;

	public Model_rengoku() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 79, -12.0F, -12.0F, -11.0F, 22, 9, 19, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 33, 61, -9.0F, -13.0F, -12.0F, 16, 11, 19, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}