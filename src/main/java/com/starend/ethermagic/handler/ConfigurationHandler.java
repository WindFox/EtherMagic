package com.starend.ethermagic.handler;

import com.starend.ethermagic.reference.Reference;
import com.starend.ethermagic.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * FML Configuration Handler
 * Created by windfox on 8/27/2014.
 */
public class ConfigurationHandler {
    public static Configuration configuration;

    public static boolean configValue = false;
    public static boolean configValue2 = false;


    public static void init(File configFile){
        // Create the config object from the given config file
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        try{
            // Load the config file
            configuration.load();

            // Read the config file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example Value").getBoolean(true);
            configValue2 = configuration.get("Fish", "configValue2", true, "Example Value 2").getBoolean(true);
        }
        catch (Exception e){
            // Log Exception
        }
        finally{
            // Save the config file
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }

        LogHelper.info("Config Test: " + configValue);
        LogHelper.info("Fish: " + configValue2);
    }
}
