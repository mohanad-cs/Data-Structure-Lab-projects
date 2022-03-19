package Lab6;

/*
Created by Mohanad Shamsan 
*/
public class LinkedStack<E> implements IStack<E> {
    SingleLinkedList<E> list =new SingleLinkedList<E>();
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }
    @Override
    public E pop() {
       return list.removeFirst();
    }
    @Override
    public E top() {
        return list.first();
    }

}

