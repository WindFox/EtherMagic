package com.starend.ethermagic.item;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by windfox on 8/27/2014.
 */
public class ItemHashbrown extends ItemEM{
    public ItemHashbrown(){
        super();
        this.setUnlocalizedName("hashbrown");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.maxStackSize = 64;
    }
}
