package datastructures.queue;


import java.lang.reflect.Array;

public class Queue<T> {

    private T[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nElements;

    public Queue(Class<T> classT, int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (T[]) Array.newInstance(classT, this.maxSize);
        this.front = 0;
        this.rear = -1;
        this.nElements = 0;
    }

    public boolean isEmpty() {
        return nElements == 0;
    }

    public boolean isFull() {
        return nElements == maxSize;
    }

    public int size() {
        return nElements;
    }

    public T peek() {
        return queueArray[front];
    }

    public boolean insert(T t) {
        if(isFull()) {
            throw new FullQueueException();
        }

        if(++rear == maxSize) {
            rear = 0;
        }

        ++nElements;
        queueArray[rear] = t;

        return true;
    }

    public T remove() {
        if(isEmpty()) {
            throw new EmptyQueueException();
        }

        T temp = queueArray[front];
        queueArray[front] = null;
        --nElements;

        if(++front == maxSize) {
            front = 0;
        }

        return temp;
    }
}
