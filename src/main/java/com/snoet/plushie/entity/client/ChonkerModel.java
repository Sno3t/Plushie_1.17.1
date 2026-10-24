package com.snoet.plushie.entity.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.snoet.plushie.Plushie;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import net.minecraft.resources.Identifier;

// Loads geckolib/models/entity/chonker.geo.json, geckolib/animations/entity/chonker.animation.json
// and textures/entity/chonker.png
public class ChonkerModel extends DefaultedEntityGeoModel<ChonkerEntity> {

    public ChonkerModel() {
        super(Identifier.fromNamespaceAndPath(Plushie.MOD_ID, "chonker"));
    }
}
