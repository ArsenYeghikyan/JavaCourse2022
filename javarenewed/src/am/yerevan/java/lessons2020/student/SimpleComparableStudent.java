package am.yerevan.java.lessons2020.student;

public class SimpleComparableStudent implements Comparable<SimpleComparableStudent> {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName+" "+ group;
    }

    @Override
    public int compareTo(SimpleComparableStudent o) {
        if (this.group>o.group){
            return 1;
        }else if (this.group<o.group){
            return -1;
        }else {
            return 0;
        }
    }
}
