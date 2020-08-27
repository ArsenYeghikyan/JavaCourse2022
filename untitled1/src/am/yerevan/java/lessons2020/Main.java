package am.yerevan.java.lessons2020;

import java.util.*;

public class Main {

    public static void main(String[] args) {
Queue <Integer> list = new PriorityQueue<>(2, (i1, i2) -> i2-i1);
list.offer(1);
list.offer(2);
        System.out.println(list);
list.offer(4);
list.offer(3);
        System.out.println(list);
        list.offer(15);
        list.offer(6);
        list.offer(14);
        list.offer(8);
        list.offer(7);
        list.offer(9);
        list.offer(11);
        list.offer(10);
        System.out.println(list);
//        System.out.println(list.poll());
//        for (int i = 0; i < 20; i++) {
//            System.out.println(list.poll());
//        }
//       Arrays.sort(list,);


//        Integer peek = list.pollLast();
//        System.out.println(peek);
//        System.out.println();
        for (Integer x:list
             ) {
            System.out.println(x);
        }


    }
}
