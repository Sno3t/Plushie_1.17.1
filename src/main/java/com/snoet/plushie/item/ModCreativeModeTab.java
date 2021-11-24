package com.snoet.plushie.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PLUSHIE_TAB = new CreativeModeTab("plushieModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BOW.get());
        }
    };
}
