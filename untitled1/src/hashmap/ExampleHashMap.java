package hashmap;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class ExampleHashMap {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        Scanner scan = new Scanner(System.in);


            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
    }
}

