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
    public ClashRoyale (String name, String rarity, int elixir){
        this.name = name;
        this.rarity = rarity;
        this.elixir = elixir;
        this.setAttackDamage(111);
    }

    public int getAttackDamage(){
        return this.attack_damage;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getHealth(){
        return this.health;
    }

    public void setName(String name){
        this.name = name ;
    }


    public void setAttackDamage(int attack_damage){
        this.attack_damage = attack_damage ;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setHealth(int health){
        this.health = health;
    }


    public String toString() {
        String result = "ToString from ";
        result = result + "name is " +  this.name + ":";
        result = result + "type is " +  this.type + ":";
        result = result + " speed is " + this.speed + ":";
        result = result + " damage is " + this.attack_damage + ":";
        result = result + " health is " + this.health;
        return result ;
    }

}




