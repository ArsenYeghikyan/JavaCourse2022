package task_4;

import java.util.Scanner;
/*
4. Write a Java program that reads from console a number and prints "Even" if the number is even or "Odd" if the number is odd.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        if (inputNumber % 2 == 0) {
            System.out.println("Expected Output: " + '\n' + "Even");
        } else {
            System.out.println("Expected Output: " + '\n' + "Odd");
        }
    }
}
