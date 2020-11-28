package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.setSalary(5000.0);

        System.out.println(me.species);
        me.feed(1.0);

        Phone nokia = new Phone(1999, "Nokia", "3310", 1.0);
        Car opel = new Car(1999, "Opel", "Corsa", "blue", 2000.0);

        System.out.println(nokia);
        System.out.println(opel);

    }
}
