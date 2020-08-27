package homework1.hometask1;

public class HomeTask1 {
    /**
     * 1.  Given two digits (int, double, float, long, short), write a program using ALL(+,-,/,*,%,+=,-=,*=,/=, %=) Arithmetic Operators.
      Ex. int a = 4; int b=5; System.out.println("a + b =" + (a + b));
     */
    public static void main(String[] args) {


        short a = 14;
        short b = 5;
        a += b;
        System.out.println("a = " + a);

        int c = 3235442;
        int d = 151545;
        c -= d;
        System.out.println("c = " + c);

        double e = 45.556658585;
        double f = 4.2585858;
        e *= f;
        System.out.println("e = " + e);

        float g = 15.5F;
        float h = 5.5F;
        g /= h;
        System.out.println("g = " + g);

        long i = 4566565656L;
        long j = 1254565L;
        i %= j;
        System.out.println("i = " + i);

        System.out.println("a + b = " + (a + b));
        System.out.println("c - d = " + (c - d));
        System.out.println("e * f = " + (e * f));
        System.out.println("g / h = " + (g / h));
        System.out.println("i % j = " + (i % j));


    }
}
