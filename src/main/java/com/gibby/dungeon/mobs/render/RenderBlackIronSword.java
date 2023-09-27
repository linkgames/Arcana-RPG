

package com.gibby.dungeon.mobs.render;

import com.gibby.dungeon.items.ModelBlackIronSword;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderBlackIronSword implements IItemRenderer
{
    private static final ResourceLocation swordTextures;
    ModelBlackIronSword swordmodel;

    public RenderBlackIronSword() {
        this.swordmodel = new ModelBlackIronSword();
    }

    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        switch (type) {
            case EQUIPPED: {
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(RenderBlackIronSword.swordTextures);
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, 0.6f, -0.3f);
                this.swordmodel.render((Entity)data[1], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(RenderBlackIronSword.swordTextures);
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, 0.6f, 0.2f);
                this.swordmodel.render((Entity)data[1], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
                break;
            }
            case ENTITY: {
                GL11.glPushMatrix();
                final float scale = 1.5f;
                GL11.glScalef(scale, scale, scale);
                Minecraft.getMinecraft().renderEngine.bindTexture(RenderBlackIronSword.swordTextures);
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(0.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(-0.2f, 1.0f, 0.0f);
                this.swordmodel.render((Entity)data[1], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
                break;
            }
            case INVENTORY: {
                GL11.glPushMatrix();
                final float scale = 1.2f;
                GL11.glScalef(scale, scale, scale);
                Minecraft.getMinecraft().renderEngine.bindTexture(RenderBlackIronSword.swordTextures);
                GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(0.0f, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(0.2f, -0.5f, 0.0f);
                this.swordmodel.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                GL11.glPopMatrix();
                break;
            }
        }
    }

    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        return true;
    }

    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        switch (type) {
            case INVENTORY: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    static {
        swordTextures = new ResourceLocation("gibby_dungeons:textures/mobs/orc.png");
    }
}