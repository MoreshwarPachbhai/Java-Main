package Linked_List;

public class Find_middle_element_in_LinkedList {

    // Function to find middle node
    public static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        // fast moves 2 steps
        // slow moves 1 step
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Creating Linked List:
        // 1 -> 2 -> 3 -> 4 -> 5

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = findMiddle(head);

        System.out.println("Middle Element: " + middle.data);
    }
}