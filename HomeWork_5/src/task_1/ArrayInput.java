package task_1;

import java.util.Scanner;
/*
1. Write a function that reads an array from console and returns the array.
Another function that reads a number from console and the third function that receives the array and the number as input arguments and checks if the array contains the number,
 if the number is in the array the function will return the index, otherwise -1. Print the value returned by this function.
 */
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

        int i = 0;
        while (i < array.length) {

            if (array[i] == numberForFind) {
                return 1;
            }

            i++;
        }
        return -1;
    }


}

