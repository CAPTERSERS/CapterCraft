package net.captersers.captercraft.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.item.CCSmithingTemplates;
import net.captersers.captercraft.item.material.CCArmorMaterials;
import net.captersers.captercraft.item.material.CCToolTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

import java.util.function.Supplier;

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
            () -> new BlockItem(CCBlocks.BLOCK_OF_ENDERITE.get(), new Item.Properties().fireResistant()));

    /**
     * Ítem de la placa de presión ponderada media.
     *
     * @see CCBlocks#MEDIUM_WEIGHTED_PRESSURE_PLATE
     */
    public static final RegistrySupplier<Item> MEDIUM_WEIGHTED_PRESSURE_PLATE = register("medium_weighted_pressure_plate",
            () -> new BlockItem(CCBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), new Item.Properties()));

    /**
     * Ítem del bloque void shard (resistente al fuego).
     *
     * @see CCBlocks#VOID_SHARD
     */
    public static final RegistrySupplier<Item> VOID_SHARD = register("void_shard",
            () -> new BlockItem(CCBlocks.VOID_SHARD.get(), new Item.Properties().fireResistant()));

    /**
     * Pepita de cobre.
     */
    public static final RegistrySupplier<Item> COPPER_NUGGET = register("copper_nugget",
            () -> new Item(new Item.Properties()));

    /**
     * Lingote de enderita (resistente al fuego).
     */
    public static final RegistrySupplier<Item> ENDERITE_INGOT = register("enderite_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    /**
     * Fragmento de enderita (resistente al fuego).
     */
    public static final RegistrySupplier<Item> ENDERITE_SHARD = register("enderite_shard",
            () -> new Item(new Item.Properties().fireResistant()));

    /**
     * Molde de herrería de mejora de enderita.
     *
     * @see CCSmithingTemplates#createEnderiteUpgradeTemplate()
     */
    public static final RegistrySupplier<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = register(
            "enderite_upgrade_smithing_template",
            CCSmithingTemplates::createEnderiteUpgradeTemplate);

    /**
     * Botas de cobre (durabilidad de nivel 10).
     *
     * @see CCArmorMaterials#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_BOOTS = register("copper_boots",
            () -> new ArmorItem(CCArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));

    /**
     * Peto de cobre (durabilidad de nivel 10).
     *
     * @see CCArmorMaterials#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_CHESTPLATE = register("copper_chestplate",
            () -> new ArmorItem(CCArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));

    /**
     * Casco de cobre (durabilidad de nivel 10).
     *
     * @see CCArmorMaterials#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_HELMET = register("copper_helmet",
            () -> new ArmorItem(CCArmorMaterials.COPPER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));

    /**
     * Grebas de cobre (durabilidad de nivel 10).
     *
     * @see CCArmorMaterials#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_LEGGINGS = register("copper_leggings",
            () -> new ArmorItem(CCArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));

    /**
     * Botas de enderita (nivel 42, resistentes al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_BOOTS = register("enderite_boots",
            () -> new ArmorItem(CCArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(42))));

    /**
     * Peto de enderita (nivel 42, resistente al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_CHESTPLATE = register("enderite_chestplate",
            () -> new ArmorItem(CCArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(42))));

    /**
     * Casco de enderita (nivel 42, resistente al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_HELMET = register("enderite_helmet",
            () -> new ArmorItem(CCArmorMaterials.ENDERITE, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(42))));

    /**
     * Grebas de enderita (nivel 42, resistentes al fuego).
     *
     * @see CCArmorMaterials#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_LEGGINGS = register("enderite_leggings",
            () -> new ArmorItem(CCArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(42))));

    /**
     * Hacha de cobre (daño 6.5, velocidad -3.2).
     *
     * @see CCToolTiers#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_AXE = register("copper_axe",
            () -> new AxeItem(CCToolTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(CCToolTiers.COPPER, 6.5F, -3.2F))));

    /**
     * Azada de cobre (daño -1.5, velocidad -1.5).
     *
     * @see CCToolTiers#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_HOE = register("copper_hoe",
            () -> new HoeItem(CCToolTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(CCToolTiers.COPPER, -1.5F, -1.5F))));

    /**
     * Pico de cobre (daño 1.0, velocidad -2.8).
     *
     * @see CCToolTiers#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_PICKAXE = register("copper_pickaxe",
            () -> new PickaxeItem(CCToolTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(CCToolTiers.COPPER, 1.0F, -2.8F))));

    /**
     * Pala de cobre (daño 1.5, velocidad -3.0).
     *
     * @see CCToolTiers#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_SHOVEL = register("copper_shovel",
            () -> new ShovelItem(CCToolTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(CCToolTiers.COPPER, 1.5F, -3.0F))));

    /**
     * Espada de cobre (daño 3, velocidad -2.4).
     *
     * @see CCToolTiers#COPPER
     */
    public static final RegistrySupplier<Item> COPPER_SWORD = register("copper_sword",
            () -> new SwordItem(CCToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(CCToolTiers.COPPER, 3, -2.4F))));

    /**
     * Hacha de enderita (daño 5.0, velocidad -2.5, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_AXE = register("enderite_axe",
            () -> new AxeItem(CCToolTiers.ENDERITE, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(CCToolTiers.ENDERITE, 5.0F, -2.5F))));

    /**
     * Azada de enderita (daño -4.0, velocidad 1.0, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_HOE = register("enderite_hoe",
            () -> new HoeItem(CCToolTiers.ENDERITE, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(CCToolTiers.ENDERITE, -4.0F, 1.0F))));

    /**
     * Pico de enderita (daño 1.0, velocidad -2.4, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_PICKAXE = register("enderite_pickaxe",
            () -> new PickaxeItem(CCToolTiers.ENDERITE, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(CCToolTiers.ENDERITE, 1.0F, -2.4F))));

    /**
     * Pala de enderita (daño 1.5, velocidad -2.5, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_SHOVEL = register("enderite_shovel",
            () -> new ShovelItem(CCToolTiers.ENDERITE, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(CCToolTiers.ENDERITE, 1.5F, -2.5F))));

    /**
     * Espada de enderita (daño 3, velocidad -2.0, resistente al fuego).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final RegistrySupplier<Item> ENDERITE_SWORD = register("enderite_sword",
            () -> new SwordItem(CCToolTiers.ENDERITE, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(CCToolTiers.ENDERITE, 3, -2.0F))));

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
     * Registra un ítem con identificador {@code captercraft:<name>}.
     *
     * @param name     ruta del ítem
     * @param supplier fábrica diferida del ítem
     * @return proveedor del ítem registrado
     * @see CCMod#id(String)
     */
    private static RegistrySupplier<Item> register(String name, Supplier<Item> supplier) 
    {
        return ITEMS.register(CCMod.id(name), supplier);
    }
}
