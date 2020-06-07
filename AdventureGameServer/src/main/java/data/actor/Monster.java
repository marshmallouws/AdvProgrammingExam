package data.actor;

import enums.MonsterType;

/**
 * @author Annika
 */
public class Monster {
    private final int noOfEyes;
    private int health = 100;
    private final int strength;
    private int speed;
    private final MonsterType type;
    private final int noOfHeads;
    private final int height;
    
    public Monster(int noOfEyes, int strength, int speed, MonsterType type, 
            int noOfHeads, int height) {
        this.noOfEyes = noOfEyes;
        this.strength = strength;
        this.speed = speed;
        this.type = type;
        this.noOfHeads = noOfHeads;
        this.height = height;
    }
    
    public int attack() {
        // TODO: Calculate attack
        return 0;
    }

    public int getNoOfEyes() {
        return noOfEyes;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public MonsterType getType() {
        return type;
    }

    public int getNoOfHeads() {
        return noOfHeads;
    }
    
    public int getSpeed() {
        return speed;
    }

    public int getHeight() {
        return height;
    }
    
    public void loseHealth(int lostHealth) {
        health -= lostHealth;
    }
    
    /**
     * isDead checks whether the monster is dead or not.
     * @return true if the monster is dead, otherwise false.
     */
    public boolean isDead() {
        return health < 1;
    }
}
