package Beginner.exeptions.task2;

import java.util.Scanner;

public class Subject {

    private String subjectName;
    private String shopName;
    private double subjectPrice;
    Scanner scanner = new Scanner(System.in);

    public Subject() {
        System.out.println("Enter subject name: ");
        setSubjectName(scanner.nextLine());

        System.out.println("Enter shop name: ");
        setShopName(scanner.nextLine());

        System.out.println("Enter item price: ");
        setSubjectPrice(scanner.nextDouble());
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getSubjectPrice() {
        return subjectPrice;
    }

    public void setSubjectPrice(double subjectPrice) {

        this.subjectPrice = subjectPrice;
    }


    @Override
    public String toString() {
        return "Items: " + '\n' +
                "SubjectName:" + subjectName + '\n' +
                "ShopName:" + shopName + '\n' +
                "Price: " + subjectPrice;
    }
}
