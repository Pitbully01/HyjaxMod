package de.hyjax.hyjaxmod.container;

import de.hyjax.hyjaxmod.init.ModContainerTypes;
import de.hyjax.hyjaxmod.tileentity.DirtChestTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.util.IWorldPosCallable;

public class DirtChestContainer extends Container {
	public final DirtChestTileEntity tileEntity;
	private final IWorldPosCallable canInteractWithCallable;

	public DirtChestContainer(final int windowId, final PlayerInventory playerInventory,
			final DirtChestTileEntity tileEntity) {
		super(ModContainerTypes.DIRT_CHEST.get(), windowId);
		this.tileEntity = tileEntity;
		this.canInteractWithCallable = IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos());

		// Main Inventory
		// 81//37
		int startX = 81;
		int startY = 37;
		int slotSizePlus2 = 18;
		for (int row = 0; row < 1; ++row) {
			for (int column = 0; column < 1; ++column) {
				this.addSlot(new Slot(tileEntity, (row * 1) + column, startX, (column * slotSizePlus2)));
			}
		}
	}
}
