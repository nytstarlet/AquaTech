package com.nytstudios.aquatech;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.nytstudios.aquatech.item.NytItems;
import com.nytstudios.aquatech.proxy.CommonProxy;
import com.nytstudios.aquatech.tab.CreativeTab;

@Mod(modid = AquaTech.MODID, version = AquaTech.VERSION, name = AquaTech.NAME)
public class AquaTech
{
    public static final String MODID = "aquatech";
    public static final String VERSION = "1.0";
    public static final String NAME = "AquaTech";

    @SidedProxy(clientSide = "com.nytstudios.aquatech.proxy.ClientProxy", serverSide = "com.nytstudios.aquatech.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static AquaTech instance;

    public static com.nytstudios.aquatech.tab.CreativeTab creativeTab;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        creativeTab = new com.nytstudios.aquatech.tab.CreativeTab(CreativeTabs.getNextID(), "tab_creative");
        NytItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
