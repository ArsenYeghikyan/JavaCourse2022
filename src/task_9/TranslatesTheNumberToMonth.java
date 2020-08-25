package task_9;

import java.util.Scanner;
/*
9. Write a Java program that reads a number from console and translates the number to month (use switch instead of if).
 If the number isn't in the range (1 - 12). Print "invalid number".
Sample input1:
Insert the number of month: 5
Expected Output:
May
Sample input2:
Insert the number of month: 45
Expected Output:
invalid number
 */
public class TranslatesTheNumberToMonth {

    public static void main(String[] args) {
        translater();
    }

    public static void translater() {
        System.out.println("Input number from range 1-12: ");
        Scanner scanner = new Scanner(System.in);
        byte numberOfMonth = scanner.nextByte();
        scanner.close();
        switch (numberOfMonth) {
            case 1:
                System.out.println("Expected Output:\n January");
                break;
            case 2:
                System.out.println("Expected Output:\n February");
                break;
            case 3:
                System.out.println("Expected Output:\n March");
                break;
            case 4:
                System.out.println("Expected Output:\n April");
                break;
            case 5:
                System.out.println("Expected Output:\n May");
                break;
            case 6:
                System.out.println("Expected Output:\n June");
                break;
            case 7:
                System.out.println("Expected Output:\n July");
                break;
            case 8:
                System.out.println("Expected Output:\n August");
                break;
            case 9:
                System.out.println("Expected Output:\n September");
                break;
            case 10:
                System.out.println("Expected Output:\n October");
                break;
            case 11:
                System.out.println("Expected Output:\n November");
                break;
            case 12:
                System.out.println("Expected Output:\n December");
                break;
            default:
                System.out.println("Expected Output:\n Invalid number");


        }
    }

}
