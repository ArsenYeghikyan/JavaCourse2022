package task_3;

import java.util.Scanner;
/*
3. Write a Java program that reads from console two double variables. Print true if both strictly between 0 and 1 and false otherwise.
 */
public class numberBetween0And1 {
    public static void main(String[] args) {
        System.out.println("Input double type number: ");
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        if (inputNumber > 0 && inputNumber < 1) {
            System.out.println("Expected Output: " + '\n' + "true");
        } else {
            System.out.println("Expected Output: " + '\n' + "false");
        }
    }
}
