package com.nytstudios.aquatech.init;

import com.nytstudios.aquatech.items.ItemCoralChunks;
import com.nytstudios.aquatech.items.Seeds.BlueCoralSeed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 2/1/2017.
 */
public class AquaSeeds {


    public static Item bluecoralseed;

    public static  void init(){
        bluecoralseed = new BlueCoralSeed(new ItemSeeds(AquaSeeds.bluecoralseed, Blocks.SAND), "bluecoralseed");


    }


    public static void register(){
        GameRegistry.register(bluecoralseed);

    }

    public static void registerRenders(){
        registerRender(bluecoralseed);

    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
