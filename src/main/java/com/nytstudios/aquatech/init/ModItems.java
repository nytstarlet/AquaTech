package com.nytstudios.aquatech.init;

import com.nytstudios.aquatech.Reference;
import com.nytstudios.aquatech.items.ItemCoralChunks;
import com.nytstudios.aquatech.items.ItemCoralDust;
import com.nytstudios.aquatech.items.ItemCoralDustBlue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toph on 1/30/2017.
 */
public class ModItems {

    public static Item coraldust;
    public static Item coraldustblue;
    public static Item coralchunks;

    public static  void init(){
        coraldust = new ItemCoralDust();
        coraldustblue = new ItemCoralDustBlue();
        coralchunks = new ItemCoralChunks();

    }


    public static void register(){
        GameRegistry.register(coraldust);
        GameRegistry.register((coraldustblue));
        GameRegistry.register((coralchunks));
    }

    public static void registerRenders(){
        registerRender(coraldust);
        registerRender(coraldustblue);
        registerRender(coralchunks);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
