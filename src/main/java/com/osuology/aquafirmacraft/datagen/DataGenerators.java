package com.osuology.aquafirmacraft.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.io.IOException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new Recipes(generator));
        } else if (event.includeClient()) {
            generator.addProvider(new Items(generator, event.getExistingFileHelper()));
            generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
        }

        /*try {
            generator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
