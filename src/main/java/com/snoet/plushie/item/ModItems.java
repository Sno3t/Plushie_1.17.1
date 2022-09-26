package com.snoet.plushie.item;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Plushie.MOD_ID);

    public static final RegistryObject<Item> BOW = ITEMS.register("bow", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.PLUSHIE_TAB)
            .stacksTo(16)
            .fireResistant()
    ));

    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.PLUSHIE_TAB)
            .stacksTo(64)
            .fireResistant()
    ));

    public static final RegistryObject<Item> CHONKER_SPAWN_EGG = ITEMS.register("chonker_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHONKER,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.PLUSHIE_TAB)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
