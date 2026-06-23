package Linked_List;

public class sort_0_1_2_part2 {

    public static Node sortList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // Dummy nodes (pointing to first node)
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        // Tail pointers (pointing to last node)
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }


       if(oneHead != null){
           zero.next = oneHead.next;
       }
       else{
           zero.next = twoHead.next;
       }
       one.next = twoHead.next;
       two.next = null;

        return zeroHead.next;
    }

    public static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original Linked List:");
        printLL(head);

        head = sortList(head);

        System.out.println("Sorted Linked List:");
        printLL(head);
    }
}
