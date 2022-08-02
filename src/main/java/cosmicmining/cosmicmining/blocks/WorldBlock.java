package cosmicmining.cosmicmining.blocks;

import cosmicmining.cosmicmining.blocks.interfaces.ZBlock;
import cosmicmining.cosmicmining.blocks.effects.interfaces.ZEffects;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link ZBlock} -- Never to be used on its own. Needs a factory class.
 */
public class WorldBlock implements ZBlock {

    /**
     * field - Name
     */
    private String name = "";

    /**
     * field - List<ZEffects>
     */
    private final List<ZEffects> effectsList = new ArrayList<>();

    /**
     * field - List<ItemStack>
     */
    private final List<ItemStack> itemsList = new ArrayList<>();

    /**
     * field - Int
     */
    private int modelData = 0;

    /**
     * field - Double
     */
    private double regenTime = 0.0;

    /**
     * field - Double
     */
    private double hardnessMultiplier = 0.0;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ZBlock setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public List<ZEffects> getEffects() {
        return this.effectsList;
    }

    @Override
    public ZBlock addEffect(ZEffects effects) {
        this.effectsList.add(effects);
        return this;
    }

    @Override
    public ZBlock removeEffect(ZEffects effects) {
        this.effectsList.remove(effects);
        return this;
    }

    @Override
    public int getModelData() {
        return this.modelData;
    }

    @Override
    public ZBlock setModelData(int modelData) {
        this.modelData = modelData;
        return this;
    }

    @Override
    public double getRegenTime() {
        return this.regenTime;
    }

    @Override
    public ZBlock setRegenTime(double regenTime) {
        this.regenTime = regenTime;
        return this;
    }

    @Override
    public double getHardnessMultiplier() {
        return this.hardnessMultiplier;
    }

    @Override
    public ZBlock setHardnessMultiplier(double hardnessMultiplier) {
        this.hardnessMultiplier = hardnessMultiplier;
        return this;
    }

    @Override
    public List<ItemStack> getDrops() {
        return this.itemsList;
    }

    @Override
    public ZBlock addDrop(ItemStack itemStack) {
        this.itemsList.add(itemStack);
        return this;

    }


    @Override
    public ZBlock removeDrop(ItemStack itemStack) {
        this.itemsList.remove(itemStack);
        return this;
    }
}
