package de.hyjax.hyjaxmod.bases.armor;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import de.hyjax.hyjaxmod.*;
import de.hyjax.hyjaxmod.util.RegistryHandlerItems;

public enum ArmorTiers implements IArmorMaterial{
	RUBY(HyjaxMod.MOD_ID + ":ruby", 25, new int[] {3, 6, 6, 3 }, 20 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.fromItems(RegistryHandlerItems.RUBY.get())),
	SAPHIRE(HyjaxMod.MOD_ID + ":saphire", 25, new int[] {3, 6, 6, 3 }, 20 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.fromItems(RegistryHandlerItems.SAPHIRE.get())),
	BLOODDIAMOND(HyjaxMod.MOD_ID + ":blooddiamond", 25, new int[] {3, 6, 6, 3 }, 20 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.fromItems(RegistryHandlerItems.SAPHIRE.get())),
	TOPAZ(HyjaxMod.MOD_ID + ":topaz", 25, new int[] {3, 6, 6, 3 }, 20 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.fromItems(RegistryHandlerItems.TOPAZ.get())), ;
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float KnockbackResistance;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	
	ArmorTiers(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float KnockbackResistance , Supplier<Ingredient> repairMaterial){
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.KnockbackResistance = KnockbackResistance;
		this.repairMaterial = repairMaterial;
	}	

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIN) {
		return this.damageReductionAmountArray[slotIN.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slotIN) {
		return MAX_DAMAGE_ARRAY[slotIN.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public float getKnockbackResistance() {
		return KnockbackResistance;
	}
    @OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.get();
	}

	@Override
	public SoundEvent getSoundEvent() {
		return soundEvent;
	}

	@Override
	public float getToughness() {
		return toughness;
	}

}
