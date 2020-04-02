package me.slimeyderp.beyondhorizons.materials;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

public class UnstableEtheriumResource implements GEOResource {

    private final NamespacedKey key = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "unstable_etherium");

    @Override
    public int getDefaultSupply(Environment environment, Biome biome) {
        return 0;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public int getMaxDeviation() {
        return 2;
    }

    @Override
    public String getName() {
        return "Unstable Etherium";
    }

    @Override
    public ItemStack getItem() {
        return CustomItemStack.UNSTABLE_ETHERIUM_STACK.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

}
