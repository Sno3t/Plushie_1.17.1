package com.snoet.plushie.entity.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.snoet.plushie.entity.custom.SukusukuEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.EntityType;

// Finds the model, texture and animations from the entity's id, e.g. plushie:ran uses
// geckolib/models/entity/ran.geo.json, geckolib/animations/entity/ran.animation.json and textures/entity/ran.png
public class SukusukuRenderer extends GeoEntityRenderer<SukusukuEntity, LivingEntityRenderState> {

    public SukusukuRenderer(EntityRendererProvider.Context renderManager, EntityType<? extends SukusukuEntity> entityType) {
        super(renderManager, entityType);
        this.shadowRadius = 0.3f;
        withScale(0.8f);
    }
}
