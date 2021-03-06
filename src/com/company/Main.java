package com.company;

public class Main {

    //Practice: https://www.lynda.com/course-tutorials/Exercise-Objects-Java/2242051/2257759-4.html?autoplay=true
    public static void main(String[] args) {
        Duck duck = new Duck("Lamar Jackson",50,"cotton candy");
        DuckSwim duck2 = new DuckSwim("Hollywood Brown",50,"pizza");

        duck.waddle();
        duck.waddle();
        duck.waddle();
        duck.waddle();
        duck.waddle();
        duck.waddle();

        duck2.waddle();
        duck2.swim();
        System.out.println(duck.get_name() + "'s life expectancy is " + duck.get_life_expectancy());

        duck.setFavorite_food("ice cream");
        System.out.println(duck.getFavorite_food());
    }
}
