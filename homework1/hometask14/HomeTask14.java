package homework1.hometask14;

import java.util.Scanner;

public class HomeTask14 {
    /**
     * Write a program in Java to prints the sum and average of given 5 numbers(number1, number2, number3, number4, number5)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        System.out.println("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Number 3: ");
        int number3 = scanner.nextInt();
        System.out.println("Number 4: ");
        int number4 = scanner.nextInt();
        System.out.println("Number 5: ");
        int number5 = scanner.nextInt();

        int sumOfNumbers=0;
        int[] allNumbers = {number1, number2, number3, number4, number5};
        for (int i = 0; i <allNumbers.length ; i++) {
            sumOfNumbers+=allNumbers[i];
        }
        System.out.println("Sum of numbers = " + sumOfNumbers);
        int averageOfNumbers = (number1 + number2 + number3 + number4 + number5) / allNumbers.length;
        System.out.println("Average of numbers = " + averageOfNumbers);
    }
}
