import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayListStackTest {

    @Test
    public void testPushAndPop() {

        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, (int) stack.pop());
        assertEquals(10, (int) stack.pop());
    }

    @Test
    public void testPeek() {

        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(5);
        stack.push(8);

        assertEquals(8, (int) stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testIsEmpty() {

        Stack<Integer> stack = new ArrayListStack<>();

        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());
    }
}