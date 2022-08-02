package cosmicmining.cosmicmining.blocks.effects;

import cosmicmining.cosmicmining.blocks.effects.interfaces.EffectFactory;
import cosmicmining.cosmicmining.blocks.effects.interfaces.ZEffects;

/**
 * Implementation of {@link EffectFactory}
 */
public class BukkitEffectFactory implements EffectFactory {

    /**
     *
     * @return Returns a new {@link BukkitEffect}
     *
     */
    @Override
    public ZEffects newEffect() {
        return new BukkitEffect(null);
    }

}
