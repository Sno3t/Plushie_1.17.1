package com.snoet.plushie.event;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.ModEntityTypes;
import com.snoet.plushie.entity.custom.ChonkerEntity;
//import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Plushie.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CHONKER.get(), ChonkerEntity.setAttributes());
    }
}
