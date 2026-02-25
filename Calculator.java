public class Calculator implements Calc {

    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    @Override
    public String infixToPostfix(String expression) {

        Stack<String> stack = StackFactory.getStack();
        StringBuilder output = new StringBuilder();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (isNumber(token)) {
                output.append(token).append(" ");
            }

            else if (token.equals("(")) {
                stack.push(token);
            }

            else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop();
            }

            else if (token.equals("+") || token.equals("-")) {

                while (!stack.isEmpty() &&
                       (stack.peek().equals("+") ||
                        stack.peek().equals("-") ||
                        stack.peek().equals("*") ||
                        stack.peek().equals("/"))) {

                    output.append(stack.pop()).append(" ");
                }

                stack.push(token);
            }

            else if (token.equals("*") || token.equals("/")) {

                while (!stack.isEmpty() &&
                       (stack.peek().equals("*") ||
                        stack.peek().equals("/"))) {

                    output.append(stack.pop()).append(" ");
                }

                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        return output.toString().trim();
    }

    @Override
    public int evaluatePostfix(String expression) {

        Stack<Integer> stack = StackFactory.getStack();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }

            else {
                int b = stack.pop();
                int a = stack.pop();

                if (token.equals("+")) stack.push(a + b);
                else if (token.equals("-")) stack.push(a - b);
                else if (token.equals("*")) stack.push(a * b);
                else if (token.equals("/")) stack.push(a / b);
            }
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}