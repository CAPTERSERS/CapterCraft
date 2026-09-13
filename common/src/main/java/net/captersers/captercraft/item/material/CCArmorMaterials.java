package net.captersers.captercraft.item.material;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.registry.CCItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

/**
 * Materiales de armadura de CapterCraft registrados en {@link Registries#ARMOR_MATERIAL}.
 *
 * @see ArmorMaterial
 * @see CCItems
 */
public final class CCArmorMaterials 
{
    /**
     * Registro diferido de materiales de armadura.
     *
     * @see DeferredRegister
     */
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(CCMod.MOD_ID, Registries.ARMOR_MATERIAL);

    /**
     * Cobre: defensa 1/3/4/2, encantabilidad 8, reparación con lingote de cobre.
     *
     * @see Items#COPPER_INGOT
     * @see SoundEvents#ARMOR_EQUIP_IRON
     */
    public static final RegistrySupplier<ArmorMaterial> COPPER = register("copper", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> 
    {
        enumMap.put(ArmorItem.Type.BOOTS, 1);
        enumMap.put(ArmorItem.Type.LEGGINGS, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 4);
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.BODY, 3);
    }), 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT));

    /**
     * Enderita: defensa 4/7/9/4, encantabilidad 18, dureza 4.5 y resistencia al empuje 0.2.
     *
     * @see CCItems#ENDERITE_INGOT
     * @see SoundEvents#ARMOR_EQUIP_NETHERITE
     */
    public static final RegistrySupplier<ArmorMaterial> ENDERITE = register("enderite", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> 
    {
        enumMap.put(ArmorItem.Type.BOOTS, 4);
        enumMap.put(ArmorItem.Type.LEGGINGS, 7);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 9);
        enumMap.put(ArmorItem.Type.HELMET, 4);
        enumMap.put(ArmorItem.Type.BODY, 12);
    }), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.5F, 0.2F, () -> Ingredient.of(CCItems.ENDERITE_INGOT.get()));

    /**
     * Impide instanciar esta clase de registro.
     */
    private CCArmorMaterials() {}

    /**
     * Publica el {@link DeferredRegister} de materiales de armadura.
     *
     * @see DeferredRegister#register()
     */
    public static void init() 
    {
        ARMOR_MATERIALS.register();
    }

    /**
     * Registra un {@link ArmorMaterial} con una sola capa de textura {@code captercraft:<name>}.
     *
     * @param name                 ruta del material
     * @param defense              defensa por tipo de pieza
     * @param enchantmentValue     encantabilidad
     * @param equipSound           sonido al equipar
     * @param toughness            dureza de armadura
     * @param knockbackResistance  resistencia al empuje
     * @param repairIngredient     ingrediente de reparación
     * @return proveedor del material registrado
     * @see ArmorMaterial.Layer
     */
    private static RegistrySupplier<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient) 
    {
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(
                defense,
                enchantmentValue,
                equipSound,
                repairIngredient,
                List.of(new ArmorMaterial.Layer(CCMod.id(name))),
                toughness,
                knockbackResistance));
    }
}
