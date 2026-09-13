package net.captersers.captercraft.item.material;

import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.tag.CCItemTags;
import net.minecraft.util.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

/**
 * Material de armadura de enderita y su recurso de equipo en cliente.
 *
 * @see ArmorMaterial
 * @see EquipmentAssets
 */
public final class CCArmorMaterials
{
    /**
     * Identificador del modelo de equipo {@code captercraft:enderite}.
     *
     * @see EquipmentAssets#ROOT_ID
     */
    public static final ResourceKey<EquipmentAsset> ENDERITE_EQUIPMENT =
            ResourceKey.create(EquipmentAssets.ROOT_ID, CCMod.id("enderite"));

    /**
     * Enderita: defensa 4/7/9/4, encantabilidad 18, dureza 4.5 y resistencia al empuje 0.2.
     *
     * @see CCItemTags#REPAIRS_ENDERITE_ARMOR
     * @see SoundEvents#ARMOR_EQUIP_NETHERITE
     */
    public static final ArmorMaterial ENDERITE = new ArmorMaterial(
            42,
            Util.make(new EnumMap<>(ArmorType.class), enumMap ->
            {
                enumMap.put(ArmorType.BOOTS, 4);
                enumMap.put(ArmorType.LEGGINGS, 7);
                enumMap.put(ArmorType.CHESTPLATE, 9);
                enumMap.put(ArmorType.HELMET, 4);
                enumMap.put(ArmorType.BODY, 12);
            }),
            18,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.5F,
            0.2F,
            CCItemTags.REPAIRS_ENDERITE_ARMOR,
            ENDERITE_EQUIPMENT);

    /**
     * Impide instanciar esta clase de materiales.
     */
    private CCArmorMaterials() {}
}
