package com.company.devices;

import com.company.creatures.Human;

import java.net.URL;
import java.util.*;

public class Phone extends Device implements Saleable {

    public final Double screenSize;
    public Set<Application> applications = new HashSet<>();
    private Human owner;

    public static final String DEFAULT_APP_VERSION = "LATEST";
    public static final String DEFAULT_SERVER_ADDRESS = "appserver.me.com";

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize, Human owner) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
        this.owner = owner;
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

    public boolean installAnApp(List<String> appNames) {
        System.out.println("ale głupie te zadania");
        return true;
    }

    public boolean installAnApp(String appName) {
        return installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public boolean installAnApp(String appName, String version) {
        return installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public boolean installAnApp(String appName, String version, String server) {
        //weryfikacja wieku użytkownika
        //sprawdzenie czy mamy dość miejsca na telefonie
        //sprawdzenie czy płatne
        //przekierowanie do płatności
        //wykonanie płatności
        //weryfikacja płatności
        //pobranie aplikacji
        //skanowanie aplikacji/sprawdzenie sumy kontrolnej
        //rozpakowanie pliku z aplikacją
        //instalacja
        System.out.println("Zainstalowano " + appName + " w wersji " + version + " z serwera " + server);
        return true;
    }

    public void installAnApp(Application app) throws Exception {
        if (this.owner.getCash() < app.price) {
            throw new Exception("Brak kasy");
        }
        this.applications.add(app);
        this.owner.setCash(this.owner.getCash() - app.price);
    }

    public boolean isInstalled(Application app) {
        return this.applications.contains(app);
    }

    public boolean isInstalled(String appName) {
        for (Application application : this.applications) {
            if (application.name.equals(appName)) {
                return true;
            }
        }
        return false;
     }

     public void printAllFreeApps(){
        for(Application application : this.applications){
            if(application.price == 0.0){
                System.out.println(application.name);
            }
        }
     }

    public boolean installAnApp(URL url) {
        System.out.println();
        return true;
    }

}
