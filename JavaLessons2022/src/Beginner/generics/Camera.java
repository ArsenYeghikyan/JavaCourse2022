package Beginner.generics;

public class Camera extends Product{

    private int pixel;

    public Camera(String name, int price, int pixel) {
        super(name, price);
        this.pixel = pixel;
    }


    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    @Override
    public void printInfo() {
        System.out.println();
        super.printInfo();

        System.out.println("Pixel: "+getPixel());

    }

}
