package com.nytstudios.aquatech.init;


import com.nytstudios.aquatech.blocks.BlockCompressedCoralDust;
import com.nytstudios.aquatech.blocks.chests.AquaChest;
import com.nytstudios.aquatech.blocks.machines.AquaFurnace;
import com.nytstudios.aquatech.blocks.machines.AquaFurnaceOn;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 1/30/2017.
 */
public class ModBlocks {


    public static Block compressedcoraldust;
    public static Block aquablocks;
    public static Block aquafurnace;
    public static Block aquafurnaceon;

    public static  void init(){
        compressedcoraldust = new BlockCompressedCoralDust();
        aquablocks = new AquaChest();
        aquafurnace = new AquaFurnaceOn(false, "aquafurnace");
        aquafurnaceon = new AquaFurnaceOn(true, "aquafurnaceon");


    }


    public static void register(){
       registerBlock(compressedcoraldust);
       registerBlock(aquablocks);

       registerBlock(aquafurnaceon);
    }


    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(compressedcoraldust);
        registerRender(aquablocks);

        registerRender(aquafurnaceon);

    }

    public static void registerRender(Block block){


        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
