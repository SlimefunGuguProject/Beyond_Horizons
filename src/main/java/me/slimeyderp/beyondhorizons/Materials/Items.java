package me.slimeyderp.beyondhorizons.materials;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.RadioactiveItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.slimeyderp.beyondhorizons.ExtraCategory;
import me.slimeyderp.beyondhorizons.electricity.CoalDrill;
import me.slimeyderp.beyondhorizons.electricity.DimensionalReactor;
import me.slimeyderp.beyondhorizons.electricity.DimensionalTransmutator;
import me.slimeyderp.beyondhorizons.tools.AetherialWindStaff;
import me.slimeyderp.beyondhorizons.tools.PortableDimensionShifter;
import me.slimeyderp.beyondhorizons.weapons_armor.NoDisenchantSlimefunItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Items {

    public static final SlimefunItem SUPER_CHARGED_COOLANT_CELL = new SlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.SUPER_CHARGED_COOLANT_CELL_STACK,
        ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE,
        ItemRecipes.EMPTY_RECIPE
    );
    public static final SlimefunItem ETHERIUM = new SlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.ETHERIUM_STACK,
        RecipeType.SMELTERY,
        ItemRecipes.ETHERIUM_RECIPE
    );
    public static final SlimefunItem RAW_AETHER = new RadioactiveItem(
        ExtraCategory.CUSTOM_CATEGORY,
        Radioactivity.VERY_DEADLY,
        CustomItemStack.RAW_AETHER_STACK,
        ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE,
        ItemRecipes.EMPTY_RECIPE
    );
    public static final DimensionalTransmutator DIMENSIONAL_TRANSMUTATOR = new DimensionalTransmutator(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.DIMENSIONAL_TRANSMUTATOR_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.DIMENSIONAL_TRANSMUTATOR_RECIPE
    );
    public static final SlimefunItem UNSTABLE_ETHERIUM = new SlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.UNSTABLE_ETHERIUM_STACK,
        ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE,
        ItemRecipes.EMPTY_RECIPE
    );
    public static final NoDisenchantSlimefunItem ETHERIAL_BALANCE_ROD = new NoDisenchantSlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.ETHERIAL_BALANCE_ROD_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.ETHERIAL_BALANCE_ROD_RECIPE
    );
    public static final DimensionalReactor DIMENSIONAL_REACTOR = new DimensionalReactor(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.DIMENSIONAL_REACTOR_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.DIMENSIONAL_REACTOR_RECIPE
    );
    public static final SlimefunItem COAL_DUST = new SlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.COAL_DUST_STACK,
        ExtraRecipeTypes.COAL_DRILL_RECIPETYPE,
        ItemRecipes.EMPTY_RECIPE
    );
    public static final VanillaItem COAL = new VanillaItem(
        ExtraCategory.CUSTOM_CATEGORY,
        new ItemStack(Material.COAL),
        "coal",
        RecipeType.COMPRESSOR,
        ItemRecipes.COAL_RECIPE
    );
    public static final CoalDrill COAL_DRILL = new CoalDrill(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.COAL_DRILL_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.COAL_DRILL_RECIPE
    );
    public static final NoDisenchantSlimefunItem ETHERIAL_PHANTOM_SWORD = new NoDisenchantSlimefunItem(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.ETHERIAL_PHANTOM_SWORD_RECIPE
    );
    public static final PortableDimensionShifter PORTABLE_DIMENSION_SHIFTER = new PortableDimensionShifter(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.PORTABLE_DIMESNION_SHIFTER_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.PORTABLE_DIMENSION_SHIFTER_RECIPE
    );
    public static final AetherialWindStaff AETHERIAL_WIND_STAFF = new AetherialWindStaff(
        ExtraCategory.CUSTOM_CATEGORY,
        CustomItemStack.AETHERIAL_WIND_STAFF_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ItemRecipes.AETHERIAL_WIND_STAFF_RECIPE
    );

    private Items() {}
}
