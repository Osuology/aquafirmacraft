package com.osuology.aquafirmacraft.items.tools;

import net.minecraft.tags.Tag;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class AFCToolTiers {

    // Pre-metal
    public static ForgeTier stone;

    // Basic metals
    public static ForgeTier copper;

    // Basic Alloys
    public static ForgeTier bronze;

    // Advanced Alloys

    public static ForgeTier chrome_phosphorus_nickel_steel;

    public static void initialize() {
        stone = new ForgeTier(5, 100, 0.85f, 0.0f, 0, Tags.Blocks.NEEDS_NETHERITE_TOOL, new Supplier<Ingredient>() {
            @Override
            public Ingredient get() {
                return Ingredient.of(com.osuology.aquafirmacraft.items.Items.rockitem.get());
            }
        });

        copper = new ForgeTier(5, 200, 1.1f, 0.0f, 0, Tags.Blocks.NEEDS_NETHERITE_TOOL, new Supplier<Ingredient>() {
            @Override
            public Ingredient get() {
                return Ingredient.of(Items.COPPER_INGOT);
            }
        });

        bronze = new ForgeTier(5, 350, 1.9f, 0.0f, 0, Tags.Blocks.NEEDS_NETHERITE_TOOL, new Supplier<Ingredient>() {
            @Override
            public Ingredient get() {
                return Ingredient.of(Items.COPPER_INGOT);
            }
        });

        chrome_phosphorus_nickel_steel = new ForgeTier(5, 1680, 6.5f, 7.0f, 30, Tags.Blocks.NEEDS_NETHERITE_TOOL, new Supplier<Ingredient>() {
            @Override
            public Ingredient get() {
                return Ingredient.of(Items.IRON_INGOT);
            }
        });
    }
}
