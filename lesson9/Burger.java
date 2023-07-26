package com.gmail.anyakeba.homeworks.lesson9;

public class Burger {
    private String roll;
    private String meat;
    private String cheese;
    private String green;
    private String mayonnaise;

    Burger() {
        roll = "roll";
        meat = "meat";
        cheese = "cheese";
        green = "green";
        mayonnaise = "mayonnaise";
        System.out.println("Usual burger contains: " + roll + " " + meat + " " + cheese + " "
                + green + " " + mayonnaise);
    }

    Burger(String roll, String meat, String cheese, String green) {

        System.out.println("Diet burger contains: " + roll + " " + meat + " " + cheese + " " +
                green);
    }

    Burger(String roll, String meat, String cheese, String green, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;

        System.out.println("Double-meat burger contains: " + roll + " " + meat + " " + cheese + " "
                + green + " " + mayonnaise);
    }

}
