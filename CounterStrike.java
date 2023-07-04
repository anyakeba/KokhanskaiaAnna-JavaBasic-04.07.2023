package com.gmail.anyakeba.lesson3;

public class CounterStrike {
    public static void main(String[] args) {
        String firstTeam = "Lions";
        int firstLionsPlayer = 18;
        int secondLionsPlayer = 17;
        int thirdLionsPlayer = 12;
        int fourthLionsPlayer = 7;
        int fifthLionsPlayer = 15;

        String secondTeam = "Wolves";
        int firstWolvesPlayer = 10;
        int secondWolvesPlayer = 11;
        int thirdWolvesPlayer = 12;
        int fourthWolvesPlayer = 7;
        int fifthWolvesPlayer = 14;

        double averageFragLions = (double) (firstLionsPlayer + secondLionsPlayer + thirdLionsPlayer + fourthLionsPlayer + fifthLionsPlayer) / 5;
        double averageFragWolves = (double) (firstWolvesPlayer + secondWolvesPlayer + thirdWolvesPlayer + fourthWolvesPlayer + fifthWolvesPlayer) / 5;


        double eps = 0.00001;
        if (averageFragLions > averageFragWolves && Math.abs(averageFragLions - averageFragWolves) > eps) {
            System.out.println("Перемогла команда " + firstTeam + ", набрала " + averageFragLions + " очків.");
        } else if (averageFragWolves > averageFragLions && Math.abs(averageFragLions - averageFragWolves) > eps) {
            System.out.println("Перемогла команда " + secondTeam + ", набрала " + averageFragWolves + " очків.");
        } else if (Math.abs(averageFragLions - averageFragWolves) < eps) {
            System.out.println("Нічия!");
        }
    }
}
