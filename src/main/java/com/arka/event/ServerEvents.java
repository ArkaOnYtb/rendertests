package com.arka.event;

import com.arka.RenderTests;
import com.arka.entity.BeamEntity;
import com.arka.setup.Registry;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RenderTests.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerEvents {

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put(Registry.BEAM.get(), BeamEntity.prepareAttributes().build());
    }

}
