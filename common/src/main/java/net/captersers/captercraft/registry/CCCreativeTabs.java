package net.captersers.captercraft.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.DeferredSupplier;
import net.captersers.captercraft.CCMod;
import net.minecraft.util.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Pestaña creativa de CapterCraft.
 * El orden de ítems replica el registro (bloques, herramientas, combate, ingredientes).
 *
 * @see CreativeModeTab
 * @see CCBlocks
 * @see CCItems
 */
public final class CCCreativeTabs
{
    /**
     * Registro diferido de pestañas creativas.
     *
     * @see DeferredRegister
     */
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(CCMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    /**
     * Título traducido {@code category.captercraft.tab}.
     *
     * @see Component#translatable(String)
     */
    private static final Component TITLE = Component.translatable(Util.makeDescriptionId("category", CCMod.id("tab")));

    /**
     * Pestaña {@code captercraft:captercraft} con icono de bloque de enderita.
     *
     * @see CCBlocks#BLOCK_OF_ENDERITE
     */
    public static final DeferredSupplier<CreativeModeTab> CAPTERCRAFT_TAB = TABS.register("captercraft", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(TITLE)
            .icon(() -> new ItemStack(CCBlocks.BLOCK_OF_ENDERITE.get()))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(CCBlocks.BLOCK_OF_ENDERITE.get());
                output.accept(CCBlocks.VOID_SHARD.get());
                output.accept(CCBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());
                output.accept(CCItems.ENDERITE_SHOVEL.get());
                output.accept(CCItems.ENDERITE_PICKAXE.get());
                output.accept(CCItems.ENDERITE_AXE.get());
                output.accept(CCItems.ENDERITE_HOE.get());
                output.accept(CCItems.ENDERITE_SWORD.get());
                output.accept(CCItems.ENDERITE_HELMET.get());
                output.accept(CCItems.ENDERITE_CHESTPLATE.get());
                output.accept(CCItems.ENDERITE_LEGGINGS.get());
                output.accept(CCItems.ENDERITE_BOOTS.get());
                output.accept(CCItems.ENDERITE_SHARD.get());
                output.accept(CCItems.ENDERITE_INGOT.get());
                output.accept(CCItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());
            })
            .build());

    /**
     * Impide instanciar esta clase de registro.
     */
    private CCCreativeTabs() {}

    /**
     * Publica el {@link DeferredRegister} de pestañas creativas.
     *
     * @see DeferredRegister#register()
     */
    public static void init()
    {
        TABS.register();
    }
}
