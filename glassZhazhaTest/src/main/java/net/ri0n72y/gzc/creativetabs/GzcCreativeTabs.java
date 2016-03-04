package net.ri0n72y.gzc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.ri0n72y.gzc.gzcMain;
import net.ri0n72y.gzc.item.GzcItems;

/**learnt from Darkyoooooo
 * Thanks
 */

public class GzcCreativeTabs extends CreativeTabs
{
    public static final GzcCreativeTabs INSTANCE = new GzcCreativeTabs();

    public GzcCreativeTabs()
    {
        super("GlassZhazhaCraft");
    }

    @Override
    public Item getTabIconItem()
    {
        return getIconItemStack().getItem();
    }

    @Override
    public ItemStack getIconItemStack()
    {
        return new ItemStack(GzcItems.itemGlassFragment);
    }

}
