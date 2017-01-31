package com.nytstudios.aquatech.proxy;

import com.nytstudios.aquatech.block.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.nytstudios.aquatech.item.NytItems;
/**
 * Created by Toph on 1/30/2017.
 */
public class ClientProxy extends com.nytstudios.aquatech.proxy.CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Override
    public void init(FMLInitializationEvent event)
    {
        NytItems.registerRenders();
        ModBlocks.registerRenders();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
