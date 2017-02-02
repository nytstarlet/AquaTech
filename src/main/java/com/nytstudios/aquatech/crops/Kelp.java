package com.nytstudios.aquatech.crops;

import com.nytstudios.aquatech.AquaTechMain;
import com.nytstudios.aquatech.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

/**
 * Created by Toph on 2/2/2017.
 */
public class Kelp extends ItemFood {

    public Kelp() {
        super(4, 1.0F, false);
        setUnlocalizedName(Reference.AquaFoods.KELP.getUnlocalizedName());
        setRegistryName(Reference.AquaFoods.KELP.getRegistryName());
        setCreativeTab(AquaTechMain.CREATIVE_TAB);
    }
}
