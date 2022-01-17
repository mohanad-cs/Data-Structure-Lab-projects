package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation2 {
    int x[];
    int numOfElements;
    public ArrayOperation2() {
        x=new int[5];
        numOfElements=0;
    }
   public int add(int element){
        if (numOfElements<x.length){
            x[numOfElements]=element;
            numOfElements++;
            return 0;
        }
        return -1;
   }
   //check And compare the inserted element with the previous index element
    // if the inserted element is smaller than the previous element it rotates
   public int addSorted(int element){
        if (numOfElements<x.length){
            int i=numOfElements;
            while (i>0&&element<x[i-1]){
                x[i]=x[i-1];
                i--;
            }
            x[i]=element;
            numOfElements++;
            return 0;
        }
        return -1;
   }
   public int deleteSorted(int index){
        if (numOfElements>0&&index>0&&index<x.length-1){
            int i=index;
            while (i<numOfElements-1){
                x[i]=x[i+1];
                i++;
            }
            x[x.length-1]=Integer.MIN_VALUE;
            numOfElements--;
            return 0;
        }
        return -1;
   }
    //deleting from the last index to the first index
    public int delete(){
        if (numOfElements>0){
            //-2147483648 represent the null value for the index in the array.
          x[numOfElements-1]=Integer.MIN_VALUE;
          numOfElements--;
          return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayOperation2 test =new ArrayOperation2();
        Scanner in=new Scanner(System.in);
        System.out.println("input the elements:");
        for (int i = 0; i < 7; i++) {
          /*  if (test.add(in.nextInt())==0){
                System.out.println("Add Successfully");
            }
            else {
                System.out.println("Array is full of elements");
            }
            System.out.println(Arrays.toString(test.x));*/

            if (test.addSorted(in.nextInt())==0){
                System.out.println("Add Successfully");
            }
            else {
                System.out.println("Array is full of elements");
            }
            System.out.println(Arrays.toString(test.x));

        }

      /*  for (int i = 0; i < 7; i++) {
            if (test.delete()==0){
                System.out.println("Deleted Successfully");
            }
            else {
                System.out.println("Array has no  element to Delete");
            }
            System.out.println(Arrays.toString(test.x));
        }*/
        for (int i = 0; i < 7; i++) {
            if (test.deleteSorted(i)==0){
                System.out.println("Deleted Successfully");
            }
            else {
                System.out.println("Array has no  element to Delete");
            }
            System.out.println(Arrays.toString(test.x));
        }

    }

}
