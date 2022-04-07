package Beginner.collections;

import java.util.*;

public class Simple {

    public static void main(String[] args) {

     PrintChar characters = new PrintChar("String");


        for (Character ch: characters
             ) {
            System.out.print("[ "+ch+" ] "+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        characters.forEach(System.out::print);
        System.out.println();
        System.out.println("--------------------------------------");
        while (characters.hasNext()){


            System.out.print("[ "+characters.next()+" ] "+" ");
        }


        characters.remove();


    }



}




class PrintChar implements Iterator<Character>,Iterable<Character>{


    private String str;
    private int index = 0;

    public PrintChar(String str){

        this.str=str;

    }


    @Override
    public Iterator<Character> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {

        if (this.index<this.str.length()){
            return true;
        }
        this.index=0;

        return false;
    }

    @Override
    public Character next() {
        if (this.index>=this.str.length()){
            this.index = 0;
            throw new NoSuchElementException("No search element");

        }

        this.index++;
        return this.str.charAt(this.index-1);

    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException("Unsupported Operation Exception!!!");
    }
}