package GuerraMuerte.Monsters;

public class Casper extends Monsters { //Zombie

    public Casper(){
        super("Casper",3,10,10,4);
    }

    @Override
    public int randomAmountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
