public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    // Adds a new node to the end of the linked list
    public void addNode(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    // Prints the data of each node in the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

    // Adds a new node before the specified index in the linked list
    public void insertBefore(int index, Node n) {
        if (index == 0) {
            n.next = head;
            head = n;
        } else {
            Node current = head;
            Node previous = null;
            int i = 0;
            while (i < index && current != null) {
                previous = current;
                current = current.next;
                i++;
            }
            if (current == null) {
                System.out.println("Index out of bounds");
            } else {
                n.next = current;
                previous.next = n;
            }
        }
    }

    // Returns the index of the first node with the specified name, or -1 if not found
    public int indexOf(String str) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.name.equals(str)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // Removes the node at the specified index from the linked list
    public void removeNodeAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;
            int i = 0;
            while (i < index && current != null) {
                previous = current;
                current = current.next;
                i++;
            }
            if (current == null) {
                System.out.println("Index out of bounds");
            } else {
                previous.next = current.next;
            }
        }
    }

 