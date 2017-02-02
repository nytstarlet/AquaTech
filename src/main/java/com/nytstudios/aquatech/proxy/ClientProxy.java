package com.nytstudios.aquatech.proxy;

import com.nytstudios.AquaCrops;
import com.nytstudios.aquatech.init.AquaFoods;
import com.nytstudios.aquatech.init.AquaSeeds;
import com.nytstudios.aquatech.init.ModBlocks;
import com.nytstudios.aquatech.init.ModItems;

/**
 * Created by Toph on 1/30/2017.
 */


public class ClientProxy implements CommonProxy{


    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
        AquaFoods.registerRenders();
        AquaSeeds.registerRenders();



    }
}
