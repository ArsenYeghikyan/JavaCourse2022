package Beginner.collections2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class MinFormLinkedList {
    public static void main(String[] args) {

        try {
            System.out.println(getMinValue());


        } catch (IOException ioException) {

            System.out.println("Wrong number");
        }


    }


    public static LinkedList<Integer> getIntegerList() throws IOException {
        LinkedList<Integer> integers = new LinkedList<>();

        int x = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int count = Integer.parseInt(bufferedReader.readLine());

        while (x < count) {

            integers.add(Integer.parseInt(bufferedReader.readLine()));
            x++;
        }


        return integers;
    }


    public static int getMinValue() throws IOException {
        LinkedList<Integer> integers = getIntegerList();

        integers.sort(Comparator.comparingInt(o -> o));
        int minValue = integers.get(integers.size()-1);
        System.out.println(integers);
        return minValue;
    }


}
