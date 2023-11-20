package com.elbaronjack.greendelights.common.block;

import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.common.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GreenDelights.MOD_ID);

    //Crates
    public static final RegistryObject<Block> CACTUS_CRATE = BLOCKS.register("cactus_crate",
            () -> new Block(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Feasts
    public static final RegistryObject<Block> SLIME_JELLY_BLOCK = BLOCKS.register("slime_jelly_block",
            () -> new FeastBlock(Block.Properties.copy(Blocks.SLIME_BLOCK), ModItems.SLIME_JELLY, true));

    //Constructors
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn =  BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    //Register
    public  static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
