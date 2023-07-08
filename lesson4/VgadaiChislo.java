package com.gmail.anyakeba.homeworks.lesson4;

import java.util.Random;
import java.util.Scanner;

public class VgadaiChislo {
    public static void main(String[] args) {
        System.out.println("Vvedit zagadane chislo vid 0 do 10 - ");
        Scanner scanner = new Scanner(System.in);
        byte vvedeneChislo = scanner.nextByte();
        Random rand = new Random();
        int zagadeneChislo = rand.nextInt(10);
        System.out.println(zagadeneChislo);
        int kilkistsprob = 0;

        while (kilkistsprob <= 4) {
            if (vvedeneChislo == zagadeneChislo) {
                System.out.println("Vgadane chislo virne");
            } else {
                System.out.println("Vgadane chislo nevirne, sprobyite tshe raz ");
                scanner.nextByte();
                kilkistsprob++;
            }
        }

        while (kilkistsprob <= 10) {
            if (vvedeneChislo == zagadeneChislo) {
                System.out.println("Vgadane chislo virne");
            } else {
                System.out.println("Vgadane chislo nevirne");
                System.out.println("Zalishilos 5 sprob, sprobyite tshe raz");
                scanner.nextByte();
                kilkistsprob++;
            }
        }
        while (kilkistsprob > 10) {
            System.out.println("Chislo nevgadano");
            break;
        }
    }
}





        






