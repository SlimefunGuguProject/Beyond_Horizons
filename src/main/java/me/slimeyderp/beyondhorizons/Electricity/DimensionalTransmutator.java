package me.slimeyderp.beyondhorizons.Electricity;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class DimensionalTransmutator extends AContainer implements RecipeDisplayItem {

    public DimensionalTransmutator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                                   ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(8, new ItemStack[] {SlimefunItems.REACTOR_COOLANT_CELL},
            new ItemStack[] {SlimefunItems.NETHER_ICE_COOLANT_CELL});
        registerRecipe(8, new ItemStack[] {SlimefunItems.NETHER_ICE_COOLANT_CELL},
            new ItemStack[] {CustomItemStack.SUPER_CHARGED_COOLANT_CELL_STACK});
        registerRecipe(8, new ItemStack[] {SlimefunItems.URANIUM},
            new ItemStack[] {CustomItemStack.RAW_AETHER_STACK});
        registerRecipe(8, new ItemStack[] {CustomItemStack.ETHERIUM_STACK},
            new ItemStack[] {CustomItemStack.UNSTABLE_ETHERIUM_STACK});
        registerRecipe(8, new ItemStack[] {CustomItemStack.UNSTABLE_ETHERIUM_STACK},
            new ItemStack[] {CustomItemStack.ETHERIUM_STACK});
    }

    @Override
    public int getEnergyConsumption() {
        return 150;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        final List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[0]);
        }

        return displayRecipes;
    }


    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.ENDER_EYE);
    }

    @Override
    public String getInventoryTitle() {
        return "&dDimensional Transmutator";
    }

    @Override
    public String getMachineIdentifier() {
        return "DIMENSIONAL_TRANSMUTATOR";
    }

    @Override
    public int getCapacity() {
        return 2560;
    }
}


