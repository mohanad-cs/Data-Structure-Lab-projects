package Lab6;

/*
Created by Mohanad Shamsan 
*/
public class CircualerLinkedList<E>{
    private int size=0;
    private Node<E> tail=null;

    public CircualerLinkedList() {
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return  tail.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E element){
        if (size==0){
            tail=new Node<>(element,null);
            tail.setNext(tail);
        }
        else {
            Node<E> newNode =new Node<>(element,null);
            tail.setNext(newNode);

        }
        size++;
    }

    public void addLast(E element){
        addFirst(element);
        tail=tail.getNext();
    }
    public E removeFirst(){
        Node<E>x=tail.getNext();
        if (x==tail){
            tail=null;
        }
        else {
            tail.setNext(x.getNext());
        }
        size--;
        return x.getElement();
    }
    public void rotate(){
        if (tail!=null){
            tail=tail.getNext();
        }
    }
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
