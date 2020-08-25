package task_13;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindromeFinder() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int reversedInteger = 0;
        int rem;
        int numberBeforeReverse = inputNumber;


        while (inputNumber != 0) {
            rem = inputNumber % 10;
            reversedInteger = reversedInteger * 10 + rem;
            inputNumber /= 10;
        }
        System.out.println("Expected Output: ");
        return numberBeforeReverse == reversedInteger;

    }
}
