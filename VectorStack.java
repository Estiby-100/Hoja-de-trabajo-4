import java.util.Vector;

public class VectorStack<E> extends AbstractStack<E> {

    private Vector<E> vector = new Vector<>();

    @Override
    public void push(E item) {
        vector.add(item);
        count++;
    }

    @Override
    public E pop() {
        E item = vector.remove(vector.size() - 1);
        count--;
        return item;
    }

    @Override
    public E peek() {
        return vector.lastElement();
    }
}