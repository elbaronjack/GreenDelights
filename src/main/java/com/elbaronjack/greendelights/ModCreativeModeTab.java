package com.elbaronjack.greendelights;

import com.elbaronjack.greendelights.common.item.BCItems;
import com.elbaronjack.greendelights.common.item.ModItems;
import com.elbaronjack.greendelights.util.CompatUtils;
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
                    .displayItems((parameters, output) -> {
                        // Add main mod items
                        ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get()));

                        // Add Brewin' and Chewin' compatibility items if mod is present
                        if (CompatUtils.areModsLoaded("brewinandchewin")) {
                            BCItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get()));
                        }
                    })
                    .build());
}