package Beginner.generic.queue_generic;

public class GenQDemo {

    public static void main(String[] args) {

        Integer[] integer = new Integer[12];


        GenQueue<Integer> queue = new GenQueue<>(integer);


        Integer isVal;

        try {

            for (int i = 0; i < 15; i++) {
                System.out.println("Add " + i + " in Queue");
                queue.put(i);
            }


        } catch (QueueFullException e) {

            System.out.println(e);

        }

        System.out.println("---------------------------------------------------------------");

        try {

            for (int i = 0; i < 15; i++) {
                System.out.println("Get " + i + " in Queue");
//                isVal = queue.get(integer[i]);
                System.out.println(queue.get(i));
            }


        } catch (QueueEmptyException e) {

            System.out.println(e);

        }


    }


}
