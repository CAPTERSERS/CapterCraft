package net.captersers.captercraft.registry;

import dev.architectury.registry.CreativeTabOutput;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

/**
 * Coloca cada ítem del mod en las pestañas vanilla, en grupos como Minecraft
 * (pala, pico, hacha, azada / casco, peto, grebas, botas).
 * Enderita va después de netherita.
 *
 * @see CreativeTabRegistry#modify
 * @see CreativeModeTabs
 */
public final class CCVanillaCreativeTabs
{
    /**
     * Impide instanciar esta clase de utilidades.
     */
    private CCVanillaCreativeTabs() {}

    /**
     * Registra las inserciones en las pestañas vanilla.
     *
     * @see CreativeTabRegistry#defer
     */
    public static void init()
    {
        /**
         * Bloques de construcción.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.BUILDING_BLOCKS), (flags, output, canUseGameMasterBlocks) ->
        {
            output.acceptAfter(Items.NETHERITE_BLOCK, CCItems.BLOCK_OF_ENDERITE.get());
        });

        /**
         * Bloques naturales.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.NATURAL_BLOCKS), (flags, output, canUseGameMasterBlocks) ->
        {
            output.acceptAfter(Items.ANCIENT_DEBRIS, CCItems.VOID_SHARD.get());
        });

        /**
         * Bloques de redstone.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.REDSTONE_BLOCKS), (flags, output, canUseGameMasterBlocks) ->
        {
            output.acceptAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, CCItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());
        });

        /**
         * Herramientas y utilidades.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.TOOLS_AND_UTILITIES), (flags, output, canUseGameMasterBlocks) ->
        {
            acceptGroupAfter(output, Items.NETHERITE_HOE,
                    CCItems.ENDERITE_SHOVEL.get(),
                    CCItems.ENDERITE_PICKAXE.get(),
                    CCItems.ENDERITE_AXE.get(),
                    CCItems.ENDERITE_HOE.get());
        });

        /**
         * Armas y armaduras.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.COMBAT), (flags, output, canUseGameMasterBlocks) ->
        {
            output.acceptAfter(Items.NETHERITE_SWORD, CCItems.ENDERITE_SWORD.get());
            output.acceptAfter(Items.NETHERITE_AXE, CCItems.ENDERITE_AXE.get());
            acceptGroupAfter(output, Items.NETHERITE_BOOTS,
                    CCItems.ENDERITE_HELMET.get(),
                    CCItems.ENDERITE_CHESTPLATE.get(),
                    CCItems.ENDERITE_LEGGINGS.get(),
                    CCItems.ENDERITE_BOOTS.get());
        });

        /**
         * Ingredientes.
         */
        CreativeTabRegistry.modify(CreativeTabRegistry.defer(CreativeModeTabs.INGREDIENTS), (flags, output, canUseGameMasterBlocks) ->
        {
            output.acceptAfter(Items.NETHERITE_SCRAP, CCItems.ENDERITE_SHARD.get());
            output.acceptAfter(Items.NETHERITE_INGOT, CCItems.ENDERITE_INGOT.get());
            output.acceptAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, CCItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());
        });
    }

    /**
     * Inserta {@code items} juntos, en ese orden, justo después de {@code after}.
     * Se insertan al revés para que pala/casco queden primero como en vanilla.
     *
     * @param output salida de la pestaña creativa
     * @param after  ítem vanilla que cierra el grupo anterior
     * @param items  ítems del mod en orden de visualización
     * @see CreativeTabOutput#acceptAfter
     */
    private static void acceptGroupAfter(CreativeTabOutput output, ItemLike after, Item... items)
    {
        for (int index = items.length - 1; index >= 0; index--)
        {
            output.acceptAfter(after, items[index]);
        }
    }
}
