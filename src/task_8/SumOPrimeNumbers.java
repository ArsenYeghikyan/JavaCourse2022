package task_8;

public class SumOPrimeNumbers {
    public static void main(String[] args) {
        sumOfPrimeNumbers();
    }


    public static void sumOfPrimeNumbers() {
        int sum=0;
        for (int i = 2; i < 200; ++i) {
             sum  =finderPrimeNumber(i);
            sum+=sum;
        }
        System.out.println(sum);
    }

    private static int finderPrimeNumber(int num) {
        int primeNumber = 0;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            primeNumber = num;
        }
        return primeNumber;
    }

}
