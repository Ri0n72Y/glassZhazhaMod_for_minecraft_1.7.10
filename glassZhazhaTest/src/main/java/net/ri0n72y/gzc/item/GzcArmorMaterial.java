package net.ri0n72y.gzc.item;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class GzcArmorMaterial
{
    public static ItemArmor.ArmorMaterial armorGlass = EnumHelper.addArmorMaterial("armorGlass", 3, new int[]{2, 3, 2, 1}, 18) ;
    public static ItemArmor.ArmorMaterial armorStainedGlass = EnumHelper.addArmorMaterial("armorStainedGlass", 3, new int[] {2, 3, 2, 1}, 18);
    public static ItemArmor.ArmorMaterial armorGlassFragment = EnumHelper.addArmorMaterial("armorGlassFragment", 3, new int[] {1, 2, 1, 1}, 8);

}
