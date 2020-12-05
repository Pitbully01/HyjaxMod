package de.hyjax.hyjaxmod.util.helpers;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardHelper {
	public static final long Inventory = Minecraft.getInstance().getMainWindow().getHandle();
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingShift() {
		return InputMappings.isKeyDown(Inventory,GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(Inventory,GLFW.GLFW_KEY_RIGHT_SHIFT);
		
	}
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingCTRL(){
		return InputMappings.isKeyDown(Inventory,GLFW.GLFW_KEY_LEFT_CONTROL) || InputMappings.isKeyDown(Inventory, GLFW.GLFW_KEY_RIGHT_CONTROL);
	}

}
