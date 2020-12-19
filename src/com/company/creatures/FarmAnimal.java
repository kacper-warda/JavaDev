package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("adiooooooos");
        this.setWeight(0.0);
        this.isAlive = false;
    }
}
