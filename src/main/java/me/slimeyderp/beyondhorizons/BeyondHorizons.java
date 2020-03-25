package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondHorizons extends JavaPlugin implements SlimefunAddon, Listener {

    @Override
    public void onEnable() {

        RegisterItems();
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("Beyond-Horizons has loaded Sucessfully!");
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private void RegisterItems() {
        Items.ETHERIUM.register(this);
        Items.SUPER_CHARGED_COOLANT_CELL.register(this);
        Items.RAW_AETHER.register(this);
        Items.DIMENSIONAL_TRANSMUTATOR.register(this);
        Items.UNSTABLE_ETHERIUM.register(this);
    }

    @EventHandler
    public void isSprinting(PlayerToggleSprintEvent event) {
        Player p = event.getPlayer();
        if (p.getInventory().containsAtLeast(ItemStacks.UNSTABLE_ETHERIUM_STACK, 1)) {
            PlayerInventory playerInventory = p.getInventory();
            Location loc = p.getLocation();
            loc.getWorld().createExplosion(loc, 12F);
            playerInventory.removeItem(ItemStacks.UNSTABLE_ETHERIUM_STACK);
        }
    }
}
