package task_16;
/*
16. 15. Write a program that reads an array of doubles from the console and prints the minimum and maximum values of the array.

 */
public class MaxAndMInValues {

    public static void main(String[] args) {
        int[] array = new int[11];
        int arrStart = array[0];
        int min =arrStart;
        int max = arrStart;
        for (int i = 0; i <array.length ; i++) {
            array[i]=i;
            if (array[0]<array[i]){
                max=array[i];
            }else if (array[0]>array[i]){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
