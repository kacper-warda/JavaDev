package com.company.devices;

public class Phone extends Device {

    public final Double screenSize;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }
}
