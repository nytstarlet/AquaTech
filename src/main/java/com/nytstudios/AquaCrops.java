package com.nytstudios;

import com.nytstudios.aquatech.CropBlocks;
import com.nytstudios.aquatech.CropBlocksSpecial;
import com.nytstudios.aquatech.Reference;
import com.nytstudios.aquatech.crops.BlueCoralCrop;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.HashMap;

/**
 * Created by Toph on 2/1/2017.
 */
public class AquaCrops {

    public static HashMap<CropBlocks, Item> seedsMap = new HashMap<CropBlocks, Item>();

    public static HashMap<CropBlocks, Item> harvestedItemMap = new HashMap<CropBlocks, Item>();


    public static HashMap<CropBlocksSpecial, Item> seedsMapSpecial = new HashMap<CropBlocksSpecial, Item>();

    public static HashMap<CropBlocksSpecial, Item> harvestedItemMapSpecial = new HashMap<CropBlocksSpecial, Item>();


    public static Block BlueCoral;

    public static Item BlueCoralSeeds;

    public static Item BlueCoralChunks;

    public static void init() {


        //BlueCoral = registerBlockCrop("BlueCoral");

       // BlueCoralSeeds = regSeeds("BlueCoralSeeds", BlueCoral);

        //BlueCoralChunks = regHarvestItem("BlueCoralChunks", BlueCoral);





    }




}


