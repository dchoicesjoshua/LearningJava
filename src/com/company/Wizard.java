package com.company;

public class Wizard extends ClashRoyale {

    public Wizard(String name){
        super(name);
        this.setAttackDamage(232);
        this.setSpeed(2);
        this.setType("air");
        this.setRarity("rare");
        this.setElixir(5);
        this.setHealth(450);
    }

}
