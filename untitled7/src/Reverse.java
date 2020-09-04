

//2. Write a function that takes as an input array of Strings and modifies array with reversed strings.
//        Input: ["abc", "def", "qw7", "12"]
//        Modified: ["cba", "fed", "7wq", "21"]
//


import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String a = "abcd";
        char[] b = reverse(a);
        System.out.println(Arrays.toString(b));
    }

    public static char[] reverse(String array) {

        char[] rev =new char[array.length()] ;

        for (int i = array.length() - 1; i >= 0; i--) {
            rev[i]= array.charAt(array.length() - i - 1);
        }

        return rev;
    }

}
