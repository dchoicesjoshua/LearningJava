package com.company;

public class Duck {
    String name;
    int life_expectancy;
    private String favorite_food;
    //constructor
    public Duck (String name, int life_expectancy, String favorite_food){
        this.name = name;
        this.life_expectancy = life_expectancy;
        this.favorite_food = favorite_food;

    }

    public void waddle(){
        System.out.println(this.name + " is waddling.");
        this.life_expectancy++;
    }
}
