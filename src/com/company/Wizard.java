package com.company;

public class Wizard extends ClashRoyale {

    public Wizard(String name, int i, int health, String type, String rarity, int elixir){
        super(name, health, type, rarity, elixir);
        this.setAttackDamage(232);
        this.setSpeed(2);
    }

    public String toString() {
        String result = "ToString from Wizard ";
        return result ;
    }
}
