package GuerraMuerte.Locations.NormalLoc;

import GuerraMuerte.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse (Player player){
        super(player,"Safe House",1);
    }
    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the safe house.");
        System.out.println("Your health is renewed.");
        return true;
    }
}
