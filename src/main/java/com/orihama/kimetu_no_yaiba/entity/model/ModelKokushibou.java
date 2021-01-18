package com.orihama.kimetu_no_yaiba.entity.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelKokushibou extends ModelBase {
	private final ModelRenderer group;
	private final ModelRenderer Left_Arm;
	private final ModelRenderer Right_Arm;
	private final ModelRenderer Blade;
	private final ModelRenderer bone42;
	private final ModelRenderer bone41;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer Left_Leg;
	private final ModelRenderer Right_Leg;
	private final ModelRenderer belt;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer hears;
	private final ModelRenderer h_head;
	private final ModelRenderer bone35;
	private final ModelRenderer bone38;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer h_left;
	private final ModelRenderer bone11;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone6;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer h_right;
	private final ModelRenderer bone26;
	private final ModelRenderer bone22;
	private final ModelRenderer bone28;
	private final ModelRenderer bone27;
	private final ModelRenderer bone25;
	private final ModelRenderer bone23;
	private final ModelRenderer bone21;
	private final ModelRenderer bone20;
	private final ModelRenderer h_back;
	private final ModelRenderer bone9;
	private final ModelRenderer bone12;
	private final ModelRenderer bone15;
	private final ModelRenderer bone34;
	private final ModelRenderer bone16;
	private final ModelRenderer bone36;

	public ModelKokushibou() {
		textureWidth = 128;
		textureHeight = 128;

		group = new ModelRenderer(this);
		group.setRotationPoint(-8.0F, 14.0F, 8.0F);

		Left_Arm = new ModelRenderer(this);
		Left_Arm.setRotationPoint(12.0F, -17.0F, -8.0F);
		group.addChild(Left_Arm);
		Left_Arm.cubeList.add(new ModelBox(Left_Arm, 76, 75, -0.48F, -2.0F, -2.5F, 4, 10, 5, 0.0F, false));
		Left_Arm.cubeList.add(new ModelBox(Left_Arm, 5, 18, 0.31F, 4.0F, -1.5F, 2, 9, 3, 0.0F, false));
		Left_Arm.cubeList.add(new ModelBox(Left_Arm, 2, 54, -0.51F, 4.0F, -2.0F, 4, 5, 4, 0.0F, false));

		Right_Arm = new ModelRenderer(this);
		Right_Arm.setRotationPoint(3.0F, -18.0F, -8.0F);
		group.addChild(Right_Arm);
		Right_Arm.cubeList.add(new ModelBox(Right_Arm, 98, 107, -3.5341F, -1.1011F, -1.9912F, 5, 9, 5, 0.0F, false));
		Right_Arm.cubeList.add(new ModelBox(Right_Arm, 5, 18, -2.5241F, 3.8989F, -0.9912F, 2, 10, 3, 0.0F, false));
		Right_Arm.cubeList.add(new ModelBox(Right_Arm, 2, 54, -3.0241F, 3.8989F, -1.5088F, 3, 5, 4, 0.0F, false));

		Blade = new ModelRenderer(this);
		Blade.setRotationPoint(-0.0341F, -0.1011F, 8.5088F);
		Right_Arm.addChild(Blade);
		Blade.cubeList.add(new ModelBox(Blade, 28, 34, -2.3F, 11.5F, -10.6F, 2, 3, 1, 0.0F, false));
		Blade.cubeList.add(new ModelBox(Blade, 29, 35, -1.8F, 12.5F, -10.5F, 1, 1, 6, 0.0F, false));
		Blade.cubeList.add(new ModelBox(Blade, 5, 81, -2.0F, 12.0F, -54.5F, 1, 2, 44, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, 0.0F, -4.0F);
		Blade.addChild(bone42);
		bone42.cubeList.add(new ModelBox(bone42, 35, 114, -1.5F, 6.0F, -15.5F, 0, 6, 1, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 39, 112, -2.1F, 9.0F, -15.5F, 1, 4, 3, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 36, 101, -1.5F, 6.0F, -15.7F, 0, 6, 0, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-1.25F, 9.0F, -14.5F);
		setRotationAngle(bone41, 0.4363F, 0.0F, 0.0F);
		bone42.addChild(bone41);
		bone41.cubeList.add(new ModelBox(bone41, 37, 112, -0.15F, -2.0F, -0.2F, 0, 3, 2, 0.0F, false));
		bone41.cubeList.add(new ModelBox(bone41, 37, 112, -0.15F, -3.0F, 0.8F, 0, 4, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-2.6875F, 13.3125F, -24.6F);
		setRotationAngle(bone43, 0.0F, 0.0F, -3.1416F);
		Blade.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 35, 114, -1.8125F, -8.3125F, -5.9F, 0, 7, 1, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 39, 112, -1.7125F, -4.3125F, -5.9F, 0, 4, 3, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 36, 100, -2.3125F, -8.3125F, -6.1F, 1, 8, 0, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-1.5625F, -5.0625F, -3.85F);
		setRotationAngle(bone44, 0.2618F, 0.0F, 0.0F);
		bone43.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 37, 112, -0.15F, -3.25F, -1.25F, 0, 5, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 37, 112, -0.15F, -4.25F, -0.25F, 0, 6, 1, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-2.6875F, 13.3125F, -36.6F);
		setRotationAngle(bone45, 0.0F, 0.0F, -3.1416F);
		Blade.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 35, 114, -2.3125F, -11.3125F, -5.9F, 1, 10, 1, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 37, 112, -2.4125F, -4.3125F, -5.9F, 1, 4, 3, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 36, 100, -2.3125F, -11.3125F, -6.1F, 1, 11, 0, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-1.5625F, -5.0625F, -3.85F);
		setRotationAngle(bone46, 0.2618F, 0.0F, 0.0F);
		bone45.addChild(bone46);
		bone46.cubeList.add(new ModelBox(bone46, 41, 110, -0.85F, -7.25F, -0.25F, 1, 9, 1, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 37, 113, -0.85F, -3.25F, -1.25F, 1, 5, 2, 0.0F, false));

		Left_Leg = new ModelRenderer(this);
		Left_Leg.setRotationPoint(10.0F, -8.0F, -8.0F);
		group.addChild(Left_Leg);
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 0, 70, -3.4F, -1.0F, -2.5F, 6, 18, 5, 0.0F, true));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 25, 20, -1.0F, 17.0F, -3.0F, 3, 1, 6, 0.0F, false));

		Right_Leg = new ModelRenderer(this);
		Right_Leg.setRotationPoint(6.0F, -8.0F, -8.0F);
		group.addChild(Right_Leg);
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 0, 70, -4.1F, -1.0F, -2.5F, 6, 18, 5, 0.0F, true));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 0, 36, -3.0F, 17.0F, -3.0F, 3, 1, 6, 0.0F, false));

		belt = new ModelRenderer(this);
		belt.setRotationPoint(0.0F, -3.0F, 0.0F);
		group.addChild(belt);
		belt.cubeList.add(new ModelBox(belt, 25, 46, 2.1F, -7.02F, -10.49F, 10, 1, 5, 0.0F, false));
		belt.cubeList.add(new ModelBox(belt, 122, 101, 7.0F, -6.2F, -10.9F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.7F, -5.4155F, -10.3F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.8727F);
		belt.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 1, -0.8F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(8.0061F, -5.5155F, -10.3F);
		setRotationAngle(bone2, 0.0F, 0.0F, -1.0472F);
		belt.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 1, -0.4861F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(8.0F, -16.0F, -8.0F);
		group.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 63, 72, -4.8F, -4.02F, -2.06F, 9, 12, 4, 0.0F, true));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(8.0F, -19.0F, -8.0F);
		group.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 94, 0, -5.0F, -10.5F, -3.0F, 9, 9, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 9, -2.0F, -2.5F, -2.0F, 3, 3, 3, 0.0F, false));

		hears = new ModelRenderer(this);
		hears.setRotationPoint(0.0F, 27.0F, 0.0F);
		Head.addChild(hears);

		h_head = new ModelRenderer(this);
		h_head.setRotationPoint(-1.0F, -26.0F, 32.0F);
		setRotationAngle(h_head, 1.0472F, 0.0F, 0.0F);
		hears.addChild(h_head);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.3439F, -29.2202F, -3.6025F);
		setRotationAngle(bone35, 0.3491F, 0.0F, 0.0F);
		h_head.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 107, 55, -3.0F, -6.5F, -1.1975F, 7, 5, 3, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.3439F, -29.2202F, -3.6025F);
		setRotationAngle(bone38, 0.3491F, 0.0F, 0.0F);
		h_head.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 107, 55, -2.3F, -7.5F, -1.5975F, 5, 6, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.3439F, -29.2202F, -3.6025F);
		setRotationAngle(bone5, 0.6981F, 0.0F, 0.0F);
		h_head.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 80, 22, -3.3F, -6.2798F, -7.5975F, 7, 5, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.3439F, -29.2202F, -3.6025F);
		setRotationAngle(bone3, -0.2618F, 0.0F, 0.0F);
		h_head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 107, 55, -1.3F, -4.5F, 0.4025F, 3, 3, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.3439F, -29.2202F, -3.6025F);
		setRotationAngle(bone4, -0.2618F, 0.0F, 0.0F);
		h_head.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 107, 55, -2.3F, -5.5F, -1.5975F, 5, 4, 3, 0.0F, false));

		h_left = new ModelRenderer(this);
		h_left.setRotationPoint(1.0F, -4.0F, 0.0F);
		setRotationAngle(h_left, 0.0F, -0.0873F, 0.0F);
		hears.addChild(h_left);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(3.0F, -25.3F, -4.25F);
		setRotationAngle(bone11, -0.2618F, 0.6981F, 0.0F);
		h_left.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 120, 44, -2.0F, -5.2F, 1.25F, 2, 9, 0, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone47, 0.4363F, 0.0F, 1.6581F);
		h_left.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 104, 58, -2.9964F, 1.3F, -1.4986F, 9, 1, 3, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(4.5036F, -21.8F, -2.4986F);
		setRotationAngle(bone48, 0.6109F, -0.0873F, 1.0472F);
		h_left.addChild(bone48);
		bone48.cubeList.add(new ModelBox(bone48, 50, 37, -3.5F, -0.4F, -0.5F, 5, 1, 2, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(4.5036F, -21.8F, -2.4986F);
		setRotationAngle(bone49, 0.6109F, -0.0873F, 1.7453F);
		h_left.addChild(bone49);
		bone49.cubeList.add(new ModelBox(bone49, 75, 48, -2.5F, 1.6F, -1.5F, 6, 1, 1, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(4.5036F, -28.8F, -1.9986F);
		setRotationAngle(bone50, 0.0F, 0.0F, 0.8727F);
		h_left.addChild(bone50);
		bone50.cubeList.add(new ModelBox(bone50, 72, 60, -1.5F, -0.4F, -2.0F, 3, 1, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.5036F, -28.8F, -1.9986F);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.8727F);
		h_left.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 72, 60, -0.5F, 2.6F, -2.0F, 3, 0, 3, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone51, 0.6981F, 0.0F, 0.6981F);
		h_left.addChild(bone51);
		bone51.cubeList.add(new ModelBox(bone51, 110, 59, -6.9964F, -0.7F, -0.4986F, 5, 1, 2, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone52, 0.6981F, 0.0F, 0.6981F);
		h_left.addChild(bone52);
		bone52.cubeList.add(new ModelBox(bone52, 118, 58, -6.9964F, -0.7F, 0.0F, 1, 3, 3, 0.0F, false));

		h_right = new ModelRenderer(this);
		h_right.setRotationPoint(-1.0F, -4.0F, -4.0F);
		setRotationAngle(h_right, 0.0F, 2.9671F, 0.0F);
		hears.addChild(h_right);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone26, 0.4363F, 0.0F, 1.6581F);
		h_right.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 104, 58, -2.9964F, 1.3F, -1.4986F, 9, 1, 3, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(4.5036F, -22.8F, -2.4986F);
		setRotationAngle(bone22, 0.6109F, -0.6109F, 1.0472F);
		h_right.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 50, 37, -4.7906F, -0.2753F, 0.8063F, 5, 1, 2, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(4.5036F, -21.8F, -2.4986F);
		setRotationAngle(bone28, 0.6109F, -0.0873F, 2.0944F);
		h_right.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 84, 47, -1.5F, 1.6F, -2.5F, 4, 0, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(4.5036F, -28.8F, -1.9986F);
		setRotationAngle(bone27, 0.0F, 0.0F, 0.8727F);
		h_right.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 72, 60, -2.5F, -0.4F, -2.0F, 4, 1, 2, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone25, 0.6981F, 0.0F, 0.6981F);
		h_right.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 110, 60, -6.9964F, -0.7F, 0.5014F, 5, 1, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone23, 0.0873F, 0.3491F, 0.6981F);
		h_right.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 119, 58, -7.1964F, -1.7F, -2.4986F, 1, 3, 2, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(6.78F, -7.5F, 3.0031F);
		setRotationAngle(bone21, 0.2618F, 0.0F, 0.9599F);
		h_right.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 113, 66, -19.0F, -10.0F, -4.0F, 5, 0, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(3.28F, -21.3F, -1.9969F);
		setRotationAngle(bone20, 0.0F, 0.0F, 1.6581F);
		h_right.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 69, 47, -9.5F, -0.2F, -1.5031F, 11, 1, 2, 0.0F, false));

		h_back = new ModelRenderer(this);
		h_back.setRotationPoint(-1.0F, -8.0F, 16.0F);
		setRotationAngle(h_back, 0.1745F, 0.0F, 0.0F);
		hears.addChild(h_back);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.5F, -31.5F, -3.5F);
		setRotationAngle(bone9, 0.6981F, 1.2217F, 0.5236F);
		h_back.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 120, 37, 1.2006F, -3.2066F, 0.6144F, 1, 15, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(1.5F, -32.5F, -2.5F);
		setRotationAngle(bone12, -1.3963F, 0.2618F, 0.0F);
		h_back.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 67, 20, -0.8465F, 1.9421F, -3.2829F, 2, 1, 18, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.6581F);
		h_back.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 69, 41, -4.2719F, 4.4151F, -2.0985F, 17, 2, 2, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone34, -0.4363F, -0.0873F, 1.309F);
		h_back.addChild(bone34);
		bone34.cubeList.add(new ModelBox(bone34, 69, 42, -5.2471F, 1.1371F, -1.6152F, 17, 1, 2, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(5.0F, -30.5F, -3.5F);
		setRotationAngle(bone16, -0.4363F, -0.0873F, 1.9199F);
		h_back.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 71, 53, -2.2471F, 4.1371F, -0.6152F, 14, 2, 2, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(1.2529F, -23.7629F, -3.1152F);
		setRotationAngle(bone36, -2.9671F, -0.0873F, 1.0472F);
		h_back.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 59, 10, -5.8237F, 4.1227F, -0.4843F, 12, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		// scale the whole thing for big or small entities
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.5F, 0.84F, 0.5F);
		//GL11.glScalef(entity.getScaleFactor(), entity.getScaleFactor(), entity.getScaleFactor());

		this.Head.render(f5);
	     this.Body.render(f5);
	     this.Left_Arm.render(f5);
	     this.Left_Leg.render(f5);
	     this.Right_Arm.render(f5);
	     this.Right_Leg.render(f5);
	     this.belt.render(f5);

		// don't forget to pop the matrix for overall scaling
		GL11.glPopMatrix();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;

        if (flag){this.Head.rotateAngleX = -((float)Math.PI / 4F);}
        else{this.Head.rotateAngleX = headPitch * 0.017453292F;}
        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;

        this.Body.rotateAngleY = 0.0F;

        float f = 1.0F;

        if (flag){
            f = (float)(entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F){
            f = 1.0F;
        }

        this.Right_Arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.Left_Arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.Right_Arm.rotateAngleZ = 0.0F;
        this.Left_Arm.rotateAngleZ = 0.0F;
        this.Right_Leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.Left_Leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.Right_Leg.rotateAngleY = 0.0F;
        this.Left_Leg.rotateAngleY = 0.0F;
        this.Right_Leg.rotateAngleZ = 0.0F;
        this.Left_Leg.rotateAngleZ = 0.0F;


        if (this.swingProgress > 0.0F){

            float f1 = this.swingProgress;
           // this.Body.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;
           // this.Right_Arm.rotationPointZ = MathHelper.sin(this.Body.rotateAngleY) * 5.0F;
           // this.Right_Arm.rotationPointX = -MathHelper.cos(this.Body.rotateAngleY) * 5.0F;
           // this.Left_Arm.rotationPointZ = -MathHelper.sin(this.Body.rotateAngleY) * 5.0F;
           // this.Left_Arm.rotationPointX = MathHelper.cos(this.Body.rotateAngleY) * 5.0F;
           // this.Right_Arm.rotateAngleY += this.Body.rotateAngleY;
           // this.Left_Arm.rotateAngleY += this.Body.rotateAngleY;
           // this.Left_Arm.rotateAngleX += this.Body.rotateAngleY;
            f1 = 1.0F - this.swingProgress;
            f1 = f1 * f1;
            f1 = f1 * f1;
            f1 = 1.0F - f1;
            //float f2 = MathHelper.sin(f1 * (float)Math.PI);
           //  float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;

        }else{
            this.Body.rotateAngleX = 0.0F;
        }
        this.Right_Arm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.Left_Arm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.Right_Arm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.Left_Arm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }



}
