package com.elbaronjack.greendelights;

import com.elbaronjack.greendelights.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB;

    static
    {
        MOD_TAB = new CreativeModeTab("greendelightstab") {
            @Contract(" -> new")
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(ModItems.CUTLASS_IRON.get());
            }
        };
    }
}
