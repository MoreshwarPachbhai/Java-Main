package Linked_List;

public class Remove_N_th_node_from_the_end {

    public static Node removeNode(Node head, int ignoreVal){

        // Empty list
        if(head == null){
            return null;
        }

        Node temp = head;

        int count = 0;

        // Count total nodes
        while(temp != null){
            count++;
            temp = temp.next;
        }

        // If first node needs to be deleted
        if(ignoreVal == count){
            return head.next;
        }

        // Position before deleting node
        int ignore = count - ignoreVal;

        temp = head;

        // Move temp to previous node
        while(ignore > 1){
            temp = temp.next;
            ignore--;
        }

        // Delete node
        temp.next = temp.next.next;

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

        int ignoreVal = 2;

        head = removeNode(head, ignoreVal);

        printLL(head);
    }
}