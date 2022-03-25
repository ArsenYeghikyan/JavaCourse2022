package Beginner.generics;

public class Container<T extends  Product> {

    private T item;
    private static int count = 0;


    Product[] products = new Product[15];


    private Product[] makeBigArr() {

        if (count >= products.length) {

            return new Product[products.length * 2 + 1];
        }
        return products;
    }


    public  void add(T item) {

        products[count++] = item;


    }




    public void printInfo() {

        for (int i = 0; i < count; i++) {
            products[i].printInfo();
        }


    }


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


}
