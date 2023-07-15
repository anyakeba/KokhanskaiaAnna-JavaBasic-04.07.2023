package com.gmail.anyakeba.homeworks.lesson6;

import java.util.Arrays;

public class Regbi {

    private static int[] generateArray(int numberOfPlayers) {
        int maxAge = 40;
        int minAge = 18;
        int[] array = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            array[i] = (int) ((Math.random() * (maxAge - minAge)) + minAge);
        }
        return array;
    }

    public static double totalAgeTeam(int[] array) {
        double totalAge = 0;
        for (int i = 0; i < array.length; i++) {
            totalAge = totalAge + array[i];
        }
        return totalAge;
    }

    public static void main(String[] args) {
        int[] firstTeam = generateArray(25);
        int[] secondTeam = generateArray(25);

        System.out.println("Age of players firstTeam: " + Arrays.toString(firstTeam));
        System.out.println("Age of players secondTeam: " + Arrays.toString(secondTeam));

        double totalAgeFirstTeam = totalAgeTeam(firstTeam);
        double totalAgeSecondTeam = totalAgeTeam(secondTeam);

        double avarageAgeFirstTeam = (double) (totalAgeFirstTeam / 25);
        double avarageAgeSecondTeam = (double) (totalAgeSecondTeam / 25);

        System.out.println("Avarage age playes of firstTeam: " + avarageAgeFirstTeam);
        System.out.println("Avarage age playes of secondTeam: " + avarageAgeSecondTeam);

    }
}






