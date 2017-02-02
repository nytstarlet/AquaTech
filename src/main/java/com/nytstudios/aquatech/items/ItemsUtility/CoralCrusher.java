package com.nytstudios.aquatech.items.ItemsUtility;

import com.nytstudios.aquatech.AquaTechMain;
import com.nytstudios.aquatech.Reference;
import net.minecraft.item.Item;


/**
 * Created by Toph on 2/2/2017.
 */
public class CoralCrusher extends Item {

    public CoralCrusher() {
        this.setMaxStackSize(1);
        this.setMaxDamage(238);
        this.setCreativeTab(AquaTechMain.CREATIVE_TAB);

        setUnlocalizedName(Reference.AquaItems.CORALCRUSHER.getUnlocalizedName());
        setRegistryName(Reference.AquaItems.CORALCRUSHER.getRegistryName());
        setCreativeTab(AquaTechMain.CREATIVE_TAB);
    }



}
