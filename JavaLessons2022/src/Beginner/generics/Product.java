package Beginner.generics;

public abstract class Product {

    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }




    public void printInfo(){


        System.out.print("Name: "+name+'\n'+"Price: "+price+'\n');


    }


}
