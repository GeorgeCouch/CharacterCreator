package com.company;

/**
 * wizard class that defines character type and intellect
 * extends character
 * @author georgecouch
 */
public class Wizard extends Character{

    private String charType = "Wizard";
    private int intellect = 0;

    public Wizard(String charType, int intelect, String weaponType, String armorType, int health, int damage, String itemTaken) {
        super(weaponType, armorType, health, damage, itemTaken);
        this.charType = charType;
        this.intellect = intelect;
    }

    @Override
    public String toString() {
        return "[Character = " + charType + ", Intellect = " + intellect;
    }
}
