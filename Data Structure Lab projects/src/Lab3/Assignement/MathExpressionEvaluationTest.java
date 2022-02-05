package Lab3.Assignement;

import java.util.Scanner;

/*
Created by Mohanad Shamsan 
*/
public class MathExpressionEvaluationTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("*** input your Prefix Expression to get the result ****");
        System.out.println("*** Note: the valid rang of digit is from 0 to 9 ****");
        try {
            System.out.println(MathExpressionEvaluation.postfixEvaluation(in.nextLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
