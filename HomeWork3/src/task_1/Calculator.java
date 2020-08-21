package task_1;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Read numbers from console.

import java.util.Scanner;

public class Calculator {


    public static void calculator() {
        double number_1, number_2;
        String arithmeticOperator;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer num_1: ");
        number_1 = scanner.nextInt();
        System.out.println(" Input an arithmetic operator: ");
        arithmeticOperator = scanner.next();
        System.out.println("Input an integer num_2: ");
        number_2 = scanner.nextInt();

        switch (arithmeticOperator) {
            case "+":
                double sum = number_1 + number_2;
                System.out.println(sum);
                break;
            case "-":
                double sub = number_1 - number_2;
                System.out.println(sub);
                break;
            case "*":
                double multiply = number_1 * number_2;
                System.out.println(multiply);
                break;
            case "/":
                if (number_2 == 0) {
                    System.out.println("Can't divide 0 , try again: ");
                    calculator();

                } else {
                    double divide = number_1 / number_2;
                    System.out.println(divide);
                }
                break;
            case "%":
                double remainder = number_1 % number_2;
                System.out.println(remainder);
                break;
            default:
                System.out.println("Wrong arithmetic operator, try again: ");
                calculator();
                break;
        }
    }

}
