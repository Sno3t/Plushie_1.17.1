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

    // Entity types are registered before items, so CHONKER is already available here
    public static final DeferredItem<SpawnEggItem> CHONKER_SPAWN_EGG = ITEMS.registerItem("chonker_spawn_egg",
            SpawnEggItem::new, properties -> properties.spawnEgg(ModEntityTypes.CHONKER.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
