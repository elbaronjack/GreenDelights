package com.elbaronjack.greendelights.item;

import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);

    //Custom items
    public static final RegistryObject<SwordItem> CUTLASS_IRON = ITEMS.register("cutlass_iron",
            () -> new SwordItem(Tiers.IRON, 2, -2.2F, new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
