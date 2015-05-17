package net.stegr.testmod.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.stegr.testmod.reference.Reference;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Konfiguration neu laden
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "testValue", true).getBoolean(true);

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
