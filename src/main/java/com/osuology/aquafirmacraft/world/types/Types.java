package com.osuology.aquafirmacraft.world.types;

import com.mojang.realmsclient.dto.RealmsServer;
import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.items.SharkFinItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.ForgeWorldTypeScreens;
import net.minecraftforge.common.world.ForgeWorldType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Types {
    public static void initialize() {

        // You can't use default because null is vanilla, default is null in other words.
        // TODO: Make a custom world type, custom biome provider, this will allow this to work.

        /*ForgeWorldType afc_default = ForgeWorldType.getDefaultWorldType();
        afc_default.setRegistryName(new ResourceLocation(Information.MODNAME));
        ForgeRegistries.WORLD_TYPES.register(afc_default);*/
    }
}
