package com.gmail.anyakeba.homeworks.lesson4;

public class Shuttles {
    public static void main(String[] args) {

        int shuttlesInTotal = 0;
        for (int i = 1; shuttlesInTotal < 100; i++) {
            if (isHappyNumber(i)) {
                shuttlesInTotal++;
                System.out.println("shuttle with number# " + i);
            }
        }

    }

    public static boolean isHappyNumber(int number) {
        String nToString = String.valueOf(number);
        return !(nToString.contains("4") || nToString.contains("9"));
    }


}