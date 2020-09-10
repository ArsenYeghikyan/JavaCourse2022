package triangleshapes;

import triangleshapes.Triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double sideA) {
        super(sideA, sideA, sideA);
    }


    @Override
    public   double area() {
        return Math.pow(getSideA(),2)/4 * Math.sqrt(3);
    }




    @Override
    public void printInfo() {
        System.out.print(" It's an equilateral triangle with sides : ");
        super.printInfo();
    }
}
