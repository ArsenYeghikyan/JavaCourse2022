package task_5;

import java.util.Scanner;

public class Menu {
    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean isStart = true;
        System.out.println("Enter the number 1,2 or 3 to enter the menu:");
        while (isStart) {

            int button = scanner.nextInt();

            switch (button) {

                case 1:
                    System.out.println("Hello World");
                    System.out.println("If you want to continue enter number 1,2 or 3. To exit the Menu enter number 4");
                    break;
                case 2:
                    System.out.println("Hello Word");
                    System.out.println("If you want to continue enter number 1,2 or 3. To exit the Menu enter number 4");
                    break;
                case 3:
                    System.out.println("Hello Old");
                    System.out.println("If you want to continue enter number 1,2 or 3. To exit the Menu enter number 4");
                    break;
                case 4:
                    System.out.println("EXIT");
                    isStart = false;
                    break;
                default:
                    System.out.println("Try again:");
                    printMenu();
            }


        }


    }

}
