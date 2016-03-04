package net.ri0n72y.gzc.block;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;
import net.ri0n72y.gzc.item.GzcItems;

import java.util.Random;

public class BlockGzcPane extends BlockPane {
    public BlockGzcPane(String string, String s, Material material, Boolean bool)
    {
        super(string, s, material, bool);
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
