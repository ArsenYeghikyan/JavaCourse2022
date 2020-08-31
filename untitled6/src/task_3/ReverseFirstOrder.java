package task_3;

import java.util.Scanner;

public class ReverseFirstOrder {

    private static double doubleReader() {
        System.out.println("input double:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

    public static double[] doubleArrayMaker(int arrayLength) {
        double[] array = new double[arrayLength];
        for (int i = 0; i < array.length; i++) {
            double inputNumber = doubleReader();
            array[i] = inputNumber;

        }
        return array;

    }

    public static double[] reverseArrayMaker(double[] arr) {
double[] newA = new double[arr.length];
        System.out.print("Array before reverse:\n");
        for (int i =  0; i<newA.length ; i++) {
            System.out.print(arr[i]+" ");

            newA[i] = arr[arr.length-i-1];
        }
        return newA ;

    }

    public static void printArray(double[] array) {

        System.out.println("\nArray after reverse:");
        for (double value : array) {
            System.out.print(value + " ");
        }

    }


}
