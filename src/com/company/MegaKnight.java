package com.company;

public class MegaKnight extends ClashRoyale{

    public MegaKnight (String name){
        super(name);
        this.setAttackDamage(222);
        this.setSpeed(2);
        this.setType("ground");
        this.setRarity("Legendary");
        this.setElixir(7);
        this.setHealth(3300);
    }

}
