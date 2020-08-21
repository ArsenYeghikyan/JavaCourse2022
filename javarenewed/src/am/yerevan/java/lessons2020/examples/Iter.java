package am.yerevan.java.lessons2020.examples;

public class Iter {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,7,8,6,4,9,7,8};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for (int temp:arr) {
//            System.out.print(temp+" ");
//        }
        for (int temp:arr) {
            ++temp;
            System.out.print(temp+" ");
        }
        System.out.println();
        for (int temp:arr) {

            System.out.print(temp+" ");
        }
    }
}
