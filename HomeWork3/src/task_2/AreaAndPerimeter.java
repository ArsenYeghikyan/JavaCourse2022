package task_2;

import java.util.Scanner;

/*
1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Read numbers from console.
2. Write a Java program to print the area and perimeter of a circle. Read radius from console.
Test Data:
Enter the radius: 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

 */
public class AreaAndPerimeter {
    private final static double PI = 3.14159;
    private static double radius;

    private static void addRadius() {
        System.out.println("Input radius: ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
    }


    public static void area() {
        addRadius();
        double area = PI * (radius * radius);
        System.out.println("Expected Output: " + area);
    }

    public static void perimeter() {
        addRadius();
        double perimeter = 2 * PI * radius;
        System.out.println("Expected Output: " + perimeter);
    }

}
