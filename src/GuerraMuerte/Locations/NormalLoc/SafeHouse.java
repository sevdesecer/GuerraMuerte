package GuerraMuerte.Locations.NormalLoc;

import GuerraMuerte.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Safe House", 1);
    }

    @Override
    public void onLocation() {
        this.setAlive(true);
        this.getPlayer().setMoney(this.getPlayer().getMoney() - 3);
        this.getPlayer().setHealthy(getPlayer().getFirstHealth());

        System.out.println(" ===== ===== ===== ===== ===== ");
        System.out.println("Welcome to the safe house.There are no monsters here. You are safe.");
        System.out.println("Your health has been renewed. Your current health is " + this.getPlayer().getFirstHealth() + ".");
        System.out.println("Your rest period is over, what would you like to do? Please select what you want to do ?");
        System.out.println("If you want to see your inventory, please press 0. " + "\n" +
                "Else if you want to out of the safe house , please press 1.");
        int selectProcess = input.nextInt();

        while (selectProcess < 0 || selectProcess > 1) {
            System.out.print("You entered an invalid value, please enter a valid value between 0 and 1 : ");
            selectProcess = input.nextInt();
        }
        switch (selectProcess) {
            case 0:
                break;
            case 1:
                System.out.println(" ===== ===== ===== ===== =====");
                System.out.print("Your Weapons: ");
                for (int i = 0; i < ToolStore.weaponsList.length; i++) {
                    if (ToolStore.weaponsList[i].isHaveWeapon()) {
                        System.out.print(ToolStore.weaponsList[i].getName() + "\t\t");
                    }
                }
                System.out.print("\n\nYour Armors: ");
                for (int i = 0; i < ToolStore.armorList.length; i++) {
                    if (ToolStore.armorList[i].isHaveArmor()) {
                        System.out.print(ToolStore.armorList[i].getName() + "\t\t");
                    }
                }
                System.out.println("\n============================================");
                break;
        }
    }
}
