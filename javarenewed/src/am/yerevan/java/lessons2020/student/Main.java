package am.yerevan.java.lessons2020.student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] students = {
                new SimpleComparableStudent("Yura", 122),
                new SimpleComparableStudent("Igor", 112),
                new SimpleComparableStudent("Ivan", 119),
                new SimpleComparableStudent("Masha", 123)
        };
        Arrays.sort(students);
        for (SimpleComparableStudent x:students
             ) {
            System.out.println(x);
        }
    }
}
