package studentsort;

import java.util.Comparator;

public class Student {
    private String name;
    private String lastName;
    private int age;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "  " + lastName + "  " + "  " + age;
    }


}

class ComparatorSortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class ComparatorSortByLastName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class ComparatorSortByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}