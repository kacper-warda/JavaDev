package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {


        Human me = new Human("Kacper", "Warda");
        me.setSalary(5000.0);

        Car opel = new Car(1988, "Opel", "Vectra", "brown", -200.0);

        me.setCar(opel, 0);

        System.out.println(me.sumAllCarsValue());



    }
}
