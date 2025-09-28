package DSA.LinkedList;


public class ReveseLinkedList {
   static class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseList(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node forward;
        while(curr!=null)
        {
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
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

        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
