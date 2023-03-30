package GuerraMuerte.Monsters;

public class TeddyBear extends Monsters{ // Bear

    public TeddyBear(){
        super("Teddy Bear",7,20,20,12);
    }

    @Override
    public int randomAmountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
