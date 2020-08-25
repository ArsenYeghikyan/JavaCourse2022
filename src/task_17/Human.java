package task_17;

public class Human {
    private String name;
    private  int year;

    public Human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
