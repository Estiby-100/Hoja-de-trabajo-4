import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testInfixToPostfix() {

        StackFactory.configure("arraylist", "");
        Calc calculator = Calculator.getInstance();

        String result = calculator.infixToPostfix("( 10 + 20 ) * 9");

        assertEquals("10 20 + 9 *", result);
    }

    @Test
    public void testEvaluatePostfix() {

        StackFactory.configure("arraylist", "");
        Calc calculator = Calculator.getInstance();

        int result = calculator.evaluatePostfix("10 20 + 9 *");

        assertEquals(270, result);
    }
}