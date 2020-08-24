package task_10;

import java.util.Scanner;

/*
10. Write a Java program, that reads an integer from console and prints its factorial (e.g. 6! = 1 * 2 * 3 * 4 * 5 * 6).
Sample input:
Insert the number: 6
Expected Output:
Factorial of 6 is 720
 */
public class Factorial {

/*
10. Write a Java program, that reads an integer from console and prints its factorial (e.g. 6! = 1 * 2 * 3 * 4 * 5 * 6).
Sample input:
Insert the number: 6
Expected Output:
Factorial of 6 is 720

 */
    public static void factorialPrinter() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        System.out.println("Expected Output:\n" + "Factorial of " + inputNumber + " is " + factorialMaker(inputNumber));

    }

    private static long factorialMaker(int factorialFromNumber) {
        if (factorialFromNumber <= 1) {
            return 1;
        } else {
            return factorialFromNumber * (factorialMaker(factorialFromNumber - 1));
        }

    }


}