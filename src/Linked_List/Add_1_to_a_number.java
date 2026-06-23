package Linked_List;

public class Add_1_to_a_number {

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

    public static Node addOne(Node head) {

        // Reverse the list
        head = reverse(head);

        Node temp = head;
        int carry = 1;

        while (temp != null) {

            int sum = temp.data + carry;

            // 7 % 10 = 7 (update 7 to temp.data)
            temp.data = sum % 10;

            // check for carry 1 or 0
            carry = sum / 10;

            // If no carry remains, stop
            if (carry == 0) {
                break;
            }

            // Last node and carry still exists
            if (temp.next == null) {
                temp.next = new Node(carry);
                carry = 0;
                break;
            }

            temp = temp.next;
        }

        // Reverse back
        return reverse(head);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);

        System.out.print("Before adding 1: ");
        printList(head);

        head = addOne(head);

        System.out.println(" ");
        System.out.print("After adding 1: ");
        printList(head);
    }
}
