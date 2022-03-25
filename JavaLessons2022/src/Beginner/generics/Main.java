package Beginner.generics;

public class Main {


    public static void main(String[] args) {

        Container<Product> container = new Container<>();
        Camera product = new Camera("Xenon",1400,21);
        Product product2 = new Phone("Iphone",1200,"13pro");
        Product product3 = new Phone("Iphone",800,"X");
        Phone product4 = new Phone("Iphone",900,"12pro");
        Product product5 = new Phone("Iphone",850,"11pro");
//String string = new String("rrt");
//        container.add(string); //       Error
        container.add(product2);
        container.add(product3);
        container.add(product4);
        container.add(product5);

        container.printInfo();
    }



}
