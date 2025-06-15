package DSA.LinkedList;

public class CircularLinkedList {
     class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    static Node tail=null;

    void insertNode(int element,int d)
    {
        if(tail==null)
        {
            Node newNode=new Node(d);
            tail=newNode;
            newNode.next=newNode;
        }
        else
        {
            Node curr=tail;
            while(curr.data!=element)
            {
                curr=curr.next;
            }
            Node newNode=new Node(d);
            newNode.next=curr.next;
            curr.next=newNode;

        }

    }

    void deleteNode(int element)
    {
        //when list is empty
        if(tail==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node prev=tail;
            Node curr=prev.next;
            while(curr.data!=element)
            {
                prev=curr;
                curr=curr.next;

            }
            prev.next=curr.next;

            // 1 node linked list
            if(curr==prev)
            {
                tail=null;
            }

           if(curr==tail)
           {
              tail=curr.next;
           }

            curr.next=null;

        }
        System.gc();
    }
    void print()
    {
        if(tail==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail; // Start from the head (tail.next).
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail); // Stop when we return to the head.
        System.out.println();
    }

    public static void main(String[] args) {

        CircularLinkedList cll=new CircularLinkedList();
        cll.insertNode(2,3);
//        cll.print();
        cll.insertNode(3,1);
//        cll.print();
        cll.insertNode(1,4);
//        cll.print();
        cll.insertNode(4,8);
//        cll.print();
//        cll.deleteNode(3);
        cll.print();

        if(tail!=null) {
            System.out.println("\nTail= " + tail.data);
        }
        else
        {
            System.out.println("\nTail=NULL");
        }

    }
}
