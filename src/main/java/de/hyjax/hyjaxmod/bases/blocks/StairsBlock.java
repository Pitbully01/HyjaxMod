package de.hyjax.hyjaxmod.bases.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StairsBlock extends Block {

	public StairsBlock(Block block) {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f, 6.0f)
				.sound(SoundType.METAL)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
);
		
	}


}
