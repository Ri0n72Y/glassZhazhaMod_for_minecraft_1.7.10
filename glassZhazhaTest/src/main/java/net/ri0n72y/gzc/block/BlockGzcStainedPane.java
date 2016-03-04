package net.ri0n72y.gzc.block;

import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;
import net.ri0n72y.gzc.item.GzcItems;

import java.util.Random;

public class BlockGzcStainedPane extends BlockStainedGlassPane {

    public BlockGzcStainedPane()
    {
        this.setCreativeTab(GzcCreativeTabs.INSTANCE);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return GzcItems.itemGlassFragment;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return random.nextInt(3);
    }

}
