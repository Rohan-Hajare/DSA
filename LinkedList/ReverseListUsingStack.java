package DSA.LinkedList;

import java.util.Stack;

public class ReverseListUsingStack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node ReverseList(Node head) {
        Stack<Node> s = new Stack<>();
        Node curr = head;

        while (curr != null) {
            s.push(curr);
            curr = curr.next;
        }
        head = s.pop();
        curr = head;

        while (!s.isEmpty()) {
            curr.next = s.pop();
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        printList(head);

        head = ReverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
