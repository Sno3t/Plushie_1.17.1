package com.snoet.plushie.entity.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;


public class ChonkerRenderer extends GeoEntityRenderer<ChonkerEntity, LivingEntityRenderState> {

    public ChonkerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChonkerModel());
        this.shadowRadius = 0.3f;
        withScale(0.8f);
    }
}
