package com.gmail.anyakeba.homeworks.lesson9;

public class Tracker {
    private String name;
    private int birthDate;
    private String emailAddress;
    private String phoneNumber;
    String surname;
    double weight;
    String pressure;
    int stepsForDays;

    Tracker(String surname, double weight, String pressure, int stepsForDays) {
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsForDays = stepsForDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printAccountInfo() {

        System.out.println("Users information : " + surname + " " + getName() + ", weight: " + weight + " kilos, " + " steps for day: " + stepsForDays +
                ", pressure: " + pressure + ", birth date: " + getBirthDate() + " year, " + " age: " + getAge() + " " +
                getEmailAddress() + " " + getPhoneNumber());
    }

    public int getAge() {
        int age;
        age = 2023 - birthDate;
        return age;
    }

}
