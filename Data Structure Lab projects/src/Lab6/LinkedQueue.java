package Lab6;

/*
Created by Mohanad Shamsan 
*/
public class LinkedQueue<E>implements IQueue {
    SingleLinkedList<E>list=new SingleLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public void enQueue(Object element) {
       list.addLast((E) element);
    }

    @Override
    public Object deQueue() {
        return list.removeFirst();
    }

    @Override
    public Object first() {
        return list.first();
    }
}
