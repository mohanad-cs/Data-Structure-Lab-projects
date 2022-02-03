package Lab4;

import java.util.Arrays;

/*
Created by Mohanad Shamsan 
*/
public class ArrayQueue<E> implements IQueue<E>{
   private E[] data;
   private int sise =0;
   private int first=0;
    final static int defaultCapacity =10;

    public ArrayQueue() {
        this(defaultCapacity);
    }
    public ArrayQueue(int capacity) {
        data =(E[]) new Object [capacity];
    }
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return sise;
    }

    @Override
    public void enQueue(E element) {
       if (size()==data.length) throw new IllegalStateException("Queue Is full of elements");
       int x=(first+sise)%data.length;
       data[x]=element;
       sise++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()) return null;
        E deleted= data[first];
        data[first]=null;
        sise--;
        first=(first+1)%data.length;
        return deleted;
    }

    @Override
    public E first() {
        if (isEmpty())return null;
        return data[first];
    }
    @Override
    public String toString(){
       return Arrays.toString(data);
    }
}
