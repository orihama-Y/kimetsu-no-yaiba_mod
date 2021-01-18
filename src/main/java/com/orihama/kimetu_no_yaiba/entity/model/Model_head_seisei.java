package com.orihama.kimetu_no_yaiba.entity.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_head_seisei extends ModelBase {
	private final ModelRenderer bone85;
	private final ModelRenderer bone83;
	private final ModelRenderer bone84;
	private final ModelRenderer bone82;
	private final ModelRenderer bone81;
	private final ModelRenderer bone80;
	private final ModelRenderer bone79;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone78;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone11;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer bone10;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone12;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone16;
	private final ModelRenderer bone15;
	private final ModelRenderer bone14;
	private final ModelRenderer bone13;
	private final ModelRenderer bone20;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;

	public Model_head_seisei() {
		textureWidth = 256;
		textureHeight = 256;

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone85, 0.0F, 3.1416F, 0.0F);

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone83, 0.7854F, 0.0F, 0.0F);
		bone85.addChild(bone83);
		bone83.cubeList.add(new ModelBox(bone83, 116, 167, -12.0F, 40.2929F, 77.7071F, 32, 12, 6, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone84, 0.7854F, 0.0F, 0.0F);
		bone83.addChild(bone84);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone82, 0.7854F, 0.0F, 0.0F);
		bone85.addChild(bone82);
		bone82.cubeList.add(new ModelBox(bone82, 92, 160, -10.0F, 41.0F, 66.0F, 27, 9, 17, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone81, 0.4363F, 0.0F, 0.0F);
		bone85.addChild(bone81);
		bone81.cubeList.add(new ModelBox(bone81, 76, 192, -14.0F, 11.0F, 92.0F, 35, 12, 24, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone80, 1.0472F, 0.0873F, -0.0873F);
		bone85.addChild(bone80);
		bone80.cubeList.add(new ModelBox(bone80, 213, 27, -18.0F, -57.0F, 24.0F, 10, 89, 6, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone79, 1.0472F, 0.0F, 0.0873F);
		bone85.addChild(bone79);
		bone79.cubeList.add(new ModelBox(bone79, 194, 16, 5.0F, -57.0F, 25.0F, 10, 89, 7, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-2.0F, 63.0F, 161.0F);
		setRotationAngle(bone45, 2.4435F, 0.0F, 0.0F);
		bone85.addChild(bone45);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(30.0F, 1.0F, 0.0F);
		bone45.addChild(bone46);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone47, 0.6981F, 0.0F, 0.0F);
		bone46.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone48, -0.3491F, 0.0F, 0.0F);
		bone46.addChild(bone48);
		bone48.cubeList.add(new ModelBox(bone48, 119, 186, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, -4.0F, 10.0F);
		bone46.addChild(bone49);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone50, 0.6981F, 0.0F, 0.0F);
		bone49.addChild(bone50);
		bone50.cubeList.add(new ModelBox(bone50, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone51, -0.3491F, 0.0F, 0.0F);
		bone49.addChild(bone51);
		bone51.cubeList.add(new ModelBox(bone51, 119, 186, -12.0F, -41.0F, 67.0F, 1, 7, 7, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone52, 1.1345F, 0.0F, 0.0F);
		bone49.addChild(bone52);
		bone52.cubeList.add(new ModelBox(bone52, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone53, 1.1345F, 0.0F, 0.0F);
		bone46.addChild(bone53);
		bone53.cubeList.add(new ModelBox(bone53, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 7, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, -12.0F, 32.0F);
		bone46.addChild(bone54);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone55, 0.6981F, 0.0F, 0.0F);
		bone54.addChild(bone55);
		bone55.cubeList.add(new ModelBox(bone55, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone56, -0.3491F, 0.0F, 0.0F);
		bone54.addChild(bone56);
		bone56.cubeList.add(new ModelBox(bone56, 119, 186, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone57, 1.1345F, 0.0F, 0.0F);
		bone54.addChild(bone57);
		bone57.cubeList.add(new ModelBox(bone57, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 5, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(5.0F, -12.0F, 31.0F);
		bone46.addChild(bone74);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone75, 0.6981F, 0.0F, 0.0F);
		bone74.addChild(bone75);
		bone75.cubeList.add(new ModelBox(bone75, 119, 186, -17.0F, 33.0F, 56.0F, 1, 7, 3, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone76, -0.3491F, 0.0F, 0.0F);
		bone74.addChild(bone76);
		bone76.cubeList.add(new ModelBox(bone76, 119, 186, -17.0F, -34.8397F, 62.6699F, 1, 7, 2, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone77, 1.1345F, 0.0F, 0.0F);
		bone74.addChild(bone77);
		bone77.cubeList.add(new ModelBox(bone77, 119, 186, -17.0F, 53.2423F, 33.05F, 1, 7, 5, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.0F, -8.0F, 13.0F);
		bone45.addChild(bone58);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone59, 0.6981F, 0.0F, 0.0F);
		bone58.addChild(bone59);
		bone59.cubeList.add(new ModelBox(bone59, 119, 186, -12.0F, 43.7851F, 71.8944F, 1, 7, 4, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone60, -0.3491F, 0.0F, 0.0F);
		bone58.addChild(bone60);
		bone60.cubeList.add(new ModelBox(bone60, 119, 186, -12.0F, -47.0782F, 77.4572F, 1, 10, 5, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone61, 1.1345F, 0.0F, 0.0F);
		bone58.addChild(bone61);
		bone61.cubeList.add(new ModelBox(bone61, 119, 186, -12.0F, 70.1568F, 43.8036F, 1, 7, 2, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone45.addChild(bone62);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone63, 0.6981F, 0.0F, 0.0F);
		bone62.addChild(bone63);
		bone63.cubeList.add(new ModelBox(bone63, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone64, -0.3491F, 0.0F, 0.0F);
		bone62.addChild(bone64);
		bone64.cubeList.add(new ModelBox(bone64, 119, 186, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, -4.0F, 10.0F);
		bone62.addChild(bone65);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone66, 0.6981F, 0.0F, 0.0F);
		bone65.addChild(bone66);
		bone66.cubeList.add(new ModelBox(bone66, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone67, -0.3491F, 0.0F, 0.0F);
		bone65.addChild(bone67);
		bone67.cubeList.add(new ModelBox(bone67, 119, 186, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone68, 1.1345F, 0.0F, 0.0F);
		bone65.addChild(bone68);
		bone68.cubeList.add(new ModelBox(bone68, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone69, 1.1345F, 0.0F, 0.0F);
		bone62.addChild(bone69);
		bone69.cubeList.add(new ModelBox(bone69, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, -12.0F, 32.0F);
		bone62.addChild(bone70);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone71, 0.6981F, 0.0F, 0.0F);
		bone70.addChild(bone71);
		bone71.cubeList.add(new ModelBox(bone71, 119, 186, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone72, -0.3491F, 0.0F, 0.0F);
		bone70.addChild(bone72);
		bone72.cubeList.add(new ModelBox(bone72, 119, 186, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone73, 1.1345F, 0.0F, 0.0F);
		bone70.addChild(bone73);
		bone73.cubeList.add(new ModelBox(bone73, 119, 186, -12.0F, 62.0F, 40.0F, 1, 7, 4, 0.0F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(-61.0F, 28.0F, 127.0F);
		setRotationAngle(bone78, -2.1817F, -0.3491F, -1.3963F);
		bone62.addChild(bone78);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, -8.0F, 13.0F);
		bone85.addChild(bone41);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone42, 0.6981F, 0.0F, 0.0F);
		bone41.addChild(bone42);
		bone42.cubeList.add(new ModelBox(bone42, 248, 8, 19.0F, 43.7851F, 72.8944F, 1, 7, 3, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone43, -0.3491F, 0.0F, 0.0F);
		bone41.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 248, 8, 19.0F, -44.0782F, 80.4572F, 1, 7, 2, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone44, 1.1345F, 0.0F, 0.0F);
		bone41.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 248, 8, 19.0F, 70.1568F, 43.8036F, 1, 7, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone11, -0.2618F, 0.0F, 0.0F);
		bone85.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, -15.0F, -5.0F, 37.0F, 34, 7, 71, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone9, 0.7854F, 0.0F, 0.0873F);
		bone85.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 177, 4.0F, -76.0F, -3.0F, 8, 62, 7, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone8, 1.5708F, 0.0F, 0.0F);
		bone85.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 182, -32.0F, -33.0F, -17.0F, 62, 50, 24, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone10, 0.3491F, 0.0F, 0.0F);
		bone85.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -14.0F, 12.0F, 38.0F, 35, 5, 80, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 1.1345F, 0.7854F, -0.0873F);
		bone85.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 8, 180, -26.0F, -65.0F, -17.0F, 10, 57, 6, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 1.1345F, 0.0F, 0.0F);
		bone85.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 11, 170, -32.0F, -33.0F, -8.0F, 62, 50, 31, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 1.1345F, 0.5236F, 0.0F);
		bone85.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 8, 181, -26.0F, -63.4226F, 3.9063F, 5, 54, 9, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, 1.1345F, -0.2618F, 0.0F);
		bone85.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 8, 166, 14.0F, -76.0F, 8.0F, 9, 71, 11, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone85.addChild(bone12);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(30.0F, 1.0F, 0.0F);
		bone12.addChild(bone29);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone30, 0.6981F, 0.0F, 0.0F);
		bone29.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 244, 0, -12.0F, 38.0F, 65.0F, 1, 7, 5, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone31, -0.3491F, 0.0F, 0.0F);
		bone29.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 244, 0, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, -4.0F, 10.0F);
		bone29.addChild(bone32);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone33, 0.6981F, 0.0F, 0.0F);
		bone32.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 244, 0, -12.0F, 38.0F, 65.0F, 1, 7, 5, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone34, -0.3491F, 0.0F, 0.0F);
		bone32.addChild(bone34);
		bone34.cubeList.add(new ModelBox(bone34, 244, 0, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone35, 1.1345F, 0.0F, 0.0F);
		bone32.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 244, 0, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone36, 1.1345F, 0.0F, 0.0F);
		bone29.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 244, 0, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -12.0F, 32.0F);
		bone29.addChild(bone37);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone38, 0.6981F, 0.0F, 0.0F);
		bone37.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 244, 0, -12.0F, 38.0F, 65.0F, 1, 7, 5, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone39, -0.3491F, 0.0F, 0.0F);
		bone37.addChild(bone39);
		bone39.cubeList.add(new ModelBox(bone39, 244, 0, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone40, 1.1345F, 0.0F, 0.0F);
		bone37.addChild(bone40);
		bone40.cubeList.add(new ModelBox(bone40, 244, 0, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -8.0F, 13.0F);
		bone12.addChild(bone21);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone22, 0.6981F, 0.0F, 0.0F);
		bone21.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 248, 0, -12.0F, 43.7851F, 72.8944F, 1, 7, 3, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone23, -0.3491F, 0.0F, 0.0F);
		bone21.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 248, 0, -12.0F, -44.0782F, 80.4572F, 1, 7, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone24, 1.1345F, 0.0F, 0.0F);
		bone21.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 248, 0, -12.0F, 70.1568F, 43.8036F, 1, 7, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(bone17);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone18, 0.6981F, 0.0F, 0.0F);
		bone17.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 237, 8, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone19, -0.3491F, 0.0F, 0.0F);
		bone17.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 237, 8, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -4.0F, 10.0F);
		bone17.addChild(bone16);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone15, 0.6981F, 0.0F, 0.0F);
		bone16.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 237, 8, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone14, -0.3491F, 0.0F, 0.0F);
		bone16.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 237, 8, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone13, 1.1345F, 0.0F, 0.0F);
		bone16.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 237, 8, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone20, 1.1345F, 0.0F, 0.0F);
		bone17.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 237, 8, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -12.0F, 32.0F);
		bone17.addChild(bone25);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone26, 0.6981F, 0.0F, 0.0F);
		bone25.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 237, 8, -12.0F, 38.0F, 66.0F, 1, 7, 3, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone27, -0.3491F, 0.0F, 0.0F);
		bone25.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 237, 8, -12.0F, -41.0F, 72.0F, 1, 7, 2, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone28, 1.1345F, 0.0F, 0.0F);
		bone25.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 237, 8, -12.0F, 62.0F, 40.0F, 1, 7, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone85.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 8, 68, -33.0F, -17.0F, -7.0F, 65, 34, 41, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 80, -22.0F, -17.0F, 22.0F, 43, 34, 41, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 80, -25.0F, -17.0F, 9.0F, 52, 34, 41, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 2.0944F, 0.8727F, 0.0F);
		bone85.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 5, 223, -32.0F, 3.0F, -4.0F, 102, 6, 6, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.6109F, 0.3491F, -0.0873F);
		bone85.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 3, 183, -13.0F, -74.0F, -11.0F, 9, 60, 4, 0.0F, false));
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