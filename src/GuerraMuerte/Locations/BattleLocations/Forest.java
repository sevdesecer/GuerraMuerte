package GuerraMuerte.Locations.BattleLocations;

import GuerraMuerte.Player;

public class Forest extends BattleLocations{

    public Forest(Player player) {
        super(player, "Forest", 4);
    }
    @Override
    public boolean onLocation() {
        return false;
    }
}
