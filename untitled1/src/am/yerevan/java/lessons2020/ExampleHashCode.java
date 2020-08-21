package am.yerevan.java.lessons2020;

import java.util.Objects;

public class ExampleHashCode {

    public static void main(String[] args) {
        Car car = new Car(10);
        int x = car.hashCode();
        System.out.println(x);

        Car car1 = new Car(13);
        int x2 = car1.hashCode();
        System.out.println(x2);

        Car2 car11 = new Car2(11);
        int x1 = car11.hashCode();
        System.out.println(x1);

        Car2 car22 = new Car2(15);
        int x22 = car22.hashCode();
        System.out.println(x22);

        System.out.println(car.equals(car11));
//        String s= "1";
//        System.out.println(s.hashCode());
//        String s1 = s;
//
//        System.out.println(s1.hashCode());
//        System.out.println(s.equals(s1));

    }


}

class Car {
    int model;

    public Car(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return model == car.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}

class Car2 {

    int model;

    public Car2(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car2)) return false;
        Car2 car2 = (Car2) o;
        return model == car2.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}