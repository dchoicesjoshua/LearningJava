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
    public ClashRoyale (String name){
        this.setName(name);
    }

    public void rage(int increasedBy) {
        this.speed = this.speed + increasedBy;
    }

    public void rage() {
        this.speed = this.speed + 1;
    }

    public int getAttackDamage(){
        return this.attack_damage;
    }

    public String getName(){
        String namePrint = " name is " +  this.name + ": ";
        return namePrint;
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

    public int getElixir(){
        return this.elixir;
    }

    public String getRarity(){
        return this.rarity;
    }




    public void setName(String name){
        this.name = name ;
    }

    public void setRarity(String rarity){
        this.rarity = rarity;
    }

    public void setElixir(int elixir){
        this.elixir = elixir;
    }

    public void setAttackDamage(int attack_damage){
        this.attack_damage = attack_damage ;
    }

    public void setSpeed(int speed){
        if (speed < 0)
            System.out.println("Speed cannot be negative:" +  this.getName());
        else
            this.speed = speed;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setHealth(int health){
        this.health = health;
    }




    public String toString() {
        String result = this.getName();
        result = result + "type is " +  this.type + ":";
        result = result + " speed is " + this.speed + ":";
        result = result + " damage is " + this.attack_damage + ":";
        result = result + " health is " + this.health;
        return result ;
    }

}




