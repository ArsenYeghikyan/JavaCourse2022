package task_11;

import java.util.Scanner;

public class SumOfDigits {


    public static void printSumOfDigits() {
        System.out.println("Expected Output:\n" + "The sum of the digits: " + sumOfDigits());
    }

    private static int[] convertFromNumberToArray(int number) {
        String str = Integer.toString(number);

        int[] arr2 = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr2[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return arr2;
    }


    private static int sumOfDigits() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int resultOfSumOFDigits = 0;

        for (int i = 0; i < convertFromNumberToArray(inputNumber).length; i++) {
            resultOfSumOFDigits += convertFromNumberToArray(inputNumber)[i];

        }
        return resultOfSumOFDigits;
    }

}
