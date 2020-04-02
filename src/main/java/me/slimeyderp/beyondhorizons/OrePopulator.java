package me.slimeyderp.beyondhorizons;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class OrePopulator extends BlockPopulator {

    @Override
    public void populate(World world, Random random, Chunk chunk) {
        boolean isStone;

        for (int i = 0; i < 50; i++) {  // Number of tries
            if (random.nextInt(100) < 20) {  // The chance of spawning
                int x = random.nextInt(15);
                int y = random.nextInt(40) + 20;  // Get randomized coordinates
                int z = random.nextInt(15);
                if (chunk.getBlock(x, y, z).getType() == Material.END_STONE) {
                    isStone = true;
                    while (isStone) {
                        chunk.getBlock(x, y, z).setType(Material.DIAMOND_ORE);
                        if (random.nextInt(100) < 40) {   // The chance of continuing the vein
                            switch (random.nextInt(6)) {  // The direction chooser
                                case 0:
                                    x++;
                                    break;
                                case 1:
                                    y++;
                                    break;
                                case 2:
                                    z++;
                                    break;
                                case 3:
                                    x--;
                                    break;
                                case 4:
                                    y--;
                                    break;
                                case 5:
                                    z--;
                                    break;
                                default:
                                    break;
                            }

                            if ((x > 15 || x < 0) || (z > 15 || z < 0) || (y == 0 || y == 256)) {
                                isStone = false;
                            } else {
                                isStone = chunk.getBlock(x, y, z).getType() == Material.END_STONE
                                    && chunk.getBlock(x, y, z).getType() != Material.DIAMOND_ORE;
                            }
                        } else
                            isStone = false;
                    }
                }
            }
        }
    }
}
