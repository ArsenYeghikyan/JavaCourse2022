package triangleshapes;


import base.BaseShape;

public abstract class Triangle extends BaseShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
  public   double perimeter() {
        return sideA + sideB + sideC;
    }

    public void printInfo() {
        System.out.println( getSideA() + ", " + getSideB() + ", " + getSideC());
    }

}
