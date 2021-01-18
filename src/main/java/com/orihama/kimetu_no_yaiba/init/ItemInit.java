package com.orihama.kimetu_no_yaiba.init;

import java.util.ArrayList;
import java.util.List;

import com.orihama.kimetu_no_yaiba.objects.items.IconBase;
import com.orihama.kimetu_no_yaiba.objects.items.ItemBase;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_giyuu;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_honoo;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_kaminari;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_kasumi;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_kaze;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_kedamono;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_mizu;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_musi;
import com.orihama.kimetu_no_yaiba.objects.items.Nitirintou_tuki;
import com.orihama.kimetu_no_yaiba.objects.items.Taihuku_chest;
import com.orihama.kimetu_no_yaiba.objects.items.Taihuku_feet;
import com.orihama.kimetu_no_yaiba.objects.items.Taihuku_leggings;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;


public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<>();

	//アイコン
	public static final Item MINAMO_ICON = new IconBase("minamo_icon");
	public static final Item MIZUGURUMA_ICON = new IconBase("mizuguruma_icon");
	public static final Item RYUURYUU_ICON = new IconBase("ryuuryuu_icon");
	public static final Item UTISIO_ICON = new IconBase("utisio_icon");
	public static final Item KANTEN_ICON = new IconBase("kanten_icon");
	public static final Item NEJIREUZU_ICON = new IconBase("nejireuzu_icon");
	public static final Item HAMON_ICON = new IconBase("hamon_icon");
	public static final Item TAKITUBO_ICON = new IconBase("takitubo_icon");
	public static final Item SIBUKI_ICON = new IconBase("sibuki_icon");
	public static final Item SEISEI_ICON = new IconBase("seisei_icon");
	public static final Item NAGI_ICON = new IconBase("nagi_icon");

	public static final Item HEKIREKI_ICON = new IconBase("hekireki_icon");
	public static final Item IKADUTI_ICON = new IconBase("ikaduti_icon");

	public static final Item KIRIKOMA_ICON = new IconBase("kirikoma_icon");
	public static final Item KURUI_ICON = new IconBase("kuruizaki_icon");
	public static final Item RANGUI_ICON = new IconBase("rangui_icon");

	public static final Item SIRANUI_ICON = new IconBase("siranui_icon");
	public static final Item NOBORI_ICON = new IconBase("nobori_icon");
	public static final Item ENKO_ICON = new IconBase("enko_icon");
	public static final Item RENGOKU_ICON = new IconBase("rengoku_icon");

	public static final Item TAWAMURE_ICON = new IconBase("tawamure_icon");
	public static final Item HOUGA_ICON = new IconBase("houga_icon");
	public static final Item HUKUGAN_ICON = new IconBase("hukugan_icon");
	public static final Item HYAKUSOKU_ICON = new IconBase("hyakusoku_icon");

	public static final Item SOGI_ICON = new IconBase("sogi_icon");
	public static final Item SINATO_ICON = new IconBase("sinato_icon");
	public static final Item KOKUHUU_ICON = new IconBase("kokuhuu_icon");
	public static final Item IDATEN_ICON = new IconBase("idaten_icon");

	public static final Item KASAN_ICON = new IconBase("kasan_icon");
	public static final Item IRYUU_ICON = new IconBase("iryuu_icon");
	public static final Item KASYOU_ICON = new IconBase("kasyou_icon");
	public static final Item KAUN_ICON = new IconBase("kaun_icon");
    public static final Item OBORO_ICON = new IconBase("oboro_icon");

	public static final Item TODOROKI_ICON = new IconBase("todoroki_icon");
	public static final Item KYOUZAN_ICON = new IconBase("kyouzan_icon");
	public static final Item MEIGEN_ICON = new IconBase("meigen_icon");

	public static final Item KOINEKO_ICON = new IconBase("koineko_icon");
	public static final Item OUNOU_ICON = new IconBase("ounou_icon");

	public static final Item SAIKA_ICON = new IconBase("saika_icon");
	public static final Item TUKIBAE_ICON = new IconBase("tukibae_icon");
	public static final Item RINBI_ICON = new IconBase("rinbi_icon");
	public static final Item KATAWARE_ICON = new IconBase("kataware_icon");

	//アイテム
	public static final Item HISATETU_ITEM = new ItemBase("hisatetu_item");
	public static final Item HIKOUSEKI_ITEM = new ItemBase("hikouseki_item");
	public static final Item TAMAHAGANE = new ItemBase("tamahagane");

	//隊服
	public static final ItemArmor.ArmorMaterial ARMOR_KISATU = EnumHelper.addArmorMaterial("armor_kisatu", "kimetu_no_yaiba:taihuku", 1500, new int[] { 4, 7, 9, 5 }, 17, SoundEvents.BLOCK_ANVIL_HIT, 0.0F);
	public static final Item TAIHUKU_CHEST = (Item)new Taihuku_chest(ARMOR_KISATU, 101, EntityEquipmentSlot.CHEST, "taihuku_chest");
	public static final Item TAIHUKU_LEGGINGS = (Item)new Taihuku_leggings(ARMOR_KISATU, 102, EntityEquipmentSlot.LEGS, "taihuku_leggings");
	public static final Item TAIHUKU_FEET = (Item)new Taihuku_feet(ARMOR_KISATU, 103, EntityEquipmentSlot.FEET, "taihuku_feet");

	//日輪刀
	public static final Item NITIRINTOU_MIZU = (Item)new Nitirintou_mizu(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_GIYUU = (Item)new Nitirintou_giyuu(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_KAMINARI = (Item)new Nitirintou_kaminari(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_KEDAMONO = (Item)new Nitirintou_kedamono(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_KAZE = (Item)new Nitirintou_kaze(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_HONOO = (Item)new Nitirintou_honoo(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_MUSI = (Item)new Nitirintou_musi(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_KASUMI = (Item)new Nitirintou_kasumi(Item.ToolMaterial.DIAMOND);
	public static final Item NITIRINTOU_TUKI = (Item)new Nitirintou_tuki(Item.ToolMaterial.DIAMOND);

}
