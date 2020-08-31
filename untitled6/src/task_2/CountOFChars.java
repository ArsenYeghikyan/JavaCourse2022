package task_2;

import java.util.Scanner;

public class CountOFChars {

    private static char scannerChars() {
        System.out.println("Input Character: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static char[] charsArrayMaker(int characterCount) {
        char[] charArray = new char[characterCount];

        for (int i = 0; i < charArray.length; i++) {
            char inputChar = scannerChars();
            charArray[i] = inputChar;
        }

        return charArray;

    }


    public static int characterCounter(char[] array, char inputChar) {

        int count = 0;
        for (char value : array) {
            if (value == inputChar) {

                count++;
            }
        }
        System.out.println("Expected Output: ");

        return count;
    }


}
