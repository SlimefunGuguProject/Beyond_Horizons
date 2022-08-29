package me.slimeyderp.beyondhorizons.Tools;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PortableDimensionShifter extends SimpleSlimefunItem<ItemUseHandler> {

    public PortableDimensionShifter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
                                    ItemStack[] recipe
    ) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemUseHandler getItemHandler() {
        return event -> {
            final Player player = event.getPlayer();
            final World world = Bukkit.getWorlds().get(0);
            final World aether = Bukkit.getWorld("world_aether");
            if (aether != null && player.getWorld().getUID().equals(aether.getUID())) {
                player.teleport(aether.getHighestBlockAt(player.getLocation()).getLocation().add(0, 2, 0));
            } else {
                player.teleport(world.getHighestBlockAt(player.getLocation()).getLocation().add(0, 2, 0));
            }
        };
    }

}
