package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sipmle1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("Ani");
        set.add("Ani");
        set.add("Ani");
        set.add("Ani");
        set.add("Milena");
        set.add("Arman");
        set.add("Samvel");
        set.add("Lilit");
        for (String x: set
             ) {
            System.out.println(x+" ");
        }
    }
}
