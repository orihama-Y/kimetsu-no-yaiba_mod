package com.orihama.kimetu_no_yaiba.objects.blocks;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.init.BlockInit;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name,Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
	}


}