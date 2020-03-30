package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import me.slimeyderp.beyondhorizons.BeyondHorizons;
import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class UnstableEtheriumResource implements GEOResource {

    private Random rand = new Random();

    private final NamespacedKey key = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "unstable_etherium");

    @Override
    public int getDefaultSupply(Environment environment, Biome biome) {
        if (biome != Biome.THE_END) {
            return environment == Environment.THE_END ? rand.nextInt(3) : 0;
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
