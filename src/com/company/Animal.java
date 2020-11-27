package com.company;

import java.io.File;

public class Animal {

    final static Double MIN_WEIGHT = 2.0;

    final public String species;
    public Boolean isAlive = true;
    String name;
    File pic;
    private Double weight = 10.0;

    public Animal(String species) {

        this.species = species;
    }

    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("too late");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("thx for a walk, bro");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println("go for jail");
            System.out.println("nice");
        }
    }

    Double getWeight() {
        return weight;
    }

    void setWeight(Double newWeight) {
        this.weight = newWeight;
    }


}
