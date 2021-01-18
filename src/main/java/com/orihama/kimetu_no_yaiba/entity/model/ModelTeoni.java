package com.orihama.kimetu_no_yaiba.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTeoni extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer arms;
	private final ModelRenderer attack_arm1;
	private final ModelRenderer subarm14;
	private final ModelRenderer sub2_14;
	private final ModelRenderer sub3_14;
	private final ModelRenderer sub4_14;
	private final ModelRenderer sub5_14;
	private final ModelRenderer sub4_15;
	private final ModelRenderer attack_arm2;
	private final ModelRenderer subarm15;
	private final ModelRenderer sub2_15;
	private final ModelRenderer sub3_15;
	private final ModelRenderer sub4_16;
	private final ModelRenderer sub5_2;
	private final ModelRenderer sub4_17;
	private final ModelRenderer neck_arm1;
	private final ModelRenderer subarm17;
	private final ModelRenderer sub2_17;
	private final ModelRenderer sub3_17;
	private final ModelRenderer sub4_19;
	private final ModelRenderer neck_arm2;
	private final ModelRenderer subarm16;
	private final ModelRenderer sub2_16;
	private final ModelRenderer sub3_16;
	private final ModelRenderer sub4_18;
	private final ModelRenderer g1;
	private final ModelRenderer arm1;
	private final ModelRenderer subarm1;
	private final ModelRenderer sub2_1;
	private final ModelRenderer sub3_1;
	private final ModelRenderer sub4_1;
	private final ModelRenderer arm7;
	private final ModelRenderer subarm7;
	private final ModelRenderer sub2_7;
	private final ModelRenderer sub3_7;
	private final ModelRenderer sub4_7;
	private final ModelRenderer sub5_7;
	private final ModelRenderer arm10;
	private final ModelRenderer subarm10;
	private final ModelRenderer sub2_10;
	private final ModelRenderer sub3_10;
	private final ModelRenderer sub4_10;
	private final ModelRenderer g2;
	private final ModelRenderer arm13;
	private final ModelRenderer subarm13;
	private final ModelRenderer sub2_13;
	private final ModelRenderer sub3_13;
	private final ModelRenderer sub4_13;
	private final ModelRenderer arm3;
	private final ModelRenderer subarm3;
	private final ModelRenderer sub2_3;
	private final ModelRenderer sub3_3;
	private final ModelRenderer sub4_3;
	private final ModelRenderer arm4;
	private final ModelRenderer subarm4;
	private final ModelRenderer sub2_4;
	private final ModelRenderer sub3_4;
	private final ModelRenderer sub4_4;
	private final ModelRenderer arm11;
	private final ModelRenderer subarm11;
	private final ModelRenderer sub2_11;
	private final ModelRenderer sub3_11;
	private final ModelRenderer sub4_11;
	private final ModelRenderer sub5_1;
	private final ModelRenderer g3;
	private final ModelRenderer arm19;
	private final ModelRenderer subarm19;
	private final ModelRenderer sub2_19;
	private final ModelRenderer sub3_19;
	private final ModelRenderer sub4_21;
	private final ModelRenderer arm9;
	private final ModelRenderer subarm9;
	private final ModelRenderer sub2_9;
	private final ModelRenderer sub3_9;
	private final ModelRenderer sub4_9;
	private final ModelRenderer sub5_9;
	private final ModelRenderer arm6;
	private final ModelRenderer subarm6;
	private final ModelRenderer sub2_6;
	private final ModelRenderer sub3_6;
	private final ModelRenderer sub4_6;
	private final ModelRenderer arm2;
	private final ModelRenderer subarm2;
	private final ModelRenderer sub2_2;
	private final ModelRenderer sub3_2;
	private final ModelRenderer sub4_2;
	private final ModelRenderer g4;
	private final ModelRenderer arm18;
	private final ModelRenderer subarm18;
	private final ModelRenderer sub2_18;
	private final ModelRenderer sub3_18;
	private final ModelRenderer sub4_20;
	private final ModelRenderer arm8;
	private final ModelRenderer subarm8;
	private final ModelRenderer sub2_8;
	private final ModelRenderer sub3_8;
	private final ModelRenderer sub4_8;
	private final ModelRenderer arm5;
	private final ModelRenderer subarm5;
	private final ModelRenderer sub2_5;
	private final ModelRenderer sub3_5;
	private final ModelRenderer sub4_5;
	private final ModelRenderer arm12;
	private final ModelRenderer subarm12;
	private final ModelRenderer sub2_12;
	private final ModelRenderer sub3_12;
	private final ModelRenderer sub4_12;
	private final ModelRenderer foots;
	private final ModelRenderer left;
	private final ModelRenderer foot4;
	private final ModelRenderer foot2_4;
	private final ModelRenderer foot3_4;
	private final ModelRenderer foot1;
	private final ModelRenderer foot2_1;
	private final ModelRenderer foot3_1;
	private final ModelRenderer right;
	private final ModelRenderer foot3;
	private final ModelRenderer foot2_3;
	private final ModelRenderer foot3_3;
	private final ModelRenderer foot2;
	private final ModelRenderer foot2_2;
	private final ModelRenderer foot3_2;
	private final ModelRenderer head;
	private final ModelRenderer Body;

	public ModelTeoni() {
		this.textureWidth = 128;
		this.textureHeight = 128;

		this.bone = new ModelRenderer(this);
		this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(this.bone, 0.0F, -1.5708F, 0.0F);

		this.arms = new ModelRenderer(this);
		this.arms.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bone.addChild(this.arms);

		this.attack_arm1 = new ModelRenderer(this);
		this.attack_arm1.setRotationPoint(-25.5F, -55.7658F, 13.1596F);
		setRotationAngle(this.attack_arm1, -0.4363F, 1.8326F, 0.0873F);
		this.arms.addChild(this.attack_arm1);
		this.attack_arm1.cubeList.add(new ModelBox(this.attack_arm1, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm14 = new ModelRenderer(this);
		this.subarm14.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.attack_arm1.addChild(this.subarm14);
		this.subarm14.cubeList.add(new ModelBox(this.subarm14, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_14 = new ModelRenderer(this);
		this.sub2_14.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_14, 0.2618F, 0.0F, 0.0F);
		this.subarm14.addChild(this.sub2_14);
		this.sub2_14.cubeList.add(new ModelBox(this.sub2_14, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_14 = new ModelRenderer(this);
		this.sub3_14.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_14, 0.4363F, 0.0F, 0.0F);
		this.sub2_14.addChild(this.sub3_14);
		this.sub3_14.cubeList.add(new ModelBox(this.sub3_14, 0, 0, -2.4849F, -0.3914F, -4.8298F, 5, 6, 10, 0.0F, false));

		this.sub4_14 = new ModelRenderer(this);
		this.sub4_14.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_14, 0.9599F, 0.4363F, 0.0F);
		this.sub3_14.addChild(this.sub4_14);
		this.sub4_14.cubeList.add(new ModelBox(this.sub4_14, 0, 0, -2.9417F, 5.4278F, -7.4334F, 4, 4, 19, 0.0F, false));

		this.sub5_14 = new ModelRenderer(this);
		this.sub5_14.setRotationPoint(-3.8192F, 11.5494F, -7.3567F);
		setRotationAngle(this.sub5_14, -0.3491F, 0.0F, -2.618F);
		this.sub4_14.addChild(this.sub5_14);
		this.sub5_14.cubeList.add(new ModelBox(this.sub5_14, 0, 0, -1.6807F, 2.6654F, -5.3651F, 3, 4, 9, 0.0F, false));

		this.sub4_15 = new ModelRenderer(this);
		this.sub4_15.setRotationPoint(-4.1808F, -1.5494F, -14.6433F);
		setRotationAngle(this.sub4_15, 0.2618F, 0.4363F, 0.0F);
		this.sub5_14.addChild(this.sub4_15);
		this.sub4_15.cubeList.add(new ModelBox(this.sub4_15, 0, 87, -1.9866F, 7.0621F, -29.0208F, 4, 4, 37, 0.0F, false));

		this.attack_arm2 = new ModelRenderer(this);
		this.attack_arm2.setRotationPoint(-25.5F, -55.7658F, -16.8404F);
		setRotationAngle(this.attack_arm2, -0.4363F, 1.1345F, 0.0873F);
		this.arms.addChild(this.attack_arm2);
		this.attack_arm2.cubeList.add(new ModelBox(this.attack_arm2, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm15 = new ModelRenderer(this);
		this.subarm15.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.attack_arm2.addChild(this.subarm15);
		this.subarm15.cubeList.add(new ModelBox(this.subarm15, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_15 = new ModelRenderer(this);
		this.sub2_15.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_15, 0.2618F, 0.0F, 0.0F);
		this.subarm15.addChild(this.sub2_15);
		this.sub2_15.cubeList.add(new ModelBox(this.sub2_15, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_15 = new ModelRenderer(this);
		this.sub3_15.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_15, 0.4363F, 0.0F, 0.0F);
		this.sub2_15.addChild(this.sub3_15);
		this.sub3_15.cubeList.add(new ModelBox(this.sub3_15, 0, 0, -2.4849F, -0.3914F, -4.8298F, 5, 6, 10, 0.0F, false));

		this.sub4_16 = new ModelRenderer(this);
		this.sub4_16.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_16, 0.9599F, 0.4363F, 0.0F);
		this.sub3_15.addChild(this.sub4_16);
		this.sub4_16.cubeList.add(new ModelBox(this.sub4_16, 0, 0, -2.9417F, 5.4278F, -7.4334F, 4, 4, 19, 0.0F, false));

		this.sub5_2 = new ModelRenderer(this);
		this.sub5_2.setRotationPoint(-3.8192F, 11.5494F, -7.3567F);
		setRotationAngle(this.sub5_2, -0.5236F, 0.2618F, -2.618F);
		this.sub4_16.addChild(this.sub5_2);
		this.sub5_2.cubeList.add(new ModelBox(this.sub5_2, 0, 0, -1.6807F, 2.6654F, -5.3651F, 3, 4, 9, 0.0F, false));

		this.sub4_17 = new ModelRenderer(this);
		this.sub4_17.setRotationPoint(-9.1808F, 6.4506F, -11.6433F);
		setRotationAngle(this.sub4_17, 0.0873F, 0.4363F, -1.309F);
		this.sub5_2.addChild(this.sub4_17);
		this.sub4_17.cubeList.add(new ModelBox(this.sub4_17, 0, 88, -1.9866F, 7.0621F, -28.0208F, 4, 4, 36, 0.0F, false));

		this.neck_arm1 = new ModelRenderer(this);
		this.neck_arm1.setRotationPoint(10.5F, -76.7658F, -1.8404F);
		setRotationAngle(this.neck_arm1, 0.0873F, 0.6109F, 0.0F);
		this.arms.addChild(this.neck_arm1);

		this.subarm17 = new ModelRenderer(this);
		this.subarm17.setRotationPoint(2.0F, 8.0F, -15.0F);
		setRotationAngle(this.subarm17, 0.0F, 0.9599F, 0.6109F);
		this.neck_arm1.addChild(this.subarm17);
		this.subarm17.cubeList.add(new ModelBox(this.subarm17, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 27, 0.0F, false));

		this.sub2_17 = new ModelRenderer(this);
		this.sub2_17.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_17, 0.1745F, -0.1745F, 0.1745F);
		this.subarm17.addChild(this.sub2_17);
		this.sub2_17.cubeList.add(new ModelBox(this.sub2_17, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_17 = new ModelRenderer(this);
		this.sub3_17.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_17, 0.4363F, 0.0F, 0.0F);
		this.sub2_17.addChild(this.sub3_17);
		this.sub3_17.cubeList.add(new ModelBox(this.sub3_17, 0, 0, -2.5F, 0.6046F, -12.9176F, 5, 4, 18, 0.0F, false));

		this.sub4_19 = new ModelRenderer(this);
		this.sub4_19.setRotationPoint(-2.1808F, -1.5494F, -13.6433F);
		setRotationAngle(this.sub4_19, -0.5236F, -2.618F, -0.5236F);
		this.sub3_17.addChild(this.sub4_19);
		this.sub4_19.cubeList.add(new ModelBox(this.sub4_19, 0, 0, 0.0602F, 3.4517F, -0.2024F, 4, 4, 10, 0.0F, false));

		this.neck_arm2 = new ModelRenderer(this);
		this.neck_arm2.setRotationPoint(14.5F, -69.7658F, 28.1596F);
		setRotationAngle(this.neck_arm2, -0.2618F, 0.6109F, 0.0F);
		this.arms.addChild(this.neck_arm2);

		this.subarm16 = new ModelRenderer(this);
		this.subarm16.setRotationPoint(2.0F, 7.0F, -15.0F);
		setRotationAngle(this.subarm16, 0.0F, 0.9599F, 0.4363F);
		this.neck_arm2.addChild(this.subarm16);
		this.subarm16.cubeList.add(new ModelBox(this.subarm16, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 27, 0.0F, false));

		this.sub2_16 = new ModelRenderer(this);
		this.sub2_16.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_16, 0.2618F, 0.0F, 0.0F);
		this.subarm16.addChild(this.sub2_16);
		this.sub2_16.cubeList.add(new ModelBox(this.sub2_16, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_16 = new ModelRenderer(this);
		this.sub3_16.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_16, 0.4363F, 0.0F, 0.0F);
		this.sub2_16.addChild(this.sub3_16);
		this.sub3_16.cubeList.add(new ModelBox(this.sub3_16, 0, 0, -2.5F, 0.6046F, -12.9176F, 5, 4, 18, 0.0F, false));

		this.sub4_18 = new ModelRenderer(this);
		this.sub4_18.setRotationPoint(8.8192F, 2.4506F, -17.6433F);
		setRotationAngle(this.sub4_18, 0.4363F, -0.8727F, 0.0F);
		this.sub3_16.addChild(this.sub4_18);
		this.sub4_18.cubeList.add(new ModelBox(this.sub4_18, 0, 0, -3.9826F, 2.6546F, 0.8077F, 4, 4, 10, 0.0F, false));

		this.g1 = new ModelRenderer(this);
		this.g1.setRotationPoint(-13.5F, -55.7658F, -24.8404F);
		this.arms.addChild(this.g1);

		this.arm1 = new ModelRenderer(this);
		this.arm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(this.arm1, 0.1745F, 0.3491F, 0.0F);
		this.g1.addChild(this.arm1);
		this.arm1.cubeList.add(new ModelBox(this.arm1, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm1 = new ModelRenderer(this);
		this.subarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm1.addChild(this.subarm1);
		this.subarm1.cubeList.add(new ModelBox(this.subarm1, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_1 = new ModelRenderer(this);
		this.sub2_1.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_1, 0.2618F, 0.0F, 0.0F);
		this.subarm1.addChild(this.sub2_1);
		this.sub2_1.cubeList.add(new ModelBox(this.sub2_1, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_1 = new ModelRenderer(this);
		this.sub3_1.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_1, 0.4363F, 0.0F, 0.0F);
		this.sub2_1.addChild(this.sub3_1);
		this.sub3_1.cubeList.add(new ModelBox(this.sub3_1, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_1 = new ModelRenderer(this);
		this.sub4_1.setRotationPoint(0.0F, 9.0242F, -18.1433F);
		setRotationAngle(this.sub4_1, 0.6109F, 0.0F, 0.0F);
		this.sub3_1.addChild(this.sub4_1);
		this.sub4_1.cubeList.add(new ModelBox(this.sub4_1, 0, 0, -2.5F, 1.0F, -27.0F, 5, 4, 43, 0.0F, false));

		this.arm7 = new ModelRenderer(this);
		this.arm7.setRotationPoint(-5.0F, 0.0F, 49.0F);
		setRotationAngle(this.arm7, 0.0873F, 2.8798F, 0.0F);
		this.g1.addChild(this.arm7);
		this.arm7.cubeList.add(new ModelBox(this.arm7, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm7 = new ModelRenderer(this);
		this.subarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm7.addChild(this.subarm7);
		this.subarm7.cubeList.add(new ModelBox(this.subarm7, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_7 = new ModelRenderer(this);
		this.sub2_7.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_7, 0.2618F, 0.0F, 0.0F);
		this.subarm7.addChild(this.sub2_7);
		this.sub2_7.cubeList.add(new ModelBox(this.sub2_7, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_7 = new ModelRenderer(this);
		this.sub3_7.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_7, 0.4363F, 0.0F, 0.0F);
		this.sub2_7.addChild(this.sub3_7);
		this.sub3_7.cubeList.add(new ModelBox(this.sub3_7, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_7 = new ModelRenderer(this);
		this.sub4_7.setRotationPoint(2.8192F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_7, 0.3491F, -0.1745F, -0.3491F);
		this.sub3_7.addChild(this.sub4_7);
		this.sub4_7.cubeList.add(new ModelBox(this.sub4_7, 0, 0, -2.5F, -2.0F, -12.5F, 5, 4, 25, 0.0F, false));

		this.sub5_7 = new ModelRenderer(this);
		this.sub5_7.setRotationPoint(0.1808F, -1.3119F, -14.6116F);
		setRotationAngle(this.sub5_7, 0.0873F, 0.2618F, 0.0F);
		this.sub4_7.addChild(this.sub5_7);
		this.sub5_7.cubeList.add(new ModelBox(this.sub5_7, 0, 0, -3.5F, 0.0F, -21.5F, 5, 3, 25, 0.0F, false));

		this.arm10 = new ModelRenderer(this);
		this.arm10.setRotationPoint(47.0F, 19.0F, 21.0F);
		setRotationAngle(this.arm10, -0.2618F, -1.8326F, 0.0F);
		this.g1.addChild(this.arm10);
		this.arm10.cubeList.add(new ModelBox(this.arm10, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm10 = new ModelRenderer(this);
		this.subarm10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm10.addChild(this.subarm10);
		this.subarm10.cubeList.add(new ModelBox(this.subarm10, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_10 = new ModelRenderer(this);
		this.sub2_10.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_10, 0.2618F, 0.0F, 0.0F);
		this.subarm10.addChild(this.sub2_10);
		this.sub2_10.cubeList.add(new ModelBox(this.sub2_10, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_10 = new ModelRenderer(this);
		this.sub3_10.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_10, 0.4363F, 0.0F, 0.0F);
		this.sub2_10.addChild(this.sub3_10);
		this.sub3_10.cubeList.add(new ModelBox(this.sub3_10, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_10 = new ModelRenderer(this);
		this.sub4_10.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_10, 0.9599F, 0.4363F, 0.0F);
		this.sub3_10.addChild(this.sub4_10);
		this.sub4_10.cubeList.add(new ModelBox(this.sub4_10, 0, 0, -3.8074F, 5.058F, -24.771F, 5, 4, 36, 0.0F, false));

		this.g2 = new ModelRenderer(this);
		this.g2.setRotationPoint(-13.5F, -55.7658F, -24.8404F);
		setRotationAngle(this.g2, 0.0F, 0.0F, -0.0873F);
		this.arms.addChild(this.g2);

		this.arm13 = new ModelRenderer(this);
		this.arm13.setRotationPoint(22.0F, 0.0F, 48.0F);
		setRotationAngle(this.arm13, -0.2618F, 3.1416F, 0.0F);
		this.g2.addChild(this.arm13);
		this.arm13.cubeList.add(new ModelBox(this.arm13, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm13 = new ModelRenderer(this);
		this.subarm13.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm13.addChild(this.subarm13);
		this.subarm13.cubeList.add(new ModelBox(this.subarm13, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_13 = new ModelRenderer(this);
		this.sub2_13.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_13, 0.2618F, 0.0F, 0.0F);
		this.subarm13.addChild(this.sub2_13);
		this.sub2_13.cubeList.add(new ModelBox(this.sub2_13, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_13 = new ModelRenderer(this);
		this.sub3_13.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_13, 0.4363F, 0.0F, 0.0F);
		this.sub2_13.addChild(this.sub3_13);
		this.sub3_13.cubeList.add(new ModelBox(this.sub3_13, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_13 = new ModelRenderer(this);
		this.sub4_13.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_13, 0.9599F, 0.4363F, 0.0F);
		this.sub3_13.addChild(this.sub4_13);
		this.sub4_13.cubeList.add(new ModelBox(this.sub4_13, 0, 0, -3.8074F, 5.058F, -30.771F, 5, 4, 42, 0.0F, false));

		this.arm3 = new ModelRenderer(this);
		this.arm3.setRotationPoint(22.0F, 0.0F, 0.0F);
		setRotationAngle(this.arm3, -0.2618F, -0.2618F, 0.0F);
		this.g2.addChild(this.arm3);
		this.arm3.cubeList.add(new ModelBox(this.arm3, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm3 = new ModelRenderer(this);
		this.subarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm3.addChild(this.subarm3);
		this.subarm3.cubeList.add(new ModelBox(this.subarm3, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_3 = new ModelRenderer(this);
		this.sub2_3.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_3, 0.2618F, 0.0F, 0.0F);
		this.subarm3.addChild(this.sub2_3);
		this.sub2_3.cubeList.add(new ModelBox(this.sub2_3, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_3 = new ModelRenderer(this);
		this.sub3_3.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_3, 0.4363F, 0.0F, 0.0F);
		this.sub2_3.addChild(this.sub3_3);
		this.sub3_3.cubeList.add(new ModelBox(this.sub3_3, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_3 = new ModelRenderer(this);
		this.sub4_3.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_3, 0.9599F, 0.4363F, 0.0F);
		this.sub3_3.addChild(this.sub4_3);
		this.sub4_3.cubeList.add(new ModelBox(this.sub4_3, 0, 0, -3.8074F, 5.058F, -39.771F, 5, 4, 51, 0.0F, false));

		this.arm4 = new ModelRenderer(this);
		this.arm4.setRotationPoint(34.0F, 0.0F, 4.0F);
		setRotationAngle(this.arm4, -0.2618F, -1.2217F, 0.0873F);
		this.g2.addChild(this.arm4);
		this.arm4.cubeList.add(new ModelBox(this.arm4, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm4 = new ModelRenderer(this);
		this.subarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm4.addChild(this.subarm4);
		this.subarm4.cubeList.add(new ModelBox(this.subarm4, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_4 = new ModelRenderer(this);
		this.sub2_4.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_4, 0.2618F, 0.0F, 0.0F);
		this.subarm4.addChild(this.sub2_4);
		this.sub2_4.cubeList.add(new ModelBox(this.sub2_4, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_4 = new ModelRenderer(this);
		this.sub3_4.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_4, 0.4363F, 0.0F, 0.0F);
		this.sub2_4.addChild(this.sub3_4);
		this.sub3_4.cubeList.add(new ModelBox(this.sub3_4, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_4 = new ModelRenderer(this);
		this.sub4_4.setRotationPoint(4.8192F, 18.4506F, -1.6433F);
		setRotationAngle(this.sub4_4, -2.0071F, -0.2618F, -0.2618F);
		this.sub3_4.addChild(this.sub4_4);
		this.sub4_4.cubeList.add(new ModelBox(this.sub4_4, 0, 0, -3.8074F, 5.058F, -13.771F, 4, 4, 25, 0.0F, false));

		this.arm11 = new ModelRenderer(this);
		this.arm11.setRotationPoint(39.0F, 0.0F, 41.0F);
		setRotationAngle(this.arm11, -0.2618F, -1.8326F, 0.0F);
		this.g2.addChild(this.arm11);
		this.arm11.cubeList.add(new ModelBox(this.arm11, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm11 = new ModelRenderer(this);
		this.subarm11.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm11.addChild(this.subarm11);
		this.subarm11.cubeList.add(new ModelBox(this.subarm11, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_11 = new ModelRenderer(this);
		this.sub2_11.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_11, 0.2618F, 0.0F, 0.0F);
		this.subarm11.addChild(this.sub2_11);
		this.sub2_11.cubeList.add(new ModelBox(this.sub2_11, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_11 = new ModelRenderer(this);
		this.sub3_11.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_11, 0.4363F, 0.0F, 0.0F);
		this.sub2_11.addChild(this.sub3_11);
		this.sub3_11.cubeList.add(new ModelBox(this.sub3_11, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_11 = new ModelRenderer(this);
		this.sub4_11.setRotationPoint(-4.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_11, 0.9599F, 0.4363F, 0.0F);
		this.sub3_11.addChild(this.sub4_11);
		this.sub4_11.cubeList.add(new ModelBox(this.sub4_11, 0, 0, -3.8074F, 5.058F, -13.771F, 5, 4, 25, 0.0F, false));

		this.sub5_1 = new ModelRenderer(this);
		this.sub5_1.setRotationPoint(-2.0F, 1.0F, -23.0F);
		setRotationAngle(this.sub5_1, 0.0873F, 0.1745F, 0.0F);
		this.sub4_11.addChild(this.sub5_1);
		this.sub5_1.cubeList.add(new ModelBox(this.sub5_1, 0, 0, -3.8074F, 5.058F, -20.771F, 5, 4, 32, 0.0F, false));

		this.g3 = new ModelRenderer(this);
		this.g3.setRotationPoint(-13.5F, -55.7658F, -24.8404F);
		setRotationAngle(this.g3, 0.0F, 0.0873F, -0.0873F);
		this.arms.addChild(this.g3);

		this.arm19 = new ModelRenderer(this);
		this.arm19.setRotationPoint(-20.0F, 16.0F, 11.0F);
		setRotationAngle(this.arm19, 0.1745F, 2.0071F, 0.0F);
		this.g3.addChild(this.arm19);
		this.arm19.cubeList.add(new ModelBox(this.arm19, 0, 0, 2.3443F, -8.232F, 1.1834F, 7, 8, 7, 0.0F, false));

		this.subarm19 = new ModelRenderer(this);
		this.subarm19.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm19.addChild(this.subarm19);
		this.subarm19.cubeList.add(new ModelBox(this.subarm19, 0, 0, 3.3443F, -7.3707F, -7.0616F, 5, 6, 10, 0.0F, false));

		this.sub2_19 = new ModelRenderer(this);
		this.sub2_19.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_19, 0.2618F, 0.0F, 0.0F);
		this.subarm19.addChild(this.sub2_19);
		this.sub2_19.cubeList.add(new ModelBox(this.sub2_19, 0, 0, 3.3443F, -4.8756F, 2.1192F, 5, 5, 7, 0.0F, false));

		this.sub3_19 = new ModelRenderer(this);
		this.sub3_19.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_19, 0.4363F, 0.0F, 0.0F);
		this.sub2_19.addChild(this.sub3_19);
		this.sub3_19.cubeList.add(new ModelBox(this.sub3_19, 0, 0, 3.3443F, 0.3732F, 1.3904F, 5, 4, 10, 0.0F, false));

		this.sub4_21 = new ModelRenderer(this);
		this.sub4_21.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_21, 0.3491F, 0.0F, 0.0F);
		this.sub3_19.addChild(this.sub4_21);
		this.sub4_21.cubeList.add(new ModelBox(this.sub4_21, 0, 0, 3.3443F, -0.06F, -12.4933F, 5, 4, 31, 0.0F, false));

		this.arm9 = new ModelRenderer(this);
		this.arm9.setRotationPoint(42.0F, 15.0F, 11.0F);
		setRotationAngle(this.arm9, 0.0873F, -1.3963F, 0.0F);
		this.g3.addChild(this.arm9);
		this.arm9.cubeList.add(new ModelBox(this.arm9, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm9 = new ModelRenderer(this);
		this.subarm9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm9.addChild(this.subarm9);
		this.subarm9.cubeList.add(new ModelBox(this.subarm9, 0, 0, 0.3978F, -3.071F, -10.9715F, 5, 6, 10, 0.0F, false));

		this.sub2_9 = new ModelRenderer(this);
		this.sub2_9.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_9, 0.2618F, 0.0F, 0.0F);
		this.subarm9.addChild(this.sub2_9);
		this.sub2_9.cubeList.add(new ModelBox(this.sub2_9, 0, 0, 0.3978F, -1.7344F, -2.7704F, 5, 5, 7, 0.0F, false));

		this.sub3_9 = new ModelRenderer(this);
		this.sub3_9.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_9, 0.4363F, 0.0F, 0.0F);
		this.sub2_9.addChild(this.sub3_9);
		this.sub3_9.cubeList.add(new ModelBox(this.sub3_9, 0, 0, 0.3978F, 1.1536F, -4.3685F, 5, 4, 10, 0.0F, false));

		this.sub4_9 = new ModelRenderer(this);
		this.sub4_9.setRotationPoint(2.8192F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_9, 0.3491F, -0.1745F, -0.3491F);
		this.sub3_9.addChild(this.sub4_9);
		this.sub4_9.cubeList.add(new ModelBox(this.sub4_9, 0, 0, 0.0921F, -0.5495F, -4.921F, 5, 4, 17, 0.0F, false));

		this.sub5_9 = new ModelRenderer(this);
		this.sub5_9.setRotationPoint(-2.0F, 7.0F, -11.0F);
		setRotationAngle(this.sub5_9, -0.1745F, 0.6981F, -1.5708F);
		this.sub4_9.addChild(this.sub5_9);
		this.sub5_9.cubeList.add(new ModelBox(this.sub5_9, 0, 0, -1.1881F, 0.544F, -17.2477F, 3, 4, 28, 0.0F, false));

		this.arm6 = new ModelRenderer(this);
		this.arm6.setRotationPoint(9.0F, 14.0F, 55.0F);
		setRotationAngle(this.arm6, 0.2618F, 2.618F, 0.0F);
		this.g3.addChild(this.arm6);
		this.arm6.cubeList.add(new ModelBox(this.arm6, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm6 = new ModelRenderer(this);
		this.subarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm6.addChild(this.subarm6);
		this.subarm6.cubeList.add(new ModelBox(this.subarm6, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_6 = new ModelRenderer(this);
		this.sub2_6.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_6, 0.2618F, 0.0F, 0.0F);
		this.subarm6.addChild(this.sub2_6);
		this.sub2_6.cubeList.add(new ModelBox(this.sub2_6, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_6 = new ModelRenderer(this);
		this.sub3_6.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_6, 0.4363F, 0.0F, 0.0F);
		this.sub2_6.addChild(this.sub3_6);
		this.sub3_6.cubeList.add(new ModelBox(this.sub3_6, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_6 = new ModelRenderer(this);
		this.sub4_6.setRotationPoint(-1.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_6, 0.3491F, 0.2618F, 0.0F);
		this.sub3_6.addChild(this.sub4_6);
		this.sub4_6.cubeList.add(new ModelBox(this.sub4_6, 0, 0, -3.366F, -1.517F, -19.3706F, 5, 4, 32, 0.0F, false));

		this.arm2 = new ModelRenderer(this);
		this.arm2.setRotationPoint(9.0F, 0.0F, 0.0F);
		setRotationAngle(this.arm2, 0.2618F, -0.6109F, 0.0F);
		this.g3.addChild(this.arm2);
		this.arm2.cubeList.add(new ModelBox(this.arm2, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm2 = new ModelRenderer(this);
		this.subarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm2.addChild(this.subarm2);
		this.subarm2.cubeList.add(new ModelBox(this.subarm2, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_2 = new ModelRenderer(this);
		this.sub2_2.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_2, 0.2618F, 0.0F, 0.0F);
		this.subarm2.addChild(this.sub2_2);
		this.sub2_2.cubeList.add(new ModelBox(this.sub2_2, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_2 = new ModelRenderer(this);
		this.sub3_2.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_2, 0.4363F, 0.0F, 0.0F);
		this.sub2_2.addChild(this.sub3_2);
		this.sub3_2.cubeList.add(new ModelBox(this.sub3_2, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_2 = new ModelRenderer(this);
		this.sub4_2.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_2, 0.3491F, 0.0F, 0.0F);
		this.sub3_2.addChild(this.sub4_2);
		this.sub4_2.cubeList.add(new ModelBox(this.sub4_2, 0, 0, -2.5F, -2.0F, -32.5F, 5, 4, 45, 0.0F, false));

		this.g4 = new ModelRenderer(this);
		this.g4.setRotationPoint(-13.5F, -55.7658F, -24.8404F);
		setRotationAngle(this.g4, 0.0F, 0.0873F, 0.0F);
		this.arms.addChild(this.g4);

		this.arm18 = new ModelRenderer(this);
		this.arm18.setRotationPoint(-17.0F, 11.0F, 44.0F);
		setRotationAngle(this.arm18, 0.2618F, 1.3963F, -0.1745F);
		this.g4.addChild(this.arm18);
		this.arm18.cubeList.add(new ModelBox(this.arm18, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm18 = new ModelRenderer(this);
		this.subarm18.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm18.addChild(this.subarm18);
		this.subarm18.cubeList.add(new ModelBox(this.subarm18, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_18 = new ModelRenderer(this);
		this.sub2_18.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_18, 0.2618F, 0.0F, 0.0F);
		this.subarm18.addChild(this.sub2_18);
		this.sub2_18.cubeList.add(new ModelBox(this.sub2_18, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_18 = new ModelRenderer(this);
		this.sub3_18.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_18, 0.4363F, 0.0F, 0.0F);
		this.sub2_18.addChild(this.sub3_18);
		this.sub3_18.cubeList.add(new ModelBox(this.sub3_18, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_20 = new ModelRenderer(this);
		this.sub4_20.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_20, 0.3491F, 0.0F, 0.0F);
		this.sub3_18.addChild(this.sub4_20);
		this.sub4_20.cubeList.add(new ModelBox(this.sub4_20, 0, 14, -2.5F, -2.0F, -18.5F, 5, 4, 31, 0.0F, false));

		this.arm8 = new ModelRenderer(this);
		this.arm8.setRotationPoint(35.0F, 12.0F, 60.0F);
		setRotationAngle(this.arm8, 0.2618F, 3.1416F, 0.0F);
		this.g4.addChild(this.arm8);
		this.arm8.cubeList.add(new ModelBox(this.arm8, 0, 0, 2.4772F, -0.9669F, -3.7713F, 7, 8, 7, 0.0F, false));

		this.subarm8 = new ModelRenderer(this);
		this.subarm8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm8.addChild(this.subarm8);
		this.subarm8.cubeList.add(new ModelBox(this.subarm8, 0, 0, 3.4772F, -0.1056F, -12.0164F, 5, 6, 10, 0.0F, false));

		this.sub2_8 = new ModelRenderer(this);
		this.sub2_8.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_8, 0.2618F, 0.0F, 0.0F);
		this.subarm8.addChild(this.sub2_8);
		this.sub2_8.cubeList.add(new ModelBox(this.sub2_8, 0, 0, 3.4772F, 0.8595F, -4.5471F, 5, 5, 7, 0.0F, false));

		this.sub3_8 = new ModelRenderer(this);
		this.sub3_8.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_8, 0.4363F, 0.0F, 0.0F);
		this.sub2_8.addChild(this.sub3_8);
		this.sub3_8.cubeList.add(new ModelBox(this.sub3_8, 0, 0, 3.4772F, 2.7537F, -7.0751F, 5, 4, 10, 0.0F, false));

		this.sub4_8 = new ModelRenderer(this);
		this.sub4_8.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_8, 0.3491F, 0.0F, 0.0F);
		this.sub3_8.addChild(this.sub4_8);
		this.sub4_8.cubeList.add(new ModelBox(this.sub4_8, 0, 0, 3.4772F, -0.7184F, -19.2624F, 5, 4, 29, 0.0F, false));

		this.arm5 = new ModelRenderer(this);
		this.arm5.setRotationPoint(36.0F, 19.0F, -9.0F);
		setRotationAngle(this.arm5, 0.2618F, -0.3491F, 0.0F);
		this.g4.addChild(this.arm5);
		this.arm5.cubeList.add(new ModelBox(this.arm5, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm5 = new ModelRenderer(this);
		this.subarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm5.addChild(this.subarm5);
		this.subarm5.cubeList.add(new ModelBox(this.subarm5, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_5 = new ModelRenderer(this);
		this.sub2_5.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_5, 0.2618F, 0.0F, 0.0F);
		this.subarm5.addChild(this.sub2_5);
		this.sub2_5.cubeList.add(new ModelBox(this.sub2_5, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_5 = new ModelRenderer(this);
		this.sub3_5.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_5, 0.4363F, 0.0F, 0.0F);
		this.sub2_5.addChild(this.sub3_5);
		this.sub3_5.cubeList.add(new ModelBox(this.sub3_5, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_5 = new ModelRenderer(this);
		this.sub4_5.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_5, 0.3491F, 0.0F, 0.0F);
		this.sub3_5.addChild(this.sub4_5);
		this.sub4_5.cubeList.add(new ModelBox(this.sub4_5, 0, 0, -2.5F, -2.0F, -15.5F, 5, 4, 28, 0.0F, false));

		this.arm12 = new ModelRenderer(this);
		this.arm12.setRotationPoint(47.0F, 19.0F, 48.0F);
		setRotationAngle(this.arm12, 0.2618F, -1.8326F, 0.0F);
		this.g4.addChild(this.arm12);
		this.arm12.cubeList.add(new ModelBox(this.arm12, 0, 0, -3.5F, -4.0F, -3.5F, 7, 8, 7, 0.0F, false));

		this.subarm12 = new ModelRenderer(this);
		this.subarm12.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm12.addChild(this.subarm12);
		this.subarm12.cubeList.add(new ModelBox(this.subarm12, 0, 0, -2.5F, -3.1387F, -11.745F, 5, 6, 10, 0.0F, false));

		this.sub2_12 = new ModelRenderer(this);
		this.sub2_12.setRotationPoint(0.0F, 0.0F, -12.0F);
		setRotationAngle(this.sub2_12, 0.2618F, 0.0F, 0.0F);
		this.subarm12.addChild(this.sub2_12);
		this.sub2_12.cubeList.add(new ModelBox(this.sub2_12, 0, 0, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));

		this.sub3_12 = new ModelRenderer(this);
		this.sub3_12.setRotationPoint(0.0F, -0.1387F, -6.745F);
		setRotationAngle(this.sub3_12, 0.4363F, 0.0F, 0.0F);
		this.sub2_12.addChild(this.sub3_12);
		this.sub3_12.cubeList.add(new ModelBox(this.sub3_12, 0, 0, -2.5F, 0.6046F, -4.9176F, 5, 4, 10, 0.0F, false));

		this.sub4_12 = new ModelRenderer(this);
		this.sub4_12.setRotationPoint(-0.1808F, 6.4506F, -14.6433F);
		setRotationAngle(this.sub4_12, 0.3491F, 0.0F, 0.0F);
		this.sub3_12.addChild(this.sub4_12);
		this.sub4_12.cubeList.add(new ModelBox(this.sub4_12, 0, 0, -2.5F, -2.0F, -9.5F, 5, 4, 22, 0.0F, false));

		this.foots = new ModelRenderer(this);
		this.foots.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bone.addChild(this.foots);

		this.left = new ModelRenderer(this);
		this.left.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.foots.addChild(this.left);

		this.foot4 = new ModelRenderer(this);
		this.foot4.setRotationPoint(36.0F, -40.0F, 29.0F);
		setRotationAngle(this.foot4, -0.2618F, 0.3491F, -0.1745F);
		this.left.addChild(this.foot4);
		this.foot4.cubeList.add(new ModelBox(this.foot4, 0, 0, -9.0F, -8.0F, 0.0F, 9, 8, 9, 0.0F, false));

		this.foot2_4 = new ModelRenderer(this);
		this.foot2_4.setRotationPoint(-4.0F, -6.0F, 11.0F);
		setRotationAngle(this.foot2_4, -1.1345F, 3.0543F, -0.2618F);
		this.foot4.addChild(this.foot2_4);
		this.foot2_4.cubeList.add(new ModelBox(this.foot2_4, 0, 0, -3.3774F, -1.9386F, 1.0013F, 9, 10, 8, 0.0F, false));

		this.foot3_4 = new ModelRenderer(this);
		this.foot3_4.setRotationPoint(0.0F, -2.0F, 17.0F);
		setRotationAngle(this.foot3_4, -0.7854F, 3.0543F, -0.2618F);
		this.foot2_4.addChild(this.foot3_4);
		this.foot3_4.cubeList.add(new ModelBox(this.foot3_4, 0, 0, -2.3379F, -4.0327F, 8.9616F, 10, 39, 9, 0.0F, false));

		this.foot1 = new ModelRenderer(this);
		this.foot1.setRotationPoint(-28.0F, -40.0F, 35.0F);
		setRotationAngle(this.foot1, -0.1745F, -1.0472F, -0.1745F);
		this.left.addChild(this.foot1);
		this.foot1.cubeList.add(new ModelBox(this.foot1, 0, 0, -9.0F, -8.0F, 0.0F, 9, 8, 9, 0.0F, false));

		this.foot2_1 = new ModelRenderer(this);
		this.foot2_1.setRotationPoint(-4.0F, -6.0F, 11.0F);
		setRotationAngle(this.foot2_1, -1.1345F, 3.0543F, -0.2618F);
		this.foot1.addChild(this.foot2_1);
		this.foot2_1.cubeList.add(new ModelBox(this.foot2_1, 0, 0, -3.3774F, -1.9386F, 1.0013F, 9, 10, 8, 0.0F, false));

		this.foot3_1 = new ModelRenderer(this);
		this.foot3_1.setRotationPoint(9.0F, -2.0F, 13.0F);
		setRotationAngle(this.foot3_1, -0.6109F, -2.7925F, -0.1745F);
		this.foot2_1.addChild(this.foot3_1);
		this.foot3_1.cubeList.add(new ModelBox(this.foot3_1, 0, 0, 0.8736F, -3.4751F, 8.1245F, 10, 39, 8, 0.0F, false));

		this.right = new ModelRenderer(this);
		this.right.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.foots.addChild(this.right);

		this.foot3 = new ModelRenderer(this);
		this.foot3.setRotationPoint(27.0F, -40.0F, -33.0F);
		setRotationAngle(this.foot3, -0.2618F, 1.9199F, 0.0873F);
		this.right.addChild(this.foot3);
		this.foot3.cubeList.add(new ModelBox(this.foot3, 0, 0, -9.0F, -8.0F, 0.0F, 9, 8, 9, 0.0F, false));

		this.foot2_3 = new ModelRenderer(this);
		this.foot2_3.setRotationPoint(-4.0F, -6.0F, 11.0F);
		setRotationAngle(this.foot2_3, -1.1345F, 3.0543F, -0.2618F);
		this.foot3.addChild(this.foot2_3);
		this.foot2_3.cubeList.add(new ModelBox(this.foot2_3, 0, 0, -3.3774F, -1.9386F, 1.0013F, 9, 10, 8, 0.0F, false));

		this.foot3_3 = new ModelRenderer(this);
		this.foot3_3.setRotationPoint(0.0F, 1.0F, 17.0F);
		setRotationAngle(this.foot3_3, -0.6109F, 3.0543F, -0.2618F);
		this.foot2_3.addChild(this.foot3_3);
		this.foot3_3.cubeList.add(new ModelBox(this.foot3_3, 0, 0, -2.3379F, -4.0327F, 9.9616F, 10, 39, 8, 0.0F, false));

		this.foot2 = new ModelRenderer(this);
		this.foot2.setRotationPoint(-32.0F, -40.0F, -27.0F);
		setRotationAngle(this.foot2, -0.1745F, -2.4435F, -0.1745F);
		this.right.addChild(this.foot2);
		this.foot2.cubeList.add(new ModelBox(this.foot2, 0, 0, -9.0F, -8.0F, 0.0F, 9, 8, 9, 0.0F, false));

		this.foot2_2 = new ModelRenderer(this);
		this.foot2_2.setRotationPoint(-4.0F, -6.0F, 11.0F);
		setRotationAngle(this.foot2_2, -1.1345F, 3.0543F, -0.2618F);
		this.foot2.addChild(this.foot2_2);
		this.foot2_2.cubeList.add(new ModelBox(this.foot2_2, 0, 0, -3.3774F, -1.9386F, 1.0013F, 9, 10, 8, 0.0F, false));

		this.foot3_2 = new ModelRenderer(this);
		this.foot3_2.setRotationPoint(0.0F, 1.0F, 17.0F);
		setRotationAngle(this.foot3_2, -0.8727F, 3.0543F, -0.2618F);
		this.foot2_2.addChild(this.foot3_2);
		this.foot3_2.cubeList.add(new ModelBox(this.foot3_2, 0, 0, -2.3379F, -9.0327F, 9.9616F, 10, 44, 8, 0.0F, false));

		this.head = new ModelRenderer(this);
		this.head.setRotationPoint(-12.0F, -64.0F, 0.0F);
		setRotationAngle(this.head, 0.0F, 0.0873F, 0.0F);
		this.bone.addChild(this.head);
		this.head.cubeList.add(new ModelBox(this.head, 64, 102, -7.0F, -4.0F, -8.0F, 16, 10, 16, 0.0F, false));
		this.head.cubeList.add(new ModelBox(this.head, 64, 87, -6.0F, -6.0F, -7.0F, 13, 10, 14, 0.0F, false));
		this.head.cubeList.add(new ModelBox(this.head, 64, 87, -4.0F, -7.0F, -6.0F, 9, 11, 12, 0.0F, false));

		this.Body = new ModelRenderer(this);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bone.addChild(this.Body);
		this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -37.5F, -18.0F, -37.5F, 75, 10, 75, 0.0F, false));
		this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -35.0F, -29.0F, -35.0F, 70, 11, 70, 0.0F, false));
		this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -34.0F, -50.0F, -34.0F, 68, 21, 68, 0.0F, false));
		this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -24.0F, -62.0F, -24.0F, 48, 31, 48, 0.0F, false));
	}


	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bone.render(f5);
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right.rotateAngleX = f1 / 3.0F * -1.0F;
		this.left.rotateAngleX = f1 / 3.0F;
		this.g1.rotateAngleX = f1 / 4.0F;
		this.g2.rotateAngleZ = -f1 / 4.0F * -1.0F;
		this.g2.rotateAngleX = f1 / 4.0F * -1.0F;
		this.g3.rotateAngleZ = f1 / 4.0F;
		this.g3.rotateAngleX = f1 / 4.5F;
		this.g4.rotateAngleZ = f1 / 4.0F;
	}
}