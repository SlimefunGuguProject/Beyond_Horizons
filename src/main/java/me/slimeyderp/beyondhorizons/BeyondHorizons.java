package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondHorizons extends JavaPlugin implements SlimefunAddon, Listener {

    @Override
    public void onEnable() {
        RegisterItems();
        AddingEnchantments();
        RewritingTheWholeCode();
        FailingToRewriteTheCode();
        TestingCatBazookas();
        RealizingItsABadIdea();
        HidingEasterEggs();
        PingingTheBusyBiscuit();
        new SpecialItemListener(this);
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
        Items.ETHERIAL_BALANCE_ROD.register(this);
    }

    private void AddingEnchantments() {
        ItemMeta ETHERIAL_BALANCE_ROD_META = ItemStacks.ETHERIAL_BALANCE_ROD_STACK.getItemMeta();
        ETHERIAL_BALANCE_ROD_META.addEnchant(Enchantment.KNOCKBACK, 5, true);
        ItemStacks.ETHERIAL_BALANCE_ROD_STACK.setItemMeta(ETHERIAL_BALANCE_ROD_META);
        getLogger().info("Cleaning the dustbins...");
    }

    private void RewritingTheWholeCode() {
        getLogger().info("Rewriting the whole add-on..");
    }

    private void FailingToRewriteTheCode() {
        getLogger().info("Failing to re-write the whole add-on...");
    }

    private void TestingCatBazookas() {
        getLogger().info("Testing Cat Bazookas...");
    }

    private void RealizingItsABadIdea() {
        getLogger().info("Realizing it's a bad idea...");
    }

    private void HidingEasterEggs() {
        getLogger().info("Hiding Easter Eggs...");
    }

    private void PingingTheBusyBiscuit() {
        getLogger().info("Pinging TheBusyBiscuit...");
    }
}
