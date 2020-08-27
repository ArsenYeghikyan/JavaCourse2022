package homework1.hometask11;

import java.util.Scanner;

public class HomeTask11 {
    /**
     * Write a Java program to compute a specified formula
     *                     4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter number 3: ");
        double num3 = scanner.nextDouble();
        System.out.println("Enter number 4: ");
        double num4 = scanner.nextDouble();
        System.out.println("Enter number 5: ");
        double num5 = scanner.nextDouble();
        System.out.println("Enter number 6: ");
        double num6 = scanner.nextDouble();
        System.out.println("Enter number 7: ");
        double num7 = scanner.nextDouble();
        System.out.println("Enter number 8: ");
        double num8 = scanner.nextDouble();
        System.out.println( num1 * (num3 - (num2/num4) + (num2/num5) - (num2/num6) + (num2/num7) - (num2/num8)));
    }
}
