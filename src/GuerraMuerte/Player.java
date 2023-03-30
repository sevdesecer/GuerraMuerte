package GuerraMuerte;

import GuerraMuerte.Locations.BattleLocations.Cave;
import GuerraMuerte.Locations.BattleLocations.Forest;
import GuerraMuerte.Locations.BattleLocations.River;
import GuerraMuerte.Locations.Location;
import GuerraMuerte.Locations.NormalLoc.SafeHouse;
import GuerraMuerte.Locations.NormalLoc.ToolStore;
import GuerraMuerte.Warriors.Archer;
import GuerraMuerte.Warriors.Knight;
import GuerraMuerte.Warriors.Samurai;
import GuerraMuerte.Warriors.Warriors;


import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int money;
    private int firstHealth;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory = new Inventory();

    public Player(String name) {
        this.name = name;
    }
    public void initPlayer (Warriors warriors) {
        this.setDamage(warriors.getDamage());
        this.setHealthy(warriors.getHealth());
        this.setMoney(warriors.getMoney());
        this.setName(warriors.getName());
        this.firstHealth = warriors.getFirstHealth();
    }
    Location safeHouse = new SafeHouse(this);
    Location toolStore = new ToolStore(this);
    Location forest = new Forest(this);
    Location cave = new Cave(this);
    Location river = new River(this);
    Location[] locationList = {safeHouse, toolStore, forest, cave, river};

    public void selectLoc() {

        Location location = null;
        while (true) {

            Location[] locationList = {new SafeHouse(this),
                    new ToolStore(this),
                    new Cave(this),
                    new Forest(this),
                    new River(this)};

            System.out.println("===== Locations ====="); // display locations
            for (Location locations : locationList) {
                System.out.println(locations.getId() + " : " + locations.getName());
            }
            System.out.println("Please select the location you want to go: ");
            int selectLoc = input.nextInt();

            while (selectLoc < 1 || selectLoc > locationList.length) {
                System.out.print("\nPlease enter a valid value between 1 and " + locationList.length + ": ");
                selectLoc = input.nextInt();
            }
            switch (selectLoc) {
                case 1:
                    location = safeHouse;
                    break;
                case 2:
                    location = toolStore;
                    break;
                case 3:
                    location = cave;
                    break;
                case 4:
                    location = forest;
                    break;
                case 5:
                    location = river;
                    break;
            }

            location.onLocation();

            if (this.getInventory().isFood() && this.getInventory().isWater() && this.getInventory().isWood()){
                System.out.println("Yoou collected all items " + this.getName() + "." + "\n!!Congratulations!!");
                break;
            }
            if (!location.isAlive())
            {
                System.out.println("You die <[o]>");
                System.out.println("GAME OVER...");
                break;
            }
        }
    }

    public void selectWarriors(){
        Warriors[] warriorsList = {new Samurai("Samurai", 1, 21,5,15, 21), new Archer("Archer", 2,18,7,20,18) ,new Knight("Knight", 3,24,8,5,24)};
        System.out.println("==== Warriors ====");
        for (Warriors warriors : warriorsList) {
            System.out.println("Charecter id :"+ warriors.getId() +
                    "\t Character name : " + warriors.getName() +
                    "\t Damage : " + warriors.getDamage() +
                    "\t First health : " + warriors.getFirstHealth() +
                    "\t Money : " + warriors.getMoney());
        }
        System.out.println("\n ===== ===== ===== ===== ===== ");
        System.out.println("Please choose one of the warriors to start the game.You can choose by their id number.");
        int selectWarriors = input.nextInt();

        switch (selectWarriors){
            case 1:
                initPlayer(new Samurai("Samurai", 1, 21, 5, 15, 21));
                break;
            case 2:
                initPlayer(new Archer("Archer", 2,18,7,20,18));
                break;
            case 3:
                initPlayer(new Knight("Knight", 3, 24, 8, 5, 24));
                break;
            default:
                System.out.println(" Bye bye chicken ;) ");
                System.exit(0);
                break;
        }

        System.out.println("Selected warrior is : " + this.getName() + "  " +
                "\nFirst healthy : " + this.getHealthy() + "  " +
                "\nDamage : " + this.getDamage() + "  " +
                "\nMoney : " + this.getMoney());
        System.out.println("La guerra esta comenzando...");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFirstHealth() {
        return firstHealth;
    }

    public void setFirstHealth(int firstHealth) {
        this.firstHealth = firstHealth;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
