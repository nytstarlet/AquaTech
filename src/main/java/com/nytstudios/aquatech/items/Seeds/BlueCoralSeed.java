package com.nytstudios.aquatech.items.Seeds;

import com.nytstudios.aquatech.AquaTechMain;
import com.nytstudios.aquatech.Reference;
import net.minecraft.item.Item;

/**
 * Created by Toph on 2/2/2017.
 */
public class BlueCoralSeed extends Item {

    public BlueCoralSeed(){
        setUnlocalizedName(Reference.AquaSeeds.BLUECORALSEEDS.getUnlocalizedName());
        setRegistryName(Reference.AquaSeeds.BLUECORALSEEDS.getRegistryName());
        setCreativeTab(AquaTechMain.CREATIVE_TAB);
    }
}
