// Problem Statement: Given a linked list and an integer value val, insert a new node with that value at the beginning (before the head) of the list and return the updated linked list.
//
//Examples
//Input: 0->1->2, val = 5
//Output: 5->0->1->2

package Linked_List;


public class Insert_at_the_head_of_a_LinkedList {

    // Function to insert node at beginning
    public static Node insertAtBeginning(Node head, int val) {

        // Step 1:
        // Create new node with given value
        Node newNode = new Node(val);

        // Step 2:
        // Connect new node to old head
        newNode.next = head;

        // Step 3:
        // Move head to new node
        head = newNode;

        // Step 4:
        // Return updated head
        return head;
    }

    // Function to print linked list
    public static void printList(Node head) {

        // Temporary pointer for traversal
        Node temp = head;

        // Traverse until temp becomes null
        while (temp != null) {

            // Print current node data
            System.out.print(temp.data);

            // Print arrow if next node exists
            if (temp.next != null) {
                System.out.print(" -> ");
            }

            // Move temp to next node
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Creating first node
        Node head = new Node(0);

        // Connecting second node
        head.next = new Node(1);

        // Connecting third node
        head.next.next = new Node(2);

        /*
              Current Linked List

              head
               ↓
              0 -> 1 -> 2 -> null
        */

        // Value to insert at beginning
        int val = 5;

        // Insert node at beginning
        head = insertAtBeginning(head, val);

        /*
              Updated Linked List

              head
               ↓
              5 -> 0 -> 1 -> 2 -> null
        */

        // Print final linked list
        printList(head);
    }
}