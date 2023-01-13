package com.mattborle.cupsuniques.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.text.DecimalFormat;

public class CupsUniquesCommonConfigs {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    private static final DecimalFormat df = new DecimalFormat("0.00");


    // Sizes ===========================================================================================================
    public static final int sizeCount = 4; // This should ALWAYS match the number of sizes present below.

    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SIZE;

    private static final double defaultGiantChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_GIANT;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_GIANT;

    private static final double defaultHeavyChance = 0.40f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_HEAVY;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_HEAVY;

    private static final double defaultLightChance = 0.40f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_LIGHT;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_LIGHT;

    private static final double defaultFeatherweightChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_FEATHERWEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_FEATHERWEIGHT;


    // Qualities =======================================================================================================
    public static final int qualityCount = 6; // This should ALWAYS match the number of qualities present below.

    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_QUALITY;

    private static final double defaultExoticChance = 0.025f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_EXOTIC;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_EXOTIC;

    private static final double defaultFlawlessChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_FLAWLESS;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_FLAWLESS;

    private static final double defaultSuperiorChance = 0.25f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_SUPERIOR;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_SUPERIOR;

    private static final double defaultSimpleChance = 0.30f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_SIMPLE;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_SIMPLE;

    private static final double defaultWornChance = 0.225f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_WORN;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_WORN;

    private static final double defaultFlawedChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Double>  CHANCE_FLAWED;
    public static final ForgeConfigSpec.ConfigValue<Double>  TUNE_FLAWED;



    // Abilities =======================================================================================================
    public static final int abilityCount = 10; // This should ALWAYS match the number of abilities present below.

    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_ABILITY;

    private static final double defaultBlazingChance = 0.12f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_BLAZING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_BLAZING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_BLAZING;

    private static final double defaultSmolderingChance = 0.25f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_SMOLDERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SMOLDERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SMOLDERING;

    private static final double defaultSmashingChance = 0.18f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_SMASHING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SMASHING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SMASHING;

    private static final double defaultMorbinChance = 0.01f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_MORBIN;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_MORBIN;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_MORBIN;

    private static final double defaultHardeningChance = 0.03f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_HARDENING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_HARDENING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_HARDENING;

    private static final double defaultShatteringChance = 0.06f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_SHATTERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SHATTERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SHATTERING;

    private static final double defaultPoisoningChance = 0.15f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_POISONING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_POISONING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_POISONING;

    private static final double defaultGlowingChance = 0.05f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_GLOWING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_GLOWING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_GLOWING;

    private static final double defaultWitheringChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_WITHERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_WITHERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_WITHERING;

    private static final double defaultShulkingChance = 0.05f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_SHULKING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SHULKING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SHULKING;



    static {
        // Sizes =======================================================================================================
        BUILDER.push("Sizes =======================================================================================");
        CHANCE_SIZE = BUILDER.comment("GLOBAL chance for size to be rolled on items (Default: 0.50 = 50%)")
                .defineInRange("Roll Chance (%)", 0.50, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Giant Size");
        CHANCE_GIANT = BUILDER.comment("Chance for this size to be rolled (will be multiplied its weight by count (if 4 sizes present, then 0.25 and with the base size roll chance) [Example: 1.2*0.25*0.25 (chance*weight*base)]. (Default: "+df.format(defaultGiantChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultGiantChance*sizeCount, 0.00, 100.00);
        TUNE_GIANT = BUILDER.comment("How strong should the effect of this size be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Heavy Size");
        CHANCE_HEAVY = BUILDER.comment("Chance for this size to be rolled (will be multiplied its weight by count (if 4 sizes present, then 0.25 and with the base size roll chance) [Example: 1.2*0.25*0.25 (chance*weight*base)]. (Default: "+df.format(defaultHeavyChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultHeavyChance*sizeCount, 0.00, 100.00);
        TUNE_HEAVY = BUILDER.comment("How strong should the effect of this size be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Light Size");
        CHANCE_LIGHT = BUILDER.comment("Chance for this size to be rolled (will be multiplied its weight by count (if 4 sizes present, then 0.25 and with the base size roll chance) [Example: 1.2*0.25*0.25 (chance*weight*base)]. (Default: "+df.format(defaultLightChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultLightChance*sizeCount, 0.00, 100.00);
        TUNE_LIGHT = BUILDER.comment("How strong should the effect of this size be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Featherweight Size");
        CHANCE_FEATHERWEIGHT = BUILDER.comment("Chance for this size to be rolled (will be multiplied its weight by count (if 4 sizes present, then 0.25 and with the base size roll chance) [Example: 1.2*0.25*0.25 (chance*weight*base)]. (Default: "+df.format(defaultFeatherweightChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultFeatherweightChance*sizeCount, 0.00, 100.00);
        TUNE_FEATHERWEIGHT = BUILDER.comment("How strong should the effect of this size be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();



        // Qualities ===================================================================================================
        BUILDER.push("Qualities ===================================================================================");
        CHANCE_QUALITY = BUILDER.comment("GLOBAL chance for quality to be rolled on items (Default: 1.00 = 100%)")
                .defineInRange("Roll Chance (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Exotic Quality");
        CHANCE_EXOTIC = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultExoticChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultExoticChance*sizeCount, 0.00, 100.00);
        TUNE_EXOTIC = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Flawless Quality");
        CHANCE_FLAWLESS = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultFlawlessChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultFlawlessChance*sizeCount, 0.00, 100.00);
        TUNE_FLAWLESS = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Superior Quality");
        CHANCE_SUPERIOR = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSuperiorChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSuperiorChance*sizeCount, 0.00, 100.00);
        TUNE_SUPERIOR = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Simple Quality");
        CHANCE_SIMPLE = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSimpleChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSimpleChance*sizeCount, 0.00, 100.00);
        TUNE_SIMPLE = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Worn Quality");
        CHANCE_WORN = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultWornChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultWornChance*sizeCount, 0.00, 100.00);
        TUNE_WORN = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Flawed Quality");
        CHANCE_FLAWED = BUILDER.comment("Chance for this quality to be rolled (will be multiplied its weight by count (if 6 qualities present, then 0.167 and with the base quality roll chance) [Example: 1.2*0.167*0.25 (chance*weight*base)]. (Default: "+df.format(defaultFlawedChance*sizeCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultFlawedChance*sizeCount, 0.00, 100.00);
        TUNE_FLAWED = BUILDER.comment("How strong should the effect of this quality be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();



        // Abilities ===================================================================================================
        BUILDER.push("Abilities ===================================================================================");
        CHANCE_ABILITY = BUILDER.comment("GLOBAL chance for abilities to be rolled on items (Default: 0.25 = 25%)")
                .defineInRange("Roll Chance (%)", 0.25, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Blazing ability");
        ENABLE_BLAZING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_BLAZING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultBlazingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultBlazingChance*abilityCount, 0.00, 100.00);
        TUNE_BLAZING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Smoldering ability");
        ENABLE_SMOLDERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SMOLDERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSmolderingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSmolderingChance*abilityCount, 0.00, 100.00);
        TUNE_SMOLDERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Smashing ability");
        ENABLE_SMASHING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SMASHING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSmashingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSmashingChance*abilityCount, 0.00, 100.00);
        TUNE_SMASHING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Morbin ability (Joke ability)");
        ENABLE_MORBIN = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_MORBIN = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultMorbinChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultMorbinChance*abilityCount, 0.00, 100.00);
        TUNE_MORBIN = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Hardening ability");
        ENABLE_HARDENING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_HARDENING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultHardeningChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultHardeningChance*abilityCount, 0.00, 100.00);
        TUNE_HARDENING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Shattering ability");
        ENABLE_SHATTERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SHATTERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultShatteringChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultShatteringChance*abilityCount, 0.00, 100.00);
        TUNE_SHATTERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Poisoning ability");
        ENABLE_POISONING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_POISONING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultPoisoningChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultPoisoningChance*abilityCount, 0.00, 100.00);
        TUNE_POISONING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Glowing ability");
        ENABLE_GLOWING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_GLOWING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultGlowingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultGlowingChance*abilityCount, 0.00, 100.00);
        TUNE_GLOWING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Withering ability");
        ENABLE_WITHERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_WITHERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultWitheringChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultWitheringChance*abilityCount, 0.00, 100.00);
        TUNE_WITHERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Shulking ability");
        ENABLE_SHULKING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SHULKING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultShulkingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultShulkingChance*abilityCount, 0.00, 100.00);
        TUNE_SHULKING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();


        SPEC = BUILDER.build();
    }
}
