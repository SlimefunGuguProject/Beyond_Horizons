package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondHorizons extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        registerItems();
        getLogger().info("Beyond-Horizons Add-on by SlimeyDerp: Add-on Loaded Successfully! :D");
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

    private void registerItems() {
        Items.ETHERIUM.register(this);
        Items.SUPER_CHARGED_COOLANT_CELL.register(this);
        Items.RAW_AETHER.register(this);
        Items.DIMENSIONAL_TRANSMUTATOR.register(this);
    }
}
