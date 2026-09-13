package net.captersers.captercraft.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.captersers.captercraft.CCMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeightedPressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

/**
 * Registro de bloques de CapterCraft.
 * Las propiedades (dureza, sonido, herramienta) coinciden con el diseño original del mod.
 *
 * @see Registries#BLOCK
 * @see CCItems
 */
public final class CCBlocks 
{
    /**
     * Registro diferido de bloques bajo el espacio {@link CCMod#MOD_ID}.
     *
     * @see DeferredRegister
     */
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CCMod.MOD_ID, Registries.BLOCK);

    /**
     * Bloque de almacenamiento de enderita: color púrpura, dureza 50/1200 y sonido de netherita.
     *
     * @see SoundType#NETHERITE_BLOCK
     */
    public static final RegistrySupplier<Block> BLOCK_OF_ENDERITE = register("block_of_enderite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.NETHERITE_BLOCK)));

    /**
     * Placa de presión ponderada media (máximo 75 entidades), set de cobre.
     *
     * @see WeightedPressurePlateBlock
     * @see BlockSetType#COPPER
     */
    public static final RegistrySupplier<Block> MEDIUM_WEIGHTED_PRESSURE_PLATE = register("medium_weighted_pressure_plate",
            () -> new WeightedPressurePlateBlock(75, BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .forceSolidOn()
                    .requiresCorrectToolForDrops()
                    .noCollission()
                    .strength(0.5F)
                    .pushReaction(PushReaction.DESTROY)));

    /**
     * Mena del End (void shard): dureza 30/1200 y sonido de mena del Nether.
     *
     * @see SoundType#NETHER_ORE
     */
    public static final RegistrySupplier<Block> VOID_SHARD = register("void_shard",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F)
                    .sound(SoundType.NETHER_ORE)));

    /**
     * Impide instanciar esta clase de registro.
     */
    private CCBlocks() {}

    /**
     * Publica el {@link DeferredRegister} de bloques en el juego.
     *
     * @see DeferredRegister#register()
     */
    public static void init() 
    {
        BLOCKS.register();
    }

    /**
     * Registra un bloque con identificador {@code captercraft:<name>}.
     *
     * @param name     ruta del bloque
     * @param supplier fábrica diferida del bloque
     * @return proveedor del bloque registrado
     * @see CCMod#id(String)
     */
    private static RegistrySupplier<Block> register(String name, Supplier<Block> supplier) 
    {
        return BLOCKS.register(CCMod.id(name), supplier);
    }
}
