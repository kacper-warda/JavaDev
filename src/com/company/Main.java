package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Kacper", "Warda");
        me.setSalary(5000.0);

        Phone nokia = new Phone(1999, "Nokia", "3310", 1.0);
        Car opel = new Car(1999, "Opel", "Corsa", "blue", 2000.0);

        me.phone = nokia;
        me.setCar(opel);


        Human brotherInLow = new Human("Piotr", "Grygo");
        brotherInLow.setCash(1000.0);

        try {
            nokia.sell(me, brotherInLow, 50.0);
        } catch (Exception e) {
            System.out.println("sorry, nie udało się sprzedać");
            System.out.println(e.getMessage());
        }

        System.out.println("dalsza logika");

    }
}
