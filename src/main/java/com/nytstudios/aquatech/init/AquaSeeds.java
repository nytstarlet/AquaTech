package com.nytstudios.aquatech.init;


import com.nytstudios.aquatech.AquaTechMain;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;


/**
 * Created by Toph on 2/1/2017.
 */
public class AquaSeeds extends ItemSeeds{


    public AquaSeeds(Block crops, Block sand, String regName) {

        super(crops, sand);

        this.setUnlocalizedName(regName);

        this.setCreativeTab(AquaTechMain.CREATIVE_TAB);

    }
}
