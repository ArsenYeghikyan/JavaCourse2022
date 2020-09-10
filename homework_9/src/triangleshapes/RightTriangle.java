package triangleshapes;

public class RightTriangle extends Triangle {


    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }


    @Override
    public double area() {
        return 0.5 * getSideA() * getSideB();
    }

    public void printInfo() {
        System.out.print(" It's a right triangle with sides : ");
        super.printInfo();
    }


}
