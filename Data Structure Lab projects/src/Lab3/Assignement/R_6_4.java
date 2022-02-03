package Lab3.Assignement;

import Lab3.ArrayStack;

import java.util.Arrays;
import java.util.Random;

/*
Created by Mohanad Shamsan 
*/
/*
R-6.4 Implement a method with signature transfer(S, T) that transfers all elements
from stack S onto stack T, so that the element that starts at the top of S is the first
to be inserted onto T, and the element at the bottom of S ends up at the top of T.
 */
public class R_6_4 {


    public static void main(String[] args) {
        Random random=new Random();
        ArrayStack<Integer> T=new ArrayStack<>(10);
        ArrayStack<Integer> S=new ArrayStack<>(10);
        for (int i = 0; i < S.getLength(); i++) {
            int r=random.nextInt(1,100);
            S.push(r);
        }
        System.out.print("S Origin :");
        print(S);
        transfer(S,T);
        System.out.print("After Transferring >> T Contain :");
        print(T);
    }

   static void transfer(ArrayStack<Integer> S,ArrayStack<Integer> T){
       for (int i = 0; i < T.getLength(); i++) {
           T.push(S.pop());
       }
    }
    static void print(ArrayStack<Integer> T){
        System.out.println(T.toString());
    }
}
