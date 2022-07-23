package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public class FireCrystalArmor extends ArmorItem {
    private static Item.Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_MISC);

    //creating a custom armor material - this is almost identical to the old way
    private static ArmorMaterial customMaterial = ItemUtils.buildArmorMaterial(
            "firecrystal",
            22,
            new int[]{10, 10, 10, 10},
            5,
            SoundEvents.ARMOR_EQUIP_IRON,
            4.0f,
            0.3f,
            BaseMod.MODID+":firecrystal");

    public static final Item FIRECRYSTAL_HELM = new FireCrystalArmor(customMaterial, EquipmentSlot.HEAD, (properties)).setRegistryName("firecrystal_helm");
    public static final Item FIRECRYSTAL_CHEST = new FireCrystalArmor(customMaterial, EquipmentSlot.CHEST, (properties)).setRegistryName("firecrystal_chest");
    public static final Item FIRECRYSTAL_LEGS = new FireCrystalArmor(customMaterial, EquipmentSlot.LEGS, (properties)).setRegistryName("firecrystal_legs");
    public static final Item FIRECRYSTAL_BOOTS = new FireCrystalArmor(customMaterial, EquipmentSlot.FEET, (properties)).setRegistryName("firecrystal_boots");

    public FireCrystalArmor(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if(slot == EquipmentSlot.LEGS){
            return BaseMod.MODID+":textures/models/armor/firecrystal_armor_layer_2.png";
        }else{
            return BaseMod.MODID+":textures/models/armor/firecrystal_armor_layer_1.png";
        }
    }
}
