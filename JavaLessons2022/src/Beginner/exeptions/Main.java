package Beginner.exeptions;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ars", "Ye","manager", new Date());
        Worker worker1 = new Worker("Ani", "Ye","manager", new Date());
        Worker worker2 = new Worker("DAv", "Ye","manager", new Date());


        worker.addWorkers(worker);
        worker.addWorkers(worker1);
        worker.addWorkers(worker2);
        worker.printInfo();
        System.out.println();
    }
}
