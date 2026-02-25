public interface Calc {
    String infixToPostfix(String expression);
    int evaluatePostfix(String expression);
}