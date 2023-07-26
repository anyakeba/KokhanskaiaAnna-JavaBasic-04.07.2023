package com.gmail.anyakeba.homeworks.lesson6;

import java.util.Arrays;

public class Regbi {

    static int numberOfPlayers = 25;
    private static int[] generateArray() {
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
            totalAge = (totalAge + array[i]);
        }
        return totalAge;
    }

    public static void main(String[] args) {
        int[] firstTeam = generateArray();
        int[] secondTeam = generateArray();

        System.out.println("Age of players firstTeam: " + Arrays.toString(firstTeam));
        System.out.println("Age of players secondTeam: " + Arrays.toString(secondTeam));

        double totalAgeFirstTeam = totalAgeTeam(firstTeam);
        double totalAgeSecondTeam = totalAgeTeam(secondTeam);

        double avarageAgeFirstTeam = (double) (totalAgeFirstTeam / numberOfPlayers);
        double avarageAgeSecondTeam = (double) (totalAgeSecondTeam / numberOfPlayers);

        System.out.println("Avarage age playes of firstTeam: " + avarageAgeFirstTeam);
        System.out.println("Avarage age playes of secondTeam: " + avarageAgeSecondTeam);

    }
}






