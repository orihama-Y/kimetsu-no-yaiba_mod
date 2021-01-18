package com.orihama.kimetu_no_yaiba.init.recipes;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class Recipe_icon extends ShapedRecipes {

	public Recipe_icon(String group, int width, int height, NonNullList<Ingredient> ingredients, ItemStack result) {
		super(group, width, height, ingredients, result);
	}

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn){
		for (int i = 0; i <= inv.getWidth() - this.recipeWidth; ++i){
			for (int j = 0; j <= inv.getHeight() - this.recipeHeight; ++j){
				if (this.checkMatch(inv, i, j, false)){return true;}
			}
		}
		return false;
	}

	private boolean checkMatch(InventoryCrafting par1, int par2, int par3, boolean par4){
		for (int i = 0; i < par1.getWidth(); ++i){
			for (int j = 0; j < par1.getHeight(); ++j){
				int k = i - par3;
				int l = j - par3;
				Ingredient ingredient = Ingredient.EMPTY;

				if (k >= 0 && l >= 0 && k < this.recipeWidth && l < this.recipeHeight){
					if (par4){ingredient = this.recipeItems.get(this.recipeWidth - k - 1 + l * this.recipeWidth);}
					else{ingredient = this.recipeItems.get(k + l * this.recipeWidth);}
				}
				if (!ingredient.apply(par1.getStackInRowAndColumn(i, j))){return false;}
			}
		}
		return true;
	}


}
