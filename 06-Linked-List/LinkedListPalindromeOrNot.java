public class LinkedListPalindromeOrNot {

    public Node reverseSecondHalf(Node header) {
        // size of array 1 2 2 1
        int c = 0;
        Node curr = header;
        while (curr != null) {
            c++;
            curr = curr.next;
        } // c=4
        int mid = 0;
        if (c % 2 == 0) {
            mid = c / 2;
        } else {
            mid = (c / 2) + 1;
        }
        curr = header;
        int i = 0;
        while (i != mid) {
            i++;
            curr = curr.next;
        }
        // Node temp = curr;
        Node prev = curr;
        if (curr.next != null) {
            curr = curr.next;
        } else {
            return curr;
        }
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev.next = null;
            prev = curr;
            if (nxt != null) {
                curr = nxt;
                nxt = nxt.next;

            } else
                break;
        }
        // temp.next = null;
        return curr;
    }

    public boolean isPalindrome(Node header) {
        // 1->2->2->1 ; 1->2-> 2<-1
        if (header == null || header.next == null) {
            return true;
        }
        Node newHeader = reverseSecondHalf(header);
        Node first = header;
        Node last = newHeader;
        while (first.next != null && last != null) {
            if (first.data != last.data) {
                return false;
            }
            first = first.next;
            last = last.next;
        }
        return true;
    }

    public static void main(String[] args) {
        SinglyLinkedListOperations obj = new SinglyLinkedListOperations();
        // palindromic structure
        obj.addLast(1);
        obj.addLast(0);
        // obj.addLast(3);
        // obj.addLast(5);
        obj.addLast(1);
        LinkedListPalindromeOrNot obj2 = new LinkedListPalindromeOrNot();
        System.out.println(obj2.isPalindrome(obj.header));

    }
}
