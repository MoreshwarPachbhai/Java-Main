package Doubly_Linked_List;

public class Delete_Last_Node_of_Doubly_LinkedList {

    public static Node deleteNode(Node head){
        // Case 1: Empty list
        if (head == null) {
            return null;
        }

        // Case 2: Only one node
        if (head.next == null) {
            return null;
        }

        Node temp = head;

        // finding last node
        while(temp.next != null){
            temp = temp.next;
        }

        // temp is last node
        // Move to previous node [ creating new node named previousNode to store last node ]
        Node previousNode = temp.prev;

        // Remove connection
        previousNode.next = null;


        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data);

            if(temp.next != null){
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
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

        head = deleteNode(head);

        printDLL(head);

    }
}
