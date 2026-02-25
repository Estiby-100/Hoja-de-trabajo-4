public class ListFactory {

    public static <E> ListADT<E> getList(String type) {
        if (type.equalsIgnoreCase("single")) {
            return new SingleLinkedList<>();
        } else {
            return new DoubleLinkedList<>();
        }
    }
}