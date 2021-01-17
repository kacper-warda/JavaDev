package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Human me = new Human("Kacper", "Warda");
        me.setSalary(5000.0);

        Car opel = new Car(1988, "Opel", "Vectra", "brown", -200.0);

        System.out.println("Liczba transakcji: " + opel.numberOfTransactions());

        me.setCar(opel, 0);

        Human brotherInLow = new Human("Pioter", "Szfagier");
        brotherInLow.setCash(500.0);

        try {
            opel.sell(me, brotherInLow, 300.0);
        } catch (Exception e) {
            System.out.println("niestety nie udało się sprzedać");
            e.printStackTrace();
        }

        System.out.println("Liczba transakcji: " + opel.numberOfTransactions());

        List<String> texts = new ArrayList<>();
        String bob = "Bob";
        String alex = "Alex";
        String janusz = "Janusz";

        texts.add(bob);
        texts.add(bob);
        texts.add(bob);
        texts.add(janusz);
        texts.add(alex);

        System.out.println(texts.size());

        System.out.println("ELEMENTY LISTY:");
        for(int i = 0; i< texts.size(); i++){
            System.out.println(texts.get(i));
        }

        Set<String> textsSet = new TreeSet<>();
        textsSet.add(bob);
        textsSet.add(bob);
        textsSet.add(bob);
        textsSet.add(janusz);
        textsSet.add(alex);

        System.out.println(textsSet.size());

        Object[] insideSet = textsSet.toArray();
        for (int i = 0; i< textsSet.size();i++){
            System.out.println(insideSet[i]);
        }

    }
}
