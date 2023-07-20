package com.gmail.anyakeba.homeworks.lesson8.runner;

import com.gmail.anyakeba.homeworks.lesson8.Person;

public class PersonRunner {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();


        firstPerson.personInfo("Jack", "Nelson", "Washington", "7894635923");
        secondPerson.personInfo("Mario", "Pavarroti", "Rome", "894534921");
        thirdPerson.personInfo("Oleksandr", "Shevchenko", "Kiev", "380964578932");


    }
}
