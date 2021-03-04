package com.company;

public class Duck {
    private String name;
    private int life_expectancy;
    private String favorite_food;
    //constructor
    public Duck (String name, int life_expectancy, String favorite_food){
        this.name = name;
        this.life_expectancy = life_expectancy;
        this.favorite_food = favorite_food;

    }

    public String get_name(){
        return this.name;
    }

    public int get_life_expectancy(){
        return this.life_expectancy;
    }


    public void waddle(){
        System.out.println(this.name + " is waddling.");
        this.life_expectancy++;
    }
}
