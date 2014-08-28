package com.starend.ethermagic.item;

import net.minecraft.creativetab.CreativeTabs;

/**
 * #Hashbrown
 * An advanced potato item.
 * Added as a nod to my sister, Katie. (It was kinda her idea.)
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
