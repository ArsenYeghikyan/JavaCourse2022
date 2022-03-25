package Beginner.exeptions.task2;

public class Main {

    public static void main(String[] args) {


        SubjectTools items = new SubjectTools();



        Subject subject = new Subject();
        Subject subject2 = new Subject();
    //   Subject subject3 = new Subject();

        items.addItems(subject);
        items.addItems(subject2);
//        items.addItems(subject3);


        items.printItemsInfo();
//        items.findSubject(subject);
//        items.removeSubject(subject2);
//        items.removeSubject(subject);
//        items.printItemsInfo();


    }


}
