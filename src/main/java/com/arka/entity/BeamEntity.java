package com.arka.entity;

import com.arka.custom.LaserBeam;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class BeamEntity extends Animal {


    public BeamEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    public static AttributeSupplier.Builder prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 0.0)
                .add(Attributes.MAX_HEALTH, 1.0)
                .add(Attributes.FOLLOW_RANGE, 0.0)
                .add(Attributes.MOVEMENT_SPEED, 0.0);
    }

    @Override
    public void baseTick() {
        if(this.level.isClientSide) {
            new LaserBeam(this.getX(), this.getY(), this.getZ(), this.getX() + 5, this.getY() + 2, this.getZ() + 5, 255, 30, 30, 0.8f, 3.0f).render();
        }
    }
}
