package cosmicmining.cosmicmining.blocks;

import cosmicmining.cosmicmining.blocks.effects.BukkitEffect;
import cosmicmining.cosmicmining.blocks.interfaces.BlockFactory;
import cosmicmining.cosmicmining.blocks.interfaces.ZBlock;

/**
 * Implementation of the {@link BlockFactory}
 */
public class WorldBlockFactory implements BlockFactory {
    /**
     *
     * @return Returns a new {@link ZBlock}
     *
     */
    @Override
    public ZBlock newBlock() {
        return new WorldBlock();
    }
}
