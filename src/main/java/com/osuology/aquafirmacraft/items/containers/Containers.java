package com.osuology.aquafirmacraft.items.containers;

import com.osuology.aquafirmacraft.Information;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Containers {
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Information.MODNAME);

    public static void initialize() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        CONTAINERS.register(bus);
    }

    public static RegistryObject<MenuType<RockCraftingContainer>> ROCKCRAFTING = CONTAINERS.register("rockcrafting", () -> IForgeContainerType.create((windowID, inventory, data) -> {
        return new RockCraftingContainer(windowID, inventory, inventory.player);
    }));
}
