package StacksAndQueuesExercises;

import java.util.*;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> operators = new ArrayDeque<>();
        ArrayDeque<String> expression = new ArrayDeque<>();
        ArrayDeque<Double> result = new ArrayDeque<>();
        Map<String, Integer> priorites = new HashMap<>();
        priorites.put("*", 3);
        priorites.put("/", 3);
        priorites.put("+", 2);
        priorites.put("-", 2);
        priorites.put("(", 1);

        for (String anInput : input) {
            if (isNumeric(anInput)) {
                expression.addLast(anInput);
            } else {
                switch (anInput) {
                    case "x":
                    case "y":
                        expression.addLast(anInput);
                        break;
                    case "(":
                        operators.push(anInput);
                        break;
                    case ")":
                        String symbol = operators.pop();
                        while (!symbol.equals("(")) {
                            expression.addLast(symbol);
                            symbol = operators.pop();
                        }
                        break;
                    default:
                        while (!operators.isEmpty() && priorites.get(operators.peek()) >= priorites.get(anInput)) {
                            expression.addLast(operators.pop());
                        }
                        operators.push(anInput);
                        break;
                }
            }
        }
        while (!operators.isEmpty()) {
            expression.addLast(operators.pop());
        }

        while (!expression.isEmpty()) {
            if (isNumeric(expression.peek())) {
                result.push(Double.valueOf(expression.pop()));
            } else if (isOperator(expression.peek())){
                String operator = expression.pop();
                double second = result.pop();
                double first= result.pop();

                double resultNumber = 0;
                switch (operator) {
                    case "*":
                        resultNumber = first*second;
                        result.push(resultNumber);
                        break;
                    case "/":
                        resultNumber = first/second;
                        result.push(resultNumber);
                        break;
                    case "+":
                        resultNumber = first+second;
                        result.push(resultNumber);
                        break;
                    case "-":
                        resultNumber = first-second;
                        result.push(resultNumber);
                        break;
                }
            }
        }

        System.out.printf("%.2f", result.getFirst());
    }

    private static boolean isNumeric(String anInput) {
        return anInput.matches("([a-zA-Z]+|\\d+)");
    }

    private static boolean isOperator(String s) {
        return s.matches("[+\\-*\\/]");
    }
}
