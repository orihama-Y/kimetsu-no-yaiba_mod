package com.orihama.kimetu_no_yaiba.entity.ai;

import com.orihama.kimetu_no_yaiba.entity.monster.EntityTeoni;

import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityTeoniAttack extends EntityAIAttackMelee
{

    public EntityTeoniAttack(EntityTeoni teoni, double speedIn, boolean longMemoryIn)
    {
        super(teoni, speedIn, longMemoryIn);
    }

    public void startExecuting()
    {
        super.startExecuting();
    }

    public void updateTask()
    {
        super.updateTask();
    }
}