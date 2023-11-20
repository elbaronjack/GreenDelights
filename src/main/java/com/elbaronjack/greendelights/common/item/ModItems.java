package com.elbaronjack.greendelights.common.item;

import com.google.common.collect.Sets;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.elbaronjack.greendelights.GreenDelights;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.PopsicleItem;
import com.elbaronjack.greendelights.common.block.ModBlocks;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenDelights.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    //Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    //Crates
    public static final RegistryObject<Item> CACTUS_CRATE = registerWithTab("cactus_crate",
            () -> new BlockItem(ModBlocks.CACTUS_CRATE.get(), basicItem()));

    //Cactus
    public static final RegistryObject<Item> CACTUS_PEELED = registerWithTab("cactus_peeled",
            () -> new Item(foodItem(FoodValues.CACTUS_PEELED)));

    public static final RegistryObject<Item> CACTUS_DRIED = registerWithTab("cactus_dried",
            () -> new Item(foodItem(FoodValues.CACTUS_DRIED)));

    public static final RegistryObject<Item> CACTUS_SANDWICH = registerWithTab("cactus_sandwich",
            () -> new Item(foodItem(FoodValues.CACTUS_SANDWICH)));

    public static final RegistryObject<Item> CACTUS_STICK = registerWithTab("cactus_stick",
            () -> new Item(foodItem(FoodValues.CACTUS_STICK)));

    public static final RegistryObject<Item> CACTUS_JUICE = registerWithTab("cactus_juice",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_JUICE)));

    public static final RegistryObject<Item> CACTUS_COLA = registerWithTab("cactus_cola",
            () -> new DrinkableItem(foodItem(FoodValues.CACTUS_COLA)));

    //Bamboo
    public static final RegistryObject<Item> BAMBOO_BEEF = registerWithTab("bamboo_beef",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_BEEF), true));

    public static final RegistryObject<Item> BAMBOO_RICE = registerWithTab("bamboo_rice",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_RICE), true));

    public static final RegistryObject<Item> BAMBOO_PASTA = registerWithTab("bamboo_pasta",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BAMBOO_PASTA), true));

    //Slime
    public static final RegistryObject<Item> SLIME_BREAD = registerWithTab("slime_bread",
            () -> new Item(foodItem(FoodValues.SLIME_BREAD)));

    public static final RegistryObject<Item> SLIME_POPSICLE = registerWithTab("slime_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.SLIME_POPSICLE)));

    public static final RegistryObject<Item> SLIME_MOUSSE = registerWithTab("slime_mousse",
            () -> new DrinkableItem(foodItem(FoodValues.SLIME_MOUSSE).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));

    public static final RegistryObject<Item> SLIME_JELLY_BLOCK = registerWithTab("slime_jelly_block",
            () -> new BlockItem(ModBlocks.SLIME_JELLY_BLOCK.get(), basicItem().stacksTo(1)));

    public static final RegistryObject<Item> SLIME_JELLY = registerWithTab("slime_jelly",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SLIME_JELLY), true));

    //Sweets
    public static final RegistryObject<Item> CREEPER_COOKIE = registerWithTab("creeper_cookie",
            () -> new Item(foodItem(FoodValues.CREEPER_COOKIE)));

    //Salads
    public static final RegistryObject<Item> SEA_SALAD = registerWithTab("sea_salad",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SEA_SALAD), true));


    //Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
