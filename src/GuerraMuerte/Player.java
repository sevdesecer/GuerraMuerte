package GuerraMuerte;

import GuerraMuerte.Locations.BattleLocations.Cave;
import GuerraMuerte.Locations.BattleLocations.Forest;
import GuerraMuerte.Locations.BattleLocations.River;
import GuerraMuerte.Locations.Location;
import GuerraMuerte.Locations.NormalLoc.NormalLoc;
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
    private String name;
    private Scanner input = new Scanner(System.in);




    public Player(String name) {
        this.name = name;
    }
    public void initPlayer (Warriors warriors) {
        this.setDamage(warriors.getDamage());
        this.setHealthy(warriors.getHealth());
        this.setMoney(warriors.getMoney());
        this.setName(warriors.getName());

    }
    Location location = null;
    public void selectLoc(){
        Location[] locationList = {new SafeHouse(this),
                new ToolStore(this),
                new Cave(this),
                new Forest(this),
                new River(this)};

        System.out.println("==== Locations ====");
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
                location = new SafeHouse(this);
                break;
            case 2:
                location = new ToolStore(this);
                break;
            case 3:
                location = new Forest(this);
                break;
            case 4:
                location = new Cave(this);
                break;
            case 5:
                location = new River(this);
                break;
        }
        location.onLocation();

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
        System.out.println("------------------------");
        System.out.println("Please choose one of the warriors to start the game.You can choose by their id number.");
        int selectWarriors = input.nextInt();

        switch (selectWarriors){
            case 1:
                initPlayer(new Samurai("Samurai", 1, 21, 5, 15, 0));
                break;
            case 2:
                initPlayer(new Archer("Archer", 2,18,7,20,18));
                break;
            case 3:
                initPlayer(new Knight("Knight", 3, 24, 8, 5, 0));
                break;
            default:
                System.out.println(" Bye bye chicken ;) ");
                System.exit(0);
                break;
        }

        System.out.println("Selected warrior is : " + this.getName() + "  " +
                "First healthy : " + this.getHealthy() + "  " +
                "Damage : " + this.getDamage() + "  " +
                "Money : " + this.getMoney());
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

}
