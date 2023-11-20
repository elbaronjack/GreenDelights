package com.elbaronjack.greendelights.util;

import net.minecraftforge.fml.ModList;

public class CompatUtils {
    public static boolean areModsLoaded(String... modIds) {
        ModList modList = ModList.get();
        for (String mod : modIds)
            if (!modList.isLoaded(mod))
                return false;
        return true;
    }
}
