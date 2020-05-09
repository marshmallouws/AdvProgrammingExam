package data.collectible;

/**
 * @author Annika
 */
public abstract class Weapon extends Item {
    private final int strength;
    private int ownDamage;
    
    public Weapon(String name, int strength, int ownDamage) {
        super(name);
        this.strength = strength;;
        this.ownDamage = ownDamage;
    }
}
