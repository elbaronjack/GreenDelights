package com.elbaronjack.greendelights.common.block;

import com.elbaronjack.greendelights.GreenDelights;
import com.elbaronjack.greendelights.common.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
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
    public static final RegistryObject<Block> CACTUS_CRATE = registerBlock("cactus_crate_block",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Feasts
    public static final RegistryObject<Block> SLIME_JELLY_BLOCK = registerBlock("slime_jelly_block",
            () -> new FeastBlock(Block.Properties.copy(Blocks.SLIME_BLOCK), ModItems.SLIME_JELLY_SLICE, true));

    //Constructors
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Register
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
