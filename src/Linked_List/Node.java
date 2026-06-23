package Linked_List;

class Node {

    // This variable stores the data/value
    int data;

    // This variable stores address of next node
    Node next;

    // Constructor
    Node(int data) {

        // Store given value inside node
        this.data = data;

        // Initially next points to nothing
        this.next = null;
    }
}
