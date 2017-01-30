package com.nytstudios.aquatech.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Toph on 1/16/2017.
 */
public class CreativeTab extends CreativeTabs {


    public CreativeTab(int index, String label){
        super(index, label);

    }

    @Override
    public Item getTabIconItem() {
        return Items.APPLE;
    }
}