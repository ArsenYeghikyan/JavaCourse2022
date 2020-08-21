package homework1;

import java.util.*;

public class MinNumber {
    public static void main(String[] args) {
        System.out.println(getIntegerList(5));
//        System.out.println(getMinimum(getIntegerList(5)));


    }

    static List<Integer> getIntegerList(int numberCount) {
        int startNumberCount = 0;
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        while (startNumberCount < numberCount) {

            int num = scanner.nextInt();
            list.add(num);
            startNumberCount++;

        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return list;
    }


    public static int getMinimum(List<Integer> list){




       return  Collections.min(list);
    }
}