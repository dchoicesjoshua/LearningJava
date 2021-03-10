package com.company;

public class MegaKnight extends ClashRoyale{
    public MegaKnight (String name, int health, int speed, String type, String rarity, int elixir){
        super(name, health, speed, type, rarity, elixir);
        this.setAttachDamage(222);
    }
}
