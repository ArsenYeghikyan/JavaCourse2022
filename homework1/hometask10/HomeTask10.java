package homework1.hometask10;

import java.util.Scanner;

public class HomeTask10 {
    /**
     * Write a Java program to print the sum (addition), multiply of 4 numbers(number1, number2, number3, number4). Go to the editor
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 integers: ");
        System.out.println("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Number 3: ");
        int number3 = scanner.nextInt();
        System.out.println("Number 4: ");
        int number4 = scanner.nextInt();

        int sumOfNumbers = number1 + number2 + number3 + number4;
        System.out.println("Sum of numbers = " + sumOfNumbers);

        int multiplyOfNumbers = number1 + number2 + number3 + number4;
        System.out.println("Multiply of numbers = " + multiplyOfNumbers);

    }
}
