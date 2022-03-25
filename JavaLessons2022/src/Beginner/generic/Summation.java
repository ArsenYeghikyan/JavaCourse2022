package Beginner.generic;

public class Summation {

    private int sum;

    <T extends Number> Summation (T t){

        sum = 0;

        for (int i = 0; i < t.intValue() ; i++) {
            sum+=i;
        }

    }

    int getSum(){
        return sum;
    }


}
class GenConsDemo{

    public static void main(String[] args) {
        Summation summation = new Summation(5);
        System.out.println(summation.getSum());
    }


}