package com.orihama.kimetu_no_yaiba.objects.blocks;

import java.util.Random;

import com.orihama.kimetu_no_yaiba.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class hisatetu_block  extends BlockBase
{


	public hisatetu_block(String name,Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.5f);
		setResistance(15);
		setHarvestLevel("pickaxe",3);
		setLightLevel(1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ItemInit.HISATETU_ITEM;
	}

	public int quantityDropped(Random random)
	{
		return 1;
	}
}