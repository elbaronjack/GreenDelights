package com.elbaronjack.greendelights;

import com.elbaronjack.greendelights.common.block.ModBlocks;
import com.elbaronjack.greendelights.common.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTab.CREATIVE_TABS.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
