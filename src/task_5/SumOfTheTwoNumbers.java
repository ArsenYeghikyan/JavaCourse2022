package task_5;

import java.util.Scanner;

public class SumOfTheTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Input number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Input number 3: ");
        int num3 = scanner.nextInt();
        if (num1+num2==num3) {
            System.out.println("Expected Output:\n" + "The result is: true");
        }else {
            System.out.println("Expected Output:\n" + "The result is: false");
        }
    }
}




