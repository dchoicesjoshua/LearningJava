package com.company;

public class Barbarians extends ClashRoyale {

    public Barbarians (String name){
        super(name);
        this.setAttackDamage(159);
        this.setSpeed(-1);
        this.setType("ground");
        this.setRarity("common");
        this.setElixir(5);
        this.setHealth(450);
    }


}
