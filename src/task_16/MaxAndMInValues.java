package task_16;
/*
16. 15. Write a program that reads an array of doubles from the console and prints the minimum and maximum values of the array.

 */
public class MaxAndMInValues {

    public static void main(String[] args) {
       maxValue(new int[]{1,2,5,7,3});
       minValue(new int[]{1,2,5,7,3});

    }


    public static void maxValue(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }
        System.out.println("Max value "+max);

    }

    public static void minValue(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("Min value:"+min);
    }
}

