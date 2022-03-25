package Beginner.generic;

public class Array {


    public static <T extends Comparable<T>, V extends T> boolean comparTo(T[] ts, V[] vs) {

if (ts!=null||vs!=null) {
    if (ts.length != vs.length) {
        return false;
    }
    for (int i = 0; i < ts.length; i++) {
        if (!ts[i].equals(vs[i])) {

            return false;
        }

    }
}else {
    throw new NullPointerException("throw exception");
}
        return true;


    }

    public static void main(String[] args)  {

        String[] s = {"null"};
        String[] d = {"nul"};

//try {

    System.out.println(Array.comparTo(s, d));
//}catch (NullPointerException e){
//
//    System.out.println(e.getMessage());
//}
//
    }
}



