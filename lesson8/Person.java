package com.gmail.anyakeba.homeworks.lesson8;

public class Person {
    String name;
    String surname;
    String city;
    String phoneNumber;

    void personInfo() {
        System.out.println("To call a citizen " + name + " " + surname + " from city " + city + " available by number " + phoneNumber);
    }

    public static void main(String[] args) {
        Person FirstPerson = new Person();
        Person SecondPerson = new Person();
        Person ThirdPerson = new Person();

        FirstPerson.name = "Jack";
        FirstPerson.surname = "Nelson";
        FirstPerson.city = "Washington";
        FirstPerson.phoneNumber = "7894635923";

        SecondPerson.name = "Mario";
        SecondPerson.surname = "Pavarroti";
        SecondPerson.city = "Rome";
        SecondPerson.phoneNumber = "894534921";

        ThirdPerson.name = "Oleksandr";
        ThirdPerson.surname = "Shevchenko";
        ThirdPerson.city = "Kiev";
        ThirdPerson.phoneNumber = "380964578932";

        FirstPerson.personInfo();
        SecondPerson.personInfo();
        ThirdPerson.personInfo();


    }
}
