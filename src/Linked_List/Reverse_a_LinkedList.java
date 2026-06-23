package Linked_List;

public class Reverse_a_LinkedList {

    // Reverse Linked List
    public static Node reverseLL(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            // Store next node
            Node front = current.next;

            // Reverse link
            current.next = prev;

            // Move prev and current ahead
            prev = current;
            current = front;
        }

        // prev becomes new head
        return prev;
    }

    // Print Linked List
    public static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if(temp.next != null){
                System.out.print(" -> ");
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // 1 -> 3 -> 2 -> 4

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printLL(head);

        head = reverseLL(head);

        System.out.println("\nReversed List:");
        printLL(head);
    }
}