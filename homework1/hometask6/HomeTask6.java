package homework1.hometask6;

import java.util.Scanner;

public class HomeTask6 {
    /**
     * Write a program that checks if given digit divides onto 3 and 7, using if-else-if, if-nested if, if with logical operators(&&)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i+"  divides into 3 and 7");

            }
        }

    }
}
