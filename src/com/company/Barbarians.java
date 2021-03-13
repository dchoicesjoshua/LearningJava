package com.company;

public class Barbarians extends ClashRoyale {

    public Barbarians (String name, int health, String type, String rarity, int elixir){
        super(name, health, type, rarity, elixir);
        this.setAttackDamage(159);
        this.setSpeed(2);

    }

    public String toString() {
        String result = "ToString from Barbarian ";
        return result ;
    }
}
