package GuerraMuerte;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    public void start() {

        System.out.println("Since you are here, you must be a brave warrior.\n" +
                "It will be quite difficult to survive on this scary island.\n" +
                "You have to fight to get the materials you need to live.\n" +
                "Good luck because you will need luck..\n" +
                "You will learn the details soon, be patient. :) \n");


        System.out.println("Firstly please enter your name and surname : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome to our island " + player.getName() + ".Please select one of warriors.");
        player.selectWarriors();
        player.selectLoc();

    }
}
