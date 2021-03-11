package com.company;

import java.util.ArrayList;

public class Main {

    //Practice: https://www.lynda.com/course-tutorials/Exercise-Objects-Java/2242051/2257759-4.html?autoplay=true
    public static void main(String[] args) {

        ArrayList<ClashRoyale> clashList = new ArrayList<ClashRoyale>();
        Wizard wizard = new Wizard("wizard",598,232, "air","rare",5);
        MegaKnight mega = new MegaKnight("archer",252,230,"air","common",3);

        clashList.add(wizard);
        clashList.add(mega);

        PrintClash(clashList);


        if (wizard.getAttackDamage() > mega.getAttackDamage()) {
            System.out.println("wizard win");
        }

      /*
        Duck duck = new Duck("Lamar Jackson",50,"cotton candy");
        DuckSwim duck2 = new DuckSwim("Hollywood Brown",50,"pizza");
        DuckRun duckies  = new DuckRun("Julio Jones",23,"lemonade");
        duck2.waddle();
        duck2.swim();
        duckies.run();
        duckies.swim();
        System.out.println(duck.get_name() + "'s life expectancy is " + duck.get_life_expectancy());
        duck.setFavorite_food("ice cream");
        System.out.println(duck.getFavorite_food());
      */

    }

    private static void PrintClash(ArrayList<ClashRoyale> list) {
        for(ClashRoyale item: list){
            System.out.println("Attack Damage:" + Integer.toString(item.getAttackDamage()));
        }
    }


}
