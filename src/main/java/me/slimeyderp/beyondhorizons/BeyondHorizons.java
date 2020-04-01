package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.BukkitUpdater;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import me.slimeyderp.beyondhorizons.Materials.Items;
import me.slimeyderp.beyondhorizons.Materials.RawAetherResource;
import me.slimeyderp.beyondhorizons.Materials.UnstableEtheriumResource;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondHorizons extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        registerItems();
        addingEnchantments();
        makingAetherWorld();
        failingToRewriteTheCode();
        testingCatBazookas();
        realizingItsABadIdea();
        hidingEasterEggs();
        pingingTheBusyBiscuit();
        new SpecialItemListener(this);
        new BukkitUpdater(this, this.getFile(), 370897);
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

    private void registerItems() {

        Items.ETHERIUM.register(this);
        Items.UNSTABLE_ETHERIUM.register(this);
        Items.ETHERIAL_BALANCE_ROD.register(this);
        Items.AETHERIAL_WIND_STAFF.register(this);
        Items.ETHERIAL_PHANTOM_SWORD.register(this);
        Items.DIMENSIONAL_TRANSMUTATOR.register(this);
        Items.DIMENSIONAL_REACTOR.register(this);
        Items.SUPER_CHARGED_COOLANT_CELL.register(this);
        Items.RAW_AETHER.register(this);
        Items.COAL.register(this);
        Items.COAL_DUST.register(this);
        Items.COAL_DRILL.register(this);
        Items.PORTABLE_DIMENSION_SHIFTER.register(this);
        new RawAetherResource().register();
        new UnstableEtheriumResource().register();
    }

    private void addingEnchantments() {
        ItemMeta ETHERIAL_BALANCE_ROD_META = CustomItemStack.ETHERIAL_BALANCE_ROD_STACK.getItemMeta();
        ETHERIAL_BALANCE_ROD_META.addEnchant(Enchantment.KNOCKBACK, 5, true);
        CustomItemStack.ETHERIAL_BALANCE_ROD_STACK.setItemMeta(ETHERIAL_BALANCE_ROD_META);
        ItemMeta ETHERIAL_PHANTOM_SWORD_META = CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK.getItemMeta();
        ETHERIAL_PHANTOM_SWORD_META.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK.setItemMeta(ETHERIAL_PHANTOM_SWORD_META);
        ItemMeta AETHERIAL_WIND_STAFF_META = CustomItemStack.AETHERIAL_WIND_STAFF_STACK.getItemMeta();
        AETHERIAL_WIND_STAFF_META.addEnchant(Enchantment.DURABILITY, 1, true);
        CustomItemStack.AETHERIAL_WIND_STAFF_STACK.setItemMeta(AETHERIAL_WIND_STAFF_META);
        getLogger().info("Cleaning the dustbins...");
    }

    private void makingAetherWorld() {
        WorldCreator wc = new WorldCreator("world_aether");
        wc.type(WorldType.NORMAL);
        wc.generator(new CustomChunkGenerator());
        wc.environment(World.Environment.THE_END);
        wc.createWorld();
        getLogger().info("Rewriting the whole add-on..");
    }

    private void failingToRewriteTheCode() {
        Bukkit.getServer().getWorld("world_aether").getBlockAt(0, 1, 0).setType(Material.END_PORTAL);
        getLogger().info("Failing to re-write the whole add-on...");
    }

    private void testingCatBazookas() {
        getLogger().info("Testing Cat Bazookas...");
    }

    private void realizingItsABadIdea() {
        getLogger().info("Realizing it's a bad idea...");
    }

    private void hidingEasterEggs() {
        getLogger().info("Hiding Easter Eggs...");
    }

    private void pingingTheBusyBiscuit() {
        getLogger().info("Pinging TheBusyBiscuit...");
    }
}
