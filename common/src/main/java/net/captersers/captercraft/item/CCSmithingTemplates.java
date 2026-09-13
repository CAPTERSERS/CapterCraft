package net.captersers.captercraft.item;

import net.captersers.captercraft.CCMod;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
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
     * Color de las descripciones de aplica-a e ingredientes.
     *
     * @see ChatFormatting#BLUE
     */
    private static final ChatFormatting DESCRIPTION = ChatFormatting.BLUE;

    /**
     * Icono de ranura vacía de casco en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_HELMET = Identifier.withDefaultNamespace("container/slot/helmet");

    /**
     * Icono de ranura vacía de peto en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_CHESTPLATE = Identifier.withDefaultNamespace("container/slot/chestplate");

    /**
     * Icono de ranura vacía de grebas en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_LEGGINGS = Identifier.withDefaultNamespace("container/slot/leggings");

    /**
     * Icono de ranura vacía de botas en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_BOOTS = Identifier.withDefaultNamespace("container/slot/boots");

    /**
     * Icono de ranura vacía de azada en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_HOE = Identifier.withDefaultNamespace("container/slot/hoe");

    /**
     * Icono de ranura vacía de hacha en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_AXE = Identifier.withDefaultNamespace("container/slot/axe");

    /**
     * Icono de ranura vacía de espada en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_SWORD = Identifier.withDefaultNamespace("container/slot/sword");

    /**
     * Icono de ranura vacía de pala en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_SHOVEL = Identifier.withDefaultNamespace("container/slot/shovel");

    /**
     * Icono de ranura vacía de pico en la plantilla de herrería.
     */
    private static final Identifier EMPTY_SLOT_PICKAXE = Identifier.withDefaultNamespace("container/slot/pickaxe");

    /**
     * Icono de ranura vacía de lingote (material adicional).
     */
    private static final Identifier EMPTY_SLOT_INGOT = Identifier.withDefaultNamespace("container/slot/ingot");

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
     * Impide instanciar esta clase de fábrica.
     */
    private CCSmithingTemplates() {}

    /**
     * Crea el {@link SmithingTemplateItem} de mejora de netherita a enderita.
     *
     * @param properties propiedades del ítem (ya identificadas por el registro)
     * @return plantilla configurada con textos e iconos de ranura
     * @see #createEnderiteUpgradeEmptySlotList()
     * @see #createEnderiteUpgradeEmptyMaterialList()
     */
    public static SmithingTemplateItem createEnderiteUpgradeTemplate(Item.Properties properties)
    {
        return new SmithingTemplateItem(
                ENDERITE_UPGRADE_APPLIES_TO,
                ENDERITE_UPGRADE_INGREDIENTS,
                ENDERITE_UPGRADE_BASE_SLOT_DESCRIPTION,
                ENDERITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createEnderiteUpgradeEmptySlotList(),
                createEnderiteUpgradeEmptyMaterialList(),
                properties);
    }

    /**
     * Lista de iconos de ranura base (armadura y herramientas).
     *
     * @return ubicaciones de textura de ranura vacía
     */
    private static List<Identifier> createEnderiteUpgradeEmptySlotList()
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
    private static List<Identifier> createEnderiteUpgradeEmptyMaterialList()
    {
        return List.of(EMPTY_SLOT_INGOT);
    }
}
