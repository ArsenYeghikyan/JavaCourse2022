package carsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("red", 1999, 223),
                new Car("blue", 1990, 103),
                new Car("white", 1995, 111),
                new Car("yellow", 1975, 123)
        };
        Arrays.sort(cars,new ComparatorByColor());
        for (Car x:cars) {
            System.out.println(x);
        }
        System.out.println("-------");
        Arrays.sort(cars,new ComparatorBySpeed());
        for (Car x:cars) {
            System.out.println(x);
        }
        System.out.println("-------");
        Arrays.sort(cars,new ComparatorByYear());
        for (Car x:cars) {
            System.out.println(x);
        }
        System.out.println("-------");
    }
}
