package task_4;

import java.util.Scanner;

public class ArraysCompare {

    private static int scannerInts() {
        System.out.println("Input Int: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] IntsArrayMaker(int integerCount) {
        int[] intArray = new int[integerCount];

        for (int i = 0; i < intArray.length; i++) {
            int inputInt = scannerInts();
            intArray[i] = inputInt;
        }
        return intArray;
    }

    public static int compare(int[] arr1, int[] arr2) {


        for (int value : arr1) {

            for (int value2 : arr2) {
                if (value != value2) {
                    return value;
                }

            }
        }

        return -1;

    }

}
