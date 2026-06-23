package Linked_List;

public class Delete_the_Middle_Node {

    public static Node middleNode(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = head;

        // Find the node before the middle node
        while(temp.next != slow){
            temp = temp.next;
        }

        // Delete the middle node
        temp.next = slow.next;

        return head;
    }

    public static void printLL(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
       // head.next.next.next.next.next = new Node(6);

        head = middleNode(head);

        printLL(head);
    }
}
