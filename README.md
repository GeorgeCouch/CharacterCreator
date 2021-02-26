# CharacterCreator

# Requirements
I wrote this in IntelliJ, but it should work in any IDE.

# Description
This program allows for an administrator to define what is possible in what a character can have.
The program then displays those options to the user and the user is able to create a character based off of those choices.
The program then exports the information to a text file.

# How it works
Administrator Options:
The program starts off by assigning you as the administrator. From there it will ask you a series of questions that will
allow you to set options that the user will be able to select. Loops are used to ensure that you don't want to make any changes
before progressing, and exception handling is used to stop the program from crashing. After entering an option for the user, it is
stored within a linked list based on its category and then the linked list is sorted in alphabetical order. After the administrator 
finishes defining the choices for the user the program asks if you would like to continue to make changes as the administrator, 
or make a character as the user.

User Options:
As the user you'll first be given the choice to choose what type of character you are creating (warrior, archer, wizard).
After choosing a number to correspond with your character type, a switch statement is used to continue the program in the correct 
block of code for that character type. You'll then be given the choices that you previously defined as the administrator. 
Depending on where you are in the character creation will determine which linked list you are shown. You will choose a number 
corresponding with the item in the linked list to add an attribute to your character. Exception handling is used to ensure that
you can't enter anything that would crash the program. After you are done defining the values of your character, a character object
is created to store all of your choices. Then another object is created for your character type, which stores your character type
and the attribute that corresponds with that character type (warrior: strength, archer: dexterity, wizzard: intellect). All of the
character type classes inherrit from the character class. From here the progam concatanates the toString method for the character
type object and the character type object to output the character that you created to the characters.txt file. The program then asks
if you would like to continue using it and if N is answered then the program exits. You can come back to this program at anytime to
add more characters to characters.txt.
