package behavioralPatterns.interpreterPattern.code;

import java.util.Stack;

public class App {

  public static void main(String[] args) {
    String tokenString = "4 3 2 - 1 + *";
    Stack<Expression> stack = new Stack<>();

    String[] tokenList = tokenString.split(" ");
    for (String s : tokenList) {
      if (isOperator(s)) {
        Expression rightExpression = stack.pop();
        Expression leftExpression = stack.pop();

        Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
        int result = operator.interpret();
        Expression resultExpression = new NumberExpression(result);
        stack.push(resultExpression);
      } else {
        Expression i = new NumberExpression(s);
        stack.push(i);
      }
    }
    System.out.println(stack.peek().interpret());
  }

  public static boolean isOperator(String s) {
    return s.equals("+") || s.equals("-") || s.equals("*");
  }

  public static Expression getOperatorInstance(String s, Expression left, Expression right) {
    switch (s) {
      case "+":
        return new PlusExpression(left, right);
      case "-":
        return new MinusExpression(left, right);
      default:
        return new MultiplyExpression(left, right);
    }
  }
}
