package Beginner.classesAndObjects.hw1;

public class Main {
    public static void main(String[] args) {
        Car car =new Car("RED");
        Car car1 =new Car(25,"black");

        Car car3 =new Car(15,"Yellow");


        System.out.println(car.getColor());
        System.out.println(car1.getColor());
        System.out.println(car3.getColor());
    }
}
