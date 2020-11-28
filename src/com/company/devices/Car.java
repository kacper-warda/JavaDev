package com.company.devices;

import java.io.Serializable;

public class Car extends Device implements Saleable, Serializable {
    private final String color;
    public Double value;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model);
        this.color = color;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("key turned");
        System.out.println("not working");
        System.out.println("key turned");
        System.out.println("not working");
        System.out.println("key turned");
        System.out.println("engine started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void sell() {
        System.out.println("sprzedano (walnięcie młotkiem)");
    }

    @Override
    public void sellOnCredit() {
        System.out.println("sprzedano (bank się cieszy)");
    }
}
