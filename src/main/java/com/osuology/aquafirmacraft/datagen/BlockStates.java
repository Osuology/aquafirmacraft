package com.osuology.aquafirmacraft.datagen;

import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.blocks.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.io.IOException;

public class BlockStates extends BlockStateProvider {

    public BlockStates(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Information.MODNAME, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Blocks.ASPEN_LOG.get());
    }
}
