package homework1.hometask8;

public class HomeTask8 {
    /**
     * Given double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0. Print the maximum and minimum numbers;
     */
    public static void main(String[] args) {


        double[] numbers =  {0,1.2,-2.5,0.6};

        double min = numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
//        -----------------------------------------------------------------------------------------

        double max = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);


    }
}
