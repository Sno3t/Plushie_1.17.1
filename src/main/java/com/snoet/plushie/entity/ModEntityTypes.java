package com.snoet.plushie.entity;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Plushie.MOD_ID);

    public static final RegistryObject<EntityType<ChonkerEntity>> CHONKER =
            ENTITY_TYPES.register("chonker",
                    () -> EntityType.Builder.of(ChonkerEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(Plushie.MOD_ID, "chonker").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
