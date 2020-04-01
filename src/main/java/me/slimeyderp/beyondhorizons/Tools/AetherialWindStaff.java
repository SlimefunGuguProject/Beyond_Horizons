package me.slimeyderp.beyondhorizons.Tools;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class AetherialWindStaff extends SlimefunItem {

    ItemStack stick = new ItemStack(Material.STICK);

    public AetherialWindStaff(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemusehandler = this::onItemRightClick;
        addItemHandler(itemusehandler);
    }

    private void onItemRightClick(PlayerRightClickEvent e) {
        Player p = e.getPlayer();
        if (p.getWorld() == Bukkit.getServer().getWorld("world_aether")) {
            p.setVelocity((p.getLocation().getDirection()).multiply(10));
            p.setItemInHand(stick);
            new BukkitRunnable() {
                @Override
                public void run() {
                    byte counter = -1;
                    for (ItemStack item : p.getInventory().getContents()) {
                        counter++;
                        if (item != null) {
                            if (item.equals(stick)) {
                                p.getInventory().setItem(counter, CustomItemStack.AETHERIAL_WIND_STAFF_STACK);
                                break;
                            }
                        }
                    }
                }
            }.runTaskLater(BeyondHorizons.getPlugin(BeyondHorizons.class), 20);
        }
    }
}
