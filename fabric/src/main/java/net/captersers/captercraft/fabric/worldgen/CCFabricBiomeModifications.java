package net.captersers.captercraft.fabric.worldgen;

import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.tag.CCBiomeTags;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

/**
 * Inyecta las vetas grande y pequeña de void shard en Fabric.
 * Fabric no lee biome modifiers de NeoForge; esta clase es el equivalente del JSON
 * en el módulo NeoForge. Se excluye {@link Biomes#THE_END} (isla de la dragona).
 * Los biomas válidos coinciden con {@link CCBiomeTags#HAS_VOID_SHARD}.
 *
 * @see BiomeModifications#addFeature
 * @see BiomeSelectors#foundInTheEnd()
 */
public final class CCFabricBiomeModifications 
{
    /**
     * Veta grande (size 3, 1 intento), equivalente a {@code ore_ancient_debris_large}.
     *
     * @see Registries#PLACED_FEATURE
     */
    private static final ResourceKey<PlacedFeature> VOID_SHARD_PLACED =
            ResourceKey.create(Registries.PLACED_FEATURE, CCMod.id("void_shard_placed"));

    /**
     * Vetas pequeñas (size 2, 2 intentos), equivalente a {@code ore_ancient_debris_small}.
     *
     * @see Registries#PLACED_FEATURE
     */
    private static final ResourceKey<PlacedFeature> VOID_SHARD_PLACED_SMALL =
            ResourceKey.create(Registries.PLACED_FEATURE, CCMod.id("void_shard_placed_small"));

    /**
     * Impide instanciar esta clase de worldgen.
     */
    private CCFabricBiomeModifications() {}

    /**
     * Añade void shard a {@link GenerationStep.Decoration#UNDERGROUND_ORES} en islas exteriores del End.
     *
     * @see Biomes#THE_END
     */
    public static void init() 
    {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(Biomes.THE_END)),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                VOID_SHARD_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd().and(BiomeSelectors.excludeByKey(Biomes.THE_END)),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                VOID_SHARD_PLACED_SMALL);
    }
}
