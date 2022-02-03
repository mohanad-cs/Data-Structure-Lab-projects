
package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class PrintFiles {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> queue=new ArrayQueue<>();
        Scanner in =new Scanner(System.in);
        System.out.println("input the File path");
        for (int i = 0; i < 3; i++) {
          queue.enQueue(in.next());
        }
        while (!queue.isEmpty()){
            Scanner fileScanner=new Scanner(new File(queue.deQueue()));
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }
    }
}
