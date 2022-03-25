package Beginner.generic;

public interface Containment<T> {


    boolean contains(T o);

}


class MyClass<T> implements Containment<T> {

    T[] array;


    public MyClass(T[] array) {
        this.array = array;
    }

    @Override
    public boolean contains(T o) {


        for (T x : array) {
            if (x.equals(o)) {
                return true;
            }
        }

        return false;
    }
}


class  Main{
    public static void main(String[] args) {

        Integer[] integer = {1,2,3,4,5};

        MyClass<Integer>  myClass = new MyClass<>(integer);

        System.out.println(myClass.contains(1));

    }


}
