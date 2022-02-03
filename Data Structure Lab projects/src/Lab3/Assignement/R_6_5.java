package Lab3.Assignement;

/*
Created by Mohanad Shamsan 
*/
/*R-6.5 Give a recursive method for removing all the elements from a stack.*/

import Lab3.ArrayStack;

import java.util.Random;

public class R_6_5 {
    public static void main(String[] args) {
        ArrayStack<Integer> stack =new ArrayStack<>(10);
        Random random=new Random();
        for (int i = 0; i < stack.getLength(); i++) {
            //stack.push(random.nextInt(1,100));
        }
        System.out.println("stack After push : "+stack.toString());
        rest(stack);
        System.out.println("Is stack empty :"+ stack.isEmpty());
        System.out.println("stack After resting :"+stack.toString());
    }
    static boolean rest(ArrayStack arrayStack ){
        if (arrayStack.isEmpty())throw new  IllegalStateException("the Array is Empty");
        for (int i = 0; i < arrayStack.getLength(); i++) {
            arrayStack.pop();
        }
        return true;
    }
}
