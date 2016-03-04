package net.ri0n72y.gzc.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;
import net.ri0n72y.gzc.item.GzcItems;

import java.util.Random;

public class BlockGzcGlass extends BlockGlass {
    public BlockGzcGlass(Material material, boolean bool) {
        super(material, bool);
        this.setCreativeTab(GzcCreativeTabs.INSTANCE);
    }

    @Override
    public Item getItemDropped(int n, Random random, int m)
    {
        return GzcItems.itemGlassFragment;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return random.nextInt(8) % 7 + 2;
    }
}
