package task_12;

import java.util.Scanner;
/*
12. Write a Java program, that reads an integer from console and prints its all devisors.
Sample input:
12
Expected Output:
2 3 4 6

 */
public class AllDivisors {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println("Expected Output: ");
        for (int i = 1; i <inputNumber ; i++) {
            if (inputNumber%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
