package GuerraMuerte.Warriors;

import GuerraMuerte.Player;

import javax.swing.text.PlainDocument;

public abstract class Warriors {

    private int id;
    private int damage;
    private int firstHealth;
    private int health;
    private int money;
    private String name;

    public Warriors (String name, int id, int firstHealth, int damage, int money, int health){
        this.name = name;
        this.id = id;
        this.firstHealth = firstHealth;
        this.damage = damage;
        this.money = money;
        this.health = health;
    }

    public int getId(){return this.id;}
    public void setId(int id){this.id = id;}

    public int getDamage() {return this.damage;}
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFirstHealth() {return this.firstHealth;}
    public void setFirstHealth(int firstHealth) {
        this.firstHealth = firstHealth;
    }

    public int getHealth() {return this.health;}
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return this.money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
