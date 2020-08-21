package am.yerevan.java.lessons2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Example2 {
    private String name;
    private String lastName;

    public Example2(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + " " + lastName;
    }
}
class SortByName implements Comparator<Example2> {

    @Override
    public int compare(Example2 o1, Example2 o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
class  SortedByLName implements Comparator<Example2>{
    @Override
    public int compare(Example2 ex1,Example2 ex2){
        return ex1.getLastName().compareTo(ex2.getLastName());
    }

}