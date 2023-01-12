package com.mattborle.cupsuniques.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CupsUniquesClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Cups Uniques (Client)");

        // Define client configurables here!

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
