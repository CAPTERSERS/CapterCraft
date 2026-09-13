package net.captersers.captercraft.item.material;

import net.captersers.captercraft.registry.CCItems;
import net.captersers.captercraft.tag.CCBlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

/**
 * Niveles de herramienta de CapterCraft (durabilidad, velocidad, daño y reparación).
 *
 * @see Tier
 * @see CCBlockTags
 */
public enum CCToolTiers implements Tier 
{
    /**
     * Cobre : 190 usos, velocidad 5.0, daño +1.0, encantabilidad 13.
     *
     * @see Items#COPPER_INGOT
     * @see CCBlockTags#INCORRECT_FOR_COPPER_TOOL
     */
    COPPER(CCBlockTags.INCORRECT_FOR_COPPER_TOOL, 190, 5.0F, 1.0F, 13, Ingredient.of(Items.COPPER_INGOT)),

    /**
     * Enderita: 3120 usos, velocidad 10.0, daño +5.0, encantabilidad 18.
     *
     * @see CCItems#ENDERITE_INGOT
     * @see CCBlockTags#INCORRECT_FOR_ENDERITE_TOOL
     */
    ENDERITE(CCBlockTags.INCORRECT_FOR_ENDERITE_TOOL, 3120, 10.0F, 5.0F, 18, Ingredient.of(CCItems.ENDERITE_INGOT.get()));

    /**
     * Bonificación de daño de ataque del nivel.
     */
    private final float damage;

    /**
     * Encantabilidad del nivel.
     */
    private final int enchantmentValue;

    /**
     * Bloques que no sueltan botín correcto con este nivel.
     *
     * @see TagKey
     */
    private final TagKey<Block> incorrectBlocksForDrops;

    /**
     * Ingrediente de reparación en el yunque.
     *
     * @see Ingredient
     */
    private final Ingredient repairIngredient;

    /**
     * Multiplicador de velocidad de minado.
     */
    private final float speed;

    /**
     * Durabilidad (usos) del nivel.
     */
    private final int uses;

    /**
     * Construye un nivel de herramienta con las estadísticas del diseño original.
     *
     * @param incorrectBlockForDrops tag de bloques incorrectos para este nivel
     * @param uses                   durabilidad
     * @param speed                  velocidad de minado
     * @param damage                 bonus de daño
     * @param enchantmentValue       encantabilidad
     * @param repairIngredient       material de reparación
     */
    CCToolTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage, int enchantmentValue, Ingredient repairIngredient) 
    {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    /**
     * Devuelve la durabilidad del nivel.
     *
     * @return número de usos
     */
    @Override
    public int getUses() 
    {
        return this.uses;
    }

    /**
     * Devuelve la velocidad de minado del nivel.
     *
     * @return multiplicador de velocidad
     */
    @Override
    public float getSpeed() 
    {
        return this.speed;
    }

    /**
     * Devuelve el bonus de daño de ataque.
     *
     * @return daño adicional
     */
    @Override
    public float getAttackDamageBonus() 
    {
        return this.damage;
    }

    /**
     * Devuelve el tag de bloques que este nivel no cosecha correctamente.
     *
     * @return {@link TagKey} de bloques incorrectos
     */
    @Override
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() 
    {
        return this.incorrectBlocksForDrops;
    }

    /**
     * Devuelve la encantabilidad del nivel.
     *
     * @return valor de encantamiento
     */
    @Override
    public int getEnchantmentValue() 
    {
        return this.enchantmentValue;
    }

    /**
     * Devuelve el ingrediente de reparación en el yunque.
     *
     * @return {@link Ingredient} de reparación
     */
    @Override
    public @NotNull Ingredient getRepairIngredient() 
    {
        return this.repairIngredient;
    }
}
