package Beginner.OOP.hw2;

public class Rectangle {

    private  double sideA;
    private  double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double areaCalculator() {

        return sideA * sideB;

    }

    public double perimeterCalculator() {
        return 2 * (sideA + sideB);

    }
}
