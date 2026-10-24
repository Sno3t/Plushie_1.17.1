package com.snoet.plushie.entity;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityTypes {
    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(Plushie.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<ChonkerEntity>> CHONKER =
            ENTITY_TYPES.registerEntityType("chonker", ChonkerEntity::new, MobCategory.CREATURE,
                    builder -> builder.sized(0.8f, 0.6f));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
