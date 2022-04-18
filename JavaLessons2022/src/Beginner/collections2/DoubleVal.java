package Beginner.collections2;


import java.util.ArrayList;
import java.util.LinkedList;

public class DoubleVal {
    public static void main(String[] args) {
        doubleValues("11");
        doubleValues("11");
        doubleValues("11");
        doubleValues("11");
        doubleValues("11");
    }

    public static void doubleValues(String str) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add(str+","+str+",");

        strings.forEach(System.out::print);


    }
//    public static void doubleValues(int ints) {
//
//        LinkedList<Integer> strings = new LinkedList<>();
//
//        strings.add(ints);
//        int min = strings.get(0);
//
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.get(i)>min){
//                min = strings.get(i);
//            }
//        }

    }






