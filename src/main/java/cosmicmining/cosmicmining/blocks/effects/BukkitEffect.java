package cosmicmining.cosmicmining.blocks.effects;

import cosmicmining.cosmicmining.blocks.effects.interfaces.EffectType;
import cosmicmining.cosmicmining.blocks.effects.interfaces.ZEffects;

/**
 * Implementation of {@link ZEffects} -- Never to be used on its own. Needs a factory class.
 */
public class BukkitEffect implements ZEffects {

    /**
     * This is the effect type that will be used.
     *
     * Field
     */
    private EffectType<?> effectType;

    /**
     *
     * @param effectType {@link EffectType}
     *
     * Constructor
     */
    public BukkitEffect(EffectType<?> effectType) {
        this.effectType = effectType;
    }

    /**
     *
     * @return returns the {@link EffectType}
     *
     * Getter
     */
    @Override
    public EffectType<?> getEffectType() {
        return this.effectType;
    }

    /**
     *
     * @param type Used for setting the {@link EffectType}
     *
     * @return returns the new {@link EffectType}
     *
     * Setter
     */
    @Override
    public ZEffects setEffectType(EffectType<?> type) {
        this.effectType = type;
        return this;
    }
}
