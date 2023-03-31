package GuerraMuerte.Locations.BattleLocations;

import GuerraMuerte.Monsters.Casper;
import GuerraMuerte.Monsters.Monsters;
import GuerraMuerte.Player;

public class Cave extends BattleLocations {

    public Cave(Player player) {
        super(player, "Cave", 3);
    }

    Monsters monsters = new Casper();


    @Override
    public void onLocation() {
        int monsterAmount = monsters.randomAmountOfMonsters();
        for (int i = 1; i < monsterAmount; i++) {
            int whoStarts = (int) (Math.random() * 2) + 1;
            if (i == 1) {
                System.out.println("\n=====  A " + this.monsters.getName() + " is coming  =====");
            } else {
                System.out.println("\n=====  Another " + this.monsters.getName() + " is coming  =====");
            }
            if (whoStarts == 1) {
                while (true) {
                    System.out.println(" ===== ===== ===== ===== ===== ");
                    System.out.println(" You attacked.");
                    this.monsters.setHealth(this.monsters.getHealth() - this.getPlayer().getDamage());
                    int healthOfMonster = this.monsters.getHealth();
                    if (healthOfMonster <= 0) {
                        System.out.println("Good shot dude. You killed the " + monsters.getName() + ".");
                        System.out.println(" ===== ===== ===== ===== ===== ");
                        break;
                    }
                    System.out.println("Health of the " + this.monsters.getName() + " is " + healthOfMonster + ".");
                    System.out.println(" ===== ===== ===== ===== ===== ");
                    // Monster attacks
                    System.out.println(" ===== ===== ===== ===== ===== ");
                    System.out.println("The " + this.monsters.getName() + " attacked.");
                    this.getPlayer().setHealthy(this.getPlayer().getHealthy() - this.monsters.getDamage());
                    int healthWarrior = this.getPlayer().getHealthy();
                    if (healthWarrior <= 0) {
                        System.out.println("You failed to fight.");
                        this.setAlive(false);
                        break;
                    }
                    // Print player's remaining health
                    System.out.println("Your health is " + healthWarrior + ".");
                    System.out.println(" ===== ===== ===== ===== ===== ");
                }
            } else if (whoStarts == 2) {
                while (true) {
                    System.out.println(" ===== ===== ===== ===== ===== ");
                    // Monster attacks first
                    System.out.println("The " + this.monsters.getName() + " attacked.");
                    this.getPlayer().setHealthy(this.getPlayer().getHealthy() - this.monsters.getDamage());
                    int healthOfWarrior = this.getPlayer().getHealthy();
                    // Check if player is dead
                    if (healthOfWarrior <= 0) {
                        System.out.println("You failed to fight.");
                        this.setAlive(false);
                        break;
                    }
                    // Print player's remaining health
                    System.out.println("You must be hurt.Your remaining health is " + healthOfWarrior + ".");
                    System.out.println(" ===== ===== ===== ===== ===== ");

                    System.out.println(" ===== ===== ===== ===== ===== ");
                    System.out.println("You attacked.");
                    this.monsters.setHealth(this.monsters.getHealth() - this.getPlayer().getDamage());
                    int healthOfMonster = this.monsters.getHealth();
                    if (healthOfMonster <= 0) {
                        System.out.println("Good shot dude. You killed the " + monsters.getName() + ".");
                        System.out.println(" ===== ===== ===== ===== ===== ");
                        break;
                    }
                    System.out.println("Health of the " + this.monsters.getName() + " is " + healthOfMonster + ".");
                    System.out.println(" ===== ===== ===== ===== ===== ");
                }
            }
            this.monsters.setHealth(this.monsters.getFirstHealth());
        }
        if (this.isAlive()){
            System.out.println("\n=============================");
            System.out.println("It was a good fight.You killed all monsters in the " + this.getName() + " " + this.getPlayer().getName() + "." +
                    "\nYou got the wood.");
            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.monsters.getEarning());
            System.out.println("Your remaining health is " + this.getPlayer().getHealthy() + "."+
                    "\nYour balance is " +this.getPlayer().getMoney() + " gold.");
            System.out.println("=============================");

            this.getPlayer().getInventory().setFood(true);
        }
    }
}
