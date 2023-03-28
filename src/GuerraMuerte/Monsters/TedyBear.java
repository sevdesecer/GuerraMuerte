package GuerraMuerte.Monsters;

public class TedyBear extends Monsters{

    public TedyBear (){
        super("Tedy Bear",7,20,20,12);
    }

    @Override
    public int amountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
