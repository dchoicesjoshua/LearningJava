package com.company;

public class ClashRoyale {
    private String name;
    private int health;
    private int attack_damage;

    //1 = slow 2 = medium 3 = fast
    private int speed;

    // air or ground
    private String type;

    //towers troops or spells
    private int units;

    //Common rare epic or legendary 1 = common 2 = rare 3 = epic 4 = legendary
    private String rarity;

    //elixir 1,2,3,4,5,6,7,8,9
    private int elixir;


    //constructor
    public ClashRoyale (String name, int health, int attack_damage, String type){
        this.name = name;
        this.health = health;
        this.attack_damage = attack_damage;
        this.type = type;
    }

    public String toString() {
        String result = name + " " + health + " " + attack_damage +  " " +  this.type;
        return result ;
    }

}




