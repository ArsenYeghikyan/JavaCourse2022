package Beginner.generic;

public class Sumer<T extends Number> implements Sum<T> {
T [] ts;

private int sum = 0;
    public Sumer(T[] ts) {
        this.ts = ts;
    }

    @Override
    public void sum() {
        for (T t : ts) {
            sum += t.doubleValue();
        }
        System.out.println(sum);
    }
}

class Main2{

    public static void main(String[] args) {




        Sum<Double> sum = new Sumer<>(new Double[]{5.1,9.2,5.84,1.5});


        sum.sum();





    }





}
