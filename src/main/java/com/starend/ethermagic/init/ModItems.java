package com.starend.ethermagic.init;

import com.starend.ethermagic.item.ItemEM;
import com.starend.ethermagic.item.ItemHashbrown;
import com.starend.ethermagic.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Item Importing Wrapper
 * Created by windfox on 8/27/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemEM hashbrown = new ItemHashbrown();

    public static void init(){
        GameRegistry.registerItem(hashbrown, "Hashbrown");
    }
}
