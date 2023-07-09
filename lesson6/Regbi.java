package com.gmail.anyakeba.homeworks.lesson6;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {
        int maxAge = 40;
        int minAge = 18;

        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = (int) ((Math.random() * (maxAge - minAge)) + minAge);
        }

        for (int j = 0; j < secondTeam.length; j++) {
            secondTeam[j] = (int) ((Math.random() * (maxAge - minAge)) + minAge);
        }

        System.out.println("Age of players firstTeam: " + Arrays.toString(firstTeam));
        System.out.println("Age of players secondTeam: " + Arrays.toString(secondTeam));

        double avarageAgeFirstTeam = (double) (Arrays.stream(firstTeam).sum()) / 25;
        double avarageAgeSecondTeam = (double) (Arrays.stream(secondTeam).sum()) / 25;

        System.out.println("Avarage age playes of firstTeam: " + avarageAgeFirstTeam);
        System.out.println("Avarage age playes of secondTeam: " + avarageAgeSecondTeam);

    }
}






