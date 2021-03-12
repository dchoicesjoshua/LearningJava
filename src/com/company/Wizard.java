package com.company;

public class Wizard extends ClashRoyale {

    public Wizard (String name, int health, int speed, String type, String rarity, int elixir){
        super(name, health, speed, type, rarity, elixir);
        this.setAttackDamage(232);
    }

    public String toString() {
        String result = "ToString from Wizard ";
        return result ;
    }
}
