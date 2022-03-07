package Lab5.Assignment;

import Lab5.SingleLinkedList;

import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
/*
C-3.25 Describe an algorithm for concatenating tow singly list L and M,
into a single list L that contains all the node of L followed by all the nodes of M
* */
// the way to mack L list elements  contain and followed by   M element is:
//1 use the method of removeFirst in M list .
// pass the element that received from the removeFirst into addLast methode ,addLast will tack care of the rest.
public class C_3_25 {
    public static void main(String[] args) throws Exception {
        SingleLinkedList<String> L=new SingleLinkedList<>();
        SingleLinkedList<String> M=new SingleLinkedList<>();
        int choice =-1;
        Scanner in=new Scanner(System.in);
        System.out.println("1:addFirst to L  2: addFirst to M 3: to concatenating M to L  4 :  show the header and the tail of L");
        System.out.println("5:show the header and the tail of M ");
        while (choice!=-0){
                System.out.println("your choice: ");
                choice=in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("input name");
                        L.addFirst(in.next());
                        break;
                    case 2:
                        System.out.println("input name");
                        M.addFirst(in.next());
                        break;
                    case 3:
                        concatenating(L,M);
                        break;
                    case 4:
                        System.out.println("--head is :  "+L.first() +"--Last is : "+L.last() +"--Size is :  "+L.getSize());
                        break;
                    case 5:
                        System.out.println("--head is :  "+M.first() +"--Last is : "+M.last() +"--Size is :  "+M.getSize());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
        }

    }
    // this method can be implement in Singly list  to concatenate an external list  to the related object list
    public static void concatenating(SingleLinkedList L,SingleLinkedList M) throws Exception {
       if (M.isEmpty())throw new Exception("the M list is Empty");
       while (M.getSize()>0)
       L.addLast(M.removeFirst());
        System.out.println("Successfully concatenated");
    }
}
