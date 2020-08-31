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
public static int compare(int[] arr1,int[] arr2){
int x = 0;
    for (int i = 0; i < arr1.length; i++) {

        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i]!=arr2[j]){
              return  arr1[i];
            }

        }
    }


return -1;

}

}
