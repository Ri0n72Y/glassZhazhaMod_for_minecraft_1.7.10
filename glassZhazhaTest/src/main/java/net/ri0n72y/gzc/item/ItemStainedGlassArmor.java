package net.ri0n72y.gzc.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;

public class ItemStainedGlassArmor extends ItemArmor{

    public ItemStainedGlassArmor(ItemArmor.ArmorMaterial material,int par1, int par2)
    {
        super(material, par1, par2);
        this.setCreativeTab(GzcCreativeTabs.INSTANCE);
    }
    ItemArmor.ArmorMaterial material = getArmorMaterial();

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return (this.material == ItemArmor.ArmorMaterial.CLOTH ||this.material == GzcArmorMaterial.armorStainedGlass);
    }

    @Override
    public boolean hasColor(ItemStack p_82816_1_) {
        return true;
    }

    @Override
    public int getColor(ItemStack p_82814_1_) {
        if(this.material != ItemArmor.ArmorMaterial.CLOTH || this.material != GzcArmorMaterial.armorStainedGlass) {
            return -1;
        } else {
            NBTTagCompound nbttagcompound = p_82814_1_.getTagCompound();
            if(nbttagcompound == null) {
                return 10511680;
            } else {
                NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
                return nbttagcompound1 == null?10511680:(nbttagcompound1.hasKey("color", 3)?nbttagcompound1.getInteger("color"):10511680);
            }
        }
    }


    @Override
    public void removeColor(ItemStack p_82815_1_) {
        if(this.material == ItemArmor.ArmorMaterial.CLOTH || this.material != GzcArmorMaterial.armorStainedGlass) {
            NBTTagCompound nbttagcompound = p_82815_1_.getTagCompound();
            if(nbttagcompound != null) {
                NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
                if(nbttagcompound1.hasKey("color")) {
                    nbttagcompound1.removeTag("color");
                }
            }
        }

    }

    @Override
    public void func_82813_b(ItemStack p_82813_1_, int p_82813_2_) {
        if(this.material != ItemArmor.ArmorMaterial.CLOTH && this.material!=GzcArmorMaterial.armorStainedGlass) {
            throw new UnsupportedOperationException("Can\'t dye!");
        } else {
            NBTTagCompound nbttagcompound = p_82813_1_.getTagCompound();
            if(nbttagcompound == null) {
                nbttagcompound = new NBTTagCompound();
                p_82813_1_.setTagCompound(nbttagcompound);
            }

            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if(!nbttagcompound.hasKey("display", 10)) {
                nbttagcompound.setTag("display", nbttagcompound1);
            }

            nbttagcompound1.setInteger("color", p_82813_2_);
        }
    }


    @Override
    public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type)
    {
        if(stack.getItem() == GzcItems.armorStainedGlassLeggings)
            return "gzc:textures/armor/stained_glass_layer_2.png";
        else
            return "gzc:textures/armor/stained_glass_layer_1.png";
    }
}
