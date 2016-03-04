package net.ri0n72y.gzc.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.ri0n72y.gzc.creativetabs.GzcCreativeTabs;

public class GzcItems {

    public static Item
            itemGlassFragment,
            armorGlassHelmet,
            armorGlassChest,
            armorGlassLeggings,
            armorGlassBoots,
            toolGlassCutter,
            armorStainedGlassHelmet,
            armorStainedGlassChest,
            armorStainedGlassLeggings,
            armorStainedGlassBoots;

    public static void preInit()
    {
        itemGlassFragment = new ItemBase().setUnlocalizedName("itemGlassFragment").setTextureName("gzc:itemGlassFragment");


        armorGlassHelmet = new ItemGlassArmor(GzcArmorMaterial.armorGlass, 0, 0).setUnlocalizedName("itemGlassHelmet").setTextureName("gzc:itemGlassHelmet");
        armorGlassChest = new ItemGlassArmor(GzcArmorMaterial.armorGlass, 0, 1).setUnlocalizedName("itemGlassChest").setTextureName("gzc:itemGlassChest");
        armorGlassLeggings = new ItemGlassArmor(GzcArmorMaterial.armorGlass, 0, 2).setUnlocalizedName("itemGlassLeggings").setTextureName("gzc:itemGlassLeggings");
        armorGlassBoots = new ItemGlassArmor(GzcArmorMaterial.armorGlass,0, 3).setUnlocalizedName("itemGlassBoots").setTextureName("gzc:itemGlassBoots");
        armorStainedGlassHelmet = new ItemStainedGlassArmor(GzcArmorMaterial.armorStainedGlass, 0, 0).setUnlocalizedName("itemStainedGlassHelmet").setTextureName("gzc:itemStainedGlassHelmet");
        armorStainedGlassChest = new ItemStainedGlassArmor(GzcArmorMaterial.armorStainedGlass, 0, 1).setUnlocalizedName("itemStainedGlassChest").setTextureName("gzc:itemStainedGlassChest");
        armorStainedGlassLeggings = new ItemStainedGlassArmor(GzcArmorMaterial.armorStainedGlass, 0, 2).setUnlocalizedName("itemStainedGlassLeggings").setTextureName("gzc:itemStainedGlassLeggings");
        armorStainedGlassBoots = new ItemStainedGlassArmor(GzcArmorMaterial.armorStainedGlass, 0, 3).setUnlocalizedName("itemStainedGlassBoots").setTextureName("gzc:itemStainedGlassBoots");

        toolGlassCutter = new itemGlassCutter().setUnlocalizedName("itemGlassCutter").setTextureName("gzc:itemGlassCutter").setCreativeTab(GzcCreativeTabs.INSTANCE);

        GameRegistry.registerItem(armorGlassHelmet, "itemGlassHelmet", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorGlassChest, "itemGlassChest", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorGlassLeggings, "itemGlassLeggings", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorGlassBoots, "itemGlassBoots", "Glass Zhazha Craft");
/*        GameRegistry.registerItem(armorStainedGlassHelmet,"itemStainedGlassHelmet", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorStainedGlassChest,"itemStainedGlassChest", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorStainedGlassLeggings,"itemStainedGlassLeggings", "Glass Zhazha Craft");
        GameRegistry.registerItem(armorStainedGlassBoots,"itemStainedGlassBoots", "Glass Zhazha Craft");*/

        GameRegistry.registerItem(itemGlassFragment, "itemGlassFragment", "Glass Zhazha Craft");
        GameRegistry.registerItem(toolGlassCutter, "itemGlassCutter", "Glass Zhazha Craft");
    }
}
