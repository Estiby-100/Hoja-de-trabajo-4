public class DoubleLinkedList<E> extends AbstractList<E> {

    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;
        Node(E data) { this.data = data; }
    }

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    @Override
    public E removeLast() {
        E data = tail.data;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        count--;
        return data;
    }

    @Override
    public E getLast() {
        return tail.data;
    }
}
