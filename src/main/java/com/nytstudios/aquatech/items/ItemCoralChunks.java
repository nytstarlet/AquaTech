package com.nytstudios.aquatech.items;

import com.nytstudios.aquatech.AquaTechMain;
import com.nytstudios.aquatech.Reference;
import net.minecraft.item.Item;

/**
 * Created by Toph on 2/1/2017.
 */
public class ItemCoralChunks extends Item {


    public ItemCoralChunks(){
        setUnlocalizedName(Reference.AquaFoods.CORALCHUNKS.getUnlocalizedName());
        setRegistryName(Reference.AquaFoods.CORALCHUNKS.getRegistryName());
        setCreativeTab(AquaTechMain.CREATIVE_TAB);
    }
}
