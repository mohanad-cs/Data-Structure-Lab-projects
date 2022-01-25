package Lab2.Assignment;

import java.util.Random;
import java.util.random.RandomGenerator;

/*
Created by Mohanad Shamsan 
*/
/*
 Q1: Write a Java method that Reverse an array using another array.
 Q2: Write a Java method that Clone an array to a backup array.
 Q3:Write a Java method that repeatedly selects and removes a random
    entry from an array until the array holds no more entries.
* */
public class ArrayOperation {
    int[] array;
    int[] backupArray;

    int numOfElements;

    public int[] getBackupArray() {
        return backupArray;
    }

    public ArrayOperation() {
        this.array = new int[5];
        this.numOfElements=0;
    }

    /**
     *  removing all element with a random entry
     * @return Integer 1 if the all element have been removed successfully else nothing.
     * @throws Exception throws the exception if the array is empty.
     */
    public int randomRemove() throws Exception {
        if (isEmpty())throw new Exception("No element to remove");
        Random random=new Random();
        int randomEntry = random.nextInt(0,array.length-1);
       while (numOfElements>0){
           if (array[randomEntry]!=Integer.MIN_VALUE){
               array[randomEntry]=Integer.MIN_VALUE;
               numOfElements--;
           }
           randomEntry=random.nextInt(0,array.length);
       }
       return 1;
    }

    /**
     * reversing an array
     * @param array the array that will reverse
     * @return the reversed array
     * @throws Exception throws if the array is empty
     */
    public int[] getReverse(int[] array) throws Exception {
        if (isEmpty()) throw new Exception("The Array is Empty");
        int[] reverse =new int[array.length];
        int readIndex= array.length-1;
        for (int i= 0; i < reverse.length; i++) {
           reverse[i]=array[readIndex];
           readIndex--;
        }
        return reverse;
    }

    /**
     *  add an element to the array
     * @param index the index that represent the position where the element will be added
     * @param element the element
     * @return Integer 1 if the element have successfully added
     * @throws Exception throws if the array is full
     * @throws IndexOutOfBoundsException  throws if the index out of the range
     */
    public int addElement (int index,int element) throws Exception , IndexOutOfBoundsException{
        if (isFull()) throw new Exception("The Array is full Of elements");
        if (index<0||index>array.length-1){
            //return 0;
            throw new IndexOutOfBoundsException();
        }
        else {
           array[index]=element;
           numOfElements++;
           return 1;
        }
    }

    /**
     *  Mack a copy of the array to a backup array
     * @return 1 if the array have been copied successfully
     * @throws Exception throws if the array is empty
     */
    public int cloneArray() throws Exception {
        if (isEmpty()) throw new Exception("The Array is Empty");
            backupArray=new int[array.length];
            for (int i = 0; i < array.length; i++) {
                backupArray[i]=array[i];
            }
            return 1;

    }
    public boolean isEmpty(){
        if (numOfElements<0)return true;
        return false;
    }
    public boolean isFull(){
        if (numOfElements==array.length)return true;
        return false;
    }
}


