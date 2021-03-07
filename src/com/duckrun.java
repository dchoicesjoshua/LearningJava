package com.company;
import com.company.Duck;

class Duckrun extends DuckSwim {

    public Duckrun (String name, int life_expectancy, String favorite_food){
        super(name, life_expectancy, favorite_food);
    }

    public void run(){
        System.out.println(this.get_name() + " is swimming");
    }
}
