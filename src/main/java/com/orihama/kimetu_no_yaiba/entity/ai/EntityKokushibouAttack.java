package com.orihama.kimetu_no_yaiba.entity.ai;

import com.orihama.kimetu_no_yaiba.entity.monster.EntityKokushibou;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.world.World;

public class EntityKokushibouAttack extends EntityAIAttackMelee
{
	private final EntityKokushibou kokushibou;

	int tick = 0, tick2 = 0;
	float x = 0f;
	World world_;
	double tmpX,tmpZ;
	double prePosX,prePosY,prePosZ;
	double HprePosX,HprePosY,HprePosZ;
	int flag1=0,flag2=0;
	EntityLivingBase target;

	public EntityKokushibouAttack(EntityKokushibou entityKokushibou, double speedIn, boolean longMemoryIn, World worldIn){
		super(entityKokushibou, speedIn, longMemoryIn);
		this.kokushibou = entityKokushibou;

		this.world_ = worldIn;
	}

	@Override
	public boolean shouldExecute() {

		EntityLivingBase target = this.attacker.getAttackTarget();

		if (target == null) {
			this.kokushibou.fight_flag = 0;
			return false;
		}else if (!target.isEntityAlive()) {
			this.kokushibou.fight_flag = 0;
			return false;
		}
		else{
			float dist = this.kokushibou.getDistance(target);

			if( 15D < dist ) {
				this.kokushibou.attack_pattern = 3;
				return true;
			}

			if( 15D > dist && dist > 8) {
				this.kokushibou.attack_pattern = 2;
				return true;
			}

			if( 8D > dist && dist > 0) {
				this.kokushibou.attack_pattern = 1;
				return true;
			}

			tick = 0;
			this.kokushibou.fight_flag = 0;
			return false;
		}
	}

	@Override
	public void startExecuting(){
		this.kokushibou.fight_flag = 1;
	}

	@Override
	public void updateTask(){
	}

	//----------------------------------------

}




