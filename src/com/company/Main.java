package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {


        Human me = new Human("Kacper", "Warda");
        me.setSalary(5000.0);

        Car opel = new Car(1988, "Opel", "Vectra", "brown", -200.0);

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


    }
}
