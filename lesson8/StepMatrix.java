package com.gmail.anyakeba.homeworks.lesson8;

import java.util.Scanner;

public class StepMatrix {


    static int[][] generateStepMatrix() {
        int rows;
        int columnsMaxElements;

        System.out.println("Please enter rows ");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();

        System.out.println("Please enter columnsMaxElements ");
        Scanner scanner1 = new Scanner(System.in);
        columnsMaxElements = scanner1.nextInt();

        int[][] matrix = new int[rows][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[(int) ((Math.random() * columnsMaxElements) + 1)];
        }

        return matrix;
    }

    static void fillStepMatrix(int[][] stepMatrix) {
        for (int i = 0; i < stepMatrix.length; i++) {
            for (int j = 0; j < stepMatrix[i].length; j++) {
                stepMatrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public static int[][] sortDecrease(int[][] matrix) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < matrix.length; i += 2) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
        return matrix;
    }

    public static int[][] sortIncrease(int[][] matrix) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < matrix.length; i += 2) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                        swapped = true;

                    }
                }
            }
        } while (swapped);
        return matrix;
    }

    public static int sumAllElements(int[][] matrix) {
        int sumAllElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumAllElements = sumAllElements + matrix[i][j];

            }
        }
        System.out.println("Sum of all elements of the matrix = " + sumAllElements);
        return sumAllElements;
    }

    public static void sortElementsRows(int[][] matrix) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
    }

    public static void findMinOfRows(int[][] matrix) {
        sortElementsRows(matrix);
        System.out.println("Min element of every rows");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0] + " ");
        }
    }

    public static int absoluteMin(int[][] matrix) {
        int absoluteMin = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < absoluteMin) {
                    absoluteMin = matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Absolute min of matrix:" + absoluteMin);
        return absoluteMin;
    }

    public static int[][] devideElementstoAbsoluteMin(int[][] matrix, int absoluteMin) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= absoluteMin;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] ourMatrix = generateStepMatrix();
        fillStepMatrix(ourMatrix);
        printMatrix(ourMatrix);

        sortDecrease(ourMatrix);
        System.out.println("Sorted decrease odd rows");
        printMatrix(ourMatrix);

        sortIncrease(ourMatrix);
        System.out.println("Sorted increase even rows");
        printMatrix(ourMatrix);

        sumAllElements(ourMatrix);

        findMinOfRows(ourMatrix);

        absoluteMin(ourMatrix);
        int absoluteMin = absoluteMin(ourMatrix);
        if (absoluteMin != 0) {
            devideElementstoAbsoluteMin(ourMatrix, absoluteMin);
            System.out.println("abs min" + absoluteMin);
            printMatrix(ourMatrix);
        } else {
            System.out.println("Error! Not possible devide to 0");
        }
    }

}