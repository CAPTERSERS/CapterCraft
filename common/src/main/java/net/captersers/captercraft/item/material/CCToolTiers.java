package net.captersers.captercraft.item.material;

import net.captersers.captercraft.tag.CCBlockTags;
import net.captersers.captercraft.tag.CCItemTags;
import net.minecraft.world.item.ToolMaterial;

/**
 * Material de herramienta de enderita (durabilidad, velocidad, daño y reparación).
 *
 * @see ToolMaterial
 * @see CCBlockTags
 * @see CCItemTags
 */
public final class CCToolTiers
{
    /**
     * Enderita: 3120 usos, velocidad 10.0, daño +5.0, encantabilidad 18.
     *
     * @see CCItemTags#ENDERITE_TOOL_MATERIALS
     * @see CCBlockTags#INCORRECT_FOR_ENDERITE_TOOL
     */
    public static final ToolMaterial ENDERITE = new ToolMaterial(
            CCBlockTags.INCORRECT_FOR_ENDERITE_TOOL,
            3120,
            10.0F,
            5.0F,
            18,
            CCItemTags.ENDERITE_TOOL_MATERIALS);

    /**
     * Impide instanciar esta clase de materiales.
     */
    private CCToolTiers() {}
}
