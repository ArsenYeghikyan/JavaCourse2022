package Beginner.object.clon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {


        ArrayList<Object> arrayList = new ArrayList<>();

       arrayList.add("Aaa");
       arrayList.add(12);
       arrayList.add(1.2);
       arrayList.add(true);
       arrayList.add(new String("dsds"));

        for (Object arrayList1: arrayList
             ) {
            System.out.println(arrayList1.hashCode()
            );
        }



    }
}




//class Test {
//
//
//
//static String x ="sdsds";
//
//    public Test(String x) {
//        Test.x = x;
//    }
//}



//class Test1 extends Test{
//   String v ="hgh";
//
//    public Test1() {
//        super("n");
//    }
//}
