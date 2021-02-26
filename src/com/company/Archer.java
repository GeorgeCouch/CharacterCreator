package com.company;

/**
 * archer class that defines character type and dexterity
 * extends character
 * @author georgecouch
 */
public class Archer extends Character{

    private String charType = "Archer";
    private int dexterity = 0;

    public Archer(String charType, int dexterity, String weaponType, String armorType, int health, int damage, String itemTaken) {
        super(weaponType, armorType, health, damage, itemTaken);
        this.charType = charType;
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return "[Character = " + charType + ", Dexterity = " + dexterity;
    }
}