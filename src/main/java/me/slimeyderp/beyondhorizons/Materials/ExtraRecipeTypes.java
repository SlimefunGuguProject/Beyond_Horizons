package me.slimeyderp.beyondhorizons.materials;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import org.bukkit.NamespacedKey;

public final class ExtraRecipeTypes {

    public static final RecipeType DIMENSIONAL_TRANSMUTATOR_RECIPETYPE = new RecipeType(
        new NamespacedKey(BeyondHorizons.getInstance(), "dimensional_transmutator"),
        CustomItemStack.DIMENSIONAL_TRANSMUTATOR_RECIPETELLER_STACK
    );
    public static final RecipeType COAL_DRILL_RECIPETYPE = new RecipeType(
        new NamespacedKey(BeyondHorizons.getInstance(), "coal_drill"),
        CustomItemStack.COAL_DRILL_RECIPETELLER_STACK
    );

    private ExtraRecipeTypes() {}
}
