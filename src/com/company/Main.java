package com.company;

import javax.management.loading.ClassLoaderRepository;
import java.util.ArrayList;

public class Main {

    //Practice: https://www.lynda.com/course-tutorials/Exercise-Objects-Java/2242051/2257759-4.html?autoplay=true
    public static void main(String[] args) {

        ClashRoyale clash = new ClashRoyale("clash",200,111, "air","rare",5);
        Wizard wizard = new Wizard("wizard",598,232, "air","rare",5);
        MegaKnight mega = new MegaKnight("Mega",252,230,"air","common",3);

        ArrayList<ClashRoyale> card_list = new ArrayList<ClashRoyale>();
        card_list.add(clash);
        card_list.add(wizard);
        card_list.add(mega);

        for (ClashRoyale card: card_list) {
            System.out.println(card);
        }



        if (wizard.getAttackDamage() > mega.getAttackDamage()) {
            System.out.println("wizard win");
        }

    }



}
