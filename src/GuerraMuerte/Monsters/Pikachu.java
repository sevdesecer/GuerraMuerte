package GuerraMuerte.Monsters;

public class Pikachu extends Monsters { //Vampire

    public Pikachu(){
        super("Pikachu",4,14,14,7);
    }
    @Override
    public int randomAmountOfMonsters(){
        return (int)(Math.random() * 3) + 1;
    }
}
