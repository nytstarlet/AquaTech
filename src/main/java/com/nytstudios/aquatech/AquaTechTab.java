package com.nytstudios.aquatech;

import com.nytstudios.aquatech.init.ModItems;
import com.nytstudios.aquatech.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Toph on 1/31/2017.
 */
public class AquaTechTab extends CreativeTabs {

    public AquaTechTab() {
        super("aquaTechTab");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.coraldust;
    }
}
