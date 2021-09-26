package com.osuology.aquafirmacraft.items;

import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.blocks.Blocks;
import com.osuology.aquafirmacraft.blocks.logs.AspenLogBlock;
import com.osuology.aquafirmacraft.items.materials.BasicRockItem;
import com.osuology.aquafirmacraft.items.tools.*;
import com.osuology.aquafirmacraft.items.tools.pieces.StoneAxeHeadItem;
import com.osuology.aquafirmacraft.items.tools.pieces.StoneShovelHeadItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Information.MODNAME);

    public static void initialize() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(bus);
    }

    // Food

    public static final RegistryObject<Item> sharkfinitem = ITEMS.register("sharkfinitem", () -> new SharkFinItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    // Tool Pieces

    public static final RegistryObject<Item> stoneshovelheaditem = ITEMS.register("stoneshovelheaditem", () -> new StoneShovelHeadItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> stoneaxeheaditem = ITEMS.register("stoneaxeheaditem", () -> new StoneAxeHeadItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // Pickaxes
    public static final RegistryObject<Item> copperpickaxeitem = ITEMS.register("copperpickaxeitem", () -> new CopperPickaxe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> bronzepickaxeitem = ITEMS.register("bronzepickaxeitem", () -> new BronzePickaxe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> chromephosphorusnickelsteelpickaxeitem = ITEMS.register("chromephosphorusnickelsteelpickaxeitem", () -> new ChromePhosphorusNickelSteelPickaxe(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Shovels
    public static final RegistryObject<Item> stoneshovelitem = ITEMS.register("stoneshovelitem", () -> new StoneShovelItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> chromephosphorusnickelsteelshovelitem = ITEMS.register("chromephosphorusnickelsteelshovelitem", () -> new ChromePhosphorusNickelSteelShovel(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Axes
    public static final RegistryObject<Item> stoneaxeitem = ITEMS.register("stoneaxeitem", () -> new StoneAxeItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Materials
    public static final RegistryObject<Item> rockitem = ITEMS.register("rockitem", () -> new BasicRockItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // Blocks

    public static final RegistryObject<Item> aspenlogblockitem = ITEMS.register("aspenlogblockitem", () -> new BlockItem(Blocks.ASPEN_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
