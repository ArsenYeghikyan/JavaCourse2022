package volumetricshapes;

import circleshapes.Circle;


public class Sphere extends VolumetricShape {


    public Sphere(double radius) {
        super(radius);
    }
    Circle circle = new Circle(getRadius());
    @Override
  public   double perimeter() {
        return 0;
    }

    @Override
  public   double area() {
        return 4 * circle.area();
    }

    @Override
    public void printInfo() {
        System.out.println("It's a sphere with radius  " + getRadius());
    }

    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI* Math.pow(getRadius(),3);
    }
}
