package Lab5;

import java.util.List;
import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        SingleLinkedList<String> list=new SingleLinkedList<>();
        int choice=-1;
        System.out.println("1 add first \t 2 add last \n 3 remove first \t 4 REMOVE ALL \n 0 Exit");
        while (choice!=0){
            System.out.println("your choice: ");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;
                case  2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println( list.removeFirst()+" REMOVED");
                    break;
                case 4:
                    while (!list.isEmpty()){
                        System.out.println( list.removeFirst()+" REMOVED");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("--head is :  "+list.first() +"--Last is : "+list.last() +"--Size is :  "+list.getSize());
        }
    }
}
