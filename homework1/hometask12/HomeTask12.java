package homework1.hometask12;

import java.util.Scanner;

public class HomeTask12 {
    /**
     * Write a Java program that checks a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number == 0) {
            System.out.println("Zero");
        }

        if (number >= 0) {
            System.out.println("Positive ");
        } else {
            System.out.println("Negative");
        }

       if (number < 1) {
            System.out.println("Small");
        } else if (number > 1_000_000) {
            System.out.println("Large");
        }


        if (number == (int) number) {
            System.out.println("Isn't floating-point number");

        } else {
            System.out.println("Is floating-point number");
        }

    }
}
