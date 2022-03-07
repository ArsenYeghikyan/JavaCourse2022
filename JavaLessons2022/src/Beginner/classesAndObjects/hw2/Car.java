package Beginner.classesAndObjects.hw2;

public class Car {
    private int year;
    private double speed;
    private double wight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;

    }

    public Car(int year, double speed) {
     this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, double wight) {
        this(year,speed);

        this.wight = wight;
    }

    public Car(int year, double speed, double wight, String color) {
     this(year,speed,wight);
        this.color = color;
    }


}
