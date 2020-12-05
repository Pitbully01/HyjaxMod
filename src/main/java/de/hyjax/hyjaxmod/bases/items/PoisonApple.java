package de.hyjax.hyjaxmod.bases.items;

import java.util.List;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

@SuppressWarnings("unused")
public class PoisonApple extends Item{

	@SuppressWarnings("deprecation")
	public PoisonApple() {
		super(new Item.Properties()
				.group(HyjaxMod.TAB)
				.food(new Food.Builder()
						.hunger(3)
						.saturation(2)
							.effect(new EffectInstance(Effects.NAUSEA,300,1),1)
							.effect(new EffectInstance(Effects.POISON,300,2),1)
							.effect(new EffectInstance(Effects.HUNGER,300,1),0.2f)
								.build()));
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\u00A72" + "This is a Posion Apple it will posion you and other entitys!"));
			tooltip.add(new StringTextComponent("\u00A7d \u00A7l" + "It was included threw the HyjaxMod!"));
		}else {
			tooltip.add(new StringTextComponent("\u00A78" + "Hold " + "\u00A75 \u00A7l" + "SHIFT" + "\u00A78" + " for more Informations"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
