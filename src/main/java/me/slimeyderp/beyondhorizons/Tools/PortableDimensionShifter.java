package me.slimeyderp.beyondhorizons.tools;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PortableDimensionShifter extends SlimefunItem {

    public PortableDimensionShifter(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemusehandler = this::onItemRightClick;
        addItemHandler(itemusehandler);
    }

    private void onItemRightClick(PlayerRightClickEvent event) {
        Player player = event.getPlayer();
        if ((player.getWorld()) != (Bukkit.getWorld("world_aether"))) {
            Location loc = player.getLocation();
            loc.setWorld(Bukkit.getWorld("world_aether"));
            loc.setY(1);
            boolean safe = false;
            while (true) {
                if (loc.getBlock().isEmpty() == true) {
                    loc.add(0, 1, 0);
                    break;
                } else {
                    loc.add(0, 1, 0);
                }
            }
            player.teleport(loc);
        } else {
            Location loc = player.getLocation();
            loc.setWorld(Bukkit.getWorld("world"));
            loc = Bukkit.getServer().getWorld("world").getHighestBlockAt(loc).getLocation();
            loc.add(0, 2, 0);
            player.teleport(loc);
        }
    }

}
