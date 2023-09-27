

package com.gibby.dungeon.blocks;

import com.gibby.dungeon.Dungeons;
import net.minecraft.block.BlockOre;

public class BlockCrystalOre extends BlockOre
{
    public BlockCrystalOre() {
        this.setHarvestLevel("pickaxe", 6);
        this.setHardness(17.0f);
        this.setResistance(30.0f);
        this.setCreativeTab(Dungeons.Blocks);
    }
}
