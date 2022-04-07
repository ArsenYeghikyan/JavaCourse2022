package Beginner.generic.queue_generic;

public interface IGenQ <T>{

    void put (T t) throws QueueFullException;


    T get(T t) throws QueueEmptyException;




}
