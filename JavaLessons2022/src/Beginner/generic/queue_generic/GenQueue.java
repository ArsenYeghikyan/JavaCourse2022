package Beginner.generic.queue_generic;

public class GenQueue<T> implements IGenQ<T> {

    private T[] arr ;

    private int putLoc;
    private int getLoc;


    public GenQueue(T[] arr) {
        this.arr = arr;

        putLoc = getLoc = 0;
    }

    @Override
    public void put(T t) throws QueueFullException {

        if (putLoc == arr.length) {
            throw new QueueFullException(arr.length);
        }
        arr[putLoc++] = t;

    }

    @Override
    public T get(T t) throws QueueEmptyException {
        if (getLoc == putLoc) {
            throw new QueueEmptyException();
        }
        return arr[getLoc++];
    }
}
