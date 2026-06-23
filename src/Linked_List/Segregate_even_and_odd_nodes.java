package Linked_List;

public class Segregate_even_and_odd_nodes {

    public static Node oddEvenList(Node head) {

        // Edge case
        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;

        // Store starting point of even list
        Node evenHead = even;

        while (even != null && even.next != null) {

            // Connect odd nodes
            odd.next = odd.next.next;
            odd = odd.next;

            // Connect even nodes
            even.next = even.next.next;
            even = even.next;
        }

        // Attach even list after odd list
        odd.next = evenHead;

        return head;
    }

    public static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original List:");
        printLL(head);

        head = oddEvenList(head);

        System.out.println("Modified List:");
        printLL(head);
    }
}