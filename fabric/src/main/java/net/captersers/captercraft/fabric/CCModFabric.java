package net.captersers.captercraft.fabric;

import net.captersers.captercraft.CCMod;
import net.captersers.captercraft.fabric.worldgen.CCFabricBiomeModifications;
import net.fabricmc.api.ModInitializer;

/**
 * Entrada de Fabric: inicializa el núcleo común y la generación del void shard en el End.
 *
 * @see CCMod#init()
 * @see CCFabricBiomeModifications
 */
public final class CCModFabric implements ModInitializer 
{
    /**
     * Arranca CapterCraft en Fabric.
     *
     * @see ModInitializer#onInitialize()
     */
    @Override
    public void onInitialize() 
    {
        CCMod.init();
        CCFabricBiomeModifications.init();
    }
}
