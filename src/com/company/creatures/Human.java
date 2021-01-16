package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human extends Animal {


    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public static final Integer GARAGE_DEFAULT_SIZE = 4;
    public Double salary;
    private Double cash;
    public static final String HOMO_SAPIENS = "homo sapiens";
    private final Car[] garage;

    public Human(String firstName, String lastName, Integer garageSize) {
        super(HOMO_SAPIENS);
        this.cash = 0.0;
        this.salary = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public Human(String firstName, String lastName) {
        super(HOMO_SAPIENS);
        this.cash = 0.0;
        this.salary = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[GARAGE_DEFAULT_SIZE];
    }

    public Human(String firstName) {
        super(HOMO_SAPIENS);
        this.firstName = firstName;
        this.garage = new Car[GARAGE_DEFAULT_SIZE];
    }

    public Double getSalary() {
        System.out.println("Pobieranie wynagrodzenia: " + LocalDateTime.now());
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("chyba śnisz, nikt nie będzie dokładał do roboty");
        } else {
            System.out.println("Dane o podwyżce wysłane do księgowości");
            System.out.println("Aneks do odebrania u pani Hani");
            System.out.println("Info do ZUS i US przekazane, więc bez cwaniakowania");
            this.salary = newSalary;
        }
    }

    public Car getCar(Integer parkNumber) {
        return garage[parkNumber];
    }

    public void setCar(Car car, Integer parkNumber) {
        this.garage[parkNumber] = car;
    }

    public Double sumAllCarsValue() {
        Double sum = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                sum = sum + this.garage[i].value;
            }
        }
        return sum;
    }


    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        if (cash != null) {
            this.cash = cash;
        } else {
            System.out.println("nie można mieć nieznaną liczbę gotówki");
        }

    }

    public void feed() {
        System.out.println("dzięki za jedzenie, gdzie masz widelce?");
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public boolean hasCar(Car car) {
        boolean hasThisCar = false;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                hasThisCar = true;
                break;
            }
        }
        return hasThisCar;
    }

    public boolean hasFreeSpace() {
        boolean hasFreeSpace = false;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                hasFreeSpace = true;
                break;
            }
        }
    }
}
