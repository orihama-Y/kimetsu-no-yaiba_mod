package com.orihama.kimetu_no_yaiba.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_mizu_1 extends ModelBase
{
	private final ModelRenderer bone;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone28;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone29;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone8;

	public Model_mizu_1() {
		this.textureWidth = 200;
		this.textureHeight = 200;
		this.bone = new ModelRenderer(this);
		this.bone.setRotationPoint(0.0F, 15.0F, 0.0F);

		this.bone21 = new ModelRenderer(this);
		this.bone21.setRotationPoint(42.0F, 0.0F, 0.0F);
		this.bone.addChild(this.bone21);

		this.bone22 = new ModelRenderer(this);
		this.bone22.setRotationPoint(0.0F, 0.0F, 2.0F);
		this.bone21.addChild(this.bone22);

		this.bone28 = new ModelRenderer(this);
		this.bone28.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(this.bone28, -0.0873F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone28);

		this.bone2 = new ModelRenderer(this);
		this.bone2.setRotationPoint(-26.0F, 0.0F, -10.0F);
		this.bone21.addChild(this.bone2);

		this.bone3 = new ModelRenderer(this);
		this.bone3.setRotationPoint(-42.0F, 0.0F, 7.0F);
		setRotationAngle(this.bone3, -0.4363F, 0.0F, 0.0F);
		this.bone2.addChild(this.bone3);
		this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 11, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone4 = new ModelRenderer(this);
		this.bone4.setRotationPoint(-21.0F, 0.0F, 9.0F);
		setRotationAngle(this.bone4, -0.3491F, 0.0F, 0.0F);
		this.bone2.addChild(this.bone4);
		this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 5, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, true));
		this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, true));

		this.bone6 = new ModelRenderer(this);
		this.bone6.setRotationPoint(22.0F, 0.0F, 7.0F);
		setRotationAngle(this.bone6, -0.2618F, 0.0F, 0.0F);
		this.bone2.addChild(this.bone6);
		this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 11, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone29 = new ModelRenderer(this);
		this.bone29.setRotationPoint(-39.0F, 3.0F, 12.0F);
		setRotationAngle(this.bone29, -0.3491F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone29);
		this.bone29.cubeList.add(new ModelBox(this.bone29, 0, 10, -97.0F, -6.0413F, -13.9581F, 23, 1, 4, 0.0F, true));
		this.bone29.cubeList.add(new ModelBox(this.bone29, 0, 4, 69.0F, -6.6927F, -13.9429F, 23, 1, 5, 0.0F, false));

		this.bone23 = new ModelRenderer(this);
		this.bone23.setRotationPoint(-4.0F, 0.0F, -2.0F);
		setRotationAngle(this.bone23, -0.4363F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone23);
		this.bone23.cubeList.add(new ModelBox(this.bone23, 0, 9, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone23.cubeList.add(new ModelBox(this.bone23, 0, 9, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone24 = new ModelRenderer(this);
		this.bone24.setRotationPoint(-24.0F, 0.0F, -1.0F);
		setRotationAngle(this.bone24, -0.2618F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone24);
		this.bone24.cubeList.add(new ModelBox(this.bone24, 0, 5, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, true));
		this.bone24.cubeList.add(new ModelBox(this.bone24, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, true));

		this.bone5 = new ModelRenderer(this);
		this.bone5.setRotationPoint(-4.0F, 1.0F, -3.0F);
		setRotationAngle(this.bone5, -0.2618F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone5);
		this.bone5.cubeList.add(new ModelBox(this.bone5, 0, 11, 10.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone5.cubeList.add(new ModelBox(this.bone5, 0, 0, 6.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone7 = new ModelRenderer(this);
		this.bone7.setRotationPoint(61.0F, 0.0F, -10.0F);
		this.bone21.addChild(this.bone7);

		this.bone9 = new ModelRenderer(this);
		this.bone9.setRotationPoint(-21.0F, 1.0F, 9.0F);
		setRotationAngle(this.bone9, -0.2618F, 0.0F, 0.0F);
		this.bone7.addChild(this.bone9);
		this.bone9.cubeList.add(new ModelBox(this.bone9, 0, 5, -19.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, true));
		this.bone9.cubeList.add(new ModelBox(this.bone9, 0, 0, -19.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, true));

		this.bone10 = new ModelRenderer(this);
		this.bone10.setRotationPoint(-138.0F, 0.0F, 7.0F);
		setRotationAngle(this.bone10, -0.2618F, 0.0F, 0.0F);
		this.bone7.addChild(this.bone10);
		this.bone10.cubeList.add(new ModelBox(this.bone10, 0, 11, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone10.cubeList.add(new ModelBox(this.bone10, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone11 = new ModelRenderer(this);
		this.bone11.setRotationPoint(-124.0F, -1.0F, -3.0F);
		setRotationAngle(this.bone11, -0.5236F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone11);
		this.bone11.cubeList.add(new ModelBox(this.bone11, 0, 11, 15.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone11.cubeList.add(new ModelBox(this.bone11, 0, 0, 14.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));

		this.bone8 = new ModelRenderer(this);
		this.bone8.setRotationPoint(-118.0F, 0.0F, -3.0F);
		setRotationAngle(this.bone8, -0.2618F, 0.0F, 0.0F);
		this.bone21.addChild(this.bone8);
		this.bone8.cubeList.add(new ModelBox(this.bone8, 0, 11, -13.0F, -7.0F, -3.0F, 23, 1, 4, 0.0F, false));
		this.bone8.cubeList.add(new ModelBox(this.bone8, 0, 0, -13.0F, -8.0F, 1.0F, 23, 1, 5, 0.0F, false));
	}


	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
