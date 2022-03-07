package Lab6;
/*
Created by Mohanad Shamsan 
*/
public interface IStack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
