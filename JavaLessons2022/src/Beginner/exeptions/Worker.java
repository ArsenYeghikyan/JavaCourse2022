package Beginner.exeptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Worker {

    private String workerFirstName = "";
    private String workerLastName = "";
    private String workerPosition = "";
    private Date yearOfEmployment = new Date();

    public Worker(String workerFirstName, String workerLastName, String workerPosition, Date yearOfEmployment) {
        this.workerFirstName = workerFirstName;
        this.workerLastName = workerLastName;
        this.workerPosition = workerPosition;
        this.yearOfEmployment = yearOfEmployment;

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

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    ArrayList<Worker> workers = new ArrayList<>();


    public void addWorkers(Worker worker) {

        workers.add(worker);
        sort();

    }

    private void sort(){

        workers.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getWorkerFirstName().compareTo(o2.getWorkerFirstName());
            }
        });

    }


    public void printInfo() {
        for (Worker x : workers) {
            System.out.println(
                    "Name: " + x.getWorkerFirstName() + '\n' +
                            "Last name: " + x.getWorkerLastName() + '\n' +
                            "Position: " + x.getWorkerPosition() + '\n' +
                            "YearOfEmployment: "+ x.getYearOfEmployment());



        }


    }


}
