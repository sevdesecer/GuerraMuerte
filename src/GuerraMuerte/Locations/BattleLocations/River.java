package GuerraMuerte.Locations.BattleLocations;

import GuerraMuerte.Player;

public class River extends BattleLocations{

    public River(Player player) {
        super(player, "River", 5);
    }
    @Override
    public boolean onLocation() {
        return false;
    }
}
