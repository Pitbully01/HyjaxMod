package de.hyjax.hyjaxmod.bases.tools.tier;

import java.util.function.Supplier;

import de.hyjax.hyjaxmod.util.RegistryHandlerItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum GemsTiers implements IItemTier{
	

	TOPAZ(4, 1420 ,14.0F, 4.0F, 16, () ->  {
		return Ingredient.fromItems((RegistryHandlerItems.TOPAZ.get()));
    }),
	RUBY(4, 1420 ,14.0F, 4.0F, 16, () ->  {
		return Ingredient.fromItems((RegistryHandlerItems.RUBY.get()));
    }),
	BLOODDIAMOND(5, 1420 ,14.0F, 4.0F, 20, () -> {
		return Ingredient.fromItems(RegistryHandlerItems.BLOODDIAMOND.get());
	}),
	SAPHIRE(5, 1420 ,14.0F, 4.0F, 20, () -> {
		return Ingredient.fromItems(RegistryHandlerItems.SAPHIRE.get());
	});
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    
    GemsTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
    	this.harvestLevel = harvestLevel;
    	this.maxUses = maxUses;
    	this.efficiency = efficiency;
    	this.attackDamage = attackDamage;
    	this.enchantability = enchantability;
    	this.repairMaterial = repairMaterial;
    }
    
	@Override
	public float getAttackDamage() {
		
		return attackDamage;
	}

	@Override
	public float getEfficiency() {
		
		return efficiency;
	}

	@Override
	public int getEnchantability() {
		
		return enchantability;
	}

	@Override
	public int getHarvestLevel() {
		
		return harvestLevel;
	}

	@Override
	public int getMaxUses() {
		
		return maxUses;
	}

	@Override
	public Ingredient getRepairMaterial() {
		
		return repairMaterial.get();
	}

}
