package Lab2.Assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class ArrayOperationTest {
    static ArrayOperation test =new ArrayOperation();
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("******** Pleas Enter the Index following by the element to add ********");
        add();
        System.out.print("the add Array : ");
        System.out.println(Arrays.toString(test.array));
        System.out.println("Cloning the Array.....");
        test.cloneArray();
        System.out.println("getting the cloned Array.....");
        System.out.print("the cloned Array : ");
        System.out.println(Arrays.toString(test.getBackupArray()));
        System.out.println("reversing the Array.....");
        System.out.print("the reversed Array : ");
        System.out.println(Arrays.toString( test.getReverse(test.array)));
        System.out.println("Removing elements with random entry.....");
        if (test.randomRemove()==1){
            System.out.println("element removed successfully");
            System.out.println("The Array after removing elements : "+ Arrays.toString(test.array));
        }
    }
   static void add() throws Exception {
        for (int i = 0; i < 5; i++) {
            test.addElement(in.nextInt(), in.nextInt());
        }
    }
}
