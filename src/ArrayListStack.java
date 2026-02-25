import java.util.ArrayList;

public class ArrayListStack<E> extends AbstractStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E item) {
        list.add(item);
        count++;
    }

    @Override
    public E pop() {
        E item = list.remove(list.size() - 1);
        count--;
        return item;
    }

    @Override
    public E peek() {
        return list.get(list.size() - 1);
    }
}