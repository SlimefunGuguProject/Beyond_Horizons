package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class DimensionalTransmutator extends AContainer implements RecipeDisplayItem {

    DimensionalTransmutator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(8, new ItemStack[]{SlimefunItems.REACTOR_COOLANT_CELL}, new ItemStack[]{SlimefunItems.NETHER_ICE_COOLANT_CELL});
        registerRecipe(8, new ItemStack[]{SlimefunItems.NETHER_ICE_COOLANT_CELL}, new ItemStack[]{ItemStacks.SUPER_CHARGED_COOLANT_CELL_STACK});
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
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
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


