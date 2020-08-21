package task_4;

import java.util.Scanner;

/*
4. Create 2 int variables ( x and y). Assign any integer values to variables (е.g. 7 and 5).
 Write a code that swaps values of variables. For example: if you have x = 10 and y = 88, you have to swap values so you get x = 88 and y = 10.

 */
public class SwapsValues {
    public static void main(String[] args) {
        swapsValues();
    }

    private static void swapsValues() {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Input x: ");
        x = scanner.nextInt();
        System.out.println("Input y: ");
        y = scanner.nextInt();
        scanner.close();
        System.out.println("X number before swapping: " + x);
        System.out.println("Y number before swapping: " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("X number after swapping: " + x);
        System.out.println("Y number after swapping: " + y);

    }
}
