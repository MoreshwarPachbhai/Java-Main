package Linked_List;

public class LinkedList_is_Palindrome {

    public static boolean isPalindrome(Node head) {

        // Empty list or single node is always palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node newHead = reverse(slow.next);

        // Step 3: Compare both halves
        Node first = head;
        Node second = newHead;

        while (second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Reverse Linked List
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node front = current.next;
            current.next = prev;

            prev = current;
            current = front;
        }

        return prev;
    }


    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        System.out.println(isPalindrome(head));


    }
}