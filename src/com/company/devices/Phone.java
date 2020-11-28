package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device implements Saleable {

    public final Double screenSize;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }


    @Override
    public void turnOn() {
        System.out.println("you pushed the button");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("beeep");
        System.out.println("helou");
        System.out.println("producer logo");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefiniować stan portfela ");
        }
        if (seller.phone == null) {
            System.out.println("Sorry nie masz telefonu");
            throw new Exception("Brak telefonu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sorry, nie masz kasy");
            throw new Exception("Brak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }
}
