package com.nytstudios.aquatech.blocks;

import com.nytstudios.aquatech.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Toph on 1/30/2017.
 */
public class BlockCompressedCoralDust extends Block {

    public BlockCompressedCoralDust() {
        super(Material.SAND);
        setUnlocalizedName(Reference.AquaBlocks.COMPRESSEDCORALDUST.getUnlocalizedName());
        setRegistryName(Reference.AquaBlocks.COMPRESSEDCORALDUST.getRegistryName());
    }
}
