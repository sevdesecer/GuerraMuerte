package GuerraMuerte;

import GuerraMuerte.Monsters.Pikachu;

import java.util.Scanner;

import GuerraMuerte.Monsters.Casper;
import GuerraMuerte.Monsters.TeddyBear;
import GuerraMuerte.Monsters.Monsters;


public class Game {

    private Scanner input = new Scanner(System.in);
    public void start() {

        Monsters pikachu = new Pikachu();
        Monsters casper = new Casper();
        Monsters teddyBear = new TeddyBear();

        System.out.println("Since you are here, you must be a brave warrior.\n" +
                "It will be quite difficult to survive on this scary island.\n" +
                "You have to fight to get the materials you need to live.\n" +
                "Good luck because you will need luck..\n" +
                "You will learn the details soon, be patient. :) \n");

        System.out.println("Firstly please enter your name and surname : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome to us dear " + player.getName() + "." +
                "\nNow I will give you some information before the death game starts." +
                "\nIf you want to survive, you must listen to me carefully. " +
                "\nTo live on this island you will need water, wood and of course food." +
                "\nBut each of them is protected by terrible monsters on different battle locations." +
                "\nYou have to fight and win to reach them." +
                "\n ===== ===== ===== ===== ===== " +
                "\nYou have to get wood from the forest. " +
                "\nYou're going to need a little arm muscle and a little courage for that." +
                "\nWatch out for Pikachu, the guardian of the forest."+
                "\nDon't be fooled by their cute looks, they release electricity from the red dots on their cheeks."+
                "\nBe careful, don't die :)"+
                "\n ===== ===== ===== ===== =====  " +
                "\nHealth of the " + pikachu.getName() + " is " + pikachu.getFirstHealth() + "." +
                "\nDamage of the " + pikachu.getName() + " is " + pikachu.getDamage() + "." +
                "\nEarning from the " + pikachu.getName() + " is " + pikachu.getEarning() + " gold." + "\n" +
                "\n ===== ===== ===== ===== ===== " +
                "\nYou have to get food from the cave." +
                "\nYou have to be quiet and careful, if you wake casper it means danger to you."+
                "\nHe'll want to be your friend, but don't trust him because he'll pretend to be a friend and kill you." +
                "\n ===== ===== ===== ===== ===== " +
                "\nHealth of the " + casper.getName() + " is " + casper.getFirstHealth() + "." +
                "\nDamage of the " + casper.getName() + " is " + casper.getDamage() + "." +
                "\nEarning from the " + casper.getName() + " is " + casper.getEarning() + " gold." + "\n" +
                "\n ===== ===== ===== ===== ===== " +
                "\nYou have to get water from the river." +
                "\n In fact, the teddy bear is a stuffed toy in the shape of a bear." +
                "\n But the teddy bear you will see is quite lively and hates people. So kill him before he kills you, honey :)"+
                "\n ===== ===== ===== ===== ===== \n" +
                "Health of the " + teddyBear.getName() + " is " + teddyBear.getFirstHealth() + "." +
                "\nDamage of the " + teddyBear.getName() + " is " + teddyBear.getDamage() + "." +
                "\nEarning from the " + teddyBear.getName() + " is " + teddyBear.getEarning() + " gold." + "\n" +
                "\nThere can be 1 to 3 monsters in each location."+
                "\nYou may need some weapons and armor to kill monsters, you can buy them from the tool shop."+
                "\nIf you need a rest, you can go to the safe house. Each rest costs 3 gold.");


        System.out.println("Welcome to again our island " + player.getName() + ".Here are our warriors, please review.");
        player.selectWarriors();
        System.out.println("Now it's time to choose your starting location.");
        player.selectLoc();
    }
}
