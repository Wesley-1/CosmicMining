package cosmicmining.cosmicmining.blocks.effects.types;

import cosmicmining.cosmicmining.blocks.effects.interfaces.EffectType;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Implementation of {@link EffectType} using the {@link Particle} Enum.
 */
public class ZParticle implements EffectType<Particle> {

    /**
     * field - Count
     */
    private final int val0;

    /**
     * filed - temp - Type
     */
    private Particle type = Particle.ASH;

    /**
     *
     * @param val0 Count
     *
     * Constructor
     */
    public ZParticle(int val0) {
        this.val0 = val0;
    }

    /**
     *
     * @return Returns the {@link Particle} type.
     *
     * Getter
     */
    @Override
    public Particle getType() {
        return type;
    }

    /**
     *
     * @param type Used for setting the {@link Particle} type.
     *
     * @return Returns the {@link EffectType<Particle>}
     */
    @Override
    public EffectType<Particle> setType(Particle type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param world World
     * @param location Location
     *
     * Used for handling particles globally.
     *
     */
    @Override
    public void handleEffectGlobal(World world, Location location) {
        world.spawnParticle(type, location, this.val0);
    }

    /**
     *
     * @param world World
     * @param player Player
     *
     * Used for handling player particles
     *
     */
    @Override
    public void handleEffectPlayer(World world, Player player) {
        world.spawnParticle(type, player.getLocation(), this.val0);
    }
}
