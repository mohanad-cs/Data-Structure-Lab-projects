package Lab6;

/*
Created by Mohanad Shamsan 
*/
public interface IQueue<E> {
    boolean isEmpty();
    int size();
    void enQueue(E element);
    E deQueue();
    E first();

}

