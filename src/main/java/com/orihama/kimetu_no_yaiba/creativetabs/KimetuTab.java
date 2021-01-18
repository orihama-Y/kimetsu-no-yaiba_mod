package com.orihama.kimetu_no_yaiba.creativetabs;

import com.orihama.kimetu_no_yaiba.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class KimetuTab extends CreativeTabs{

	public KimetuTab(String Label)
	{
		super("Kimetu");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.NITIRINTOU_MIZU);
	}
}
