package task_1;

import static task_1.ArrayInput.arrayMaker;

public class Main {
    public static void main(String[] args) {
        int [] array= arrayMaker();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
