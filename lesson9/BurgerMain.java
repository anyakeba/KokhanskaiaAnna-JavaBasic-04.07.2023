package com.gmail.anyakeba.homeworks.lesson9;

public class BurgerMain {
    public static void main(String[] args) {
        Burger usualBurger = new Burger("roll", "meat", "cheese", "green", "mayonnaise");
        Burger dietBurger = new Burger("roll", "meat", "cheese", "green", null);
        Burger doubleMeatBurger = new Burger("roll", "double meat", "cheese", "green", "mayonnaise");

        System.out.println("Usual burger contains :" + usualBurger.roll + " " + usualBurger.meat + " " + usualBurger.cheese + " "
                + usualBurger.green + " " + usualBurger.mayonnaise);
        System.out.println("Diet burger contains :" + dietBurger.roll + " " + dietBurger.meat + " " + dietBurger.cheese + " " +
                dietBurger.green + " " + dietBurger.mayonnaise);
        System.out.println("Double-meat burger contains :" + doubleMeatBurger.roll + " " + doubleMeatBurger.meat + " " +
                " " + doubleMeatBurger.cheese + " " + doubleMeatBurger.green + " " + doubleMeatBurger.mayonnaise);
    }
}
