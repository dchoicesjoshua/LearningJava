package com.company;

public class MegaKnight extends ClashRoyale{
    public MegaKnight (String name, int health, String type, String rarity, int elixir){
        super(name, health,  type, rarity, elixir);
        this.setAttackDamage(222);
        this.setSpeed(2);
    }
}
