package Beginner.generics;

public class Phone extends Product{

    private String model;

    public Phone(String name, int price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public void printInfo() {
        System.out.println();
        super.printInfo();

        System.out.println("Model: "+getModel());

    }
}
