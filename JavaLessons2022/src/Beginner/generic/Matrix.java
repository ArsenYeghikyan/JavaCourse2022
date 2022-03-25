package Beginner.generic;

import java.util.Scanner;

public class Matrix {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Введите ширину фигуры");
            n = sc.nextInt();


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i >= j && i >= (n + 1) - j || (i <= j & i <= (n + 1) - j)) {
                        System.out.print(">");

                    } else {
                        System.out.print("0");
                    }
                    if (j % n == 0) {
                        System.out.println("");
                    }
                }
            }
        }









}
