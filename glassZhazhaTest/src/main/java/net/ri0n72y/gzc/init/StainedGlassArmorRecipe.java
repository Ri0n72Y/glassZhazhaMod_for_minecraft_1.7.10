package net.ri0n72y.gzc.init;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Thanks for SlashBlade by Flammpfeil so much!
 */
public class StainedGlassArmorRecipe extends ShapedOreRecipe{

//    public static final String[] colorA = {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
//    public static final String[] colorB = {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
//    public static final int[] colorNum = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};
    public static final int[] colorNumGlass = new int[] {1644825, 10040115, 6717235, 6704179, 3361970, 8339378, 5013401, 10066329, 5000268, 15892389, 8375321, 15066419, 6724056, 11685080, 14188339, 16777215};

    public StainedGlassArmorRecipe(ItemStack result, Object... recipe)
    {
        super(result, recipe);
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting par1)
    {
        ItemStack result = super.getCraftingResult(par1);
        boolean sign = false;

        int i;i = 0;
        while (!sign && i < 9)
        {
            i++;
            ItemStack pane = par1.getStackInSlot(i);
            if(pane != null)
            {
                int num = pane.getItemDamage();
                NBTTagCompound tag = new NBTTagCompound();
                result.setTagCompound(tag);

                NBTTagCompound tag2 = tag.getCompoundTag("display");
                if(!tag.hasKey("display", 10)) {
                    tag.setTag("display", tag2);
                }

                tag2.setInteger("color", colorNumGlass[15-num]);

                result.setTagCompound(tag);
                sign = true;
            }
        }
        return result;
    }

}
