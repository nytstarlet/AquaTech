package com.nytstudios.aquatech.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 2/1/2017.
 */
public class BlueCoralCrop extends BlockCrops{

public BlueCoralCrop() {

    setRegistryName("blue_coral_crop");
    GameRegistry.register(this);
    GameRegistry.register(new ItemBlock(this), getRegistryName());


}

        @Override
        protected Item getSeed() {
            return super.getSeed();
        }

        @Override
        protected Item getCrop() {
            return super.getCrop();
        }



}
