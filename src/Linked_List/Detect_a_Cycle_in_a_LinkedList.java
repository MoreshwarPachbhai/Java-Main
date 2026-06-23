package Linked_List;

public class Detect_a_Cycle_in_a_LinkedList {

    public static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        //  (even list condition)  &&   (odd list condition)
        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            // cycle detected
            if (slow == fast) {
                return true;
            }
        }

        // no cycle
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating cycle ( 4.next = 2)
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}