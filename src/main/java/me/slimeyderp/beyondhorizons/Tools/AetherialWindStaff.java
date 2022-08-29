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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AetherialWindStaff extends SimpleSlimefunItem<ItemUseHandler> {

    private final Map<UUID, Long> cooldown = new HashMap<>();

    public AetherialWindStaff(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
