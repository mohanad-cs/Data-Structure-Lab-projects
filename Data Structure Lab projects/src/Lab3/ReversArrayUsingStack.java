package Lab3;

import java.util.Arrays;

/*
Created by Mohanad Shamsan 
*/
public class ReversArrayUsingStack {
    public static void main(String[] args) {
        int[] a={10,20,23,90,50,38};
        ArrayStack<Integer>stack=new ArrayStack<>(a.length);
        System.out.println("Before reverse: "+ Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
             a[i]=stack.pop();
        }
        System.out.println("After reverse: "+Arrays.toString(a));
    }
}
