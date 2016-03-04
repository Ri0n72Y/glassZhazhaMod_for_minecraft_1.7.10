package net.ri0n72y.gzc.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GzcBlocks {
    public static Block
            gzcGlass,
            gzcPane,
            gzcStainedGlass,
            gzcStainedPane;

    public static void preInit()
    {
        gzcGlass = new BlockGzcGlass(Material.glass, false).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("glass").setBlockTextureName("glass");
        gzcPane = new BlockGzcPane("glass", "glass_pane_top", Material.glass, false).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("thinGlass");
        gzcStainedGlass = new BlockGzcStainedGlass((Material.glass)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("stainedGlass").setBlockTextureName("glass");
        gzcStainedPane = new BlockGzcStainedPane().setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("thinStainedGlass").setBlockTextureName("glass");

        GameRegistry.registerBlock(gzcGlass, "glass");
        GameRegistry.registerBlock(gzcPane, "glass_pane");
        GameRegistry.registerBlock(gzcStainedGlass, "stained_glass");
        GameRegistry.registerBlock(gzcStainedPane, "stained_glass_pane");
    }
}
