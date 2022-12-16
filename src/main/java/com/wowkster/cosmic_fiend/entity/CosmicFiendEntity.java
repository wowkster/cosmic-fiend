package com.wowkster.cosmic_fiend.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class CosmicFiendEntity extends MonsterEntity {

    public CosmicFiendEntity(EntityType type, World worldIn) {
        super(type, worldIn);
        this.enablePersistence();
    }
}
