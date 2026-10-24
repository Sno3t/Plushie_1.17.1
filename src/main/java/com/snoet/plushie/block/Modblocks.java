package com.snoet.plushie.block;

import com.snoet.plushie.Plushie;
import com.snoet.plushie.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class Modblocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Plushie.MOD_ID);

    public static final DeferredBlock<Block> STUFFING_BLOCK = registerBlock("stuffing_block",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOL)
                    .strength(2f)
                    .requiresCorrectToolForDrops()
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, block);
        ModItems.ITEMS.registerSimpleBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
