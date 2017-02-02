package com.nytstudios.aquatech.init;

import com.nytstudios.aquatech.AquaTechMain;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

/**
 * Created by Toph on 2/2/2017.
 */
public class AquaSeedsSpecial extends ItemSeeds{

    public AquaSeedsSpecial(Block crops, Block sand, String regName) {

        super(crops, sand);

        this.setUnlocalizedName(regName);

        this.setCreativeTab(AquaTechMain.CREATIVE_TAB);

    }

}
