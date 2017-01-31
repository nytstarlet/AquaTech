package com.nytstudios.aquatech.block;

import com.nytstudios.aquatech.AquaTech;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by Toph on 1/30/2017.
 */
public class CoralBedBlock extends Block {

    public CoralBedBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(AquaTech.creativeTab);
        this.setHardness(3F);
        this.setResistance(10F);
        this.setSoundType(SoundType.SAND);

    }
}
