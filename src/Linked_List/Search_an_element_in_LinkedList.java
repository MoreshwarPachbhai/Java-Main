//Problem Statement: Given the head of a linked list and an integer value, find out whether the integer is present in the linked list or not. Return true if it is present, or else return false.
//
//Examples
//Input: 0->1->2, val = 2
//Output: True

package Linked_List;

public class Search_an_element_in_LinkedList {

    // Function to search element in linked list
    public static boolean search(Node head, int val) {

        Node temp = head;

        // Traverse the linked list
        while (temp != null) {

            // Check if current node contains value
            if (temp.data == val) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating linked list: 0 -> 1 -> 2
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);

        int val = 2;

        System.out.println(search(head, val));
    }
}
