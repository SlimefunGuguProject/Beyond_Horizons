package me.slimeyderp.beyondhorizons.Materials;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import org.bukkit.NamespacedKey;

public class ExtraRecipeTypes {

    public static final NamespacedKey DIMENSIONAL_ID = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "dimensional_transmutator");
    public static final NamespacedKey COAL_ID = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "coal_drill");
    public static final RecipeType DIMENSIONAL_TRANSMUTATOR_RECIPETYPE = new RecipeType(DIMENSIONAL_ID, CustomItemStack.DIMENSIONAL_TRANSMUTATOR_RECIPETELLER_STACK);
    public static final RecipeType COAL_DRILL_RECIPETYPE = new RecipeType(COAL_ID, CustomItemStack.COAL_DRILL_RECIPETELLER_STACK);
}
