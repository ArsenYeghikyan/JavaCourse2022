package Beginner.hw4;

public class Main {

    public static void main(String[] args) {
        int[] x = new int[]{54};
        int[] y = newArr(x, 15);

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }


    public static int[] newArr(int[] array, int value) {

        int[] newArr = new int[array.length + 1];


        for (int i = 0; i < array.length; i++) {

            newArr[0] = value;
            newArr[i+1] = array[i];
        }

        return newArr;

    }


}
