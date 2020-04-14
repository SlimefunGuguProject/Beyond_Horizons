package me.slimeyderp.beyondhorizons;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CustomChunkGenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        SimplexOctaveGenerator generator = new SimplexOctaveGenerator(random, 8);
        ChunkData chunk = createChunkData(world);
        generator.setScale(0.055D);

        int currentHeight;

        for (int x = 0; x < 16; x++)
            for (int z = 0; z < 16; z++) {
                currentHeight = (int) (generator.noise((double) chunkX * 16 + x,
                    (double) chunkZ * 16 + z, 0.5D, 0.5D) * 15D + 50D);

                chunk.setBlock(x, currentHeight, z,
                    random.nextInt(11) > 8 ? Material.MAGENTA_TERRACOTTA : Material.PURPLE_GLAZED_TERRACOTTA);

                chunk.setBlock(x, currentHeight - 1, z,
                    random.nextInt(11) < 4 ? Material.PURPUR_BLOCK : Material.PURPUR_PILLAR);

                for (int i = currentHeight - 2; i > 0; i--) {
                    chunk.setBlock(x, i, z, Material.END_STONE);
                }
                chunk.setBlock(x, 0, z, Material.BEDROCK);
            }
        return chunk;
    }

    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        return Collections.singletonList(new OrePopulator());
    }
}
