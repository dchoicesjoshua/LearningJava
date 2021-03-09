package com.company;
import com.company.Duck;

public class DuckSwim extends Duck {

    public DuckSwim (String name, int life_expectancy, String favorite_food){
        super(name, life_expectancy, favorite_food);
    }

    public void swim(){
        System.out.println(this.get_name() + " is swimming too");
    }
}
