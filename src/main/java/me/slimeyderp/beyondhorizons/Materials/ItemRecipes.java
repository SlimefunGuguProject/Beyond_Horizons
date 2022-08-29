package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class ItemRecipes {

    public static final ItemStack[] ETHERIUM_RECIPE = {
        SlimefunItems.MAGIC_LUMP_3, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_ALLOY_INGOT,
        SlimefunItems.BLISTERING_INGOT_3, null, null,
        null, null, null
    };
    public static final ItemStack[] EMPTY_RECIPE = {null, null, null, null, null, null, null, null, null};
    public static final ItemStack[] DIMENSIONAL_TRANSMUTATOR_RECIPE = {
        CustomItemStack.ETHERIUM_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.ETHERIUM_STACK,
        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COOLING_UNIT, SlimefunItems.ELECTRIC_MOTOR,
        CustomItemStack.ETHERIUM_STACK, SlimefunItems.CARBONADO_EDGED_CAPACITOR, CustomItemStack.ETHERIUM_STACK
    };
    public static final ItemStack[] ETHERIAL_BALANCE_ROD_RECIPE = {
        null, CustomItemStack.ETHERIUM_STACK, null,
        null, new ItemStack(Material.STICK), null,
        null, CustomItemStack.UNSTABLE_ETHERIUM_STACK, null
    };
    public static final ItemStack[] DIMENSIONAL_REACTOR_RECIPE = {
        CustomItemStack.ETHERIUM_STACK, SlimefunItems.CARBONADO_EDGED_CAPACITOR, CustomItemStack.ETHERIUM_STACK,
        SlimefunItems.LEAD_INGOT, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.LEAD_INGOT,
        CustomItemStack.RAW_AETHER_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.RAW_AETHER_STACK
    };
    public static final ItemStack[] COAL_RECIPE = {
        CustomItemStack.COAL_DUST_STACK, CustomItemStack.COAL_DUST_STACK, CustomItemStack.COAL_DUST_STACK,
        CustomItemStack.COAL_DUST_STACK, null, null,
        null, null, null
    };
    public static final ItemStack[] COAL_DRILL_RECIPE = {
        null, SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT,
        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.LEAD_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
        SlimefunItems.BIG_CAPACITOR, SlimefunItems.REINFORCED_ALLOY_INGOT
    };
    public static final ItemStack[] ETHERIAL_PHANTOM_SWORD_RECIPE = {
        null, CustomItemStack.ETHERIUM_STACK, null,
        null, CustomItemStack.UNSTABLE_ETHERIUM_STACK, null,
        null, new ItemStack(Material.STICK), null
    };
    public static final ItemStack[] PORTABLE_DIMENSION_SHIFTER_RECIPE = {
        SlimefunItems.GOLD_24K_BLOCK, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.GOLD_24K_BLOCK,
        SlimefunItems.CARBONADO, CustomItemStack.RAW_AETHER_STACK, SlimefunItems.CARBONADO,
        SlimefunItems.GOLD_24K_BLOCK, CustomItemStack.UNSTABLE_ETHERIUM_STACK, SlimefunItems.GOLD_24K_BLOCK};
    public static final ItemStack[] AETHERIAL_WIND_STAFF_RECIPE = {
        null, SlimefunItems.NECROTIC_SKULL, null,
        SlimefunItems.ENDER_LUMP_3, CustomItemStack.RAW_AETHER_STACK, SlimefunItems.ENDER_LUMP_3,
        null, SlimefunItems.NECROTIC_SKULL, null
    };

    private ItemRecipes() {}
}
