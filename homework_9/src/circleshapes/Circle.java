package circleshapes;

import base.BaseShape;

public class Circle implements BaseShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
   public double  perimeter() {

        return 2 * (Math.PI * radius);

    }

    @Override
  public   double area() {

        return Math.PI * Math.pow(getRadius(),2);

    }

    @Override
    public void printInfo() {
        System.out.println("It's a circle with radius  " + radius);
    }


}
