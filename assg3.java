 import java.util.*;
 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class assg3 {

    public static Node removeDuplicates(Node head) {
        Set<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(12);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next = new Node(5);

        Node newHead = removeDuplicates(head);
        printLinkedList(newHead);
    }
}


