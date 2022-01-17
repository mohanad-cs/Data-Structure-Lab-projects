package Lab2;

public class ArrayOperation {
    public static void main(String[] args) {
        int x[]={11,12,13,14,10};
        print(x);
      // print(reverse(x));
        //print(shiftLeft(x));
        print(shiftRight(x));
    }
    public static int[]  reverse(int[] array){

        int temp=array.length-1;
        for (int i = 0; i < array.length/2; i++) {
            int t = array[i];
            array[i] = array[temp];
            array[temp] = t;
            temp--;
        }
       return array;
    }
  public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
      System.out.println();
    }
    public static int[] shiftLeft(int[] array){
        int temp=array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;
        return array;
    }
    public static int[] shiftRight(int[]array){
        int temp=array[array.length-1];
        for (int i = array.length-1; i >0; i--) {
            array[i]=array[i-1];
        }
        array[0]=temp;
        return array;
    }
}
