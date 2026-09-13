package net.captersers.captercraft.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.item.CCSmithingTemplates;
import net.captersers.captercraft.item.material.CCArmorMaterials;
import net.captersers.captercraft.item.material.CCToolTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

/**
 * Registro de ítems de CapterCraft (block items, materiales, armadura y herramientas).
 *
 * @see CCBlocks
 * @see CCArmorMaterials
 * @see CCToolTiers
 */
public final class CCItems
{
    /**
     * Registro diferido de ítems bajo el espacio {@link CCMod#MOD_ID}.
     *
     * @see DeferredRegister
     */
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CCMod.MOD_ID, Registries.ITEM);

    /**
     * Ítem del bloque de enderita (resistente al fuego).
     *
     * @see CCBlocks#BLOCK_OF_ENDERITE
     */
    public static final RegistrySupplier<Item> BLOCK_OF_ENDERITE = register("block_of_enderite",
            properties -> new BlockItem(CCBlocks.BLOCK_OF_ENDERITE.get(), properties.useBlockDescriptionPrefix().fireResistant()));

    /**
     * Ítem de la placa de presión ponderada media.
     *
     * @see CCBlocks#MEDIUM_WEIGHTED_PRESSURE_PLATE
     */
    public static final RegistrySupplier<Item> MEDIUM_WEIGHTED_PRESSURE_PLATE = register("medium_weighted_pressure_plate",
            properties -> new BlockItem(CCBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), properties.useBlockDescriptionPrefix()));

    /**
     * Ítem del bloque void shard (resistente al fuego).
     *
     * @see CCBlocks#VOID_SHARD
     */
    public static final RegistrySupplier<Item> VOID_SHARD = register("void_shard",
            properties -> new BlockItem(CCBlocks.VOID_SHARD.get(), properties.useBlockDescriptionPrefix().fireResistant()));

    /**
     * Lingote de enderita (resistente al fuego).
     */
    public static final RegistrySupplier<Item> ENDERITE_INGOT = register("enderite_ingot",
            properties -> new Item(properties.fireResistant()));

    /**
     * Fragmento de enderita (resistente al fuego).
     */
    public static final RegistrySupplier<Item> ENDERITE_SHARD = register("enderite_shard",
            properties -> new Item(properties.fireResistant()));

    /**
     * Molde de herrería de mejora de enderita.
     *
     * @see CCSmithingTemplates#createEnderiteUpgradeTemplate(Item.Properties)
     */
    public static final RegistrySupplier<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = register(
            "enderite_upgrade_smithing_template",
            CCSmithingTemplates::createEnderiteUpgradeTemplate);

    /**
     * Botas de enderita (nivel 42, resistentes al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_BOOTS = register("enderite_boots",
            properties -> new Item(properties
                    .humanoidArmor(CCArmorMaterials.ENDERITE, ArmorType.BOOTS)
                    .fireResistant()
                    .durability(ArmorType.BOOTS.getDurability(42))));

    /**
     * Peto de enderita (nivel 42, resistente al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_CHESTPLATE = register("enderite_chestplate",
            properties -> new Item(properties
                    .humanoidArmor(CCArmorMaterials.ENDERITE, ArmorType.CHESTPLATE)
                    .fireResistant()
                    .durability(ArmorType.CHESTPLATE.getDurability(42))));

    /**
     * Casco de enderita (nivel 42, resistente al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_HELMET = register("enderite_helmet",
            properties -> new Item(properties
                    .humanoidArmor(CCArmorMaterials.ENDERITE, ArmorType.HELMET)
                    .fireResistant()
                    .durability(ArmorType.HELMET.getDurability(42))));

    /**
     * Grebas de enderita (nivel 42, resistentes al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_LEGGINGS = register("enderite_leggings",
            properties -> new Item(properties
                    .humanoidArmor(CCArmorMaterials.ENDERITE, ArmorType.LEGGINGS)
                    .fireResistant()
                    .durability(ArmorType.LEGGINGS.getDurability(42))));

    /**
     * Hacha de enderita (daño 5.0, velocidad -2.5, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_AXE = register("enderite_axe",
            properties -> new Item(properties.axe(CCToolTiers.ENDERITE, 5.0F, -2.5F).fireResistant()));

    /**
     * Azada de enderita (daño -4.0, velocidad 1.0, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_HOE = register("enderite_hoe",
            properties -> new Item(properties.hoe(CCToolTiers.ENDERITE, -4.0F, 1.0F).fireResistant()));

    /**
     * Pico de enderita (daño 1.0, velocidad -2.4, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_PICKAXE = register("enderite_pickaxe",
            properties -> new Item(properties.pickaxe(CCToolTiers.ENDERITE, 1.0F, -2.4F).fireResistant()));

    /**
     * Pala de enderita (daño 1.5, velocidad -2.5, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_SHOVEL = register("enderite_shovel",
            properties -> new Item(properties.shovel(CCToolTiers.ENDERITE, 1.5F, -2.5F).fireResistant()));

    /**
     * Espada de enderita (daño 3, velocidad -2.0, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_SWORD = register("enderite_sword",
            properties -> new Item(properties.sword(CCToolTiers.ENDERITE, 3.0F, -2.0F).fireResistant()));

    /**
     * Impide instanciar esta clase de registro.
     */
    private CCItems() {}

    /**
     * Publica el {@link DeferredRegister} de ítems.
     *
     * @see DeferredRegister#register()
     */
    public static void init()
    {
        ITEMS.register();
    }

    /**
     * Registra un ítem con identificador {@code captercraft:<path>} y {@link Item.Properties#setId}.
     *
     * @param name    ruta del ítem
     * @param factory fábrica que recibe propiedades ya identificadas
     * @return proveedor del ítem registrado
     * @see CCMod#id(String)
     */
    private static RegistrySupplier<Item> register(String name, Function<Item.Properties, Item> factory)
    {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, CCMod.id(name));
        return ITEMS.register(CCMod.id(name), () -> factory.apply(new Item.Properties().setId(key)));
    }
}
