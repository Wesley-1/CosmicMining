package cosmicmining.cosmicmining.blocks.effects.types;

import cosmicmining.cosmicmining.blocks.effects.interfaces.EffectType;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Implementation of {@link EffectType} using the {@link Sound} Enum.
 */
public class ZSound implements EffectType<Sound> {

    /**
     * field - Pitch
     */
    private final float val0;
    /**
     * field - Volume
     */
    private final float val1;
    /**
     * field - temp - Type
     */
    private Sound type = Sound.BLOCK_AMETHYST_BLOCK_BREAK;

    /**
     *
     * @param val0 Pitch
     * @param val1 Volume
     *
     * Constructor
     */
    public ZSound(float val0, float val1) {
        this.val0 = val0;
        this.val1 = val1;
    }

    /**
     *
     * @return Returns the {@link Sound} type.
     *
     * Getter
     */
    @Override
    public Sound getType() {
        return type;
    }

    /**
     *
     * @param type Used for setting the {@link Sound} type.
     *
     * @return Returns the {@link EffectType<Sound>}
     *
     * Setter
     */
    @Override
    public EffectType<Sound> setType(Sound type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param world World
     * @param location Location
     *
     * Used for handling sounds globally.
     *
     */
    @Override
    public void handleEffectGlobal(World world, Location location) {
        if (type == null) return;
        world.playSound(location, type, this.val0, this.val1);
    }

    /**
     *
     * @param world World
     * @param player Player
     *
     * Used for handling player sounds
     *
     */
    @Override
    public void handleEffectPlayer(World world, Player player) {
        if (type == null) return;
        world.playSound(player.getLocation(), type, this.val0, this.val1);
    }
}
