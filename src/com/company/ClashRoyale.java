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
    public ClashRoyale (String name, int health, int speed, String type, String rarity, int elixir){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.type = type;
        this.rarity = rarity;
        this.elixir = elixir;
        this.setAttackDamage(111);
    }

    public int getAttackDamage(){
        return this.attack_damage;
    }

    public void setAttackDamage(int attack_damage){
        this.attack_damage = attack_damage ;
    }

    public String toString() {
        String result = "ToString from ClashRoyale :" +  name + " has " + health + " health " + attack_damage + " damage. He is a " + type + " He is" +
                " a " + rarity + " and he is " + elixir + " elixir";
        return result ;
    }

}




