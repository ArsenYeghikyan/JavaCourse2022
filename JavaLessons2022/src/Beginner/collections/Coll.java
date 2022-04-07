package Beginner.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Coll {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1one");
        strings.add("4four");
        strings.add("2two");
        strings.add("3tree");
        strings.forEach(System.out::println);


        System.out.println("===================== " + strings.get(2)+" ============================");

        List<String> strings2 = new ArrayList<>(200);

//        strings.add(12,"5five");
        strings2.add("6six");
        strings.set(1," 2 ");
        strings.set(1," 2 ");
        strings.remove(1);
        strings.forEach(System.out::println);
        System.out.println("=================================================");
        List<String> strings3 = new ArrayList<>(strings);

//        strings3.add("5five");
//        strings3.add("6six");
//        strings3.forEach(System.out::println);
//        System.out.println(strings==strings3);
//        System.out.println(strings.equals(strings3));
    }



}
