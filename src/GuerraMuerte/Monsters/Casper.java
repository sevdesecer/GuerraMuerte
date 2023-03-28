package GuerraMuerte.Monsters;

public class Casper extends Monsters {

    public Casper(){
        super("Casper",3,10,10,4);
    }

    @Override
    public int amountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
