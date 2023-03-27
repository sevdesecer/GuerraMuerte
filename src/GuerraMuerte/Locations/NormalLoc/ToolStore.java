package GuerraMuerte.Locations.NormalLoc;

import GuerraMuerte.Player;
import GuerraMuerte.Tools.Armors.Armors;
import GuerraMuerte.Tools.Armors.FullArmor;
import GuerraMuerte.Tools.Armors.Helmet;
import GuerraMuerte.Tools.Armors.SteelVest;
import GuerraMuerte.Tools.Weapons.Gun;
import GuerraMuerte.Tools.Weapons.Rifle;
import GuerraMuerte.Tools.Weapons.Sword;
import GuerraMuerte.Tools.Weapons.Weapons;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Tool Store", 2);
    }

    @Override
    public void onLocation() {
        System.out.println("\n Welcome! You are in tool store.");
        System.out.println("====================");
        System.out.println(" 1- Weapons ");
        System.out.println(" 2- Armors  ");
        System.out.println(" 3- Quit... ");
        System.out.println("====================");
        System.out.print("Please select what you want to do: ");

        int selectTool = input.nextInt();
        while (selectTool < 1 || selectTool > 3) {
            System.out.print("You entered an invalid value, please enter a valid value.(between 1 and 3): ");
            selectTool = input.nextInt();
        }
        switch (selectTool) {
            case 1:
                selectWeapon();
                break;
            case 2:
                selectArmors();
                break;
            case 3:
                System.out.println("Come back when you have money, honey <3 .");
                break;
        }
    }

    /// SELECT ARMORS
    private static Armors Helmet = new Helmet();
    private static Armors SteelVest = new SteelVest();
    private static Armors FullArmor = new FullArmor();
    public static Armors[] armorList = {Helmet, SteelVest, FullArmor};

    private void HaveArmor() {
        for (int i = 0; i < armorList.length; i++) {
            armorList[i].setHaveArmor(false);
        }
    }

    private void selectArmors() {
        Armors armor = null;
        System.out.println(" ===== Armors ===== ");
        for (Armors i : armorList) {
            System.out.println("Id no: " + i.getId() +
                    "\t Armors: " + i.getName() +
                    "\t Block:  " + i.getBlock() +
                    "\t Cost: " + i.getCost());
        }
        System.out.println(" ===== ===== ===== ===== ===== ");
        System.out.println("Please enter the id number of the armor you want : ");
        int selectArmors = input.nextInt();
        while (selectArmors < 0 || selectArmors > armorList.length) {
            System.out.print("You entered an invalid value, please enter a valid value between 0 and " + weaponsList.length + " : ");
            selectArmors = input.nextInt();
        }
        // select armor by id number.

        for (int i = 0; i < armorList.length; i++) {
            if (selectArmors == armorList[i].getId()) {
                armor = armorList[i];
            }
        }
        if (selectArmors == 0) {
            onLocation();
        } else if (armor.getCost() > this.getPlayer().getMoney()) {
            System.out.println("You do not have enough money. No bargain dude.");
        } else if (!armor.isHaveArmor()) {
            System.out.println(armor.getName() + " was purchased.");
            int balance = this.getPlayer().getMoney() - armor.getCost();
            this.getPlayer().setMoney(balance);
            int instantHealth = this.getPlayer().getHealthy() + armor.getBlock();
            this.getPlayer().setHealthy(instantHealth);
            System.out.println("Your balance is " + this.getPlayer().getMoney() + " gold and your health is " +
                    instantHealth + " now " + this.getPlayer().getName() + ".");
            armor.setHaveArmor(true);
        } else if (armor.isHaveArmor()) {
            System.out.println("You've already have a " + armor.getName() + ", so you can not buy same armor.");
        }
    }

    /// SELECT WEAPONS
    private static Weapons gun = new Gun();
    private static Weapons sword = new Sword();
    private static Weapons rifle = new Rifle();
    public static Weapons[] weaponsList = {gun, sword, rifle};

    public void selectWeapon() {
        Weapons weapon = null;
        System.out.println(" ===== WEAPONS ===== ");

        for (Weapons i : weaponsList) {
            System.out.println("Id no: " + i.getId() +
                    "\t Weapon: " + i.getName() +
                    "\t Damage: " + i.getDamage() +
                    "\t Cost: " + i.getCost());
        }
        System.out.println(" ===== ===== ===== ===== ===== ");
        System.out.println("Please enter the id number of the weapon you want : ");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 0 || selectWeapon > weaponsList.length) {
            System.out.print("You entered an invalid value, please enter a valid value between 0 and " + weaponsList.length + " : ");
            selectWeapon = input.nextInt();
        }
        // select weapon by id number.
        for (int i = 0; i < armorList.length; i++) {
            if (selectWeapon == armorList[i].getId()) {
                weapon = weaponsList[i];
            }
        }
        if (selectWeapon == 0) {
            onLocation();
        } else if (weapon.getCost() > this.getPlayer().getMoney()) {
            System.out.println("You do not have enough money. No bargain dude.");
        } else if (!weapon.isHaveWeapon()) {
            System.out.println(weapon.getName() + " was purchased.");
            int balance = this.getPlayer().getMoney() - weapon.getCost();
            this.getPlayer().setMoney(balance);
            int newDamage = this.getPlayer().getDamage() + weapon.getDamage();
            this.getPlayer().setDamage(newDamage);
            System.out.println("Your balance is " + this.getPlayer().getMoney() + " gold and your damage is " +
                    newDamage + " now " + this.getPlayer().getName() + ".");
            weapon.setHaveWeapon(true);
        } else if (weapon.isHaveWeapon()) {
            System.out.println("You've already have a " + weapon.getName() + ", so you can not buy same weapon.");
        }
    }
}