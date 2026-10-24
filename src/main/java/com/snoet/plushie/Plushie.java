package com.snoet.plushie;

import com.snoet.plushie.block.Modblocks;
import com.snoet.plushie.entity.ModEntityTypes;
import com.snoet.plushie.entity.custom.ChonkerEntity;
import com.snoet.plushie.item.ModCreativeModeTab;
import com.snoet.plushie.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Plushie.MOD_ID)
public final class Plushie {
    public static final String MOD_ID = "plushie";

    public Plushie(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        Modblocks.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ModCreativeModeTab.register(modEventBus);

        modEventBus.addListener(Plushie::entityAttributeEvent);
    }

    private static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CHONKER.get(), ChonkerEntity.setAttributes());
    }
}
