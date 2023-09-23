

package com.gibby.dungeon;

import net.minecraft.item.*;
import net.minecraft.init.*;
import cpw.mods.fml.common.registry.*;

public class ToolCrafting
{
    public static void Recipes() {
        GameRegistry.addRecipe(new ItemStack(Dungeons.copperaxe), "cc", "sc", "s ", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.copperaxe), "cc", "cs", " s", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.copperpickaxe), "ccc", " s ", " s ", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.coppershovel), "c", "s", "s", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.copperhoe), "cc", "s ", "s ", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.copperhoe), "cc", " s", " s", 'c', Dungeons.copper, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.rubyAxe), "cc", "sc", "s ", 'c', Dungeons.ruby, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.rubyAxe), "cc", "cs", " s", 'c', Dungeons.ruby, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.rubyPickaxe), "ccc", " s ", " s ", 'c', Dungeons.ruby, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.rubyShovel), "c", "s", "s", 'c', Dungeons.ruby, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.amethystAxe), "cc", "sc", "s ", 'c', Dungeons.amethyst, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.amethystAxe), "cc", "cs", " s", 'c', Dungeons.amethyst, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.amethystPickaxe), "ccc", " s ", " s ", 'c', Dungeons.amethyst, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.amethystShovel), "c", "s", "s", 'c', Dungeons.amethyst, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.lithiumAxe), "cc", "sc", "s ", 'c', Dungeons.lithium, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.lithiumAxe), "cc", "cs", " s", 'c', Dungeons.lithium, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.lithiumPickaxe), "ccc", " s ", " s ", 'c', Dungeons.lithium, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.lithiumShovel), "c", "s", "s", 'c', Dungeons.lithium, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.netherSteelAxe), "cc", "sc", "s ", 'c', Dungeons.netherSteel, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.netherSteelAxe), "cc", "cs", " s", 'c', Dungeons.netherSteel, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.netherSteelPickaxe), "ccc", " s ", " s ", 'c', Dungeons.netherSteel, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.netherSteelShovel), "c", "s", "s", 'c', Dungeons.netherSteel, 's', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Dungeons.netherHoe), "nc", "s ", "s ", 'c', Dungeons.netherSteel, 's', Items.stick, 'n', Dungeons.corruptedSoul);
    }
}
