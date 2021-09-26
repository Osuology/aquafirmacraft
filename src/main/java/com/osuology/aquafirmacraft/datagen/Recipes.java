package com.osuology.aquafirmacraft.datagen;

import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.items.Items;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.data.ForgeRecipeProvider;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Items.stoneshovelitem.get())
                .pattern(" x ")
                .pattern(" i ")
                .define('x', Items.stoneshovelheaditem.get())
                .define('i', Tags.Items.RODS_WOODEN)
                .group(Information.MODNAME)
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(net.minecraft.world.item.Items.STICK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Items.stoneaxeitem.get())
                .pattern(" x ")
                .pattern(" i ")
                .define('x', Items.stoneaxeheaditem.get())
                .define('i', Tags.Items.RODS_WOODEN)
                .group(Information.MODNAME)
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(net.minecraft.world.item.Items.STICK))
                .save(consumer);
    }
}
