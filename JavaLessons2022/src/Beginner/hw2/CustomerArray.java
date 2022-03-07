package Beginner.hw2;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {

        maxNum(makeArr());
        minxNum(makeArr());
        System.out.println("sum of arr: " + sum(makeArr()));
        average(makeArr());
        odd(makeArr());
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


    public static void maxNum(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("maxNum: " + max);
    }

    public static void minxNum(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("maxNum: " + min);
    }


    public static int sum(int[] arr) {
        int sum = 0;

        for (int j : arr) {

            sum += j;

        }
        return sum;
    }


    public static void average(int[] arr) {

        int aver = 0;

        for (int i = 0; i < arr.length; i++) {
            aver = sum(arr) / arr.length;
        }
        System.out.println("Average: " + aver);

    }


    public static void odd(int[] arr) {

        for (int j : arr) {
            if (j % 2 != 0) {

                System.out.println("ODD : " + j);
            }
        }
    }

}


