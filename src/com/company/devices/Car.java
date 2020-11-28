package com.company.devices;

public class Car extends Device {
    private final String color;
    public Double value;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model);
        this.color = color;
        this.value = value;
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
}
