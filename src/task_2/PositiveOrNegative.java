package task_2;

import java.util.Scanner;

/*
2. Write a Java program that reads a number from the console and prints "positive" if the number is positive and "negative" if the number is negative
 */
public class PositiveOrNegative {

    public static void main(String[] args) {
        System.out.println("Input positive or negative number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        if (inputNumber >= 0) {
            System.out.println("Expected Output: " + '\n' + inputNumber + " is positive");
        } else {
            System.out.println("Expected Output: " + '\n' + inputNumber + " is negative");
        }
    }
}
