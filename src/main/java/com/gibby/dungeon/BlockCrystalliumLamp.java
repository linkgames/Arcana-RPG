

package com.gibby.dungeon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import java.util.*;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class BlockCrystalliumLamp extends Block
{    private final boolean field_150171_a;

    public BlockCrystalliumLamp(boolean p_i45421_1_)
    {
        super(Material.redstoneLight);
        this.field_150171_a = p_i45421_1_;

        if (p_i45421_1_)
        {
            this.setLightLevel(1.0F);
        }
    }
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
            if (this.field_150171_a && !p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
            }
            else if (!this.field_150171_a && p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
            {
                p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, Blocks.lit_redstone_lamp, 0, 2);
            }
        }
    }
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Item.getItemFromBlock(Dungeons.crystalliumLamp);
    }
}
