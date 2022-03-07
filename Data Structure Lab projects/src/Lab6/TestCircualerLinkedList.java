package Lab6;

import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class TestCircualerLinkedList {
    public static void main(String[] args) {
        CircualerLinkedList<String>list=new CircualerLinkedList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("1 add first , 2 add last , 3 rotate  4 remove 0 exit");
        int choice =-1;
        while (choice!=-0){
            System.out.println("input youre choice");
            switch (choice){
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.nextLine());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.nextLine());
                    break;
                case 3:
                    System.out.println("First before rotate is "+list.first());
                    System.out.println("Last before rotate is "+list.last());
                    System.out.println("rotating");
                    list.rotate();
                    System.out.println("First after rotate is "+list.first());
                    System.out.println("Last After rotate is "+list.last());
                    break;
                case 4:
                    System.out.println("removing from first");
                    list.removeFirst();

                    System.out.println("first is "+list.first());
                    System.out.println("Last is "+list.last());
                    break;
            }
 //Todo: show list size on the operation
        }

    }
}
