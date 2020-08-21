package task_3;

import java.util.Scanner;

/*
3. Write a Java program that takes width and height of rectangle and prints the area and perimeter of a rectangle.
Test Data:
Input width: 7
Input height: 4
Expected Output:
Area is 28
Perimeter is 22
 */
public class AreaAndPerimeterOfARectangle {

    public static int width, height;

    public static void main(String[] args) {

        area();
        perimeter();
    }

    public static void addParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width: ");
        width = scanner.nextInt();
        System.out.println("Input height: ");
        height = scanner.nextInt();
        scanner.close();
    }

    public static void area() {
        addParameters();
        int area = width * height;
        System.out.println("Expected Output: " + area);

    }

    public static void perimeter() {
        addParameters();
        int perimeter = 2 * (width + height);
        System.out.println("Expected Output: " + perimeter);

    }
}

