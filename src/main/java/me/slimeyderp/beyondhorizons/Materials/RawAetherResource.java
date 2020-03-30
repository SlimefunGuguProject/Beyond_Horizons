package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class RawAetherResource implements GEOResource {

    private Random rand = new Random();

    private final NamespacedKey key = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "raw_aether_ore");

    @Override
    public int getDefaultSupply(Environment environment, Biome biome) {
        if (biome != Biome.THE_END) {
            return environment == Environment.THE_END ? 6 : 0;
        } else {
            return 0;
        }
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public int getMaxDeviation() {
        return 18;
    }

    @Override
    public String getName() {
        return "Raw Aether Ore";
    }

    @Override
    public ItemStack getItem() {
        return CustomItemStack.RAW_AETHER_STACK.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

}
