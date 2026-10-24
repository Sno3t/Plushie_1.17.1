package com.snoet.plushie.item;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Plushie.MOD_ID);

    public static final DeferredItem<Item> BOW = ITEMS.registerSimpleItem("bow", properties -> properties
            .stacksTo(16)
            .fireResistant()
    );

    public static final DeferredItem<Item> STUFFING = ITEMS.registerSimpleItem("stuffing", properties -> properties
            .stacksTo(64)
            .fireResistant()
    );

    // Entity types are registered before items, so the entity types are already available here
    public static final DeferredItem<SpawnEggItem> IKU_SPAWN_EGG = ITEMS.registerItem("iku_spawn_egg",
            SpawnEggItem::new, properties -> properties.spawnEgg(ModEntityTypes.IKU.get()));

    public static final DeferredItem<SpawnEggItem> RAN_SPAWN_EGG = ITEMS.registerItem("ran_spawn_egg",
            SpawnEggItem::new, properties -> properties.spawnEgg(ModEntityTypes.RAN.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
