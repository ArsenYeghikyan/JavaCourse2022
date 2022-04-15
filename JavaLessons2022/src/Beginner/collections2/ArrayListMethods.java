package Beginner.collections2;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListMethods {

    public static ArrayList<String> strings = new ArrayList<>();
    public static void main(String[] args) {


        strings.add("Arsen");
        strings.add("Alex");
        strings.add("Lilit");

        ArrayList<String> strings2 = new ArrayList<>();

        strings2.add("Ani");
        strings2.add("Samvel");
        strings2.add("Ani");

        strings.addAll(1,strings2);


//        strings.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        System.out.println(strings.indexOf("Ani"));
        System.out.println(strings.lastIndexOf("Ani"));
        strings.clear();
        System.out.println(strings.isEmpty());
        strings.forEach(str->{
            System.out.println(str);
        });


    }

//
}
