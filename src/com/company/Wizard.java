package com.company;

public class Wizard extends ClashRoyale {

    public Wizard(String name, String rarity, int elixir){
        super(name,rarity, elixir);
        this.setAttackDamage(232);
        this.setSpeed(2);
        this.setType("air");
    }

}
