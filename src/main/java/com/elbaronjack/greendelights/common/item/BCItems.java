package com.elbaronjack.greendelights.common.item;

import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.common.item.BoozeItem;
import static umpaz.brewinandchewin.common.registry.BCItems.TANKARD;

public class BCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);

    //Cactus
    public static final RegistryObject<Item> CACTUS_RUM = ITEMS.register("cactus_rum",
            () -> new BoozeItem(3, 10, new Item.Properties().food(FoodValues.CACTUS_RUM).stacksTo(16).craftRemainder(TANKARD.get()).tab(ModCreativeModeTab.MOD_TAB)));

    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
