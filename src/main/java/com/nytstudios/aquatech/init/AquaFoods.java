package com.nytstudios.aquatech.init;



import com.nytstudios.aquatech.crops.Kelp;
import com.nytstudios.aquatech.items.ItemCoralChunks;
import com.nytstudios.aquatech.items.ItemCoralDust;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Created by Toph on 2/1/2017.
 */
public class AquaFoods{

    //public static Item coralchunks;
    public static Item kelp;




    public static  void init(){
       //coralchunks = new ItemCoralChunks();
        kelp = new Kelp();


    }


    public static void register(){
        //GameRegistry.register(coralchunks);
        GameRegistry.register(kelp);

    }

    public static void registerRenders(){
        //registerRender(coralchunks);
        registerRender(kelp);

    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
