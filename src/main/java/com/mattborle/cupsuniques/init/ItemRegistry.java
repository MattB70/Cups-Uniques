package com.mattborle.cupsuniques.init;

import com.mattborle.cupsuniques.CupsUniques;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Item registration using ReferredRegister. Items are initialized here as to avoid the hassle of static referencing.
public class ItemRegistry {

    // Creative Mode Tab
    /*
    public static class CreativeTab extends CreativeModeTab {

        private CreativeTab(int index, String label) {
            super(index, label);
        }
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BOTTLE_O_MOONSHINE.get()); // Use an item as the tab icon
        }
        // Register the new Creative Mod menu tab.
        public static final CreativeTab instance = new CreativeTab(CreativeModeTab.TABS.length, CupsUniques.MOD_ID);
    }
    */

    // Registry
    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CupsUniques.MOD_ID);

    // Tools ===========================================================================================================
    /*  Diamond Tool reference:
                    ready_speed
        Pickaxe:    -2.8f
        Axe:        -3.0f
        Shovel:     -3.0f
        Hoe:        0.0f
        Sword:      -2.4f
    */

    // Register Crysophilists Pickaxe with id crysophilists_pickaxe and reference CRYSOPHILISTS_PICKAXE.
    /*
    public static final RegistryObject<Item> CRYSOPHILISTS_PICKAXE = MOD_ITEMS.register("crysophilists_pickaxe",
            () -> new CrysophilistsPickaxeItem(Tiers.NETHERITE,1, -2.0f, new Item.Properties()));
    */
}
