package net.ri0n72y.gzc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.ri0n72y.gzc.block.GzcBlocks;
import net.ri0n72y.gzc.init.GzcCrafting;
import net.ri0n72y.gzc.init.GzcSmelting;
import net.ri0n72y.gzc.item.GzcItems;



@Mod(
        modid = gzcMain.modid ,
        name = "GlassZhazhaCraft" ,
        version = gzcMain.version
)

public class gzcMain
{
    public static final String modid = "Glass Zhazha Craft";
    public static final String version = "0.0.1 - Minecraft 1.7.10";



    @Mod.EventHandler
    public  void preLoad(FMLPreInitializationEvent event)
    {
        //===========Registry===========
        GzcItems.preInit();//Registry Items
        GzcBlocks.preInit();//Registry Blocks
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        GzcCrafting.preInit();
        GzcSmelting.preInit();
    }

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent event)
    {

    }
}
