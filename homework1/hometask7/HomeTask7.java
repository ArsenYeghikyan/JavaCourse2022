package homework1.hometask7;

import java.util.Scanner;

public class HomeTask7 {
    /**
     *  Write a program that checks if given digit divides onto 5 or 6, using if-else-if, if-nested if, if with logical operators(||)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
               
                System.out.println(i+"  divides into 5 or 6");

            }
        }
    }
}
