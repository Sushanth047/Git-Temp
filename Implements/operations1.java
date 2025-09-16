
class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node head = null;

    void insert(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted: " + x);
    }

    void delete(int x) {
        Node temp = head, prev = null;

        while (temp != null && temp.data != x) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }

        System.out.println("Deleted: " + x);
    }

    void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class operations1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(5);
        l.insert(15);
        l.insert(25);
        l.display();

        l.delete(15);
        l.display();
    }
}
