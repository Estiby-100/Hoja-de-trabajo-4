
public abstract class AbstractStack<E> implements Stack<E> {
    protected int count;

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}