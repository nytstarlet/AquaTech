package com.nytstudios.aquatech.item;

import com.nytstudios.aquatech.AquaTech;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 1/30/2017.
 */
public class NytItems {

    public static Item nytSponge;

    public static void preInit() {

        nytSponge = new ItemNytItems("nyt_sponge");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(nytSponge, new ResourceLocation(AquaTech.MODID, "nyt_sponge"));
    }

    public static void registerRenders() {
        registerRender(nytSponge);
    }




    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AquaTech.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}