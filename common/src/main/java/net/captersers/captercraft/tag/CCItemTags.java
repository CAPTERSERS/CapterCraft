package net.captersers.captercraft.tag;

import net.captersers.captercraft.CCMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

/**
 * Claves de tags de ítem de CapterCraft.
 * El contenido JSON vive en {@code data/captercraft/tags/item/}.
 *
 * @see TagKey
 */
public final class CCItemTags
{
    /**
     * Materiales de reparación de herramientas de enderita.
     */
    public static final TagKey<Item> ENDERITE_TOOL_MATERIALS = TagKey.create(Registries.ITEM, CCMod.id("enderite_tool_materials"));

    /**
     * Materiales de reparación de armadura de enderita.
     */
    public static final TagKey<Item> REPAIRS_ENDERITE_ARMOR = TagKey.create(Registries.ITEM, CCMod.id("repairs_enderite_armor"));

    /**
     * Impide instanciar esta clase de tags.
     */
    private CCItemTags() {}
}
