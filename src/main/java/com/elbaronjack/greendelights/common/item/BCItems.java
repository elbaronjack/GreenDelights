package com.elbaronjack.greendelights.common.item;

import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.ModCreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class BCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);

    //Helper methods
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(ModCreativeModeTab.MOD_TAB);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(ModCreativeModeTab.MOD_TAB);
    }
    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(ModCreativeModeTab.MOD_TAB);
    }

    //Cactus
    public static final RegistryObject<Item> CACTUS_RUM = ITEMS.register("cactus_rum",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_RUM)));


    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
