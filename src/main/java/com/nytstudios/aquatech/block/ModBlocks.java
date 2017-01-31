package com.nytstudios.aquatech.block;

import com.nytstudios.aquatech.AquaTech;
import com.nytstudios.aquatech.item.ItemNytItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 1/30/2017.
 */
public class ModBlocks {

    public static Block nytBlock;

    public static void preInit() {

        nytBlock = new CoralBedBlock(Material.GROUND, "coral_bed");

        registerBlocks();
    }

    public static void registerBlocks() {
        registerBlock(nytBlock, "coral_bed");
    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block, new ResourceLocation(AquaTech.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(AquaTech.MODID, name));
    }

    public static void registerRenders() {

        registerRender(nytBlock);
    }




    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AquaTech.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}