// "node" object - data(the value), next(a pointer which reference to the next
// object)
class Node {
    // properties
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    public Node header = null;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        // no node
        if (header == null) {
            header = newNode;
            return;
        }
        // node exists
        newNode.next = header;
        header = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        // no node
        if (header == null) {
            header = newNode;
            return;
        }
        // node exists
        Node curr = header;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

    }

    public void addMiddle(int data, int element) {
        Node newNode = new Node(data);
        // no node
        if (header == null) {
            System.out.println("cant add in the middle, go with addFirst");
            return;
        }
        // node exists
        Node curr = header;
        while (curr.data != element && curr != null) {
            curr = curr.next;
        }
        if (curr != null) {
            Node nextCurr = curr.next;
            curr.next = newNode;
            newNode.next = nextCurr;
        } else {
            System.out.println("element not found");
            return;
        }

    }

    public void deleteFirst() {
        // no node
        if (header == null) {
            System.out.println("no node exits. hence cant perform deletion");
            return;
        }

        // node exists
        header = header.next;
    }

    public void deleteLast() {
        // no node
        if (header == null) {
            System.out.println("no node exists. hence cant perform deletion");
            return;
        }
        if (header.next == null) {
            header = null;
            return;
        }
        Node tail = header.next;
        Node last = header;
        while (tail.next != null) {
            last = last.next;
            tail = tail.next;
        }
        last.next = null;

    }

    public void deleteMiddle(int element) {

        // no node exists
        if (header == null) {
            System.out.println("no node exists. hence cant perform deletion");
            return;
        }
        // one node
        // if (header.next == null) {
        // header = null;
        // return;
        // }
        // many node exists
        Node curr = header.next;
        Node prev = header;
        while (curr.data != element && curr != null) {
            curr = curr.next;
            prev = prev.next;
        }
        if (curr != null)
            prev.next = curr.next;
        else
            System.out.println("element not found");

    }

    public void printList() {
        Node curr = header;
        if (header == null) {
            System.out.println("no node exists");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.addFirst(30);
        obj.printList();
        obj.addFirst(10);
        obj.printList();
        obj.addMiddle(20, 10);
        obj.printList();
        obj.addLast(40);
        obj.printList();
        obj.addLast(50);
        obj.printList();
        obj.addFirst(90);
        obj.printList();
        obj.addMiddle(80, 20);
        obj.printList();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();
        obj.deleteMiddle(80);
        obj.printList();
    }
}
