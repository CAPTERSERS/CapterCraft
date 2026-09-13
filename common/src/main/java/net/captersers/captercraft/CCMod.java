package net.captersers.captercraft;

import net.captersers.captercraft.item.material.CCArmorMaterials;
import net.captersers.captercraft.registry.CCBlocks;
import net.captersers.captercraft.registry.CCCreativeTabs;
import net.captersers.captercraft.registry.CCItems;
import net.captersers.captercraft.registry.CCVanillaCreativeTabs;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Punto de entrada común de CapterCraft (Architectury).
 * Orquesta el registro de materiales, bloques, ítems y la pestaña creativa.
 *
 * @see CCArmorMaterials
 * @see CCBlocks
 * @see CCItems
 * @see CCCreativeTabs
 * @see CCVanillaCreativeTabs
 */
public final class CCMod 
{
    /**
     * Identificador del mod y espacio de nombres de recursos ({@code captercraft}).
     */
    public static final String MOD_ID = "captercraft";

    /**
     * Registrador de mensajes de arranque y diagnóstico.
     *
     * @see LoggerFactory#getLogger(String)
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Impide instanciar esta clase de utilidades.
     */
    private CCMod() {}

    /**
     * Inicializa los registros compartidos entre Fabric y NeoForge.
     * Los materiales de armadura se registran antes que los ítems porque
     * {@link CCItems} referencia {@link CCArmorMaterials} en sus proveedores.
     *
     * @see CCArmorMaterials#init()
     * @see CCBlocks#init()
     * @see CCItems#init()
     * @see CCCreativeTabs#init()
     * @see CCVanillaCreativeTabs#init()
     */
    public static void init() 
    {
        CCArmorMaterials.init();
        CCBlocks.init();
        CCItems.init();
        CCCreativeTabs.init();
        CCVanillaCreativeTabs.init();
    }

    /**
     * Construye un {@link ResourceLocation} bajo el espacio {@link #MOD_ID}.
     *
     * @param path ruta del recurso (bloque, ítem, tag, feature, etc.)
     * @return identificador {@code captercraft:<path>}
     * @see ResourceLocation#fromNamespaceAndPath(String, String)
     */
    public static ResourceLocation id(String path) 
    {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
