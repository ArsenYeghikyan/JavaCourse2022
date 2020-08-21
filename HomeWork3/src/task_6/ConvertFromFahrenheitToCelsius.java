package task_6;

import java.util.Scanner;

/*
6. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Read Fahrenheit value from console.
Test Data:
Input a degree in Farenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
(Фаренгейт — 32) : 1,8 = Цельсий
Цельсий х 1,8 + 32 = Фаренгейт
 */
public class ConvertFromFahrenheitToCelsius {
    public static void main(String[] args) {
        converterFromFahrenheitToCelsius();
    }

    public static void converterFromFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("Expected Output: " + '\n' + fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
