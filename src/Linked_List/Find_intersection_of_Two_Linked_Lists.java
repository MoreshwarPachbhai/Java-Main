package Linked_List;

public class Find_intersection_of_Two_Linked_Lists {

    public static Node getIntersectionNode(Node headA, Node headB){

        if(headA == null || headB == null){
            return null;
        }

        Node a = headA;
        Node b = headB;

        while (a != b){

            if(a == null){
                a = headB;
            }
            else{
                a = a.next;
            }

            if(b == null){
                b = headA;
            }
            else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        // Common part
        Node common = new Node(2);
        common.next = new Node(4);

        // List 1: 1 -> 3 -> 1 -> 2 -> 4
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(1);
        headA.next.next.next = common;

        // List 2: 3 -> 2 -> 4
        Node headB = new Node(3);
        headB.next = common;

        Node intersection = getIntersectionNode(headA, headB);

        if(intersection != null){
            System.out.println("Intersection Node = " + intersection.data);
        }
        else {
            System.out.println("No Intersection");
        }
    }
}
