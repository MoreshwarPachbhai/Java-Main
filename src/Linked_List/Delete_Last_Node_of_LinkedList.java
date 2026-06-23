//Problem Statement: Given a Linked List, delete the tail of the list and print the updated list.
//
//Examples
//Input: 0->1->2
//Output: 0->1

package Linked_List;

public class Delete_Last_Node_of_LinkedList {

    // Function to delete tail node
    public static Node deleteTail(Node head) {

        // Case 1:
        // If list is empty
        if (head == null) {
            return null;
        }

        // Case 2:
        // If only one node exists
        if (head.next == null) {
            return null;
        }

        // Temporary pointer
        Node temp = head;

        /*
            Move temp until it reaches
            second last node

            Example:

            0 -> 1 -> 2

            temp should stop at 1
        */

        while (temp.next.next != null) {
            temp = temp.next;
        }

        /*
            Remove last node

            Before:
            0 -> 1 -> 2 -> null

            After:
            0 -> 1 -> null
        */

        temp.next = null;

        // Return updated head
        return head;
    }

    // Function to print linked list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Creating Linked List
        // 0 -> 1 -> 2

        Node head = new Node(0);

        head.next = new Node(1);

        head.next.next = new Node(2);


        /*
              Original List

              head
               ↓
              0 -> 1 -> 2 -> null
        */

        // Delete tail node
        head = deleteTail(head);

        /*
              Updated List

              head
               ↓
              0 -> 1 -> null
        */

        // Print updated list
        printList(head);
    }
}