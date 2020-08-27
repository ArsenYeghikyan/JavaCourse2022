package homework1.hometask9;

import java.util.Scanner;

public class HomeTask9 {
    /**
     * Write a Java program to print the result of the following operations.
     *                     a. -5 + 8 * 6
     *                     b. (55+9) % 9
     *                     c. 20 + -3*5 / 8
     *                     d. 5 + 15 / 3 * 2 - 8 % 3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter number 3: ");
        double num3 = scanner.nextDouble();
        System.out.println("Enter number 4: ");
        double num4 = scanner.nextDouble();
        System.out.println("Enter number 5: ");
        double num5 = scanner.nextDouble();
        System.out.println("Enter number 6: ");
        double num6 = scanner.nextDouble();

        System.out.println(-num1 + num2 * num3);
        System.out.println((num1+num2) % num2);
        System.out.println(num1 + -num2*num3 / num4);
        System.out.println(num1 + num2 / num3 * num4 - num5 % num6);
    }
}
