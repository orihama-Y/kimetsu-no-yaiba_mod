package com.orihama.kimetu_no_yaiba.entity.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_seisei extends ModelBase {
	private final ModelRenderer bone85;
	private final ModelRenderer bone5;

	public Model_seisei() {
		textureWidth = 256;
		textureHeight = 256;

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone85, 0.0F, 3.1416F, -1.5708F);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 1.5708F, 0.0F, 0.0F);
		bone85.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 136, 196, -30.0F, -16.0F, -15.0F, 30, 30, 30, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone85.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}