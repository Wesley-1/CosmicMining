package cosmicmining.cosmicmining.blocks.interfaces;

/**
 * Factory interface for {@link ZBlock}
 */
public interface BlockFactory {

    /**
     * @return Returns an instance of {@link ZBlock}
     */
    ZBlock newBlock();

}

