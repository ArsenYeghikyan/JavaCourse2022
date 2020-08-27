package task_1;

import java.util.Scanner;

public class ArrayInput {

    private static int readNumber() {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        return inputNumber;

    }


    public static int[] arrayMaker() {
        System.out.println("Input count numbers in an array: ");
        int countNumbersInArray = readNumber();
        int[] array = new int[countNumbersInArray];
        int j = 0;

        while (j < array.length) {
            System.out.println("Input number: ");
            int inputNumber = readNumber();
            array[j] = inputNumber;

            j++;
        }

        return array;


    }

    public static int findNumber(int[] array, int numberForFind) {
        array = ArrayInput.arrayMaker();
        for (int value : array) {
            if (value == numberForFind) {
                return 1;

            }
        }
        return -1;
    }


}

