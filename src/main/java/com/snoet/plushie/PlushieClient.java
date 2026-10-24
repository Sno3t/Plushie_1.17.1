package com.snoet.plushie;

import com.snoet.plushie.entity.ModEntityTypes;
import com.snoet.plushie.entity.client.SukusukuRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = Plushie.MOD_ID, value = Dist.CLIENT)
public class PlushieClient {
    @SubscribeEvent
    static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.IKU.get(), context -> new SukusukuRenderer(context, ModEntityTypes.IKU.get()));
        event.registerEntityRenderer(ModEntityTypes.RAN.get(), context -> new SukusukuRenderer(context, ModEntityTypes.RAN.get()));
    }
}
