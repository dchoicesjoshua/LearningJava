package com.company;

public class Barbarians extends ClashRoyale {

    public Barbarians (String name, String rarity, int elixir){
        super(name, rarity, elixir);
        this.setAttackDamage(159);
        this.setSpeed(2);
        this.setType("ground");

    }


}
