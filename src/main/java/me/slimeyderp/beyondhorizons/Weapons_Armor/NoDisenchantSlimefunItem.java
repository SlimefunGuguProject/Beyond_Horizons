package me.slimeyderp.beyondhorizons.Weapons_Armor;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class NoDisenchantSlimefunItem extends SlimefunItem {

    public NoDisenchantSlimefunItem(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                                    ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public boolean isDisenchantable() {
        return false;
    }
}
