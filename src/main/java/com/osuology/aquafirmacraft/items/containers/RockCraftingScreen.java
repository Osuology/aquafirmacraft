package com.osuology.aquafirmacraft.items.containers;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.osuology.aquafirmacraft.Information;
import com.osuology.aquafirmacraft.items.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.font.FontManager;
import net.minecraft.client.gui.font.FontSet;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import java.awt.*;

public class RockCraftingScreen extends AbstractContainerScreen<RockCraftingContainer> {

    private ResourceLocation GUI = new ResourceLocation(Information.MODNAME, "textures/gui/rockcrafting_gui.png");
    private Player player;

    private int ticks, track_ticks = 0;

    public RockCraftingScreen(RockCraftingContainer container, Inventory inventory, Component component) {
        super(container, inventory, component);
        player = inventory.player;
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    public void onClose() {

        super.onClose();
    }

    @Override
    protected void containerTick() {
        ticks++;

        if (ticks > 200 && track_ticks != ticks) {
            track_ticks = ticks;
            ticks--;

            RockCraftingContainer container = this.getMenu();
            container.changeCraftingSlot(new ItemStack(Items.stoneaxeheaditem.get(), 1));
        }

        super.containerTick();
    }

    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        super.renderLabels(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, GUI);
        int posX = (this.width - this.imageWidth) / 2;
        int posY = (this.height - this.imageHeight) / 2;
        this.blit(matrixStack, posX, posY, 0, 0, this.imageWidth, this.imageHeight);
    }
}
