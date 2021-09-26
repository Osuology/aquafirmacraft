package com.osuology.aquafirmacraft.items.containers;

import com.osuology.aquafirmacraft.AquaFirmaCraft;
import com.osuology.aquafirmacraft.items.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerListener;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.EmptyHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

import java.io.Console;

public class RockCraftingContainer extends AbstractContainerMenu {

    private IItemHandler playerItemHandler;
    private IItemHandler craftingItemHandler;

    public RockCraftingContainer(int windowID, Inventory playerInventory,
                                 Player player) {
        super(Containers.ROCKCRAFTING.get(), windowID);
        playerItemHandler = new InvWrapper(playerInventory);
        craftingItemHandler = new ItemStackHandler();
        addSlots();
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    public void changeCraftingSlot(ItemStack stack) {
        this.setRemoteSlot(5, stack);
        this.broadcastChanges();
        /*SlotItemHandler crafting_slot = new SlotItemHandler(craftingItemHandler,0,64 + (18*4),24);
        crafting_slot.set(stack);
        crafting_slot.setChanged();
        addSlot(crafting_slot);*/
    }

    private void addInventorySlots() {
        for (int j = 0; j < 4; ++j) {
            for (int i = 0; i < 9; ++i) {
                if (j == 0)
                    addSlot(new SlotItemHandler(playerItemHandler, (j*10)+i, 10+(18*i), 128-(j*18)));
                else
                    addSlot(new SlotItemHandler(playerItemHandler, (j*10)+i, 10+(18*i), 124-(j*18)));
            }
        }
    }



    private void addSlots() {
        addInventorySlots();
        SlotItemHandler shovel_slot = new SlotItemHandler(craftingItemHandler,0,64 + (18*4),24);
        //craftingItemHandler.insertItem(0, new ItemStack(Items.rockitem.get(), 64), true);
        shovel_slot.set(new ItemStack(Items.stoneshovelheaditem.get(), 1));
        shovel_slot.setChanged();
        addSlot(shovel_slot);
    }
}
