package de.hyjax.hyjaxmod.bases.items;

import de.hyjax.hyjaxmod.HyjaxMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MultiBlockItem extends BlockItem{

	public MultiBlockItem(Block block) {
		super(block, new Item.Properties().group(HyjaxMod.TAB));
	}

}
