class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class assg2 {
    public static void main(String[] args) {
        Node list1 = new Node(25);
        list1.next = new Node(35);
        list1.next.next = new Node(12);
        list1.next.next.next = new Node(4);
        list1.next.next.next.next = new Node(36);
        list1.next.next.next.next.next = new Node(48);

        Node list2 = new Node(8);
        list2.next = new Node(32);
        list2.next.next = new Node(22);
        list2.next.next.next = new Node(45);
        list2.next.next.next.next = new Node(63);
        list2.next.next.next.next.next = new Node(49);

        Node mergedList = merge(list1, list2);
        Node sortedList = sort(mergedList);
        while (sortedList != null) {
            System.out.print(sortedList.data + "->");
            sortedList = sortedList.next;
        }
        System.out.println("null");
    }
    public static Node merge(Node list1, Node list2) {
        Node mergedList = new Node(0);
        Node current = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

        return mergedList.next;
    }
    public static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = sort(head);
        Node right = sort(nextOfMiddle);

        Node sortedList = merge(left, right);

        return sortedList;
    }
    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}


