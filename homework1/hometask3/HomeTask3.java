package homework1.hometask3;

import java.util.Scanner;

public class HomeTask3 {
    /**
     * 3. Write a program that prints "The number is odd", if the given number is odd, else print "The number is even".
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("The " + number + " is odd");
        } else {
            System.out.println("The " + number + " is even");
        }
    }
}
