package com.snoet.plushie.entity.client;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChonkerModel extends AnimatedGeoModel<ChonkerEntity> {

    @Override
    public ResourceLocation getModelLocation(ChonkerEntity object) {
        return new ResourceLocation(Plushie.MOD_ID, "geo/chonker.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ChonkerEntity object) {
        return new ResourceLocation(Plushie.MOD_ID, "textures/entity/chonker/chonker.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ChonkerEntity animatable) {
        return new ResourceLocation(Plushie.MOD_ID, "animations/chonker_base.animation.json");
    }
}
