package task_2;

import java.util.Scanner;

/*
2. Write a function that reads a matrix from console. Write a function for finding max value in the matrix. Print the max value in the end.
 */
public class Matrix {


    public static int[][] makeMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int x = scanner.nextInt();
        System.out.println("Input column: ");
        int y = scanner.nextInt();

        int[][] m = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = i; j < y; j++) {
                System.out.println("Input number for Matrix");
                m[i][j] = scanner.nextInt();
            }
        }

        return m;
    }

    public static int findMaxElement(int[][] matrix) {
        int max = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }


}
