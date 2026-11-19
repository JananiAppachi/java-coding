public class ReversedList {
    public Node recursiveReverse(Node header) {
        if (header == null || header.next == null) {
            return header;
        }
        Node newHeader = recursiveReverse(header.next);
        header.next.next = header;
        header.next = null;
        return newHeader;
    }

    public static void main(String[] args) {
        SinglyLinkedListOperations obj = new SinglyLinkedListOperations();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        ReversedList obj2 = new ReversedList();
        obj.header = obj2.recursiveReverse(obj.header);
        obj.printList();

    }
}
