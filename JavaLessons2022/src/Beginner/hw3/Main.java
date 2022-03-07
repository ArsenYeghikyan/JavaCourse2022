package Beginner.hw3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] arr2 = myReverse(makeArr());
        int[] arr3 = subArray(makeArr(), 1, 3);
        for (int j : arr3) {
            System.out.println(j);
        }
    }

    public static int[] makeArr() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of numbers:");
        int arrLength = scanner.nextInt();
        int[] customerArray = new int[arrLength];

        for (int i = 0; i < customerArray.length; i++) {
            int num = scanner.nextInt();
            customerArray[i] = num;
        }


        return customerArray;
    }

//    public static int[] myReverse(int[] array) {
//
//        int[] reverseArr = new int[array.length];
//        for (int i = array.length - 1, j = 0; i >= 0; j++, --i) {
//            reverseArr[j] = array[i];
//        }
//
//
//        return reverseArr;
//    }

    public static int[] subArray(int[] array, int index, int count) {

        int[] arr = new int[count];

        for (int i = 0; i < array.length-1; i++) {





        }


        return arr;
    }


}
