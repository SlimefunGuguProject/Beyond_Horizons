package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

class Items {
    static final SlimefunItem SUPER_CHARGED_COOLANT_CELL = new SlimefunItem(ExtraCategory.Customcategory, ItemStacks.SuperChargedCoolantCellStack, RecipeType.NULL, ItemRecipes.EmptyRecipe);
    static final SlimefunItem ETHERIUM = new SlimefunItem(ExtraCategory.Customcategory, ItemStacks.EtheriumStack, RecipeType.SMELTERY, ItemRecipes.EtheriumRecipe);
    static final SlimefunItem RAW_AETHER = new SlimefunItem(ExtraCategory.Customcategory, ItemStacks.RawAetherStack, RecipeType.NULL, ItemRecipes.EmptyRecipe);
    static final DimensionalTransmutator DIMENSIONAL_TRANSMUTATOR = new DimensionalTransmutator(ExtraCategory.Customcategory, ItemStacks.DimensionalTransmutatorStack, RecipeType.ENHANCED_CRAFTING_TABLE, ItemRecipes.DimensionalTransmutatorRecipe) {
        @Override
        public int getEnergyConsumption() {
            return 150;
        }

        @Override
        public int getSpeed() {
            return 1;
        }
    };

}
