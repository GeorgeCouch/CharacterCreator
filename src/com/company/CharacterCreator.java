package com.company;

/**
 * CharacterCreator{
 * code for admin
 * code for user
 * }
 *
 * Character{
 * has base things that all characters have
 * }
 *
 * Warrior{
 * extends Character but has warrior specific attributes
 * }
 *
 * Archer{
 * extends Character but has archer specific attributes
 * }
 *
 * Wizard{
 * extends Character but has wizard specific attributes
 * }
 *
 * Description:
 * This program allows for an administrator to define what is possible in what a character can have.
 * The program then displays those options to the user and the user is able to create a character based off of those choices.
 * The program then exports the information to a text file.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class CharacterCreator {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String choice = "A";
        int charChoice = 0;
        String weapon = "";
        String armor = "";
        int health = 0;
        int damage = 0;
        String charType = "";
        String item = "";
        String addMore = "Y";
        String runProgram = "Y";

        String fileText = "";

        int strength = 0;
        int dexterity = 0;
        int intellect = 0;

        LinkedList<String> weapons = new LinkedList<>();
        LinkedList<String> armors = new LinkedList<>();
        LinkedList<String> items = new LinkedList<>();

        /**
         * File to be created "Characters.txt"
         */
        FileWriter fw = new FileWriter("Characters.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        /**
         * Set options for user as program administrator.
         */
        System.out.println("You are now the administrator!");
        System.out.println("What kind of weapons can a character have?:");
        while (addMore.toUpperCase().equals("Y")) {
            System.out.println("Please add a choice: ");
            weapon = in.next();
            weapons.add(weapon);
            Collections.sort(weapons);
            System.out.println("The current choices are: " + weapons.toString());
            System.out.println("Would you like to add more choices?: Y/N");
            addMore = in.next().toUpperCase();

            while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                System.out.println("Please choose Y or N");
                addMore = in.next().toUpperCase();
            }
        }

        addMore = "Y";

        System.out.println("What kind of armor can a character have?:");
        while (addMore.toUpperCase().equals("Y")) {
            System.out.println("Please add a choice: ");
            armor = in.next();
            armors.add(armor);
            Collections.sort(armors);
            System.out.println("The current choices are: " + armors.toString());
            System.out.println("Would you like to add more choices?: Y/N");
            addMore = in.next().toUpperCase();

            while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                System.out.println("Please choose Y or N");
                addMore = in.next().toUpperCase();
            }
        }

        addMore = "Y";

        System.out.println("How much health does a character have?:");
        while (addMore.toUpperCase().equals("Y")) {
            System.out.println("Please add a value: ");

            boolean ok = false;
            while (!ok) {
                try {
                    health = in.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please choose a number");
                    in.nextLine();
                }
            }

            System.out.println("Would you like to change your choice?: Y/N");
            addMore = in.next().toUpperCase();

            while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                System.out.println("Please choose Y or N");
                addMore = in.next().toUpperCase();
            }
        }

        addMore = "Y";

        System.out.println("How much damage does a character deal?:");
        while (addMore.toUpperCase().equals("Y")) {
            System.out.println("Please add a value: ");

            boolean ok = false;
            while (!ok) {
                try {
                    damage = in.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please choose a number");
                    in.nextLine();
                }
            }

            System.out.println("Would you like to change your choice?: Y/N");
            addMore = in.next().toUpperCase();

            while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                System.out.println("Please choose Y or N");
                addMore = in.next().toUpperCase();
            }
        }

        addMore = "Y";

        System.out.println("What item can a character take?:");
        while (addMore.toUpperCase().equals("Y")) {
            System.out.println("Please add a choice: ");
            item = in.next();
            items.add(item);
            Collections.sort(items);
            System.out.println("The current choices are: " + items.toString());
            System.out.println("Would you like to change your choice?: Y/N");
            addMore = in.next().toUpperCase();

            while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                System.out.println("Please choose Y or N");
                addMore = in.next().toUpperCase();
            }
        }

        while (runProgram.toUpperCase().equals("Y")) {
            System.out.println("Choose user to create a character. Choose administrator to make more changes.");
            System.out.println("Are you a user or an administrator? U/A");

            choice = in.next();

            while ((!choice.toUpperCase().equals("A")) && (!choice.toUpperCase().equals("U"))) {
                System.out.println("Please choose A or U");
                choice = in.next();
            }

            addMore = "Y";

            if (choice.toUpperCase().equals("A")) {
                System.out.println("What kind of weapons can a character have?:");
                while (addMore.toUpperCase().equals("Y")) {
                    System.out.println("Please add a choice: ");
                    weapon = in.next();
                    weapons.add(weapon);
                    Collections.sort(weapons);
                    System.out.println("The current choices are: " + weapons.toString());
                    System.out.println("Would you like to add more choices?: Y/N");
                    addMore = in.next().toUpperCase();

                    while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                        System.out.println("Please choose Y or N");
                        addMore = in.next().toUpperCase();
                    }
                }

                addMore = "Y";

                System.out.println("What kind of armor can a character have?:");
                while (addMore.toUpperCase().equals("Y")) {
                    System.out.println("Please add a choice: ");
                    armor = in.next();
                    armors.add(armor);
                    Collections.sort(armors);
                    System.out.println("The current choices are: " + armors.toString());
                    System.out.println("Would you like to add more choices?: Y/N");
                    addMore = in.next().toUpperCase();

                    while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                        System.out.println("Please choose Y or N");
                        addMore = in.next().toUpperCase();
                    }
                }

                addMore = "Y";

                System.out.println("How much health does a character have?:");
                while (addMore.toUpperCase().equals("Y")) {
                    System.out.println("Please add a value: ");

                    boolean ok = false;
                    while (!ok) {
                        try {
                            health = in.nextInt();
                            ok = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Please choose a number");
                            in.nextLine();
                        }
                    }

                    System.out.println("Would you like to change your choice?: Y/N");
                    addMore = in.next().toUpperCase();

                    while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                        System.out.println("Please choose Y or N");
                        addMore = in.next().toUpperCase();
                    }
                }

                addMore = "Y";

                System.out.println("How much damage does a character deal?:");
                while (addMore.toUpperCase().equals("Y")) {
                    System.out.println("Please add a value: ");

                    boolean ok = false;
                    while (!ok) {
                        try {
                            damage = in.nextInt();
                            ok = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Please choose a number");
                            in.nextLine();
                        }
                    }

                    System.out.println("Would you like to change your choice?: Y/N");
                    addMore = in.next().toUpperCase();

                    while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                        System.out.println("Please choose Y or N");
                        addMore = in.next().toUpperCase();
                    }
                }

                addMore = "Y";

                System.out.println("What item can a character take?:");
                while (addMore.toUpperCase().equals("Y")) {
                    System.out.println("Please add a choice: ");
                    item = in.next();
                    items.add(item);
                    Collections.sort(items);
                    System.out.println("The current choices are: " + items.toString());
                    System.out.println("Would you like to change your choice?: Y/N");
                    addMore = in.next().toUpperCase();

                    while ((!addMore.toUpperCase().equals("Y")) && (!addMore.toUpperCase().equals("N"))) {
                        System.out.println("Please choose Y or N");
                        addMore = in.next().toUpperCase();
                    }
                }

                /**
                 * Create character using options given by administrator
                 */
            } else if (choice.toUpperCase().equals("U")) {
                System.out.println("Would you like to be a Warrior, Archer, or Wizard?: 1/2/3");
                boolean ok = false;
                while (!ok) {
                    try {
                        charChoice = in.nextInt();
                        ok = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please choose a number");
                        in.nextLine();
                    }
                }
                switch (charChoice) {
                    case 1:
                        charType = "Warrior";
                        System.out.println("Choose your choice by typing the number corresponding with the place of the item.");
                        System.out.println("i.e. [Mace, Bow, Staff]");
                        System.out.println("Typing 2 would choose Bow");
                        System.out.println("Make your choices!");
                        System.out.println("What kind of weapon will you take?: ");
                        System.out.println(weapons.toString());

                        boolean ok1 = false;
                        while (!ok1) {
                            try {
                                weapon = weapons.get(in.nextInt() - 1);
                                ok1 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What armor will you take?: ");
                        System.out.println(armors.toString());
                        boolean ok2 = false;
                        while (!ok2) {
                            try {
                                armor = armors.get(in.nextInt() - 1);
                                ok2 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What item will you take?: ");
                        System.out.println(items.toString());
                        boolean ok3 = false;
                        while (!ok3) {
                            try {
                                item = items.get(in.nextInt() - 1);
                                ok3 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("How much strength do you have?: ");
                        boolean ok4 = false;
                        while (!ok4) {
                            try {
                                strength = in.nextInt();
                                ok4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose a number");
                                in.nextLine();
                            }
                        }
                        Character character1 = new Character(weapon, armor, health, damage, item);
                        Warrior warrior = new Warrior(charType, strength, weapon, armor, health, damage, item);
                        fileText = warrior.toString() + character1.toString();
                        /**
                         * write character to characters.txt
                         */
                        bw.write(fileText);
                        bw.newLine();
                        System.out.println("Here is the character that you made.: ");
                        System.out.println(warrior.toString() + character1.toString());
                        break;
                    case 2:
                        charType = "Archer";
                        System.out.println(
                                "Choose your choice by typing the number corresponding with the place of the item.");
                        System.out.println("i.e. [Mace, Bow, Staff]");
                        System.out.println("Typing 2 would choose Bow");
                        System.out.println("Make your choices!");
                        System.out.println("What kind of weapon will you take?: ");
                        System.out.println(weapons.toString());
                        boolean ok5 = false;
                        while (!ok5) {
                            try {
                                weapon = weapons.get(in.nextInt() - 1);
                                ok5 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What armor will you take?: ");
                        System.out.println(armors.toString());
                        boolean ok6 = false;
                        while (!ok6) {
                            try {
                                armor = armors.get(in.nextInt() - 1);
                                ok6 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What item will you take?: ");
                        System.out.println(items.toString());
                        boolean ok7 = false;
                        while (!ok7) {
                            try {
                                item = items.get(in.nextInt() - 1);
                                ok7 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("How much dexterity do you have?: ");
                        boolean ok8 = false;
                        while (!ok8) {
                            try {
                                dexterity = in.nextInt();
                                ok8 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose a number");
                                in.nextLine();
                            }
                        }
                        Character character2 = new Character(weapon, armor, health, damage, item);
                        Archer archer = new Archer(charType, dexterity, weapon, armor, health, damage, item);
                        fileText = archer.toString() + character2.toString();
                        bw.write(fileText);
                        bw.newLine();
                        System.out.println("Here is the character that you made.: ");
                        System.out.println(archer.toString() + character2.toString());
                        break;
                    case 3:
                        charType = "Wizard";
                        System.out.println(
                                "Choose your choice by typing the number corresponding with the place of the item.");
                        System.out.println("i.e. [Mace, Bow, Staff]");
                        System.out.println("Typing 2 would choose Bow");
                        System.out.println("Make your choices!");
                        System.out.println("What kind of weapon will you take?: ");
                        System.out.println(weapons.toString());
                        boolean ok9 = false;
                        while (!ok9) {
                            try {
                                weapon = weapons.get(in.nextInt() - 1);
                                ok9 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(weapons.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What armor will you take?: ");
                        System.out.println(armors.toString());
                        boolean ok10 = false;
                        while (!ok10) {
                            try {
                                armor = armors.get(in.nextInt() - 1);
                                ok10 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(armors.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("What item will you take?: ");
                        System.out.println(items.toString());
                        boolean ok11 = false;
                        while (!ok11) {
                            try {
                                item = items.get(in.nextInt() - 1);
                                ok11 = true;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose from the following options");
                                System.out.println(items.toString());
                                in.nextLine();
                            }
                        }
                        System.out.println("How much intellect do you have?: ");
                        boolean ok12 = false;
                        while (!ok12) {
                            try {
                                dexterity = in.nextInt();
                                ok12 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose a number");
                                in.nextLine();
                            }
                        }
                        Character character3 = new Character(weapon, armor, health, damage, item);
                        Wizard wizard = new Wizard(charType, intellect, weapon, armor, health, damage, item);
                        fileText = wizard.toString() + character3.toString();
                        bw.write(fileText);
                        bw.newLine();
                        System.out.println("Here is the character that you made.: ");
                        System.out.println(wizard.toString() + character3.toString());
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Would you like to continue using the character creator? Y/N");
            runProgram = in.next();
        }
        bw.close();
    }
}
