package com.osuology.aquafirmacraft.blocks;

import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.blocks.logs.AspenLogBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Information.MODNAME);

    public static void initialize() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCKS.register(bus);
    }

    public static final RegistryObject<Block> ASPEN_LOG = BLOCKS.register("aspenlogblock", AspenLogBlock::new);
}
