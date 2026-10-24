package com.snoet.plushie.item;

import com.snoet.plushie.Plushie;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Plushie.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PLUSHIE_TAB = CREATIVE_MODE_TABS.register("plushie_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.plushieModTab"))
                    .icon(() -> ModItems.BOW.get().getDefaultInstance())
                    .displayItems((_, output) -> ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get())))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
