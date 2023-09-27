

package com.gibby.dungeon.items;

import com.gibby.dungeon.Dungeons;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemHeavyAmethystSword extends ItemStandardMagicSword
{
    public ItemHeavyAmethystSword(final Item.ToolMaterial p_i45356_1_, final int VoidDamage) {
        super(p_i45356_1_, VoidDamage);
    }

    @Override
    public void onUpdate(final ItemStack par1ItemStack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
        if (par3Entity instanceof EntityPlayer) {
            final EntityPlayer entity = (EntityPlayer)par3Entity;
            if (entity.getCurrentEquippedItem() == par1ItemStack) {
                entity.addPotionEffect(new PotionEffect(Dungeons.magicBoost.id, 1, 0));
                entity.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1, 0));
            }
        }
    }

    @Override
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLivingBase, final EntityLivingBase par3EntityLivingBase) {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 1));
        return super.hitEntity(par1ItemStack, par2EntityLivingBase, par3EntityLivingBase);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add(EnumChatFormatting.DARK_PURPLE + "Slows on hit");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "+" + this.magicDamage + " Magical Damage");
        par3List.add(EnumChatFormatting.GRAY + "Has " + (this.getMaxDamage() - this.getDamage(par1ItemStack)) + " uses left");
    }
}
