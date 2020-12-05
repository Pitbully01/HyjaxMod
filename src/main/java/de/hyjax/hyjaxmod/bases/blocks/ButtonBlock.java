package de.hyjax.hyjaxmod.bases.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ButtonBlock extends WoodButtonBlock{

	public ButtonBlock(Block block) {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f,6.0f)
				.sound(SoundType.METAL)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
			);
	}

}
