package com.elbaronjack.greendelights.common.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.ModCreativeModeTab;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.PopsicleItem;
import com.elbaronjack.greendelights.common.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);

    //Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties().tab(ModCreativeModeTab.MOD_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(ModCreativeModeTab.MOD_TAB);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(ModCreativeModeTab.MOD_TAB);
    }
    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(ModCreativeModeTab.MOD_TAB);
    }

    //Crates
    public static final RegistryObject<Item> CACTUS_CRATE = ITEMS.register("cactus_crate",
            () -> new BlockItem(ModBlocks.CACTUS_CRATE.get(), basicItem()));

    //Cactus
    public static final RegistryObject<Item> CACTUS_PEELED = ITEMS.register("cactus_peeled",
            () -> new Item(foodItem(FoodValues.CACTUS_PEELED)));

    public static final RegistryObject<Item> CACTUS_DRIED = ITEMS.register("cactus_dried",
            () -> new Item(foodItem(FoodValues.CACTUS_DRIED)));

    public static final RegistryObject<Item> CACTUS_SANDWICH = ITEMS.register("cactus_sandwich",
            () -> new Item(foodItem(FoodValues.CACTUS_SANDWICH)));

    public static final RegistryObject<Item> CACTUS_STICK = ITEMS.register("cactus_stick",
            () -> new Item(foodItem(FoodValues.CACTUS_STICK)));

    public static final RegistryObject<Item> CACTUS_JUICE = ITEMS.register("cactus_juice",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_JUICE)));

    public static final RegistryObject<Item> CACTUS_COLA = ITEMS.register("cactus_cola",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_COLA)));

    //Bamboo
    public static final RegistryObject<Item> BAMBOO_BEEF = ITEMS.register("bamboo_beef",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_BEEF), true));

    public static final RegistryObject<Item> BAMBOO_RICE = ITEMS.register("bamboo_rice",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_RICE), true));

    public static final RegistryObject<Item> BAMBOO_PASTA = ITEMS.register("bamboo_pasta",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_PASTA), true));

    //Slime
    public static final RegistryObject<Item> SLIME_BREAD = ITEMS.register("slime_bread",
            () -> new Item(foodItem(FoodValues.SLIME_BREAD)));

    public static final RegistryObject<Item> SLIME_POPSICLE = ITEMS.register("slime_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.SLIME_POPSICLE)));

    public static final RegistryObject<Item> SLIME_MOUSSE = ITEMS.register("slime_mousse",
            () -> new DrinkableItem(foodItem(FoodValues.SLIME_MOUSSE).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));

    public static final RegistryObject<Item> SLIME_JELLY_BLOCK = ITEMS.register("slime_jelly_block",
            () -> new BlockItem(ModBlocks.SLIME_JELLY_BLOCK.get(), basicItem().stacksTo(1)));

    public static final RegistryObject<Item> SLIME_JELLY = ITEMS.register("slime_jelly",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SLIME_JELLY), true));

    //Sweets
    public static final RegistryObject<Item> CREEPER_COOKIE = ITEMS.register("creeper_cookie",
            () -> new Item(foodItem(FoodValues.CREEPER_COOKIE)));

    //Salads
    public static final RegistryObject<Item> SEA_SALAD = ITEMS.register("sea_salad",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SEA_SALAD), true));


    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
