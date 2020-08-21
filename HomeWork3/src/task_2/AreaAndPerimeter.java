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
    final static double PI = 3.14159;

    public static void main(String[] args) {
        area();
        perimeter();
    }


    public static void area() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double area = PI * (radius * radius);
        System.out.println("Expected Output: " + area);
    }

    public static void perimeter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double perimeter = 2 * PI * radius;
        System.out.println("Expected Output: " + perimeter);
    }

}
