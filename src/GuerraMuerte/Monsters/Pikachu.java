package GuerraMuerte.Monsters;

public class Pikachu extends Monsters {

    public Pikachu(){
        super("Pikachu",4,14,14,7);
    }
    @Override
    public int amountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
