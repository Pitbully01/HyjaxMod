package de.hyjax.hyjaxmod.bases.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TopazBlock extends Block {
	
	public TopazBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f, 6.0f)
				.sound(SoundType.METAL)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
		);
	}

}
