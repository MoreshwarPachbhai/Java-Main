package Linked_List;

public class Length_of_Loop_in_LinkedList {

    public static int lengthOfLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Node entry = head;

                // entry point identification of the loop
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }

                Node temp = slow.next;
                int count = 1;

                // calculating length of the loop
                while(temp != slow ){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next.next;

        System.out.println("The length of the loop is: "+lengthOfLoop(head));
    }
}
