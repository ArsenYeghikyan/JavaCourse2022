package Beginner.exeptions.task1;

import java.util.Date;
import java.util.Scanner;

public class Worker {

    private String workerFirstName = "";
    private String workerLastName = "";
    private String workerPosition = "";
    private Date yearOfEmployment = new Date();

    public Worker() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        workerFirstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        workerLastName = scanner.nextLine();
        System.out.println("Enter position: ");
        workerPosition = scanner.nextLine();
        yearOfEmployment = new Date();


    }


    public void setWorkerFirstName(String workerFirstName) {
        this.workerFirstName = workerFirstName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public String getWorkerFirstName() {
        return workerFirstName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public Date getYearOfEmployment() {
        return yearOfEmployment;
    }






    }



