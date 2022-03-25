package Beginner.object.task1;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{-11, 2, 3, -1, 5};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        getArrayFirstOccurIndex();
    }


    public static void getArrayFirstOccurIndex() {

        int[] arr = new int[]{-11,1, 2, 3, -4, 5};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];


            }


        }
        System.out.println(min);
    }

}




