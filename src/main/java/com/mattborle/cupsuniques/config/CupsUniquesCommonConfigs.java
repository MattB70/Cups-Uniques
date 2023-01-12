package com.mattborle.cupsuniques.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.text.DecimalFormat;

public class CupsUniquesCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    // Abilities
    public static final int abilityCount = 10; // This should ALWAYS match the number of abilities present below.

    private static final double defaultBlazingChance = 0.12f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_BLAZING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_BLAZING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_BLAZING;

    private static final double defaultSmolderingChance = 0.25f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_SMOLDERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SMOLDERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SMOLDERING;

    private static final double defaultSmashingChance = 0.18f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_SMASHING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SMASHING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SMASHING;

    private static final double defaultMorbinChance = 0.01f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_MORBIN;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_MORBIN;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_MORBIN;

    private static final double defaultHardeningChance = 0.03f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_HARDENING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_HARDENING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_HARDENING;

    private static final double defaultShatteringChance = 0.06f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_SHATTERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SHATTERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SHATTERING;

    private static final double defaultPoisoningChance = 0.15f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_POISONING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_POISONING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_POISONING;

    private static final double defaultGlowingChance = 0.05f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_GLOWING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_GLOWING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_GLOWING;

    private static final double defaultWitheringChance = 0.10f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_WITHERING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_WITHERING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_WITHERING;

    private static final double defaultShulkingChance = 0.05f;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ABILITY_SHULKING;
    public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_SHULKING;
    public static final ForgeConfigSpec.ConfigValue<Double> TUNE_SHULKING;


    static {

        // Abilities
        BUILDER.push("Blazing ability");
        ABILITY_BLAZING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_BLAZING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultBlazingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultBlazingChance*abilityCount, 0.00, 100.00);
        TUNE_BLAZING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Smoldering ability");
        ABILITY_SMOLDERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SMOLDERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSmolderingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSmolderingChance*abilityCount, 0.00, 100.00);
        TUNE_SMOLDERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Smashing ability");
        ABILITY_SMASHING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SMASHING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultSmashingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultSmashingChance*abilityCount, 0.00, 100.00);
        TUNE_SMASHING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Morbin ability (Joke ability)");
        ABILITY_MORBIN = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_MORBIN = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultMorbinChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultMorbinChance*abilityCount, 0.00, 100.00);
        TUNE_MORBIN = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Hardening ability");
        ABILITY_HARDENING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_HARDENING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultHardeningChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultHardeningChance*abilityCount, 0.00, 100.00);
        TUNE_HARDENING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Shattering ability");
        ABILITY_SHATTERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SHATTERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultShatteringChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultShatteringChance*abilityCount, 0.00, 100.00);
        TUNE_SHATTERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Poisoning ability");
        ABILITY_POISONING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_POISONING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultPoisoningChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultPoisoningChance*abilityCount, 0.00, 100.00);
        TUNE_POISONING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Glowing ability");
        ABILITY_GLOWING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_GLOWING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultGlowingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultGlowingChance*abilityCount, 0.00, 100.00);
        TUNE_GLOWING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Withering ability");
        ABILITY_WITHERING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_WITHERING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultWitheringChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultWitheringChance*abilityCount, 0.00, 100.00);
        TUNE_WITHERING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();

        BUILDER.push("Shulking ability");
        ABILITY_SHULKING = BUILDER.comment("Enable this ability (Default: true)")
                .define("Enabled (Boolean)", true);
        CHANCE_SHULKING = BUILDER.comment("Chance for this ability to be rolled (will be multiplied its weight by count (if 10 abilities present, then 0.1 and with the base ability roll chance) [Example: 1.2*0.1*0.25 (chance*weight*base)]. (Default: "+df.format(defaultShulkingChance*abilityCount)+")")
                .defineInRange("Roll Chance (Weight)", defaultShulkingChance*abilityCount, 0.00, 100.00);
        TUNE_SHULKING = BUILDER.comment("How strong should this ability be (Percentage of default) (Default: 1.00 = 100%)")
                .defineInRange("Strength Tune (%)", 1.00, 0.00, 100.00);
        BUILDER.pop();



        SPEC = BUILDER.build();
    }
}
