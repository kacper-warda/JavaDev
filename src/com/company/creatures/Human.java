package com.company.creatures;

import com.company.devices.Car;

import java.time.LocalDateTime;

public class Human extends Animal {


    public String firstName;
    public String lastName;
    public Animal pet;
    public Double salary;
    private Car car;

    public Human() {
        super("homo sapiens");
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Gratulacje :D");
            this.car = car;
        } else if (this.salary > car.value / 12.0) {
            System.out.println("Kupiłeś auto na raty");
            this.car = car;
        } else {
            System.out.println("Najpierw nazbieraj");
        }
    }

    public String toString() {
        return "Kacper Warda";
    }
}
