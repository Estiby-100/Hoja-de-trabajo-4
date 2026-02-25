
public interface ListADT<E> {
    void add(E element);
    E removeLast();
    E getLast();
    boolean isEmpty();
    int size();
}