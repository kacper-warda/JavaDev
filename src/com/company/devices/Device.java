package com.company.devices;

public class Device {
    final public Integer yearOfProduction;
    final public String producer;
    final public String model;

    public Device(Integer yearOfProduction, String producer, String model) {
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
