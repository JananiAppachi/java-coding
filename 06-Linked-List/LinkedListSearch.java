class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListSearch {
    Node header;

    public void searchGivenNumber(int search) {
        Node curr = header;
        int index = 0;
        while (curr != null) {
            if (curr.data == search) {
                System.out.println(index);
                return;
            }
            curr = curr.next;
            index++;
        }

        System.out.println("cant found");

    }

    public static void main(String[] args) {
        LinkedListSearch obj1 = new LinkedListSearch(); // 1, 5, 7, 3 , 8, 2, 3
        obj1.header = new Node(1);
        obj1.header.next = new Node(5);
        obj1.header.next.next = new Node(7);
        obj1.header.next.next.next = new Node(3);
        obj1.header.next.next.next.next = new Node(8);
        obj1.header.next.next.next.next.next = new Node(2);
        obj1.header.next.next.next.next.next.next = new Node(3);
        obj1.searchGivenNumber(7);
    }
}