package task_4;

import java.util.Scanner;

public class ArraysCompare {

    private static int scannerInts() {
        System.out.println("Input Int: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] intsArrayMaker(int integerCount) {
        int[] intArray = new int[integerCount];

        for (int i = 0; i < intArray.length; i++) {
            int inputInt = scannerInts();
            intArray[i] = inputInt;
        }
        return intArray;
    }
    public static int compare(int[] arr1,int[] arr2){


    for (int i = 0; i < arr1.length; i++) {

        for (int value : arr2) {
            if (arr1[i] != value) {
                return i;
            }

        }
    }

    return -1;

}

}
