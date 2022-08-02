package cosmicmining.cosmicmining.blocks.interfaces;

import cosmicmining.cosmicmining.blocks.effects.interfaces.ZEffects;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Interface used for creating ZBlocks.
 */
public interface ZBlock {

    /**
     *
     * @return Returns a {@link String} of the blocks name.
     *
     * Getter
     */
    String getName();

    /**
     *
     * @param name Used for setting the {@link String} of the blocks name.
     *
     * @return Returns the {@link ZBlock}
     *
     * Setter
     */
    ZBlock setName(String name);

    /**
     *
     * @return Returns the {@link List<ZEffects>} which is a list of effects for the block.
     *
     * Getter
     */
    List<ZEffects> getEffects();

    /**
     *
     * @param effectFactory Used for adding the {@link ZEffects} to the block.
     *
     * @return Returns the {@link ZBlock}
     *
     * Adder
     */
    ZBlock addEffect(ZEffects effectFactory);
    /**
     *
     * @param effectFactory Used for removing the {@link ZEffects} from the block.
     *
     * @return Returns the {@link ZBlock}
     *
     * Remover
     */
    ZBlock removeEffect(ZEffects effectFactory);

    /**
     *
     * @return Returns the {@link Integer} of the model data for the block.
     *
     * Getter
     */
    int getModelData();

    /**
     *
     * @param modelData Used for setting the {@link Integer} for the blocks model data.
     *
     * @return Returns the {@link ZBlock}
     *
     * Setter
     */
    ZBlock setModelData(int modelData);

    /**
     *
     * @return Returns the {@link Double} of the regen time for the block.
     *
     * Getter
     */
    double getRegenTime();

    /**
     *
     * @param regenTime Used for setting the {@link Double} for the blocks regen time.
     *
     * @return Returns the {@link ZBlock}
     *
     * Setter
     */
    ZBlock setRegenTime(double regenTime);

    /**
     *
     * @return Returns the {@link Double} of the hardness multiplier for the block.
     *
     * Getter
     */
    double getHardnessMultiplier();


    /**
     *
     * @param hardnessMultiplier Used for setting the {@link Double} for the blocks' hardness multiplier.
     *
     * @return Returns the {@link ZBlock}
     *
     * Setter
     */
    ZBlock setHardnessMultiplier(double hardnessMultiplier);

    /**
     *
     * @return Returns the {@link List<ItemStack>} which is a list of drops for the block.
     *
     * Getter
     */
    List<ItemStack> getDrops();

    /**
     *
     * @param itemStack Used for adding the {@link ItemStack} to the blocks drops.
     *
     * @return Returns the {@link ZBlock}
     *
     * Adder
     */
    ZBlock addDrop(ItemStack itemStack);

    /**
     *
     * @param itemStack Used for removing the {@link ItemStack} from the blocks drops.
     *
     * @return Returns the {@link ZBlock}
     *
     * Remover
     */
    ZBlock removeDrop(ItemStack itemStack);

}

