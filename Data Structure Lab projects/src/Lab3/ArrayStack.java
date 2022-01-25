package Lab3;

/*
Created by Mohanad Shamsan 
*/
public class ArrayStack <E> implements IStack<E>{

    E[] array;
    static final int CAPACITY =100;
    int top=-1;

    public ArrayStack(int capacity) {
        array=(E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public void push(E element) {
        if (size()==array.length){
            throw   new IllegalStateException("stack is full of elements");
        }
        array[++top]=element;
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E deleted=array[top];
        array[top]=null;
        top--;
        return deleted;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return array[top];
    }
}
