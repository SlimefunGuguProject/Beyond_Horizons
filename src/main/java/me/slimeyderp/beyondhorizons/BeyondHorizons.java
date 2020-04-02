package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.BukkitUpdater;
import me.slimeyderp.beyondhorizons.materials.CustomItemStack;
import me.slimeyderp.beyondhorizons.materials.Items;
import me.slimeyderp.beyondhorizons.materials.RawAetherResource;
import me.slimeyderp.beyondhorizons.materials.UnstableEtheriumResource;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondHorizons extends JavaPlugin implements SlimefunAddon {

    private static BeyondHorizons instance;

    
    @Override
    public void onEnable() {
        instance = this;

        registerItems();
        addingEnchantments();
        makingAetherWorld();
        new SpecialItemListener(this);
        new BukkitUpdater(this, this.getFile(), 370897);
        getLogger().info("Beyond-Horizons has loaded Successfully!");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimeyDerp/Beyond_Horizons/issues";
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
        ItemMeta etherialBalanceRod = CustomItemStack.ETHERIAL_BALANCE_ROD_STACK.getItemMeta();
        etherialBalanceRod.addEnchant(Enchantment.KNOCKBACK, 5, true);
        CustomItemStack.ETHERIAL_BALANCE_ROD_STACK.setItemMeta(etherialBalanceRod);

        ItemMeta etherialPhantomSword = CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK.getItemMeta();
        etherialPhantomSword.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK.setItemMeta(etherialPhantomSword);

        ItemMeta aetherialWindStaff = CustomItemStack.AETHERIAL_WIND_STAFF_STACK.getItemMeta();
        aetherialWindStaff.addEnchant(Enchantment.DURABILITY, 1, true);
        CustomItemStack.AETHERIAL_WIND_STAFF_STACK.setItemMeta(aetherialWindStaff);
    }

    private void makingAetherWorld() {
        getLogger().info("Rewriting the whole add-on..");
        WorldCreator wc = new WorldCreator("world_aether");
        wc.type(WorldType.NORMAL);
        wc.generator(new CustomChunkGenerator());
        wc.environment(World.Environment.THE_END);
        final World aether = wc.createWorld();

        if (aether != null && aether.getBlockAt(0, 1, 0).getType() != Material.END_PORTAL)
            aether.getBlockAt(0, 1, 0).setType(Material.END_PORTAL);
    }

    public static BeyondHorizons getInstance() {
        return instance;
    }
}
