package net.captersers.captercraft.item;

import net.captersers.captercraft.CCMod;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

/**
 * Fábrica de plantillas de herrería de CapterCraft.
 * Define textos e iconos de ranura de la mejora de enderita.
 *
 * @see SmithingTemplateItem
 * @see net.captersers.captercraft.registry.CCItems#ENDERITE_UPGRADE_SMITHING_TEMPLATE
 */
public final class CCSmithingTemplates 
{
    /**
     * Color del título de la mejora en la interfaz de herrería.
     *
     * @see ChatFormatting#GRAY
     */
    private static final ChatFormatting TITLE = ChatFormatting.GRAY;

    /**
     * Color de las descripciones de aplica-a e ingredientes.
     *
     * @see ChatFormatting#BLUE
     */
    private static final ChatFormatting DESCRIPTION = ChatFormatting.BLUE;

    /**
     * Icono de ranura vacía de casco en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet");

    /**
     * Icono de ranura vacía de peto en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate");

    /**
     * Icono de ranura vacía de grebas en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings");

    /**
     * Icono de ranura vacía de botas en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots");

    /**
     * Icono de ranura vacía de azada en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");

    /**
     * Icono de ranura vacía de hacha en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");

    /**
     * Icono de ranura vacía de espada en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");

    /**
     * Icono de ranura vacía de pala en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");

    /**
     * Icono de ranura vacía de pico en la plantilla de herrería.
     */
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");

    /**
     * Icono de ranura vacía de lingote (material adicional).
     */
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("item/empty_slot_ingot");

    /**
     * Texto «se aplica a» del molde de mejora de enderita.
     *
     * @see Component#translatable(String)
     */
    private static final Component ENDERITE_UPGRADE_APPLIES_TO = Component.translatable(
            Util.makeDescriptionId("item", CCMod.id("smithing_template.enderite_upgrade.applies_to"))).withStyle(DESCRIPTION);

    /**
     * Texto de ingredientes del molde de mejora de enderita.
     */
    private static final Component ENDERITE_UPGRADE_INGREDIENTS = Component.translatable(
            Util.makeDescriptionId("item", CCMod.id("smithing_template.enderite_upgrade.ingredients"))).withStyle(DESCRIPTION);

    /**
     * Descripción de la ranura base (equipo de netherita).
     */
    private static final Component ENDERITE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", CCMod.id("smithing_template.enderite_upgrade.base_slot_description")));

    /**
     * Descripción de la ranura de adición (lingote de enderita).
     */
    private static final Component ENDERITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", CCMod.id("smithing_template.enderite_upgrade.additions_slot_description")));

    /**
     * Título de la mejora de enderita en la mesa de herrería.
     */
    private static final Component ENDERITE_UPGRADE = Component.translatable(
            Util.makeDescriptionId("upgrade", CCMod.id("enderite_upgrade"))).withStyle(TITLE);

    /**
     * Impide instanciar esta clase de fábrica.
     */
    private CCSmithingTemplates() {}

    /**
     * Crea el {@link SmithingTemplateItem} de mejora de netherita a enderita.
     *
     * @return plantilla configurada con textos e iconos de ranura
     * @see #createEnderiteUpgradeEmptySlotList()
     * @see #createEnderiteUpgradeEmptyMaterialList()
     */
    public static SmithingTemplateItem createEnderiteUpgradeTemplate() 
    {
        return new SmithingTemplateItem(
                ENDERITE_UPGRADE_APPLIES_TO,
                ENDERITE_UPGRADE_INGREDIENTS,
                ENDERITE_UPGRADE,
                ENDERITE_UPGRADE_BASE_SLOT_DESCRIPTION,
                ENDERITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createEnderiteUpgradeEmptySlotList(),
                createEnderiteUpgradeEmptyMaterialList());
    }

    /**
     * Lista de iconos de ranura base (armadura y herramientas).
     *
     * @return ubicaciones de textura de ranura vacía
     */
    private static List<ResourceLocation> createEnderiteUpgradeEmptySlotList() 
    {
        return List.of(
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE,
                EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL);
    }

    /**
     * Lista de iconos de ranura de material (lingote de enderita).
     *
     * @return ubicaciones de textura de material vacío
     */
    private static List<ResourceLocation> createEnderiteUpgradeEmptyMaterialList() 
    {
        return List.of(EMPTY_SLOT_INGOT);
    }
}
