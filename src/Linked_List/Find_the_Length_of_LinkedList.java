// Problem Statement: Given the head of a linked list, print the length of the linked list.
//
//Examples
//Input: 0->1->2
//Output: 3
//Explanation: The list has a total of 3 nodes, thus the length of the list is 3.

package Linked_List;

public class Find_the_Length_of_LinkedList {

    // Function to find length of linked list
    public static int length(Node head) {

        int count = 0;

        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        // Creating linked list: 0 -> 1 -> 2
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);

        System.out.println(length(head));
    }
}