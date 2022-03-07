package task_1;

/*
1. Implement generic class Stack, this class should be able to keep any number of elements in it.
Methods
    - push - adds element in the stack
    - pop - remove last added element from the stack
    - top - returns last added element
    - size - returns the number of added elements in the stack
    - contains - gets an element as an argument and checks whether this elements exists in the added elements of the stack
    - containsAll - gets an array of elements as an argument and checks whether all elements exist in the added elements of the stack
Example:
Queue<Integer> queue = new Queue<>();
queue.push(1);
queue.push(4);
queue.push(0);
queue.push(10);
int[] arr = {1, 0, 10}
System.out.println(queue);
System.out.println(queue.top());
System.out.println(queue.size());
System.out.println(queue.contains(4));
System.out.println(queue.containsAll(arr));
queue.pop();
System.out.println(queue);
System.out.println(queue.top());
System.out.println(queue.size());
System.out.println(queue.contains(8));
System.out.println(queue.containsAll(arr));
Expected Output:
Queue contains 1 4 0 10
1
4
True
True
Queue contains 4 0 10
4
3
False
False

 */
public interface Stack<E> {
    void push(E e);

    void pop();

   void top();

    int size();

    boolean contains(E e);

    boolean containsAll(E e);
}




