package com.company;

/**
 * class for specific character types to inherit from
 * @author georgecouch
 *
 */
public class Character {

    private String weaponType = "";
    private String armorType = "";
    private int health = 0;
    private int damage = 0;
    private String itemTaken = "";

    public Character(String weaponType, String armorType, int health, int damage, String itemTaken) {
        this.weaponType = weaponType;
        this.armorType = armorType;
        this.health = health;
        this.damage = damage;
        this.itemTaken = itemTaken;
    }

    @Override
    public String toString() {
        return ", WeaponType = " + weaponType + ", Armor Type = " + armorType + ", Health = " + health + ", Damage = "
                + damage + ", Item Taken = " + itemTaken + "]";
    }
}