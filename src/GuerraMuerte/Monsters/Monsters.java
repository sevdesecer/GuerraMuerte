package GuerraMuerte.Monsters;

public abstract class Monsters {

    private String name;
    private int damage;
    private int health;
    private int firstHealth;
    private int earning;

    public Monsters(String name, int damage, int health, int firstHealth, int earning) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.firstHealth = firstHealth;
        this.earning = earning;
    }
    public abstract int randomAmountOfMonsters();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getFirstHealth() {
        return firstHealth;
    }

    public void setFirstHealth(int firstHealth) {
        this.firstHealth = firstHealth;
    }

    public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }
}
