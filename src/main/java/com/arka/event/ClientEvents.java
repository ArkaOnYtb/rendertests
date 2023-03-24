package com.arka.event;

import com.arka.RenderTests;
import com.arka.entity.BeamEntityModel;
import com.arka.entity.BeamEntityRenderer;
import com.arka.setup.Registry;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RenderTests.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    /*@SubscribeEvent
    public void onWorldRender(RenderPlayerEvent event) {
        Player player = event.getEntity();
        new LaserBeam(player.getX(), player.getY(), player.getZ(), player.getX() + 5, player.getY() + 2, player.getZ() + 5, 255, 30, 30, 0.8f, 3.0f).render();
    }*/

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Registry.BEAM.get(), BeamEntityRenderer::new);
    }

}
