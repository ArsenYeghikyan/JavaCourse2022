package Beginner.exeptions.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Subject  {


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
//        double subjectPrice = scanner.nextDouble();
//        if (subjectPrice > 0) {
            setSubjectPrice(scanner.nextDouble());

//        } else {
//
//            System.out.println("Price cannot be less than 0");
//
//        }
//
//
//        try {
//            setSubjectPrice(subjectPrice);
//
//        } catch (InputMismatchException e) {
//            System.out.println("enter the number");
//        }

    }

//    public String getSubjectName() {
//        return subjectName;
//
//    }


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

    private void setSubjectPrice(double subjectPrice) {
        try {

            this.subjectPrice = subjectPrice;
        } catch (InputMismatchException e) {
            System.out.println("enter the number");
        }
        if (subjectPrice > 0) {

            this.subjectPrice = subjectPrice;


        } else {


            System.out.println("Price cannot be less than 0");

        }


    }


    @Override
    public String toString() {
        return "Items: " + '\n' +
                "SubjectName:" + subjectName + '\n' +
                "ShopName:" + shopName + '\n' +
                "Price: " + subjectPrice;
    }
}
