package com.arka.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class BeamEntityRenderer extends LivingEntityRenderer<BeamEntity, BeamEntityModel> {
    public BeamEntityRenderer(EntityRendererProvider.Context renderer/*, BeamEntityModel beam, float p_174306_*/) {
        super(renderer, new BeamEntityModel(), 0.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(BeamEntity p_114482_) {
        return null;
    }
}
