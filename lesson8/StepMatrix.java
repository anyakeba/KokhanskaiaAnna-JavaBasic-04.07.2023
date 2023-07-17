package com.gmail.anyakeba.homeworks.lesson8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepMatrix {


    private static int [][] generateStepMatrix() {
        int raws;
        int columns;
        int columnsMaxElements;

        System.out.println("Please enter raws ");
        Scanner scanner = new Scanner(System.in);
        raws = scanner.nextInt();

        System.out.println("Please enter columnsMaxElements ");
        Scanner scanner1 = new Scanner(System.in);
        columnsMaxElements = scanner1.nextInt();
        columns = ThreadLocalRandom.current().nextInt(columnsMaxElements);
        int[][] matrix = new int[raws][columns];
        if (columns > 0 && columns <= columnsMaxElements) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 10);
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();

            }
        }
        return matrix;
    }


    public static void main(String[] args) {

        int[][] ourMatrix = generateStepMatrix();


    }

}