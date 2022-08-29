package me.slimeyderp.beyondhorizons.Electricity;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.reactors.NuclearReactor;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.reactors.Reactor;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;

public class DimensionalReactor extends AGenerator{

    public DimensionalReactor(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public String getInventoryTitle() {
        return "&1Dimensional Reactor";
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(1500, CustomItemStack.RAW_AETHER_STACK, null));
    }

    @Override
    public ItemStack getProgressBar() {
        return SkullItem.fromBase64(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ==");
    }

    @Override
    public int getEnergyProduction() {
        return 1750;
    }

    @Override
    public int getCapacity() {
        return 101004;
    }
}
