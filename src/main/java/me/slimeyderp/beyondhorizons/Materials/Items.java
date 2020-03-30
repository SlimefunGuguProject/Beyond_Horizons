package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.RadioactiveItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.slimeyderp.beyondhorizons.Electricity.CoalDrill;
import me.slimeyderp.beyondhorizons.Electricity.DimensionalReactor;
import me.slimeyderp.beyondhorizons.Electricity.DimensionalTransmutator;
import me.slimeyderp.beyondhorizons.ExtraCategory;
import me.slimeyderp.beyondhorizons.Tools.PortableDimensionShifter;
import me.slimeyderp.beyondhorizons.Weapons_Armor.NoDisenchantSlimefunItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {
    public static final SlimefunItem SUPER_CHARGED_COOLANT_CELL = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.SUPER_CHARGED_COOLANT_CELL_STACK, ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE, ItemRecipes.EmptyRecipe);
    public static final SlimefunItem ETHERIUM = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.ETHERIUM_STACK, RecipeType.SMELTERY, ItemRecipes.EtheriumRecipe);
    public static final SlimefunItem RAW_AETHER = new RadioactiveItem(ExtraCategory.CUSTOM_CATEGORY, Radioactivity.VERY_DEADLY, CustomItemStack.RAW_AETHER_STACK, ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE, ItemRecipes.EmptyRecipe);
    public static final DimensionalTransmutator DIMENSIONAL_TRANSMUTATOR = new DimensionalTransmutator(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.DIMENSIONAL_TRANSMUTATOR_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.DimensionalTransmutatorRecipe);
    public static final SlimefunItem UNSTABLE_ETHERIUM = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.UNSTABLE_ETHERIUM_STACK, ExtraRecipeTypes.DIMENSIONAL_TRANSMUTATOR_RECIPETYPE, ItemRecipes.EmptyRecipe);
    public static final NoDisenchantSlimefunItem ETHERIAL_BALANCE_ROD = new NoDisenchantSlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.ETHERIAL_BALANCE_ROD_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.EtherialBalanceRodRecipe);
    public static final DimensionalReactor DIMENSIONAL_REACTOR = new DimensionalReactor(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.DIMENSIONAL_REACTOR_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.DimensionalReactorRecipe);
    public static final SlimefunItem COAL_DUST = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.COAL_DUST_STACK, ExtraRecipeTypes.COAL_DRILL_RECIPETYPE, ItemRecipes.EmptyRecipe);
    public static final VanillaItem COAL = new VanillaItem(ExtraCategory.CUSTOM_CATEGORY, new ItemStack(Material.COAL), "coal", RecipeType.COMPRESSOR, ItemRecipes.CoalRecipe);
    public static final CoalDrill COAL_DRILL = new CoalDrill(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.COAL_DRILL_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.CoalDrillRecipe);
    public static final NoDisenchantSlimefunItem ETHERIAL_PHANTOM_SWORD = new NoDisenchantSlimefunItem(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.EtherialPhantomSwordRecipe);
    public static final PortableDimensionShifter PORTABLE_DIMENSION_SHIFTER = new PortableDimensionShifter(ExtraCategory.CUSTOM_CATEGORY, CustomItemStack.PORTABLE_DIMESNION_SHIFTER_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.PortableDimensionShifterRecipe);
}
