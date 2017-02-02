package com.nytstudios.aquatech.items;

import com.nytstudios.aquatech.AquaTechMain;
import com.nytstudios.aquatech.AquaTechTab;
import com.nytstudios.aquatech.Reference;
import net.minecraft.item.Item;

/**
 * Created by Toph on 1/30/2017.
 */
public class ItemCoralDust extends Item {


    public ItemCoralDust(){
        setUnlocalizedName(Reference.AquaItems.CORALDUST.getUnlocalizedName());
        setRegistryName(Reference.AquaItems.CORALDUST.getRegistryName());
        setCreativeTab(AquaTechMain.CREATIVE_TAB);
    }

}
