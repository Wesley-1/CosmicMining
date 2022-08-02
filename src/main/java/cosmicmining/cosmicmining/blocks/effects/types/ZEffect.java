package cosmicmining.cosmicmining.blocks.effects.types;

import cosmicmining.cosmicmining.blocks.effects.interfaces.EffectType;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Implementation of {@link EffectType} using the {@link Effect} Enum.
 */
public class ZEffect implements EffectType<Effect> {

    /**
     * field - Data
     */
    private final int val0;
    /**
     * field - Radius
     */
    private final int val1;

    /**
     * field - temp - Type TODO: change to configurable
     */
    private Effect type = Effect.ANVIL_BREAK;

    /**
     *
     * @param val0 Data
     * @param val1 Radius
     *
     * Constructor
     */
    public ZEffect(int val0, int val1) {
        this.val0 = val0;
        this.val1 = val1;
    }

    /**
     *
     * @return Returns the {@link Effect}
     *
     * Getter
     */
    @Override
    public Effect getType() {
        return type;
    }

    /**
     *
     * @param type Used for setting the {@link Effect} type.
     *
     * @return Returns the {@link EffectType<Effect>}
     *
     * Setter
     */
    @Override
    public EffectType<Effect> setType(Effect type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param world World
     * @param location Location
     *
     * Used for handling effects globally.
     *
     */
    @Override
    public void handleEffectGlobal(World world, Location location) {
        if (type == null) return;
        world.playEffect(location, type, this.val0, this.val1);
    }

    /**
     *
     * @param world World
     * @param player Player
     *
     * Used for handling player effects
     *
     */
    @Override
    public void handleEffectPlayer(World world, Player player) {
        if (type == null) return;
        world.playEffect(player.getLocation(), type, this.val0, this.val1);
    }
}
