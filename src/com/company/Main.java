package com.company;

import javax.management.loading.ClassLoaderRepository;
import java.util.ArrayList;

public class Main {

    //Practice: https://www.lynda.com/course-tutorials/Exercise-Objects-Java/2242051/2257759-4.html?autoplay=true
    public static void main(String[] args) {

        ClashRoyale clash = new ClashRoyale("Clash");
        Wizard wizard = new Wizard("wizard");
        MegaKnight mega = new MegaKnight("MegaKnight");
        Barbarians barbarians = new Barbarians("Barbarians");

        ArrayList<ClashRoyale> clash_royale = new ArrayList<ClashRoyale>();
        clash_royale.add(clash);
        clash_royale.add(wizard);
        clash_royale.add(mega);
        clash_royale.add(barbarians);

        for (ClashRoyale card: clash_royale){
            System.out.println(card);
            System.out.println("Speed before:" + card.getSpeed());
            card.rage(2);
            card.rage(3);
            card.rage();
            System.out.println("Speed after:" + card.getSpeed());
        }

        if(wizard.getHealth() > 100)
            System.out.println("you are healthy");

    }



}
