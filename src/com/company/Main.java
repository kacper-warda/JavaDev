package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.setSalary(5000.0);

        me.feed(2.0);
        me.name = "afawefawf";

        Car opel1 = new Car(2000, "opel", "astra", "sraczkowaty", 3000.0);
        Car zlom = opel1;

        System.out.println("Czy to będzie prawda?");
        System.out.println(opel1 == zlom);

        System.out.println(me);

    }
}
