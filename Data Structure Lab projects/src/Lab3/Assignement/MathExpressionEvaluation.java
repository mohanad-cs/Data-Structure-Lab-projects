package Lab3.Assignement;

import Lab3.ArrayStack;

/*
Created by Mohanad Shamsan 
*/
/*P-6.35 Implement a program that can input an expression in postfix notation (see Exercise C-6.19) and output its value.*/
public class MathExpressionEvaluation {

    public static double postfixEvaluation(String postfixExpression) throws Exception {
        ArrayStack<Double> stack = new ArrayStack<>(postfixExpression.length());
        double operand1;
        double operand2;

        for (int i = 0; i < postfixExpression.length(); i++) {
            if (postfixExpression.isBlank()) throw new Exception("invalid expression due the blank string");
            if (!isCharacterValid(postfixExpression.charAt(i))) throw new Exception("invalid expression>>" +
                    "invalid character have detected  :'" + postfixExpression.charAt(i)+"'");
            if (Character.isDigit(postfixExpression.charAt(i))) {
                stack.push(Double.parseDouble(String.valueOf(postfixExpression.charAt(i))));
            } else {
                if (stack.size() == 1 || stack.isEmpty()) {
                    throw new Exception("malformed  occur in the expression. " +
                            "the expression may have many operators or the expression have wrong order");
                } else {
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    double result = calculate(operand1, operand2, postfixExpression.charAt(i));
                    stack.push(result);
                }

            }
        }
        if (stack.size() != 1 || stack.isEmpty())
            throw new Exception("Operation field >> it may cased by an invalid expression or malformed have Occurred");
        return stack.top();
    }

    private static double calculate(double operand1, double operand2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) throw new ArithmeticException("can not / by zero");
                else {
                    return operand1 / operand2;
                }
            default:
                throw new Exception("something went wrong while calculating :" +
                        "Operand1=" + operand1 + " Operator=" + operator + " Operand2=" + operand2);
        }
    }

    private static boolean isCharacterValid(char character) {
        char[] expressionCharList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/'};
        for (char c : expressionCharList) {
            if (character == c) return true;
        }
        return false;
    }

}

