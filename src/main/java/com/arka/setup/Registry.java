package com.arka.setup;

import com.arka.RenderTests;
import com.arka.entity.BeamEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registry {

    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RenderTests.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITIES.register(bus);
    }

    public static final RegistryObject<EntityType<BeamEntity>> BEAM = ENTITIES.register("beam", () -> EntityType.Builder.of(BeamEntity::new, MobCategory.CREATURE)
            .sized(0.1f, 0.1f)
            .build("beam"));
}
