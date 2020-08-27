package task_1;

import static task_1.ArrayInput.arrayMaker;
import static task_1.ArrayInput.findNumber;

public class Main {
    public static void main(String[] args) {
        int [] array= arrayMaker();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        int x =findNumber(array,5);
        System.out.println(x);
    }
}
