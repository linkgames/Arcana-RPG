

package com.gibby.dungeon;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestSetup
{
    public static void addChestItems() {
        final ChestGenHooks vampireChest = ChestGenHooks.getInfo("Vampire");
        WeightedRandomChestContent stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 1, 1, 20);
        vampireChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.lithium, 0, 5, 10, 10);
        vampireChest.addItem(stack);
        final ChestGenHooks voidChest = ChestGenHooks.getInfo("VoidDungeon");
        stack = new WeightedRandomChestContent(Dungeons.cursedStone, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.bloodWand, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.warlockStaff, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.botSword, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.botAmulet, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.necroticAmulet, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.bubbleSword, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.castIronStar, 0, 5, 10, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicCoin, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.metalCoin, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.bedrock, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.ruby, 0, 2, 4, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.silver, 0, 2, 4, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.voidFiendSword, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.trollAxe, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.steelSword, 0, 1, 1, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.rootBeer, 0, 2, 4, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.rotten_flesh, 0, 20, 24, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.gunpowder, 0, 10, 15, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.coal, 0, 10, 15, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.bone, 0, 10, 15, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.iron_ingot, 0, 10, 15, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.gold_ingot, 0, 5, 10, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.redstone, 0, 5, 10, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.apple, 0, 5, 10, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.experience_bottle, 0, 10, 15, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.amazonite, 0, 6, 10, 20);
        voidChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.potato, 0, 10, 15, 20);
        voidChest.addItem(stack);
        final ChestGenHooks netherChest = ChestGenHooks.getInfo("NetherStructure");
        stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 1, 1, 20);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.lithium, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.netherSteel, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.lavaKnightSword, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.corruptedBow, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.chaoticWand, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.netherDrill, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.flameSword, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.nether_wart, 0, 6, 10, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.rotten_flesh, 0, 6, 10, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.bone, 0, 6, 10, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.coal, 0, 6, 10, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.rawTrollMeat, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicPotion, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.bedrock, 0, 1, 2, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.blaze_powder, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.gunpowder, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.ruby, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.whiskey, 0, 2, 4, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicCoin, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.metalCoin, 0, 1, 2, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.ionicWand, 0, 1, 1, 10);
        netherChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.necroticAmulet, 0, 1, 1, 10);
        netherChest.addItem(stack);
        final ChestGenHooks montaneChest = ChestGenHooks.getInfo("MontaneDungeon");
        stack = new WeightedRandomChestContent(Dungeons.orcWarWand, 0, 0, 1, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.cookedTrollMeat, 0, 1, 3, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.beefstew, 0, 1, 3, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.potato, 0, 8, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.baked_potato, 0, 8, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.cooked_beef, 0, 8, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.beef, 0, 8, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIron, 0, 1, 3, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIronSword, 0, 1, 1, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIronChestplate, 0, 0, 1, 1);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.blackIronBoots)), 0, 1, 1);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.torturedChainSword)), 0, 1, 1);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.dungeonEyeSword)), 0, 1, 1);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.golden_apple, 0, 2, 8, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.crecentWand, 0, 1, 1, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.sapientWarWand, 0, 1, 1, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.coal, 0, 8, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.frostySword)), 0, 1, 1);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.amethyst, 0, 4, 8, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.metalCoin, 0, 4, 8, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicCoin, 0, 1, 2, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 1, 2, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.whiskey, 0, 2, 4, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.rootBeer, 0, 2, 4, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.gingerAle, 0, 2, 4, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.castIronStar, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.gunpowder, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.arrow, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.cookie, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.wheat, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.carrot, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.gold_nugget, 0, 4, 16, 10);
        montaneChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicPotion, 0, 1, 2, 10);
        montaneChest.addItem(stack);
        final ChestGenHooks montaneRichChest = ChestGenHooks.getInfo("MontaneRiches");
        stack = new WeightedRandomChestContent(Dungeons.orcWarWand, 0, 0, 1, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.cookedTrollMeat, 0, 1, 3, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIron, 0, 1, 3, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIronSword, 0, 1, 1, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.blackIronChestplate, 0, 0, 1, 4);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.blackIronBoots)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.blackIronHelmet)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.blackIronLeggings)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.torturedChainSword)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.dungeonEyeSword)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.golden_apple, 0, 4, 8, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.diamond, 0, 4, 8, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.ender_pearl, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.blaze_rod, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.emerald, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.ruby, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.amethyst, 0, 4, 8, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.crecentWand, 0, 1, 1, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.sapientWarWand, 0, 0, 1, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setRare(new ItemStack(Dungeons.frostySword)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicCoin, 0, 2, 4, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 2, 4, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setLegendary(new ItemStack(Dungeons.blackIronSword)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setLegendary(new ItemStack(Dungeons.blackIronBoots)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setLegendary(new ItemStack(Dungeons.dungeonEyeSword)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.setLegendary(new ItemStack(Dungeons.corruptedBow)), 0, 1, 1);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.cookie, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.cake, 0, 1, 2, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.wheat, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.golden_carrot, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.book, 0, 4, 16, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicPotion, 0, 1, 3, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.magicPotion2, 0, 1, 1, 10);
        montaneRichChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.experience_bottle, 0, 4, 8, 20);
        voidChest.addItem(stack);
        final ChestGenHooks beholderChest = ChestGenHooks.getInfo("Beholder");
        stack = new WeightedRandomChestContent(Dungeons.hadrialWand, 0, 1, 1, 100);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.lithium, 0, 5, 10, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.metalCoin, 0, 15, 30, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.voidCoin, 0, 5, 10, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.nether_star, 0, 1, 1, 100);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Items.nether_wart, 0, 5, 10, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.netherSteelShards, 0, 5, 10, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.corruptedSoul, 0, 5, 10, 50);
        beholderChest.addItem(stack);
        stack = new WeightedRandomChestContent(Dungeons.metalCoin, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.copper, 0, 2, 4, 2);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.amazonite, 0, 1, 2, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.castIron, 0, 1, 2, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.cookedTrollMeat, 0, 1, 2, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.magicCoin, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.graniteSword, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.whittler, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.botSword, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.mace, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.forceWand, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.pulseWand, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.poisonWand, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.magicGem, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.magicWand, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.poisonWand, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        ItemStack itemstack = new ItemStack(Dungeons.battleTome);
        itemstack.setItemDamage(2);
        stack = new WeightedRandomChestContent(itemstack, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        itemstack = new ItemStack(Dungeons.earthTome);
        itemstack.setItemDamage(4);
        stack = new WeightedRandomChestContent(itemstack, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.coppersword, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.amazoniteSword, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.rubySword, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.magicGem, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.cursedStone, 0, 1, 1, 1);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
        stack = new WeightedRandomChestContent(Dungeons.necroticAmulet, 0, 1, 1, 1);
        ChestGenHooks.addItem("dungeonChest", stack);
        ChestGenHooks.addItem("mineshaftCorridor", stack);
        ChestGenHooks.addItem("strongholdLibrary", stack);
        ChestGenHooks.addItem("pyramidDesertyChest", stack);
        ChestGenHooks.addItem("pyramidJungleChest", stack);
        ChestGenHooks.addItem("strongholdCrossing", stack);
        ChestGenHooks.addItem("strongholdCorridor", stack);
    }
}
