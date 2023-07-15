package com.gmail.anyakeba.homeworks.lesson7;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please enter m ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Please enter n ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();

        System.out.println("Our first matrix");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Our transposted matrix");
        int[][] transpostedMatrix = new int[n][m];
        for (int i = 0; i < transpostedMatrix.length; i++) {
            for (int j = 0; j < transpostedMatrix[i].length; j++) {
                transpostedMatrix[i][j] = matrix[j][i];
                System.out.print(transpostedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}








