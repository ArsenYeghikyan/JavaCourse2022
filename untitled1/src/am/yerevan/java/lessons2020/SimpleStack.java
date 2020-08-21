package am.yerevan.java.lessons2020;

public class SimpleStack {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(Object element) {
        stackArray[++top] = element;
    }

    public Object pop() {
        return stackArray[top--];
    }

    public Object peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(10);
        stack.push("10");
        stack.push("20");
        stack.push("30");
        stack.push("40");
        stack.push("50");
        stack.push("60");


//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
        isEmpty(stack);
    }

    private static void isEmpty(SimpleStack stack) {
        while ((!stack.isEmpty())) {
            Object popElement = stack.pop();
            System.out.println(popElement + " ");
        }
    }
}