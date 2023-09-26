

package com.gibby.dungeon.gen;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import com.gibby.dungeon.*;

public class squareruins extends WorldGenerator
{
    public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
        world.setBlock(i, j + 0, k + 0, Blocks.cobblestone);
        world.setBlock(i, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i, j + 0, k + 2, Blocks.dirt);
        world.setBlock(i, j + 0, k + 3, Blocks.dirt);
        world.setBlock(i, j + 0, k + 4, Blocks.dirt);
        world.setBlock(i, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i, j + 0, k + 7, Blocks.dirt);
        world.setBlock(i, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i, j + 0, k + 9, Blocks.mossy_cobblestone);
        world.setBlock(i, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i, j + 0, k + 11, Blocks.dirt);
        world.setBlock(i, j + 0, k + 12, Blocks.dirt);
        world.setBlock(i, j + 0, k + 13, Blocks.dirt);
        world.setBlock(i, j + 0, k + 14, Blocks.grass);
        world.setBlock(i, j + 0, k + 15, Blocks.dirt);
        world.setBlock(i, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i, j + 1, k + 1, Blocks.stonebrick, 4, 0);
        world.setBlock(i, j + 1, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 3, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 3, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 3, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i, j + 4, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 1, j + 0, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 0, k + 3, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 4, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 5, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 6, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 7, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 8, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 9, Blocks.grass);
        world.setBlock(i + 1, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 1, j + 0, k + 11, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 12, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 13, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 14, Blocks.cobblestone);
        world.setBlock(i + 1, j + 0, k + 15, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 16, Blocks.mossy_cobblestone);
        world.setBlock(i + 1, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 1, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 1, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 3, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 5, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 1, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 2, j + 0, k + 1, Blocks.grass);
        world.setBlock(i + 2, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 2, j + 0, k + 3, Blocks.dirt);
        world.setBlock(i + 2, j + 0, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 2, j + 0, k + 6, Blocks.mossy_cobblestone);
        world.setBlock(i + 2, j + 0, k + 7, Blocks.dirt);
        world.setBlock(i + 2, j + 0, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 2, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 2, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 2, j + 0, k + 12, Blocks.mossy_cobblestone);
        world.setBlock(i + 2, j + 0, k + 13, Blocks.grass);
        world.setBlock(i + 2, j + 0, k + 14, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 0, k + 15, Blocks.dirt);
        world.setBlock(i + 2, j + 0, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 0, k + 17, Blocks.mossy_cobblestone);
        world.setBlock(i + 2, j + 0, k + 18, Blocks.cobblestone);
        world.setBlock(i + 2, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        WorldGenWarlordDungeon.chest(world, rand, i + 2, j + 1, k + 1, "dungeonChest", rand.nextInt(5) + 1);
        world.setBlock(i + 2, j + 1, k + 3, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 1, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 1, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 2, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 2, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 2, j + 4, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 3, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i + 3, j + 0, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 7, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 8, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 13, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 3, j + 0, k + 15, Blocks.dirt);
        world.setBlock(i + 3, j + 0, k + 16, Blocks.mossy_cobblestone);
        world.setBlock(i + 3, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 3, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 3, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 3, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 4, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 4, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 4, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 4, Blocks.dirt);
        world.setBlock(i + 4, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 4, j + 0, k + 8, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 9, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 11, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 12, Blocks.grass);
        world.setBlock(i + 4, j + 0, k + 13, Blocks.mossy_cobblestone);
        world.setBlock(i + 4, j + 0, k + 14, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i + 4, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 4, j + 0, k + 18, Blocks.grass);
        world.setBlock(i + 4, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 4, j + 1, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 4, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 4, j + 2, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 0, k + 0, Blocks.cobblestone);
        world.setBlock(i + 5, j + 0, k + 1, Blocks.mossy_cobblestone);
        world.setBlock(i + 5, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 5, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 5, j + 0, k + 4, Blocks.grass);
        world.setBlock(i + 5, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 5, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 5, j + 0, k + 7, Blocks.cobblestone);
        world.setBlock(i + 5, j + 0, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 0, k + 9, Blocks.dirt);
        world.setBlock(i + 5, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i + 5, j + 0, k + 11, Blocks.mossy_cobblestone);
        world.setBlock(i + 5, j + 0, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 5, j + 0, k + 14, Blocks.mossy_cobblestone);
        world.setBlock(i + 5, j + 0, k + 15, Blocks.mossy_cobblestone);
        world.setBlock(i + 5, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i + 5, j + 0, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 0, k + 18, Blocks.dirt);
        Dungeons.spawner(world, i + 5, j + 1, k + 3, 4, 2);
        world.setBlock(i + 5, j + 1, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 5, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 6, j + 0, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 0, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 6, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i + 6, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i + 6, j + 0, k + 9, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 11, Blocks.mossy_cobblestone);
        world.setBlock(i + 6, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 6, j + 0, k + 13, Blocks.dirt);
        world.setBlock(i + 6, j + 0, k + 14, Blocks.cobblestone);
        world.setBlock(i + 6, j + 0, k + 15, Blocks.mossy_cobblestone);
        world.setBlock(i + 6, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 6, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 6, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 6, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 6, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 7, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 7, j + 0, k + 3, Blocks.dirt);
        world.setBlock(i + 7, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 7, j + 0, k + 7, Blocks.dirt);
        world.setBlock(i + 7, j + 0, k + 8, Blocks.grass);
        world.setBlock(i + 7, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 7, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 12, Blocks.mossy_cobblestone);
        world.setBlock(i + 7, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 7, j + 0, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 0, k + 16, Blocks.cobblestone);
        world.setBlock(i + 7, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 7, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 7, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 1, k + 3, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 2, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 7, j + 3, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 0, k + 0, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i + 8, j + 0, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 0, k + 3, Blocks.mossy_cobblestone);
        world.setBlock(i + 8, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 0, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 0, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 15, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 8, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 8, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 8, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 2, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 3, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 8, j + 4, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 9, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i + 9, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 9, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 9, j + 0, k + 7, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 8, Blocks.mossy_cobblestone);
        world.setBlock(i + 9, j + 0, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 9, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 13, Blocks.dirt);
        world.setBlock(i + 9, j + 0, k + 14, Blocks.mossy_cobblestone);
        world.setBlock(i + 9, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 9, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 9, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 9, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 9, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 9, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 10, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 12, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 14, Blocks.cobblestone);
        world.setBlock(i + 10, j + 0, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 17, Blocks.grass);
        world.setBlock(i + 10, j + 0, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 10, j + 4, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 11, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 11, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 11, j + 0, k + 3, Blocks.dirt);
        world.setBlock(i + 11, j + 0, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 11, j + 0, k + 6, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 0, k + 7, Blocks.mossy_cobblestone);
        world.setBlock(i + 11, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i + 11, j + 0, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i + 11, j + 0, k + 11, Blocks.grass);
        world.setBlock(i + 11, j + 0, k + 12, Blocks.grass);
        world.setBlock(i + 11, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 11, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 11, j + 0, k + 15, Blocks.mossy_cobblestone);
        world.setBlock(i + 11, j + 0, k + 16, Blocks.cobblestone);
        world.setBlock(i + 11, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 11, j + 0, k + 18, Blocks.cobblestone);
        world.setBlock(i + 11, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 1, k + 3, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 11, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 12, j + 0, k + 0, Blocks.mossy_cobblestone);
        world.setBlock(i + 12, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i + 12, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 12, j + 0, k + 4, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 5, Blocks.mossy_cobblestone);
        world.setBlock(i + 12, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 7, Blocks.mossy_cobblestone);
        world.setBlock(i + 12, j + 0, k + 8, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 12, j + 0, k + 10, Blocks.dirt);
        world.setBlock(i + 12, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 12, j + 0, k + 12, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 13, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 14, Blocks.mossy_cobblestone);
        world.setBlock(i + 12, j + 0, k + 15, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 12, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 12, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 12, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 12, j + 1, k + 10, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 12, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 13, j + 0, k + 0, Blocks.mossy_cobblestone);
        world.setBlock(i + 13, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 4, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 7, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 8, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 9, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 11, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 12, Blocks.grass);
        world.setBlock(i + 13, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 14, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 13, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i + 13, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 13, j + 0, k + 18, Blocks.dirt);
        Dungeons.spawner(world, i + 13, j + 0, k + 18, 4, 2);
        world.setBlock(i + 13, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 13, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 13, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 13, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 14, j + 0, k + 1, Blocks.dirt);
        world.setBlock(i + 14, j + 0, k + 2, Blocks.grass);
        world.setBlock(i + 14, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 14, j + 0, k + 4, Blocks.dirt);
        world.setBlock(i + 14, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 14, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 14, j + 0, k + 7, Blocks.dirt);
        world.setBlock(i + 14, j + 0, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 0, k + 9, Blocks.grass);
        world.setBlock(i + 14, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 14, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 14, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 14, j + 0, k + 13, Blocks.mossy_cobblestone);
        world.setBlock(i + 14, j + 0, k + 14, Blocks.mossy_cobblestone);
        world.setBlock(i + 14, j + 0, k + 15, Blocks.grass);
        world.setBlock(i + 14, j + 0, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 14, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 14, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 1, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 1, k + 7, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 14, j + 3, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 0, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 0, k + 1, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 2, Blocks.cobblestone);
        world.setBlock(i + 15, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 15, j + 0, k + 4, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 6, Blocks.cobblestone);
        world.setBlock(i + 15, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 8, Blocks.mossy_cobblestone);
        world.setBlock(i + 15, j + 0, k + 9, Blocks.dirt);
        world.setBlock(i + 15, j + 0, k + 10, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 15, j + 0, k + 12, Blocks.mossy_cobblestone);
        world.setBlock(i + 15, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 15, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 15, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 15, j + 0, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 15, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 1, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 15, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 16, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 4, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 5, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 6, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 7, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 8, Blocks.mossy_cobblestone);
        world.setBlock(i + 16, j + 0, k + 9, Blocks.mossy_cobblestone);
        world.setBlock(i + 16, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 11, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 13, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 16, j + 0, k + 16, Blocks.grass);
        world.setBlock(i + 16, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 16, j + 0, k + 18, Blocks.cobblestone);
        world.setBlock(i + 16, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 2, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 16, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 0, k + 0, Blocks.mossy_cobblestone);
        world.setBlock(i + 17, j + 0, k + 1, Blocks.grass);
        world.setBlock(i + 17, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 17, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 4, Blocks.dirt);
        world.setBlock(i + 17, j + 0, k + 5, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 6, Blocks.mossy_cobblestone);
        world.setBlock(i + 17, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 17, j + 0, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 0, k + 9, Blocks.grass);
        world.setBlock(i + 17, j + 0, k + 10, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 11, Blocks.dirt);
        world.setBlock(i + 17, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 13, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 17, j + 0, k + 15, Blocks.grass);
        world.setBlock(i + 17, j + 0, k + 16, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 17, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 17, j + 1, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 1, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 2, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 17, j + 3, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 0, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 0, k + 1, Blocks.grass);
        world.setBlock(i + 18, j + 0, k + 2, Blocks.mossy_cobblestone);
        world.setBlock(i + 18, j + 0, k + 3, Blocks.grass);
        world.setBlock(i + 18, j + 0, k + 4, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 5, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 0, k + 6, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 7, Blocks.grass);
        world.setBlock(i + 18, j + 0, k + 8, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 9, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 0, k + 10, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 11, Blocks.cobblestone);
        world.setBlock(i + 18, j + 0, k + 12, Blocks.cobblestone);
        world.setBlock(i + 18, j + 0, k + 13, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 14, Blocks.grass);
        world.setBlock(i + 18, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 18, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i + 18, j + 0, k + 17, Blocks.cobblestone);
        world.setBlock(i + 18, j + 0, k + 18, Blocks.cobblestone);
        world.setBlock(i + 18, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 4, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 6, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 10, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        WorldGenWarlordDungeon.chest(world, rand, i + 18, j + 1, k + 17, "dungeonChest", rand.nextInt(5) + 1);
        world.setBlock(i + 18, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 18, j + 2, k + 8, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 0, k + 0, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 1, Blocks.cobblestone);
        world.setBlock(i + 19, j + 0, k + 2, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 3, Blocks.cobblestone);
        world.setBlock(i + 19, j + 0, k + 4, Blocks.mossy_cobblestone);
        world.setBlock(i + 19, j + 0, k + 5, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 6, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 7, Blocks.mossy_cobblestone);
        world.setBlock(i + 19, j + 0, k + 8, Blocks.cobblestone);
        world.setBlock(i + 19, j + 0, k + 9, Blocks.mossy_cobblestone);
        world.setBlock(i + 19, j + 0, k + 10, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 11, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 12, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 13, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 14, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 15, Blocks.cobblestone);
        world.setBlock(i + 19, j + 0, k + 16, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 17, Blocks.dirt);
        world.setBlock(i + 19, j + 0, k + 18, Blocks.dirt);
        world.setBlock(i + 19, j + 1, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 1, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 5, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 6, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 10, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 11, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 14, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 17, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 1, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 2, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 5, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 10, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 14, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 2, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 3, k + 0, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 3, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 3, k + 13, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 3, k + 16, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 3, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 4, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 4, k + 18, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 5, k + 12, Blocks.stonebrick, 2, 0);
        world.setBlock(i + 19, j + 5, k + 18, Blocks.stonebrick, 2, 0);
        return true;
    }
}
