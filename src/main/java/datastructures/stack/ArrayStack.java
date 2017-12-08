package datastructures.stack;

import java.lang.reflect.Array;

public class ArrayStack<T> {

    private int top;
    private int size;
    private T[] stackArray;

    public ArrayStack(Class<T> classT, int size) {
        this.size = size;
        this.stackArray = (T[]) Array.newInstance(classT, this.size);
        top = -1;
    }

    public void push(T t) {
        if(isFull()) {
            throw new FullStackException();
        }
        stackArray[++top] = t;
    }

    public T pop() {
        if(isEmpty()) {
            throw  new EmptyStackException();
        }
        return stackArray[top--];
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return size;
    }

    public int top() {
        return top;
    }
}
