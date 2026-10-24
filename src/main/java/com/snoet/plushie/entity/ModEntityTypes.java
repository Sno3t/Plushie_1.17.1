package com.snoet.plushie.entity;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.custom.SukusukuEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityTypes {
    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(Plushie.MOD_ID);

    // Iku Sukusuku
    public static final DeferredHolder<EntityType<?>, EntityType<SukusukuEntity>> IKU =
            ENTITY_TYPES.registerEntityType("iku", SukusukuEntity::new, MobCategory.CREATURE,
                    builder -> builder.sized(0.8f, 0.8f));

    // Ran Sukusuku
    public static final DeferredHolder<EntityType<?>, EntityType<SukusukuEntity>> RAN =
            ENTITY_TYPES.registerEntityType("ran", SukusukuEntity::new, MobCategory.CREATURE,
                    builder -> builder.sized(0.8f, 0.9f));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
