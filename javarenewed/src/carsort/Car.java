package carsort;

import java.util.Comparator;

public class Car {
    private String color;
    private int year;
    private int speed;

    public Car(String color, int year, int speed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return
                " " + color  + " " + year + " " + speed ;
    }
}
class ComparatorByColor implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
class ComparatorByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear()-o2.getYear();
    }
}
class ComparatorBySpeed implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getSpeed()-o2.getSpeed();
    }
}
