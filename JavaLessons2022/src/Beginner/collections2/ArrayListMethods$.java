package Beginner.collections2;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods$ {


    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arr = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(arr);
        arr[0].append("!!!");


//List<Character> characters = new ArrayList<>();

//      for (int i = 65,  j = 97 ; i <= 90 && j <=122; i++, j++) {
//
//
//          if (i==89 || i==101|| i==103|| i==104|| i==105|| i==107|| i==121|| i==97|| i==110){
//              characters.add((char) i);
//          }

//          characters.add('\n');
////          characters.add((char) i);
//
//          characters.add((char) 82);
//          characters.add((char) 83);
//          characters.add((char) 69);
//          characters.add((char) 78);
//          characters.add((char) 40);
////          characters.add('\n');
//
//
////          characters.add((char) j);
//          characters.add((char) 89);
//          characters.add((char) 101);
//          characters.add((char) 103);
//          characters.add((char) 104);
//          characters.add((char) 105);
//          characters.add((char) 107);
//          characters.add((char) 121);
//          characters.add((char) 97);
//          characters.add((char) 110);
//          characters.add((char) 41);


//characters.forEach(ch->{
//    System.out.print(ch+" ");
//});

//       System.out.println(Arrays.toString("Yeghikyan".chars().toArray()));


        ArrayList<Integer> integers = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            integers.add(i);
            System.out.print(integers.get(i) + " ");
        }
        System.out.println(integers.size());
        integers.subList(0, 50).clear();

        integers.forEach(ints -> {
            System.out.print(ints + " ");
        });
        System.out.println();
        System.out.println(integers.size());
        integers.trimToSize();

    }

}
