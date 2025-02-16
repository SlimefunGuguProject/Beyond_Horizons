package me.slimeyderp.beyondhorizons.Electricity;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class CoalDrill extends AContainer implements RecipeDisplayItem {

    public CoalDrill(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(6, new ItemStack[] {new ItemStack(Material.COBBLESTONE)},
            new ItemStack[] {CustomItemStack.COAL_DUST_STACK});
        registerRecipe(6, new ItemStack[] {new ItemStack(Material.STONE)},
            new ItemStack[] {CustomItemStack.COAL_DUST_STACK});
        registerRecipe(6, new ItemStack[] {new ItemStack(Material.DIORITE)},
            new ItemStack[] {CustomItemStack.COAL_DUST_STACK});
        registerRecipe(6, new ItemStack[] {new ItemStack(Material.GRANITE)},
            new ItemStack[] {CustomItemStack.COAL_DUST_STACK});
    }

    @Override
    public int getEnergyConsumption() {
        return 15;
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
