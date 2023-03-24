package GuerraMuerte.Locations.BattleLocations;

import GuerraMuerte.Locations.Location;
import GuerraMuerte.Player;

public class BattleLocations extends Location {

    public BattleLocations(Player player,String name, int id){
        super(player,name,id);
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
