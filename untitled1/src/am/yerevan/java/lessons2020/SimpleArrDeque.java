package am.yerevan.java.lessons2020;

import java.util.ArrayDeque;

public class SimpleArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(12);
        deque.offer(13);
        deque.offer(14);
        deque.add(11);
        deque.add(15);
//        deque.push(1);

        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
//        System.out.println(deque.peek());
        System.out.println(deque.peek());
//        System.out.println(deque.peek());

    }

}
