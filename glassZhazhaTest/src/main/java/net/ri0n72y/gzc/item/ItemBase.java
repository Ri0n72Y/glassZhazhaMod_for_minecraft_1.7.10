package net.ri0n72y.gzc.item;

import net.minecraft.item.Item;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;

/**
 * Created by dell01 on 2016/1/10.
 */
public class ItemBase extends Item
{
    public ItemBase()
    {
        this.setMaxStackSize(64)
                .setCreativeTab(GzcCreativeTabs.INSTANCE);
    }

}
