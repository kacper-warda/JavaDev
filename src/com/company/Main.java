package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        cat.takeForAWalk();
        cat.feed(0.5);
        cat.feed(0.3);
        cat.takeForAWalk();
        cat.feed(0.3);

        cat = new Animal("tiger");
        cat.feed(2.0);

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(70000000.0);
        System.out.println(me.getSalary());


    }
}
