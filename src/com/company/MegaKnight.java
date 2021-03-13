package com.company;

public class MegaKnight extends ClashRoyale{

    public MegaKnight (String name, String rarity, int elixir){
        super(name, rarity, elixir);
        this.setAttackDamage(222);
        this.setSpeed(2);
        this.setType("ground");
    }

}
