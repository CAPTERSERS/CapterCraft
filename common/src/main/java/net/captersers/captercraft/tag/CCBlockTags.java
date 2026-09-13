package net.captersers.captercraft.tag;

import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.item.material.CCToolTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

/**
 * Claves de tags de bloque de CapterCraft.
 * El contenido JSON vive en {@code data/captercraft/tags/block/}.
 *
 * @see CCToolTiers
 * @see TagKey
 */
public final class CCBlockTags
{
    /**
     * Bloques que el nivel de enderita no cosecha correctamente (solo bedrock).
     *
     * @see CCToolTiers#ENDERITE
     */
    public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = TagKey.create(Registries.BLOCK, CCMod.id("incorrect_for_enderite_tool"));

    /**
     * Impide instanciar esta clase de tags.
     */
    private CCBlockTags() {}
}
