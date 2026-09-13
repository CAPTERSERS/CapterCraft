package net.captersers.captercraft.tag;

import net.captersers.captercraft.CCMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

/**
 * Claves de tags de bioma de CapterCraft.
 * El contenido JSON vive en {@code data/captercraft/tags/worldgen/biome/}.
 *
 * @see TagKey
 */
public final class CCBiomeTags 
{
    /**
     * Biomas del End donde genera void shard (islas exteriores, no la isla de la dragona).
     *
     * @see net.minecraft.world.level.biome.Biomes#THE_END
     */
    public static final TagKey<Biome> HAS_VOID_SHARD = TagKey.create(Registries.BIOME, CCMod.id("has_void_shard"));

    /**
     * Impide instanciar esta clase de tags.
     */
    private CCBiomeTags() {}
}
