package me.slimeyderp.beyondhorizons;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CustomChunkGenerator extends ChunkGenerator {
    int currentHeight = 50;

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        SimplexOctaveGenerator generator = new SimplexOctaveGenerator(new Random(world.getSeed()), 8);
        ChunkData chunk = createChunkData(world);
        generator.setScale(0.055D);

        for (int X = 0; X < 16; X++)
            for (int Z = 0; Z < 16; Z++) {
                currentHeight = (int) (generator.noise(chunkX * 16 + X, chunkZ * 16 + Z, 0.5D, 0.5D) * 15D + 50D);
                int randomNumber1 = random.nextInt(11);
                if (randomNumber1 > 8) {
                    chunk.setBlock(X, currentHeight, Z, Material.MAGENTA_TERRACOTTA);
                } else {
                    chunk.setBlock(X, currentHeight, Z, Material.PURPLE_GLAZED_TERRACOTTA);
                }
                int randomNumber2 = random.nextInt(11);
                if (randomNumber2 < 4) {
                    chunk.setBlock(X, currentHeight - 1, Z, Material.PURPUR_BLOCK);
                } else {
                    chunk.setBlock(X, currentHeight - 1, Z, Material.PURPUR_PILLAR);
                }
                for (int i = currentHeight - 2; i > 0; i--) {
                    chunk.setBlock(X, i, Z, Material.END_STONE);
                }
                chunk.setBlock(X, 0, Z, Material.BEDROCK);
            }
        return chunk;
    }

    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        return Arrays.asList((BlockPopulator) new OrePopulator());
    }
}