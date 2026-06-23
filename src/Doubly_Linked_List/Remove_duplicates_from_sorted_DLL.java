package Doubly_Linked_List;

public class Remove_duplicates_from_sorted_DLL {

    public static Node removeDuplicates(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node current = head;

        while(current != null && current.next != null){

            if(current.data == current.next.data){
                Node duplicate = current.next;
                current.next = duplicate.next;

                // After deleting a node its Next node still points towards deleted node
                // duplicate.next.prev = current; it helps to points towards previous of deleted node
                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            }
            else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printDLL(Node head){
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
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(3);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.prev =
                head.next.next.next.next;

        head = removeDuplicates(head);

        printDLL(head);

    }
}
