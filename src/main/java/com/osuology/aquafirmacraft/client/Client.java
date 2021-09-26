package com.osuology.aquafirmacraft.client;

import com.osuology.aquafirmacraft.AquaFirmaCraft;
import com.osuology.aquafirmacraft.items.containers.Containers;
import com.osuology.aquafirmacraft.items.containers.RockCraftingScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class Client {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Containers.ROCKCRAFTING.get(), RockCraftingScreen::new);
        });
    }
}
