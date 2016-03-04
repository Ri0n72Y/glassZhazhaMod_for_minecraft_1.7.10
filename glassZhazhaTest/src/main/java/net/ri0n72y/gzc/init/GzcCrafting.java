package net.ri0n72y.gzc.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.ri0n72y.gzc.block.GzcBlocks;
import net.ri0n72y.gzc.item.GzcItems;

public class GzcCrafting {
    public static Item helmet, chest, leggings, boots;
    public static void preInit() {
        GameRegistry.addRecipe(new ItemStack(GzcItems.toolGlassCutter, 1), " **", " X ", "X  ", '*', Items.diamond, 'X', Items.stick);
        GameRegistry.addRecipe(new ItemStack(GzcItems.armorGlassHelmet, 1), "###", "# #", '#', Blocks.glass_pane);
        GameRegistry.addRecipe(new ItemStack(GzcItems.armorGlassChest, 1), "# #", "###", "###", '#', Blocks.glass_pane);
        GameRegistry.addRecipe(new ItemStack(GzcItems.armorGlassLeggings, 1), "###", "# #", "# #", '#', Blocks.glass_pane);
        GameRegistry.addRecipe(new ItemStack(GzcItems.armorGlassBoots, 1), "# #", "# #", '#', Blocks.glass_pane);
//        GameRegistry.addRecipe(new ItemStack(GzcItems.itemGlassFragment, 4), "#", '#',Blocks.glass);
        GameRegistry.addRecipe(new ItemStack(GzcItems.itemGlassFragment, 4), "#", '#', GzcBlocks.gzcGlass);
        GameRegistry.addRecipe(new ItemStack(GzcBlocks.gzcPane, 16), "###", "###", '#', GzcBlocks.gzcGlass);

        for(int i = 0; i < 16; i++) {
            GameRegistry.addRecipe(new StainedGlassArmorRecipe(new ItemStack(GzcItems.armorStainedGlassHelmet,1),
                    "###",
                    "# #",
                    '#', new ItemStack(Blocks.stained_glass_pane, 1, i)));
            GameRegistry.addRecipe(new StainedGlassArmorRecipe(new ItemStack(GzcItems.armorStainedGlassChest,1),
                    "# #",
                    "###",
                    "###",
                    '#', new ItemStack(Blocks.stained_glass_pane, 1, i)));
            GameRegistry.addRecipe(new StainedGlassArmorRecipe(new ItemStack(GzcItems.armorStainedGlassLeggings,1),
                    "###",
                    "# #",
                    "# #",
                    '#', new ItemStack(Blocks.stained_glass_pane, 1, i)));
            GameRegistry.addRecipe(new StainedGlassArmorRecipe(new ItemStack(GzcItems.armorStainedGlassBoots,1),
                    "# #",
                    "# #",
                    '#', new ItemStack(Blocks.stained_glass_pane, 1, i)));
        }

    }
}
