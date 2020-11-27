package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.setSalary(5000.0);

        Car opel = new Car(1999, "opel", "astra", "sraczkowaty", 6000.0);
        me.setCar(opel);

        System.out.println(me.getCar());

    }
}
