package com.starend.ethermagic.init;

import com.starend.ethermagic.block.BlockEM;
import com.starend.ethermagic.block.BlockFat;
import com.starend.ethermagic.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Block Importing Wrapper
 * Created by windfox on 8/28/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockEM fat = new BlockFat();

    public static void init(){
        GameRegistry.registerBlock(fat, "fat");
    }
}
