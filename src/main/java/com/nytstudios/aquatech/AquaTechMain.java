package com.nytstudios.aquatech;

import com.nytstudios.aquatech.init.ModBlocks;
import com.nytstudios.aquatech.init.ModItems;
import com.nytstudios.aquatech.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Toph on 1/30/2017.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class AquaTechMain {

    @Instance

    public static AquaTechMain instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){

        proxy.init();


    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){



    }
}
