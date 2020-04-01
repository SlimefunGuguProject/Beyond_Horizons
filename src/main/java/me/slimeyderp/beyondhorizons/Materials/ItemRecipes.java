package me.slimeyderp.beyondhorizons.Materials;

import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemRecipes {
    public static final ItemStack[] EtheriumRecipe = {SlimefunItems.MAGIC_LUMP_3, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.BLISTERING_INGOT_3, null, null, null, null, null};
    public static final ItemStack[] EmptyRecipe = {null, null, null, null, null, null, null, null, null};
    public static final ItemStack[] DimensionalTransmutatorRecipe = {CustomItemStack.ETHERIUM_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.ETHERIUM_STACK, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COOLING_UNIT, SlimefunItems.ELECTRIC_MOTOR, CustomItemStack.ETHERIUM_STACK, SlimefunItems.CARBONADO_EDGED_CAPACITOR, CustomItemStack.ETHERIUM_STACK};
    public static final ItemStack[] EtherialBalanceRodRecipe = {null, CustomItemStack.ETHERIUM_STACK, null, null, new ItemStack(Material.STICK), null, null, CustomItemStack.UNSTABLE_ETHERIUM_STACK, null};
    public static final ItemStack[] DimensionalReactorRecipe = {CustomItemStack.ETHERIUM_STACK, SlimefunItems.CARBONADO_EDGED_CAPACITOR, CustomItemStack.ETHERIUM_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.RAW_AETHER_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.RAW_AETHER_STACK};
    public static final ItemStack[] CoalRecipe = {CustomItemStack.COAL_DUST_STACK, CustomItemStack.COAL_DUST_STACK, CustomItemStack.COAL_DUST_STACK, CustomItemStack.COAL_DUST_STACK, null, null, null, null, null};
    public static final ItemStack[] CoalDrillRecipe = {null, SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.LEAD_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.BIG_CAPACITOR, SlimefunItems.REINFORCED_ALLOY_INGOT};
    public static final ItemStack[] EtherialPhantomSwordRecipe = {null, CustomItemStack.ETHERIUM_STACK, null, null, CustomItemStack.UNSTABLE_ETHERIUM_STACK, null, null, new ItemStack(Material.STICK), null};
    public static final ItemStack[] PortableDimensionShifterRecipe = {SlimefunItems.GOLD_24K_BLOCK, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.CARBONADO, CustomItemStack.RAW_AETHER_STACK, SlimefunItems.CARBONADO, SlimefunItems.GOLD_24K_BLOCK, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.GOLD_24K_BLOCK};
    public static final ItemStack[] AetherialWindStaffRecipe = {null, SlimefunItems.NECROTIC_SKULL, null, SlimefunItems.ENDER_LUMP_3, CustomItemStack.RAW_AETHER_STACK, SlimefunItems.ENDER_LUMP_3, null, SlimefunItems.NECROTIC_SKULL, null};
}
