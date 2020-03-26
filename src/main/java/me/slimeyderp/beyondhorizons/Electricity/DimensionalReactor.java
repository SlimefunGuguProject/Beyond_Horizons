package me.slimeyderp.beyondhorizons.Electricity;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AReactor;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class DimensionalReactor extends AReactor {

    public DimensionalReactor(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
        return SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ==");
    }

    @Override
    public ItemStack getCoolant() {
        return CustomItemStack.SUPER_CHARGED_COOLANT_CELL_STACK;
    }

    @Override
    public int getEnergyProduction() {
        return 1750;
    }

    @Override
    public int getCapacity() {
        return 101004;
    }

    @Override
    public void extraTick(Location l) {
        // This machine does not need to perform anything while ticking
        // The Nether Star Reactor uses this method to generate the Wither Effect
    }

}
