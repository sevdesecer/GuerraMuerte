package GuerraMuerte.Locations.NormalLoc;

import GuerraMuerte.Player;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player){
        super(player, "Tool Store",2);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the tool store.");
        return true;
    }
}
