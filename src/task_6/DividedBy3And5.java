package task_6;

import java.util.Scanner;

/*
6. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both
Expected Output:
Divided by 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95,

Divided by 3 & 5:
15, 30, 45, 60, 75, 90,
 */
public class DividedBy3And5 {

    private static int startLength = 0;
    private static int endLength = 0;

    private static void addLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput start length: ");
        startLength = scanner.nextInt();
        System.out.println("\nInput end length: ");
        endLength = scanner.nextInt();
//        scanner.close();
    }

    public static void dividedBy3() {
        addLength();
        System.out.println("\nDivided by 3:");
        for (int i = startLength; i < endLength; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void dividedBy5() {
        addLength();
        System.out.println("\nDivided by 5:");
        for (int i = startLength; i < endLength; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void dividedBy3And5() {
        addLength();
        System.out.println("\nDivided by 3 and 5:");
        for (int i = startLength; i < endLength; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
