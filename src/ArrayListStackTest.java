import org.junit.*;
import static org.junit.Assert.*;

public class ArrayListStackTest {

    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(5);
        stack.push(8);

        assertEquals(8, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void testIsEmpty() {
        Stack<Integer> stack = new ArrayListStack<>();

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
