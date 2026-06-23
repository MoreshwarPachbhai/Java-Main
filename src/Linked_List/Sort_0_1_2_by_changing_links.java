package Linked_List;

public class Sort_0_1_2_by_changing_links {

    public static Node sort(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;

        int zerocount = 0;
        int onecount = 0;
        int twocount = 0;

        while(temp != null){

            if(temp.data == 0){
                zerocount++;
            }
            else if(temp.data == 1){
                onecount++;
            }
            else if (temp.data == 2){
                twocount++;
            }
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            if(zerocount != 0){
                temp.data = 0;
                zerocount--;
            }
            else if(onecount != 0) {
                temp.data = 1;
                onecount--;
            } else if(twocount != 0) {
                temp.data = 2;
                twocount--;
            }
            temp = temp.next;
        }

        return head;
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);

        head = sort(head);

        printLL(head);

    }
}
