package task_7;

import java.util.Scanner;

public class MultiplicationTable {


    public static void multiplication() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Expected Output: ");
        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(number + " x " + i + " = " + result);
        }
    }


}
