package Lab4;

import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Character> queue = new ArrayQueue<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("Is the queue empty?" +queue.isEmpty());
        System.out.println("Please Enter the Queque elements");
        for (int i = 0; i < 5; i++) {
            queue.enQueue(in.next().charAt(0));
            System.out.println("First is : "+queue.first());
            System.out.println("Size is : "+queue.size());
        }
        System.out.println(queue.toString());
       while (!queue.isEmpty()){
           System.out.println(queue.deQueue());
       }
    }
}
