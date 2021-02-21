package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Warszawa");
        list.add("Palermo");
        list.add("Tokio");

        for(String city : list){
            System.out.println(city);
        }

        list.remove("Warszawa");
        list.clear();

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Poland","Warsaw");
        capitalCities.put("GB","London");
        capitalCities.put("Italy","Rome");
        capitalCities.put("onomatopeja","reprezentuje biedę");

        System.out.println(capitalCities.get("Poland"));
        System.out.println(capitalCities.get("onomatopeja"));

        Map<String, Human> humanByNames = new HashMap<>();
        humanByNames.put("kacper",new Human("kacper"));
        Human human = new Human("karolina");
        humanByNames.put(human.firstName,human);


        humanByNames.get("kacper");
        humanByNames.remove("kacper");

        humanByNames.put("karolina", new Human("kasia"));
        humanByNames.put("kasia", new Human("kasia"));

        for(Human someone : humanByNames.values()){
            System.out.println(someone);
        }

        for(String name : humanByNames.keySet()){
            System.out.println(humanByNames.get(name));
        }



    }
}
