package de.hyjax.hyjaxmod.bases.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StairsBlock extends net.minecraft.block.StairsBlock{

	@SuppressWarnings("deprecation")
	public StairsBlock(BlockState state, Properties properties) {
		super(state, Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f,6.0f)
				.sound(SoundType.METAL)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)		
				.setRequiresTool()
				.harvestLevel(2));
	}

}
