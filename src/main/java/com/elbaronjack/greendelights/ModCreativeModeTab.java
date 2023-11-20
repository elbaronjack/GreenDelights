package com.elbaronjack.greendelights;

import com.elbaronjack.greendelights.common.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GreenDelights.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_TABS.register(GreenDelights.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.greendelights"))
                    .icon(() -> new ItemStack(ModItems.SLIME_MOUSSE.get()))
                    .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());
}
