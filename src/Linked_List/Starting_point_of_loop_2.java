package Linked_List;

import java.util.HashSet;

public class Starting_point_of_loop_2 {

    public static Node detectCycle(Node head){

     // Does not contain duplicate elements
        HashSet<Node> set = new HashSet<>();

        Node temp = head;

        while (temp != null){

            if(set.contains(temp)){
                return temp;
            }

            set.add(temp);

            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // creating cycle
        head.next.next.next.next = head.next.next;

        Node ans = detectCycle(head);

        if (ans != null) {
            System.out.println("Cycle starts at: " + ans.data);
        } else {
            System.out.println("No cycle");
        }

    }
}
