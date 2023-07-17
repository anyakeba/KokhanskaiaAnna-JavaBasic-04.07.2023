package com.gmail.anyakeba.homeworks.lesson4;

import java.util.Random;
import java.util.Scanner;


public class VgadaiChislo {
    public static void main(String[] args) {
        Random random = new Random();
        int machinesNumber = random.nextInt(10);
        int attempt = 3;

        do {
            System.out.println("Please enter number from 0 to 10 - ");
            Scanner scanner = new Scanner(System.in);
            int usersNumber = scanner.nextInt();
            if (usersNumber == machinesNumber) {
                System.out.println("Congatulations! It is correct!");
                break;
            } else {
                attempt--;
                System.out.println("Oops, it is incorrect.");

            }

        } while (attempt >= 1);

    }
}







        






