package GuerraMuerte.Locations;

import GuerraMuerte.Player;

public abstract class Location {

    private Player player ;
    private String name;
    private int id;

    public Location (Player player, String name, int id){

        this.player = player;
        this.name = name;
        this.id = id;
    }

    public abstract boolean onLocation();

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Player getPlayer() {
        return this.player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
