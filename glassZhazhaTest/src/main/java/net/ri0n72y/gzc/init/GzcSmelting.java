package net.ri0n72y.gzc.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.ri0n72y.gzc.block.GzcBlocks;
import net.ri0n72y.gzc.item.GzcItems;

public class GzcSmelting {
    public static void preInit() {
        GameRegistry.addSmelting(Blocks.sand, new ItemStack(Item.getItemFromBlock(GzcBlocks.gzcGlass)), 0.1f);

        }
}
