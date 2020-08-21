package studentsort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends ArrayList {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ann","Petrova", 23),
            new Student("Alex","Petrova", 26),
            new Student("Sergei","Ivanov", 29),
            new Student("Ivan","Kuznecov", 21),
            new Student("Andrei","Orehov", 22),
        };

        Arrays.sort(students,new ComparatorSortByName());
        for (Student arr: students) {
            System.out.println(arr);
        }
        System.out.println("----------------------------");

        Arrays.sort(students,new ComparatorSortByLastName());
        for (Student arr: students) {
            System.out.println(arr);
        }
        System.out.println("----------------------------");

        Arrays.sort(students,new ComparatorSortByAge());
        for (Student arr: students) {
            System.out.println(arr);
        }

        System.out.println("----------------------------");


    }
}
