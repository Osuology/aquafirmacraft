package com.osuology.aquafirmacraft.blocks.logs;

import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.material.Material;

public class AspenLogBlock extends DirectionalBlock {
    public AspenLogBlock() {
        super(Properties.of(Material.WATER)
                .noOcclusion()
                .strength(5.0f));
    }
}
