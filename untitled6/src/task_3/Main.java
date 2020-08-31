package task_3;

public class Main {
    public static void main(String[] args) {
        double[] arrBeforeReverse = ReverseFirstOrder.doubleArrayMaker(6);
        double[] arr = ReverseFirstOrder.reverseArrayMaker(arrBeforeReverse);

        ReverseFirstOrder.printArray(arr);
    }
}
