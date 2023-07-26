package com.gmail.anyakeba.homeworks.lesson9;

public class TrackerMain {
    public static void main(String[] args) {

        Tracker firstUser = new Tracker("Sidorenko", 67.2, "120/60", 9568);
        firstUser.setName("Anna");
        firstUser.setBirthDate(1998);
        firstUser.setEmailAddress("annakkk@gmail.com");
        firstUser.setPhoneNumber("0978567932");

        Tracker secondUser = new Tracker("Petrenko", 96.4, "130/70", 10549);
        secondUser.setName("Ivan");
        secondUser.setBirthDate(1989);
        secondUser.setEmailAddress("ivanppp@gmail.com");
        secondUser.setPhoneNumber("0634981945");

        Tracker thirdUser = new Tracker("Schevchenko", 85.2, "140/80", 6783);

        thirdUser.setName("Galina");
        thirdUser.setBirthDate(1962);
        thirdUser.setEmailAddress("galinashev@gmail.com");
        thirdUser.setPhoneNumber("0935672938");


        firstUser.printAccountInfo();
        secondUser.printAccountInfo();
        thirdUser.printAccountInfo();


        firstUser.surname = "Oleinik";
        firstUser.weight = 65.9;
        firstUser.stepsForDays = 10456;
        firstUser.printAccountInfo();

        secondUser.weight = 83;
        secondUser.pressure = "120/60";
        secondUser.stepsForDays = 12345;
        secondUser.printAccountInfo();

    }
}