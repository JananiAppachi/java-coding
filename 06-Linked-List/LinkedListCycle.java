public class LinkedListCycle {

    public boolean hasCycle(Node header) {// 1 2 , 1 3 4
        Node t = header;
        Node h = header;
        while (h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (h == t) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        SinglyLinkedListOperations obj = new SinglyLinkedListOperations();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        // Node curr = obj.header;
        // Node st = obj.header.next;
        // curr = curr.next.next.next;
        // curr.next = st;

        LinkedListCycle obj2 = new LinkedListCycle();
        System.out.println(obj2.hasCycle(obj.header));
    }
}
