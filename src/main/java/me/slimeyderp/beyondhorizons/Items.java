package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

class Items {
    public static final SlimefunItem SUPER_CHARGED_COOLANT_CELL = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.SUPER_CHARGED_COOLANT_CELL_STACK, RecipeType.NULL, ItemRecipes.EmptyRecipe);
    public static final SlimefunItem ETHERIUM = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.ETHERIUM_STACK, RecipeType.SMELTERY, ItemRecipes.EtheriumRecipe);
    public static final SlimefunItem RAW_AETHER = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.RAW_AETHER_STACK, RecipeType.NULL, ItemRecipes.EmptyRecipe);
    public static final DimensionalTransmutator DIMENSIONAL_TRANSMUTATOR = new DimensionalTransmutator(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.DIMENSIONAL_TRANSMUTATOR_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.DimensionalTransmutatorRecipe);
    public static final SlimefunItem UNSTABLE_ETHERIUM = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.UNSTABLE_ETHERIUM_STACK, RecipeType.NULL, ItemRecipes.EmptyRecipe);
    public static final SlimefunItem ETHERIAL_BALANCE_ROD = new SlimefunItem(ExtraCategory.CUSTOM_CATEGORY, ItemStacks.ETHERIAL_BALANCE_ROD_STACK, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.EtherialBalanceRodRecipe);

}
