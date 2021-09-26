package com.osuology.aquafirmacraft.datagen;

import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.blocks.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Information.MODNAME, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Blocks.ASPEN_LOG.get().getRegistryName().toString(), new ResourceLocation(Information.MODNAME, "block/aspenlogblock"));
    }
}
