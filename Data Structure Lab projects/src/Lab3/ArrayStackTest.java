package Lab3;

import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer>mystack =new ArrayStack<>(5);
        Scanner in= new Scanner(System.in);
        System.out.println("Is the stack empty? "+mystack.isEmpty());
        System.out.println("Input the stack elements");
        for (int i = 0; i < 5; i++) {
            mystack.push(in.nextInt());
            System.out.println("top element = " +mystack.top());
            System.out.println("size =" +mystack.size());
            System.out.println("Is the stack empty? "+mystack.isEmpty());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("deleted element is :"+mystack.pop());
            System.out.println("top element after deletion : = " +mystack.top());
            System.out.println("size =" +mystack.size());
            System.out.println("Is the stack empty? "+mystack.isEmpty());
        }
    }
}
