package LinkedList;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {

        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {


    static Node head = null;


    public static void push(int newData) {
        Node new_Node = new Node(newData);
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
    }

    public static void append(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null) {
            last = last.next;
            last.next = new_node;
            new_node.prev = last;
        }
    }

    public static void InsertAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println("the given node cannot be NULL ");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    public static void printlist(Node node) {
        Node last = null;
        System.out.println(
                "Traversal in forward direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println(
                "Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

}
