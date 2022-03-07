package Beginner.exeptions;

import java.util.ArrayList;
import java.util.Comparator;

public class WorkerMethod {


    ArrayList<Worker> workers = new ArrayList<>();

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void addWorkers(Worker worker) {


        try {
            workers.add(worker);
            sort();
            throw new NullPointerException("Vvedite znachenie!");
        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    private void sort(){

        workers.sort(Comparator.comparing(Worker::getWorkerFirstName));


    }


    public void printInfo() {
        for (Worker x : getWorkers()) {
            System.out.println(
                    "Name: " + x.getWorkerFirstName() + '\n' +
                            "Last name: " + x.getWorkerLastName() + '\n' +
                            "Position: " + x.getWorkerPosition() + '\n' +
                            "YearOfEmployment: " + x.getYearOfEmployment());


        }


    }

}
