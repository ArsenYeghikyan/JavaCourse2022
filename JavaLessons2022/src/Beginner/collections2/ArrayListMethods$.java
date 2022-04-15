package Beginner.collections2;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods$ {




   public static void main(String[] args) {

      StringBuilder sb1 = new StringBuilder("A");
      StringBuilder sb2 = new StringBuilder("B");
      StringBuilder sb3 = new StringBuilder("C");
      StringBuilder sb4 = new StringBuilder("D");
      StringBuilder[] arr = {sb1,sb2,sb3,sb4};

      List<StringBuilder> list  = Arrays.asList(arr);
arr[0].append("!!!");

      System.out.println(list);
   }


}
