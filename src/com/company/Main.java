package com.company;

import javax.management.loading.ClassLoaderRepository;
import java.util.ArrayList;

public class Main {

    //Practice: https://www.lynda.com/course-tutorials/Exercise-Objects-Java/2242051/2257759-4.html?autoplay=true
    public static void main(String[] args) {

        ClashRoyale clash = new ClashRoyale("Clash","none",0);
        Wizard wizard = new Wizard("wizard","rare", 5);
        MegaKnight mega = new MegaKnight("MegaKnight","Legendary",7);
        Barbarians barbarians = new Barbarians("Barbarians","common",5);

        ArrayList<ClashRoyale> array_list = new ArrayList<ClashRoyale>();
        array_list.add(clash);
        array_list.add(wizard);
        array_list.add(mega);
        array_list.add(barbarians);

        for (ClashRoyale card: array_list) {
            System.out.println(card);

        }
    }



}
