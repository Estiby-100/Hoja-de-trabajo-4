import org.junit.*;
import static org.junit.Assert.*;

public class ListStackTest {

    @Test
    void testListStackPushPop() {
        ListADT<Integer> list = new SinglyLinkedList<>();
        Stack<Integer> stack = new ListStack<>(list);

        stack.push(3);
        stack.push(7);

        assertEquals(7, stack.pop());
        assertEquals(3, stack.pop());
    }
}