package Doubly_Linked_List;

public class Insert_at_end_of_Doubly_Linked_List {

    // Function to insert at end
    public static Node insertAtEnd(Node head, int k) {

        // Step 1: Create new node
        Node newNode = new Node(k);

        // Step 2: If list is empty
        if (head == null) {
            return newNode;
        }

        // Step 3: Traverse to last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Step 4: Connect last node with new node
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Print DLL
    public static void printDLL(Node head) {
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

        // Creating DLL: 1 <-> 2 <-> 3 <-> 4

        Node head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // Insert 6 at end
        head = insertAtEnd(head, 6);

        // Print updated DLL
        printDLL(head);
    }
}