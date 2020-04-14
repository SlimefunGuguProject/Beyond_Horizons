package me.slimeyderp.beyondhorizons.materials;

import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class ItemRecipes {

    public static final ItemStack[] ETHERIUM_RECIPE = {
        new ItemStack(Material.WHITE_CONCRETE_POWDER), SlimefunItems.CARBONADO, SlimefunItems.BLISTERING_INGOT_3,
        SlimefunItems.SYNTHETIC_DIAMOND, null, null,
        null, null, null
    };
    public static final ItemStack[] EMPTY_RECIPE = {
        null, null, null,
        null, null, null,
        null, null, null
    };
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
        CustomItemStack.REFINED_AETHER_STACK, SlimefunItems.LEAD_INGOT, CustomItemStack.REFINED_AETHER_STACK
    };
    public static final ItemStack[] COAL_RECIPE = {
        new CustomItem(CustomItemStack.COAL_DUST_STACK, 4), null, null,
        null, null, null,
        null, null, null
    };
    public static final ItemStack[] WITHER_SKELLETON_SKULL_RECIPE = {
        new ItemStack(Material.BONE_BLOCK), SlimefunItems.CARBON_CHUNK, CustomItemStack.COAL_DUST_STACK,
        null, null, null,
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
        SlimefunItems.ENDER_LUMP_3, CustomItemStack.REFINED_AETHER_STACK, SlimefunItems.ENDER_LUMP_3,
        null, SlimefunItems.NECROTIC_SKULL, null
    };
    public static final ItemStack[] REFINED_AETHER_RECIPE = {
        CustomItemStack.RAW_AETHER_STACK, SlimefunItems.MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_INGOT,
        SlimefunItems.SULFATE, null, null,
        null, null, null
    };

    private ItemRecipes() {}
}
