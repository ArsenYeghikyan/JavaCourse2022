package task_1;

public class CopyArray {

    public static int[] copyArrayElements(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }

    public static void printArray(int[] array) {

        System.out.print("Expected Output:\n");
        for (int value : array) {
            System.out.print(value+" ");
        }

    }


}
