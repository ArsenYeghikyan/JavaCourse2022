package task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class Main {
    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
      int[] a= ArraysCompare.intsArrayMaker(3);
        int[] a1 =ArraysCompare.intsArrayMaker(2);
        System.out.println(ArraysCompare.compare(a,a1));
    }
}
