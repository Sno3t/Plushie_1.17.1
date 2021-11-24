package com.snoet.plushie.item;

import com.snoet.plushie.Plushie;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Plushie.MOD_ID);

    public static final RegistryObject<Item> BOW = ITEMS.register("bow", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.PLUSHIE_TAB)
            .stacksTo(16)
            .fireResistant()

    ));

    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.PLUSHIE_TAB)
            .stacksTo(16)
            .fireResistant()

    ));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
