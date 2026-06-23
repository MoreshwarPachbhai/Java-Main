package Doubly_Linked_List;

public class Reverse_a_Doubly_LinkedList {

    // Reverse DLL
    static Node reverseDLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        while (current != null) {

            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move forward
            current = current.prev;
        }

        // temp is at previous node
        return temp.prev;
    }

    // Print DLL
    static void printDLL(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Creating DLL
        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Linking
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // Reverse
        head = reverseDLL(head);

        // Print
        printDLL(head);
    }
}
