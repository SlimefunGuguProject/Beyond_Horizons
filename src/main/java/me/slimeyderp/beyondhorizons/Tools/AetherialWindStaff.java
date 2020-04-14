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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AetherialWindStaff extends SimpleSlimefunItem<ItemUseHandler> {

    private final Map<UUID, Long> cooldown = new HashMap<>();

    public AetherialWindStaff(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            final Player p = e.getPlayer();
            final World aether = Bukkit.getServer().getWorld("world_aether");
            final long lastHit = cooldown.getOrDefault(p.getUniqueId(), -1L);
            if (aether != null && p.getWorld().getUID().equals(aether.getUID()) && lastHit <= System.currentTimeMillis()) {
                p.setVelocity(p.getLocation().getDirection().multiply(10));
                cooldown.put(p.getUniqueId(), System.currentTimeMillis() + 1000);
            }
        };
    }
}
