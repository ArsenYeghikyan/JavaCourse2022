package task_5;

import java.util.Scanner;

/*
5. Write a Java program to convert seconds to hour, minute and seconds. Read seconds from console.
Test Data:
Input seconds to convert: 86399
Expected Output:
23:59:59
 */
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int inputSeconds = scanner.nextInt();
        scanner.close();
        int hour = (inputSeconds / 60) / 60;
        int min = inputSeconds % 60;
        int seconds = min % 60;

        System.out.print(hour + ":" + min+":"+seconds);

    }
}
