package com.gmail.anyakeba.homeworks.lesson3;

public class ChineseDinasty {
    public static void main(String[] args) {
        int strengthWarriorsLi = 13;
        int strengthBowmenLi = 24;
        int strengthHorsemenLi = 46;

        int strengthWarriorsMin = 9;
        int strengthBowmenMin = 35;
        int strengthHorsemenMin = 12;

        int countEachOfTypeSoldiersLi = 860;
        int countEachOfTypeSoldiersMin = (int) Math.floor(countEachOfTypeSoldiersLi * 1.5);

        int totalStrengthArmyLi = (strengthWarriorsLi + strengthBowmenLi + strengthHorsemenLi) * countEachOfTypeSoldiersLi;
        int totalStrengthArmyMin = (strengthWarriorsMin + strengthBowmenMin + strengthHorsemenMin) * countEachOfTypeSoldiersMin;

        System.out.println("Total Strength Army Li - " + totalStrengthArmyLi);
        System.out.println("Total Strength Army Min - " + totalStrengthArmyMin);

    }
}
