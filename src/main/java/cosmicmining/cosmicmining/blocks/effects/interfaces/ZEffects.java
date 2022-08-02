package cosmicmining.cosmicmining.blocks.effects.interfaces;

/**
 * Interface for Building out different effects.
 */
public interface ZEffects {

    /**
     *
     * @return Returns the {@link EffectType}
     *
     * Getter
     */
    EffectType<?> getEffectType();

    /**
     *
     * @param type Used for setting the {@link EffectType}
     *
     * @return Returns {@link ZEffects}
     *
     * Setter
     */
    ZEffects setEffectType(EffectType<?> type);

}
