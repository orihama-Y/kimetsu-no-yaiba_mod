package com.orihama.kimetu_no_yaiba.objects.items;

import java.util.logging.Logger;

import com.orihama.kimetu_no_yaiba.kimetu_no_yaiba_MOD;
import com.orihama.kimetu_no_yaiba.init.ItemInit;
import com.orihama.kimetu_no_yaiba.init.PotionInit;
import com.orihama.kimetu_no_yaiba.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Taihuku_chest
extends ItemArmor implements IHasModel {
	int cnt = 0;
    public static Logger logger;
	int joutyuu_flag=0;
	public Taihuku_chest(ItemArmor.ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, String Name) {
		super(material, renderIndex, armorType);
		setUnlocalizedName(Name);
		setRegistryName(Name);
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		super.onArmorTick(world, player, stack);

		if (player.inventory.armorInventory.get(0) != null
				&& player.inventory.armorInventory.get(1) != null
				&& player.inventory.armorInventory.get(2) != null)
		{
			if (((ItemStack)player.inventory.armorInventory.get(0)).getItem() == ItemInit.TAIHUKU_FEET
					&& ((ItemStack)player.inventory.armorInventory.get(1)).getItem() == ItemInit.TAIHUKU_LEGGINGS
					&& ((ItemStack)player.inventory.armorInventory.get(2)).getItem() == ItemInit.TAIHUKU_CHEST) {

				joutyuu_flag=1;

				if (player.getHeldItemMainhand().getItem() == ItemInit.NITIRINTOU_KEDAMONO) {
					for (EntityLivingBase i : world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(60.0D))) {
						if (i == player) continue;
						i.addPotionEffect(new PotionEffect(Potion.getPotionById(24), 10, 0, false, true));
					}
				}

				if(joutyuu_flag==1 ) {
					player.capabilities.setPlayerWalkSpeed(0.17f);
					player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
					if(!player.isInWater() && !player.isCreative())player.addVelocity(0F, 0.01F, 0F);
					player.fallDistance = 0.0F;
					player.addPotionEffect(new PotionEffect(PotionInit.JOUTYUU_POTION_EFFECT_SPEED, 2, 0, false, false));
					joutyuu_flag=0;
				}
			}else {
				player.capabilities.setPlayerWalkSpeed(0.1f);
				player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
			}
		}else {
			player.capabilities.setPlayerWalkSpeed(0.1f);
			player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
		}
	}

	public void registerModels() {
		kimetu_no_yaiba_MOD.proxy.registerItemRenderer((Item)this, 0, "inventory");
	}
}
