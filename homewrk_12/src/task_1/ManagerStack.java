package task_1;

import java.util.Arrays;

public class ManagerStack<E> implements Stack {
    private static final int DEFAULT_CAPACITY = 10;
    E[] stack ;
    private int elementCount = 0;

    public ManagerStack() {
        this.stack = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public ManagerStack(E[] stack) {
        this.stack = stack;
    }

    @Override
    public void push(Object o) {
        if (o != null) {
            stack[elementCount] =(E) o;
            elementCount++;
        }else if (elementCount>=stack.length){
            stack = Arrays.copyOf(stack,stack.length*2);
        };
    }

    @Override
    public void pop() {

    }

    @Override
    public void top() {

        for (E x:stack
             ) {
            System.out.println(x);
        }

    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Object o) {
        return false;
    }
}
