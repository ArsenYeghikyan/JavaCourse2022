package Beginner.exeptions.task2;

import java.util.ArrayList;

public class SubjectTools {


    ArrayList<Subject> items = new ArrayList<>();


    public void addItems(Subject subject) {

        items.add(subject);

    }

    public void removeSubject(Subject subject) {

        items.remove(subject);

    }


    public void findSubject(Subject subject) {
        try {


            if (subject != null) {
                for (Subject allItems : items) {


                    if (items.contains(subject)) {
                        System.out.println(allItems);
                    } else {

                        System.out.println("subject not found");
                    }
                }
            } else {
                throw new NullPointerException("empty value!!");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    public void printItemsInfo() {
        try {
            for (Subject allItems : items) {
                if (allItems != null) {

                    System.out.println(allItems);
                } else {
                    throw new NullPointerException("empty value!!");
                }
            }
        } catch (NullPointerException e) {

            System.out.println(e.getMessage());
        }


    }

}
