package me.slimeyderp.beyondhorizons.tools;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PortableDimensionShifter extends SimpleSlimefunItem<ItemUseHandler> {

    public PortableDimensionShifter(Category category, SlimefunItemStack item, RecipeType recipeType,
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
