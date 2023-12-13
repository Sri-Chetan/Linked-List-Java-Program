public static void Main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        // Create some nodes
        Node node1 = new Node("John");
        Node node2 = new Node("Mary");
        Node node3 = new Node("Peter");

        // Add the nodes to the linked list
        myLinkedList.addNode(node1);
        myLinkedList.addNode(node2);
        myLinkedList.addNode(node3);

        // Print the linked list
        myLinkedList.printList();

        // Insert a new node before index 1
        Node newNode = new Node("Alice");
        myLinkedList.insertBefore(1, newNode);

        // Print the linked list again
        System.out.println("\nAfter inserting Alice before index 1:");
        myLinkedList.printList();

        // Find the index of "Peter"
        int index = myLinkedList.indexOf("Peter");
        if (index >= 0) {
            System.out.println("\nPeter is at index " + index);
        } else {
            System.out.println("\nPeter not found");
        }

        // Remove the node at index 2
        myLinkedList.removeNodeAt(2);

        // Print the linked list again
        System.out.println("\nAfter removing node at index 2:");
        myLinkedList.printList();
    }
}