package triangleshapes;


import base.BaseShape;

public  class Triangle implements BaseShape {
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

   public  double halfPerimeter() {
        return (sideA+sideB+sideC)/2;
    }


    @Override
    public double area() {
      double  s = halfPerimeter();
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    public void printInfo() {
        System.out.println( getSideA() + ", " + getSideB() + ", " + getSideC());
    }

}
