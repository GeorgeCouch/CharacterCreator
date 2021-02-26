package com.company;

/**
 * warrior class that defines the character type and strength
 * extends Character
 * @author georgecouch
 */
public class Warrior extends Character{

    private String charType = "Warrior";
    private int strength = 0;

    public Warrior(String charType, int strength, String weaponType, String armorType, int health, int damage, String itemTaken) {
        super(weaponType, armorType, health, damage, itemTaken);
        this.charType = charType;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "[Character = " + charType + ", Strength = " + strength;
    }
}
