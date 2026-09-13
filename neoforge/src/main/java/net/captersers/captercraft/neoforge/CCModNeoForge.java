package net.captersers.captercraft.neoforge;

import net.captersers.captercraft.CCMod;
import net.neoforged.fml.common.Mod;

/**
 * Entrada de NeoForge: inicializa el núcleo común.
 * El void shard en el End se añade con el biome modifier JSON
 * {@code neoforge/src/main/resources/data/captercraft/neoforge/biome_modifier/void_shard.json}.
 *
 * @see CCMod#init()
 * @see Mod
 */
@Mod(CCMod.MOD_ID)
public final class CCModNeoForge 
{
    /**
     * Construye el mod y registra bloques, ítems y pestaña creativa.
     *
     * @see CCMod#init()
     */
    public CCModNeoForge() 
    {
        CCMod.init();
    }
}
