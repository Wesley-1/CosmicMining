package cosmicmining.cosmicmining.blocks.effects.interfaces;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 *
 * @param <T> This is normally an Enum class, used for Type based effects.
 *
 * Class used for implementing different effect types.
 *
 *           TODO: Make a packet based method in here for implementing - Per player
 */
public interface EffectType<T> {

    /**
     *
     * @return Returns the {@link T} class/enumeration.
     *
     * Getter
     */
    T getType();

    /**
     *
     * @param type Used for setting the {@link T} type.
     *
     * @return Returns the {@link EffectType<T>}
     *
     * Setter
     */
    EffectType<T> setType(T type);

    /**
     *
     * @param world World
     * @param location Location
     *
     * Used for handling {@link T} globally.
     */
    void handleEffectGlobal(World world, Location location);

    /**
     *
     * @param world World
     * @param player Player
     *
     * Used for handling per player {@link T}
     */
    void handleEffectPlayer(World world, Player player);

}
