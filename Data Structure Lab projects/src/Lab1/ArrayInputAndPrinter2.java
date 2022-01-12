package Lab1;

import java.util.Scanner;

public class ArrayInputAndPrinter2 {
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("input the array element:");
        Add(a,in);
        print(a);
    }
    static void Add(int a[],Scanner in){
        for (int i = 0; i < 10; i++) {
            a[i]=in.nextInt();
        }
    }
   static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
