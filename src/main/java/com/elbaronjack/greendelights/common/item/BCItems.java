package com.elbaronjack.greendelights.common.item;


import com.google.common.collect.Sets;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.elbaronjack.greendelights.GreenDelights;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class BCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    //Helper methods
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    //Cactus
    public static final RegistryObject<Item> CACTUS_RUM = registerWithTab("cactus_rum",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_RUM)));

    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}