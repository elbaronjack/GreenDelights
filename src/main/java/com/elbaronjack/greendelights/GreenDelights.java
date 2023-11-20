package com.elbaronjack.greendelights;

import com.elbaronjack.greendelights.common.block.ModBlocks;
import com.elbaronjack.greendelights.common.item.BCItems;
import com.elbaronjack.greendelights.common.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//Let's make compatibilities for mods! Use: 'areModsLoaded(String...)'
import com.elbaronjack.greendelights.util.CompatUtils;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GreenDelights.MOD_ID)
//Main class of the mod
public class GreenDelights
{
    public static final String MOD_ID = "greendelights";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GreenDelights() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        if(CompatUtils.areModsLoaded("brewinandchewin")) BCItems.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
