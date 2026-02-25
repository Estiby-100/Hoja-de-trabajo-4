public class ListStack<E> extends AbstractStack<E> {

    private ListADT<E> list;

    public ListStack(ListADT<E> list) {
        this.list = list;
    }

    @Override
    public void push(E item) {
        list.add(item);
        count++;
    }

    @Override
    public E pop() {
        count--;
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }
}