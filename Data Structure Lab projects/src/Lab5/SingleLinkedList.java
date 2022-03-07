package Lab5;

/*
Created by Mohanad Shamsan 
*/
public class SingleLinkedList<E> {
    private Node<E>head=null;
    private Node<E>tail=null;
    private int size=0;
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    /* Assignment
    * R-3.9 Give an implementation of the size()method for SingularlyLinkedList class ,
    * assuming that we did non maintain size as an instance variable.*/
    public int size(){
        int size=0;
        // the pointer that will move in the entire list ,
        // every time the method called the pointer will rest to be the first Node
        Node c=head;
        while (c!=null){
          size++;
          c=c.getNext();
        }
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return head.getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E element){
        head=new Node<>(element,head);
        if (size==0){
            tail=head;
        }
        size++;
    }
    public void addLast(E element){
        Node<E>newest =new Node<E>(element,null);
        if (size==0){
            head=newest;
        }
        else {
            tail.setNext(newest);
        }
        tail=newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted=head.getElement();
        head=head.getNext();
        size--;
        if (size==0){
            tail=null;
        }
        return deleted;
    }




    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
