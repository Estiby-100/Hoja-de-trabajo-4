
public class SingleLinkedList<E> extends AbstractList<E> {

    private Node<E> head;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element);
        if (head == null) {
            head = node;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        count++;
    }

    @Override
    public E removeLast() {
        if (head.next == null) {
            E data = head.data;
            head = null;
            count--;
            return data;
        }
        Node<E> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        E data = current.next.data;
        current.next = null;
        count--;
        return data;
    }

    @Override
    public E getLast() {
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
}