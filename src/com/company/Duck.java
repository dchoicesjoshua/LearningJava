package com.company;

public class Duck {
    private String name;
    private static int life_expectancy;
    private String favorite_food;
    //constructor
    public Duck (String name, int life_expectancy, String favorite_food){
        this.name = name;
        this.life_expectancy = life_expectancy;
        this.favorite_food = favorite_food;

    }

    public void setFavorite_food(String favorite_food){
        this.favorite_food = favorite_food;
    }

    public String getFavorite_food(){
        return this.favorite_food;
    }

    public String get_name(){
        return this.name;
    }

    public static int get_life_expectancy(){
        return life_expectancy;
    }


    public void waddle(){
        System.out.println(this.name + " is waddling.");
        this.life_expectancy++;
    }
}
