 package com.orihama.kimetu_no_yaiba.entity.model;

 import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

 public class ModelRui extends ModelBase {
   private final ModelRenderer bone;
   private final ModelRenderer foot;
   private final ModelRenderer left;
   private final ModelRenderer right;
   private final ModelRenderer body;
   private final ModelRenderer arm;
   private final ModelRenderer left_arm;
   private final ModelRenderer left_arm2;
   private final ModelRenderer right_arm2;
   private final ModelRenderer right_arm3;
   private final ModelRenderer head;
   private final ModelRenderer head2;
   private final ModelRenderer hair;
   private final ModelRenderer hair1;
   private final ModelRenderer hair2;
   private final ModelRenderer hair3;
   private final ModelRenderer hair4;
   private final ModelRenderer hair5;
   private final ModelRenderer hair6;
   private final ModelRenderer hair7;
   private final ModelRenderer hair8;
   private final ModelRenderer hair9;
   private final ModelRenderer hair10;
   private final ModelRenderer hair11;
   private final ModelRenderer hair12;
   private final ModelRenderer hair13;
   private final ModelRenderer hair14;
   private final ModelRenderer hair15;
   private final ModelRenderer hair16;
   private final ModelRenderer cloth;
   private final ModelRenderer ue_clo;
   private final ModelRenderer bone7;
   private final ModelRenderer bone9;
   private final ModelRenderer bone6;
   private final ModelRenderer bone8;
   private final ModelRenderer bone10;
   private final ModelRenderer bone11;
   private final ModelRenderer sita_clo;
   private final ModelRenderer bone2;
   private final ModelRenderer bone3;
   private final ModelRenderer bone4;
   private final ModelRenderer bone5;

   public ModelRui() {
	     this.textureWidth = 128;
	     this.textureHeight = 128;
     this.bone = new ModelRenderer(this);
     this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
     setRotationAngle(this.bone, 0.0F, 3.1416F, 0.0F);

     this.foot = new ModelRenderer(this);
     this.foot.setRotationPoint(0.0F, 0.0F, -1.0F);
     this.bone.addChild(this.foot);

     this.left = new ModelRenderer(this);
     this.left.setRotationPoint(-1.0F, -4.0F, 1.0F);
     this.foot.addChild(this.left);
     this.left.cubeList.add(new ModelBox(this.left, 19, 24, -2.0F, -5.0F, -2.0F, 3, 9, 4, 0.0F, false));

     this.right = new ModelRenderer(this);
     this.right.setRotationPoint(3.0F, -4.0F, 1.0F);
     this.foot.addChild(this.right);
     this.right.cubeList.add(new ModelBox(this.right, 19, 24, -2.0F, -7.0F, -2.0F, 3, 11, 4, 0.0F, false));

     this.body = new ModelRenderer(this);
     this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
     this.bone.addChild(this.body);
     this.body.cubeList.add(new ModelBox(this.body, 100, 78, -3.0F, -23.0F, -3.0F, 6, 18, 7, 0.0F, false));
     this.body.cubeList.add(new ModelBox(this.body, 100, 78, -2.0F, -25.0F, -2.0F, 4, 10, 4, 0.0F, false));

     this.arm = new ModelRenderer(this);
     this.arm.setRotationPoint(0.0F, 0.0F, 0.0F);
     this.bone.addChild(this.arm);

     this.left_arm = new ModelRenderer(this);
     this.left_arm.setRotationPoint(0.0F, -17.0F, 0.0F);
     setRotationAngle(this.left_arm, 3.1416F, 0.0F, 0.5236F);
     this.arm.addChild(this.left_arm);
     this.left_arm.cubeList.add(new ModelBox(this.left_arm, 16, 62, -7.3641F, -8.134F, -3.0F, 5, 11, 5, 0.0F, false));

     this.left_arm2 = new ModelRenderer(this);
     this.left_arm2.setRotationPoint(-2.0F, -7.0F, 0.0F);
     setRotationAngle(this.left_arm2, 3.1416F, 0.0F, -0.0873F);
     this.left_arm.addChild(this.left_arm2);
     this.left_arm2.cubeList.add(new ModelBox(this.left_arm2, 27, 80, -4.3641F, -2.134F, -1.0F, 2, 6, 3, 0.0F, false));

     this.right_arm2 = new ModelRenderer(this);
     this.right_arm2.setRotationPoint(0.0F, -15.0F, 0.0F);
     setRotationAngle(this.right_arm2, 0.0F, 0.0F, 2.5307F);
     this.arm.addChild(this.right_arm2);
     this.right_arm2.cubeList.add(new ModelBox(this.right_arm2, 16, 62, -8.849F, -7.5604F, -3.0F, 5, 11, 5, 0.0F, false));

     this.right_arm3 = new ModelRenderer(this);
     this.right_arm3.setRotationPoint(-4.0F, 0.0F, 0.0F);
     setRotationAngle(this.right_arm3, 0.0F, 0.0F, 1.5708F);
     this.right_arm2.addChild(this.right_arm3);
     this.right_arm3.cubeList.add(new ModelBox(this.right_arm3, 16, 62, -9.849F, 1.4396F, -2.0F, 6, 2, 3, 0.0F, false));

     this.head = new ModelRenderer(this);
     this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
     this.bone.addChild(this.head);

     this.head2 = new ModelRenderer(this);
     this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
     setRotationAngle(this.head2, 0.0F, 3.1416F, 0.0F);
     this.head.addChild(this.head2);
     this.head2.cubeList.add(new ModelBox(this.head2, 98, 4, -3.0F, -29.0F, -3.0F, 6, 5, 6, 0.0F, false));

     this.hair = new ModelRenderer(this);
     this.hair.setRotationPoint(0.0F, 0.0F, 0.0F);
     this.head.addChild(this.hair);

     this.hair1 = new ModelRenderer(this);
     this.hair1.setRotationPoint(0.0F, -30.0F, 4.0F);
     setRotationAngle(this.hair1, 0.0F, 0.0F, -0.7854F);
     this.hair.addChild(this.hair1);
     this.hair1.cubeList.add(new ModelBox(this.hair1, 0, 0, -5.0F, 0.0F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair2 = new ModelRenderer(this);
     this.hair2.setRotationPoint(0.0F, -30.0F, 4.0F);
     setRotationAngle(this.hair2, 0.0F, 0.0F, -2.1817F);
     this.hair.addChild(this.hair2);
     this.hair2.cubeList.add(new ModelBox(this.hair2, 0, 0, -5.7071F, 0.7071F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair3 = new ModelRenderer(this);
     this.hair3.setRotationPoint(-2.0F, -27.0F, 4.0F);
     setRotationAngle(this.hair3, 0.0F, 0.0F, 0.7854F);
     this.hair.addChild(this.hair3);
     this.hair3.cubeList.add(new ModelBox(this.hair3, 0, 0, -2.0F, 0.0F, -7.5F, 4, 1, 7, 0.0F, false));

     this.hair4 = new ModelRenderer(this);
     this.hair4.setRotationPoint(1.0F, -31.0F, 4.0F);
     setRotationAngle(this.hair4, 0.0F, 0.0F, -0.5236F);
     this.hair.addChild(this.hair4);
     this.hair4.cubeList.add(new ModelBox(this.hair4, 0, 0, -5.866F, -0.5F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair5 = new ModelRenderer(this);
     this.hair5.setRotationPoint(1.0F, -31.0F, 4.0F);
     setRotationAngle(this.hair5, 0.0F, 0.0F, -0.1745F);
     this.hair.addChild(this.hair5);
     this.hair5.cubeList.add(new ModelBox(this.hair5, 0, 0, -5.0F, 0.0F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair6 = new ModelRenderer(this);
     this.hair6.setRotationPoint(-1.0F, -30.0F, 4.0F);
     setRotationAngle(this.hair6, 0.0F, 0.0F, -2.8798F);
     this.hair.addChild(this.hair6);
     this.hair6.cubeList.add(new ModelBox(this.hair6, 0, 0, -4.8411F, 0.2071F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair7 = new ModelRenderer(this);
     this.hair7.setRotationPoint(0.0F, -30.0F, 4.0F);
     setRotationAngle(this.hair7, 0.0F, 0.0F, -2.5307F);
     this.hair.addChild(this.hair7);
     this.hair7.cubeList.add(new ModelBox(this.hair7, 0, 0, -5.7071F, 0.2F, -7.5F, 6, 1, 7, 0.0F, false));

     this.hair8 = new ModelRenderer(this);
     this.hair8.setRotationPoint(-2.0F, -25.0F, 4.0F);
     setRotationAngle(this.hair8, 0.0F, 0.0F, 0.6981F);
     this.hair.addChild(this.hair8);
     this.hair8.cubeList.add(new ModelBox(this.hair8, 0, 0, -2.0F, 0.0F, -7.5F, 4, 1, 7, 0.0F, false));

     this.hair9 = new ModelRenderer(this);
     this.hair9.setRotationPoint(-2.0F, -24.0F, 4.0F);
     setRotationAngle(this.hair9, 0.0F, 0.0F, 1.1345F);
     this.hair.addChild(this.hair9);
     this.hair9.cubeList.add(new ModelBox(this.hair9, 0, 0, -2.0F, 0.0F, -7.5F, 4, 1, 7, 0.0F, false));

     this.hair10 = new ModelRenderer(this);
     this.hair10.setRotationPoint(-3.0F, -27.0F, 4.0F);
     setRotationAngle(this.hair10, 0.0F, 0.0F, 1.5708F);
     this.hair.addChild(this.hair10);
     this.hair10.cubeList.add(new ModelBox(this.hair10, 0, 0, -3.0F, 0.0F, -7.5F, 5, 1, 7, 0.0F, false));

     this.hair11 = new ModelRenderer(this);
     this.hair11.setRotationPoint(5.0F, -28.0F, 4.0F);
     setRotationAngle(this.hair11, 0.0F, 0.0F, -0.7854F);
     this.hair.addChild(this.hair11);
     this.hair11.cubeList.add(new ModelBox(this.hair11, 0, 0, -3.0F, 0.0F, -7.5F, 2, 1, 7, 0.0F, false));

     this.hair12 = new ModelRenderer(this);
     this.hair12.setRotationPoint(3.0F, -25.0F, 4.0F);
     setRotationAngle(this.hair12, 0.0F, 0.0F, -0.7854F);
     this.hair.addChild(this.hair12);
     this.hair12.cubeList.add(new ModelBox(this.hair12, 0, 0, -3.0F, 0.0F, -7.5F, 4, 1, 7, 0.0F, false));

     this.hair13 = new ModelRenderer(this);
     this.hair13.setRotationPoint(4.0F, -26.0F, 4.0F);
     setRotationAngle(this.hair13, 0.0F, 0.0F, 1.5708F);
     this.hair.addChild(this.hair13);
     this.hair13.cubeList.add(new ModelBox(this.hair13, 0, 0, -2.0F, 0.0F, -7.5F, 3, 1, 7, 0.0F, false));

     this.hair14 = new ModelRenderer(this);
     this.hair14.setRotationPoint(0.0F, -25.0F, -2.0F);
     setRotationAngle(this.hair14, 0.7854F, -1.5708F, -2.3562F);
     this.hair.addChild(this.hair14);
     this.hair14.cubeList.add(new ModelBox(this.hair14, 0, 0, -2.8F, -3.0F, -4.5F, 2, 6, 6, 0.0F, false));
     this.hair14.cubeList.add(new ModelBox(this.hair14, 0, 0, -2.8F, -1.0F, -4.5F, 2, 3, 6, 0.0F, false));

     this.hair15 = new ModelRenderer(this);
     this.hair15.setRotationPoint(-2.0F, -23.0F, -2.0F);
     setRotationAngle(this.hair15, 0.7854F, -1.5708F, -2.3562F);
     this.hair.addChild(this.hair15);

     this.hair16 = new ModelRenderer(this);
     this.hair16.setRotationPoint(0.0F, -30.0F, -2.0F);
     this.hair.addChild(this.hair16);
     this.hair16.cubeList.add(new ModelBox(this.hair16, 0, 0, -2.0F, 0.0F, -2.5F, 4, 2, 7, 0.0F, false));

     this.cloth = new ModelRenderer(this);
     this.cloth.setRotationPoint(5.0F, 0.0F, 0.0F);
     this.bone.addChild(this.cloth);
     this.cloth.cubeList.add(new ModelBox(this.cloth, 36, 44, -9.8F, -16.5F, -5.0F, 10, 3, 10, 0.0F, false));

     this.ue_clo = new ModelRenderer(this);
     this.ue_clo.setRotationPoint(-9.0F, -19.0F, -6.0F);
     this.cloth.addChild(this.ue_clo);
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 33, 76, -0.6F, -4.0F, 1.5F, 2, 7, 10, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 50, 106, 0.0F, 0.0F, 7.5F, 5, 3, 4, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 36, 44, -0.2F, 2.0F, 7.5F, 8, 1, 4, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 36, 44, 0.0F, -2.0F, 11.5F, 2, 5, 0, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 68, 68, 7.1F, -4.0F, 1.5F, 2, 7, 10, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 36, 44, 5.1F, -1.0F, 9.5F, 3, 4, 2, 0.0F, false));
     this.ue_clo.cubeList.add(new ModelBox(this.ue_clo, 38, 62, -0.6F, -4.0F, 2.5F, 2, 7, 8, 0.0F, false));

     this.bone7 = new ModelRenderer(this);
     this.bone7.setRotationPoint(-1.9F, -7.1F, 10.5F);
     setRotationAngle(this.bone7, 0.0F, 0.0F, 0.8727F);
     this.ue_clo.addChild(this.bone7);
     this.bone7.cubeList.add(new ModelBox(this.bone7, 60, 43, 3.791F, -0.4946F, -0.7F, 9, 1, 2, 0.0F, false));

     this.bone9 = new ModelRenderer(this);
     this.bone9.setRotationPoint(6.1F, -1.0F, 10.5F);
     setRotationAngle(this.bone9, 0.0F, 0.0F, -0.7854F);
     this.ue_clo.addChild(this.bone9);
     this.bone9.cubeList.add(new ModelBox(this.bone9, 40, 57, -4.5F, -1.0F, -1.03F, 7, 2, 2, 0.0F, false));

     this.bone6 = new ModelRenderer(this);
     this.bone6.setRotationPoint(2.1F, -1.0F, 10.5F);
     setRotationAngle(this.bone6, 0.0F, 0.0F, 0.8727F);
     this.ue_clo.addChild(this.bone6);
     this.bone6.cubeList.add(new ModelBox(this.bone6, 45, 33, -2.5F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

     this.bone8 = new ModelRenderer(this);
     this.bone8.setRotationPoint(4.0F, 0.0F, 0.0F);
     setRotationAngle(this.bone8, 0.0F, 0.0F, -0.7854F);
     this.ue_clo.addChild(this.bone8);
     this.bone8.cubeList.add(new ModelBox(this.bone8, 36, 44, -3.5F, -1.0589F, 9.5F, 9, 1, 2, 0.0F, false));

     this.bone10 = new ModelRenderer(this);
     this.bone10.setRotationPoint(4.1F, -0.5F, 2.5F);
     setRotationAngle(this.bone10, 0.0F, -1.5708F, 0.0F);
     this.ue_clo.addChild(this.bone10);
     this.bone10.cubeList.add(new ModelBox(this.bone10, 38, 28, -1.0F, -3.5F, -5.0F, 2, 7, 9, 0.0F, false));

     this.bone11 = new ModelRenderer(this);
     this.bone11.setRotationPoint(0.0F, 0.0F, 2.0F);
     this.ue_clo.addChild(this.bone11);
     this.bone11.cubeList.add(new ModelBox(this.bone11, 24, 45, -0.6F, -4.0F, 0.5F, 2, 7, 6, 0.0F, false));

     this.sita_clo = new ModelRenderer(this);
     this.sita_clo.setRotationPoint(-6.33F, -10.3888F, 0.0F);
     this.cloth.addChild(this.sita_clo);
     this.sita_clo.cubeList.add(new ModelBox(this.sita_clo, 37, 64, -3.67F, 3.2588F, -4.5F, 11, 3, 9, 0.0F, false));

     this.bone2 = new ModelRenderer(this);
     this.bone2.setRotationPoint(-2.27F, -9.1112F, 0.5F);
     setRotationAngle(this.bone2, 0.0873F, 0.0F, 0.0F);
     this.sita_clo.addChild(this.bone2);
     this.bone2.cubeList.add(new ModelBox(this.bone2, 34, 58, -0.8166F, 4.4F, -4.0985F, 9, 8, 7, 0.0F, false));

     this.bone3 = new ModelRenderer(this);
     this.bone3.setRotationPoint(1.421F, 0.6893F, -1.6F);
     setRotationAngle(this.bone3, -1.7453F, 0.0F, 0.0F);
     this.sita_clo.addChild(this.bone3);
     this.bone3.cubeList.add(new ModelBox(this.bone3, 36, 62, -4.5F, -4.9621F, -5.2872F, 9, 7, 9, 0.0F, false));

     this.bone4 = new ModelRenderer(this);
     this.bone4.setRotationPoint(6.33F, 9.3888F, 0.0F);
     setRotationAngle(this.bone4, 0.0F, 0.0F, -0.1745F);
     this.sita_clo.addChild(this.bone4);
     this.bone4.cubeList.add(new ModelBox(this.bone4, 37, 64, -7.0F, -12.7347F, -4.5F, 9, 7, 9, 0.0F, false));

     this.bone5 = new ModelRenderer(this);
     this.bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
     setRotationAngle(this.bone5, 0.0F, 0.0F, 1.6581F);
     this.sita_clo.addChild(this.bone5);
     this.bone5.cubeList.add(new ModelBox(this.bone5, 34, 58, -4.67F, -4.7112F, -4.5F, 9, 8, 9, 0.0F, false));
   }


   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
     this.bone.render(f5);
   }
   public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
	     modelRenderer.rotateAngleX = x;
	     modelRenderer.rotateAngleY = y;
	     modelRenderer.rotateAngleZ = z;
   }

   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
     super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     this.right.rotateAngleX = MathHelper.cos(f * 0.66666F) * 0.6F * f1;
     this.left.rotateAngleX = MathHelper.cos(f * 0.66666F) * 0.6F * -1.0F * f1;
   }
 }

