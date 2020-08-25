package task_1;

import java.util.Scanner;
/*
1. Write a Java program that accepts four integers from console and prints “equal” if all four are equal, and “not equal” otherwise.

 */
public class FourNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Input number 1: ");
        num1 = scanner.nextInt();
        System.out.println("Input number 2: ");
        num2 = scanner.nextInt();
        System.out.println("Input number 3: ");
        num3 = scanner.nextInt();
        System.out.println("Input number 4: ");
        num4 = scanner.nextInt();
        scanner.close();
        if (num1 == num2 && num3 == num4 && num1 == num4) {
            System.out.println("Expected Output: all four numbers are equal");
        } else {
            System.out.println("Expected Output:  numbers aren't  equal");
        }


    }


}
