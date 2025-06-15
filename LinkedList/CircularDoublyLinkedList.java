package DSA.LinkedList;

public class CircularDoublyLinkedList {

    static Node tail=null;
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)
        {
            this.data=d;
            this.prev=null;
            this.next=null;
        }
    }

    void insertNode(int element,int d)
    {
        if(tail==null)
        {
            Node newNode=new Node(d);
            tail=newNode;
            tail.next=newNode;
            newNode.prev=tail;
        }
        else
        {
            Node newNode=new Node(d);
            Node curr=tail;
            while(curr.data!=element)
            {
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next.prev=newNode;
            curr.next=newNode;
            newNode.prev=curr;
        }
    }

    void deleteNode(int element)
    {
       if(tail==null)
       {
           System.out.println("List is empty element cant delete");
           return;
       }
       Node prev=tail;
       Node curr=tail.next;
       while(curr.data!=element)
       {
           prev=curr;
           curr=curr.next;
       }

       // if single node is there
        if(curr==prev)
        {
            tail=null;
        }

        //to delete current update tail
        if(curr==tail)
        {
            tail=curr.next;
        }

        prev.next=curr.next;
        curr.next.prev=prev;
        curr.next=null;
        curr.prev=null;


       System.gc();
    }
    void print()
    {
        if(tail==null)
        {
            System.out.println("List is empty");
            return;
        }

        Node temp=tail;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }while(temp!=tail);
        System.out.println();
    }
    public static void main(String[] args) {

        CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();

        cdll.insertNode(2,1);
//        cdll.print();
        cdll.insertNode(1,2);
//        cdll.print();

        cdll.insertNode(2,3);
//        cdll.print();

        cdll.deleteNode(3);
        cdll.print();



        if(tail!=null) {
            System.out.println("\nTail= " + tail.data);
        }
        else
        {
            System.out.println("\nTail=NULL");
        }
    }
}
