package task_1;

import java.util.Scanner;

public class ArrayInput {

    private static int readNumber() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        return inputNumber;

    }


    public static int[] arrayMaker(int countNumberInArray) {
        int[] array = new int[countNumberInArray];
        int j = 0;

        while (j < array.length) {

            int inputNumber = readNumber();
            array[j] = inputNumber;

            j++;
        }

        return array;


    }


}

