package com.snoet.plushie;

import com.snoet.plushie.block.Modblocks;
import com.snoet.plushie.entity.ModEntityTypes;
import com.snoet.plushie.entity.client.ChonkerRenderer;
import com.snoet.plushie.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Plushie.MOD_ID)
public class Plushie {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "plushie";

    public Plushie() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        Modblocks.register(eventBus);
        ModEntityTypes.register(eventBus);


        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        GeckoLib.initialize();

        // Register the enqueueIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntityTypes.CHONKER.get(), ChonkerRenderer::new);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
//        LOGGER.info("HELLO FROM PREINIT");
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
