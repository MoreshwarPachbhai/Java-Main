package Linked_List;

public class Starting_point_of_loop_in_LinkedList {
    public static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        // STEP 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // cycle found
            if (slow == fast) {

                // STEP 2: Find starting point
                Node entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry;
            }
        }

        // No cycle
        return null;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating cycle
        head.next.next.next.next = head.next.next;

        Node ans = detectCycle(head);

        if (ans != null) {
            System.out.println("Cycle starts at node: " + ans.data);
        } else {
            System.out.println("No cycle");
        }
    }
}
