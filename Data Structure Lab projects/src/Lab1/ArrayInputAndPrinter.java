package Lab1;

import java.util.Scanner;

public class ArrayInputAndPrinter {
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("input the array element:");
        for (int i = 0; i < 10; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
