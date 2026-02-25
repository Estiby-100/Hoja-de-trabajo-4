import org.junit.Test;
import static org.junit.Assert.*;

public class ListStackTest {

    @Test
    public void testListStackPushPop() {

        ListADT<Integer> list = new SingleLinkedList<>();
        Stack<Integer> stack = new ListStack<>(list);

        stack.push(3);
        stack.push(7);

        assertEquals(7, (int) stack.pop());
        assertEquals(3, (int) stack.pop());
    }
}