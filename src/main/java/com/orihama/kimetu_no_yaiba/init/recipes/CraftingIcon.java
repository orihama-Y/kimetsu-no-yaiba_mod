package com.orihama.kimetu_no_yaiba.init.recipes;

import javax.annotation.Nonnull;

import com.orihama.kimetu_no_yaiba.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.CraftingHelper.ShapedPrimer;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class CraftingIcon {

	public CraftingIcon() {
        register_icon();
    }

	public static void addShapedRecipe(ResourceLocation name, ResourceLocation group, @Nonnull ItemStack output, Object... params)
    {
        ShapedPrimer primer = CraftingHelper.parseShaped(params);
        register(new Recipe_icon(group == null ? "" : group.toString(), primer.width, primer.height, primer.input, output).setRegistryName(name));
    }

	private static <K extends IForgeRegistryEntry<K>> K register(K object)
    {
        return (K)GameData.register_impl(object);
    }

    public static void register_icon() {

    	//黄色
    	addShapedRecipe(
    			new ResourceLocation("icon_thunder1_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.HEKIREKI_ICON, 1), new Object[]{
                        "X  ","   ","   ", 'X', new ItemStack(Blocks.WOOL,1,4)
        });


    	//黄緑
    	addShapedRecipe(
    			new ResourceLocation("icon_wind1_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.SOGI_ICON, 1), new Object[]{
                        "X  ","   ","   ", 'X', new ItemStack(Blocks.WOOL,1,5)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_wind2_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.SINATO_ICON, 1), new Object[]{
                        " X ","   ","   ", 'X', new ItemStack(Blocks.WOOL,1,5)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_wind6_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.KOKUHUU_ICON, 1), new Object[]{
                        "   ","  X","   ", 'X', new ItemStack(Blocks.WOOL,1,5)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_wind9_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.IDATEN_ICON, 1), new Object[]{
                        "   ","   ","  X", 'X', new ItemStack(Blocks.WOOL,1,5)
        });

    	//グレー
    	addShapedRecipe(
    			new ResourceLocation("icon_mist4_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.IRYUU_ICON, 1), new Object[]{
                        "   ","X  ","   ", 'X', new ItemStack(Blocks.WOOL,1,8)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_mist7_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.OBORO_ICON, 1), new Object[]{
                        "   ","   ","X  ", 'X', new ItemStack(Blocks.WOOL,1,8)
        });

    	//水色
    	addShapedRecipe(
    			new ResourceLocation("icon_water1_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.MINAMO_ICON, 1), new Object[]{
                        "X  ","   ","   ", 'X', new ItemStack(Blocks.WOOL,1,11)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_water5_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.KANTEN_ICON, 1), new Object[]{
                        "   "," X ","   ", 'X', new ItemStack(Blocks.WOOL,1,11)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_water6_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.NEJIREUZU_ICON, 1), new Object[]{
                        "   ","  X","   ", 'X', new ItemStack(Blocks.WOOL,1,11)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_water8_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.TAKITUBO_ICON, 1), new Object[]{
                        "   ","   "," X ", 'X', new ItemStack(Blocks.WOOL,1,11)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_water10_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.SEISEI_ICON, 1), new Object[]{
                        "X  ","   ","  X", 'X', new ItemStack(Blocks.WOOL,1,11)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_water11_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.MINAMO_ICON, 1), new Object[]{
                        " X ","   ","  X", 'X', new ItemStack(Blocks.WOOL,1,11)
        });


    	//赤
    	addShapedRecipe(
    			new ResourceLocation("icon_flame1_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.SIRANUI_ICON, 1), new Object[]{
                        "X  ","   ","   ",'X', new ItemStack(Blocks.WOOL,1,14)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_flame2_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.NOBORI_ICON, 1), new Object[]{
                        " X ","   ","   ",'X', new ItemStack(Blocks.WOOL,1,14)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_flame5_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.ENKO_ICON, 1), new Object[]{
                        "   "," X ","   ",'X', new ItemStack(Blocks.WOOL,1,14)
        });
    	addShapedRecipe(
    			new ResourceLocation("icon_flame9_Recipe"),new ResourceLocation("kimetu_no_yaiba"),
                new ItemStack(ItemInit.RENGOKU_ICON, 1), new Object[]{
                        "   "," X ","   ",'X', new ItemStack(Blocks.WOOL,1,14)
        });


    }
}
