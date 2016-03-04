package net.ri0n72y.gzc.item;


import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;


public class ItemGlassArmor extends ItemArmor
{

    public ItemGlassArmor(ArmorMaterial material,int par1, int par2)
    {
        super(material,par1, par2);
        this.setCreativeTab(GzcCreativeTabs.INSTANCE);
    }


    @Override
    public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type)
    {
        if(stack.getItem() == GzcItems.armorGlassLeggings)
            return "gzc:textures/armor/glass_layer_2.png";
        else
            return "gzc:textures/armor/glass_layer_1.png";
    }


}
