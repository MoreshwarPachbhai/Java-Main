class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static Node add_two_num(Node l1, Node l2){
        l1 = reverse(l1);
        l2 = reverse(l2);


        Node dummy = new Node(-1);
        Node current = dummy;

        int carry = 0;

        while(l1 != null || l2 != null ){
            int sum = carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        // Handling final carry
        if(carry > 0){
            current.next = new Node(carry);
        }

        Node result = reverse(dummy.next);
        return result;
    }



    public static Node reverse(Node head){
        Node current = head;
        Node prev = null;

        if(head == null || head.next == null){
            return head;
        }

        while(current != null){
            Node front = current.next;
            current.next = prev;

            prev = current;
            current = front;
        }
        return prev;
    }



    public static void printLL(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        // First number: 2 -> 4 -> 3 (342)
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Second number: 5 -> 6 -> 4 (465)
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node head = add_two_num(l1, l2);

       printLL(head);
    }
}