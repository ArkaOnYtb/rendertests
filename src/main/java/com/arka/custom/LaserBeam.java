package com.arka.custom;

import org.lwjgl.opengl.GL11;

public class LaserBeam {
    private double startX, startY, startZ;
    private double endX, endY, endZ;
    private float red, green, blue, alpha;
    private float lineWidth;

    public LaserBeam(double startX, double startY, double startZ, double endX, double endY, double endZ, float red, float green, float blue, float alpha, float lineWidth) {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.endX = endX;
        this.endY = endY;
        this.endZ = endZ;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
        this.lineWidth = lineWidth;
    }

    public void render() {
        //GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glLineWidth(lineWidth);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDepthMask(false);
        GL11.glColor4f(red, green, blue, 0.2f * alpha);
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3d(startX, startY, startZ);
        GL11.glVertex3d(endX, endY, endZ);
        GL11.glEnd();
        GL11.glColor4f(red, green, blue, alpha);
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3d(startX, startY, startZ);
        GL11.glVertex3d(endX, endY, endZ);
        GL11.glEnd();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
    }
}