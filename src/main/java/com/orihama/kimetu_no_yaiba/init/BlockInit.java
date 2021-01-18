package com.orihama.kimetu_no_yaiba.init;

import java.util.ArrayList;
import java.util.List;

import com.orihama.kimetu_no_yaiba.objects.blocks.hikouseki_block;
import com.orihama.kimetu_no_yaiba.objects.blocks.hisatetu_block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//Items
	public static final Block HISATETU_BLOCK = new hisatetu_block("hisatetu_block",Material.IRON);
	public static final Block HIKOUSEKI_BLOCK = new hikouseki_block("hikouseki_block",Material.IRON);

}
