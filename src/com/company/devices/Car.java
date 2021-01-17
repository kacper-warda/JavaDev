package com.company.devices;

import com.company.creatures.Human;

import java.util.LinkedList;
import java.util.List;

public class Car extends Device implements Saleable {
    private final String color;
    public List<Human> owners = new LinkedList<>();

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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("SPRZEDAWCA NIE MA AUUUTAA111!!!!1");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("Kupujący nie ma miejsca w garażu");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Brak kasy u kupującego");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        owners.add(buyer);
        System.out.println("Transakcja zakończona sukcesem");
    }

    public boolean wasAnOwner(Human human){
        return owners.contains(human);
    }

    public boolean aSoldToB(Human a, Human b){
        boolean transactionOccured = false;
        for(int i = 0; i < owners.size()-1; i++){
            if(owners.get(i) == a && owners.get(i+1) == b){
                transactionOccured = true;
                break;
            }
        }
        return transactionOccured;
    }

    public Integer numberOfTransactions(){
        if(owners != null && !owners.isEmpty()){
            return owners.size() -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
