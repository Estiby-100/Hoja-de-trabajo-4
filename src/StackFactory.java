public class StackFactory {

    private static String stackType;
    private static String listType;

    public static void configure(String sType, String lType) {
        stackType = sType;
        listType = lType;
    }

    public static <E> Stack<E> getStack() {
        if (stackType.equalsIgnoreCase("arraylist")) {
            return new ArrayListStack<>();
        } else if (stackType.equalsIgnoreCase("vector")) {
            return new VectorStack<>();
        } else {
            ListADT<E> list = ListFactory.getList(listType);
            return new ListStack<>(list);
        }
    }
}