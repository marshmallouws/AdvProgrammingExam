package data.collectible;

/**
 * @author Annika
 */
public abstract class Weapon extends Item {
    private final int damage;
    
    public Weapon(String name, int value, int damage) {
        super(name, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
