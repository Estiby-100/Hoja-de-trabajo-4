
public abstract class AbstractList<E> implements ListADT<E> {
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